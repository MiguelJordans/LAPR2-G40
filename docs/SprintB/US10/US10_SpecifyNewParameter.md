# US 10 - SpecifyNewParameter

## 1. Requirements Engineering

*In this section, it is suggested to capture the requirement description and specifications as provided by the client as well as any further clarification on it. It is also suggested to capture the requirements acceptance criteria and existing dependencies to other requirements. At last, identfy the involved input and output data and depicted an Actor-System interaction in order to fulfill the requirement.*


### 1.1. User Story Description

*As an administrator, I want to specify a new parameter and categorize it.*

### 1.2. Customer Specifications and Clarifications 

**From the specifications document:**

> “Typically, the client arrives at one of the clinical analysis laboratories with a lab order prescribed by a doctor. Once there, a receptionist asks the client’s citizen card number, the lab order (which contains the type of test and parameters to be measured), and registers in the application the test to be performed to that client.”

> "Blood tests are frequently characterized by measuring several parameters which for presentation/reporting purposes are organized by categories. For example, parameters such as the number of Red Blood Cells (RBC), White Blood Cells (WBC) and Platelets (PLT) are usually presented under the blood count (Hemogram) category."

> "Covid tests are characterized by measuring a single parameter stating whether it is a positive or a negative result."

> "Despite being out of scope, the system should be developed having in mind the need to easily support other kinds of tests (e.g., urine). Regardless, such tests rely on measuring one or more parameters that can be grouped/organized by categories."

**From the client clarifications:**

> **Question:** What is the data that characterize a parameter? Should we follow the same data as the parameter category, for example, would each parameter have its own code, description and NHS identifier?
> 
> **Answer:** Each parameter is associated with one category. Each parameter has a Code, a Short Name and a Description.

> **Question:** What is the information related to a Parameter Category?
> 
> **Answer:** Each category has a name and a unique code. There are no subcategories.

### 1.3. Acceptance Criteria

* **AC1:** Code is unique and has five alphanumeric characters.
* **AC2:** Short name is a string with no more than 8 characters.
* **AC3:** Description is a string with no more than 20 characters.

### 1.4. Found out Dependencies

* There is a dependency to “US11 Specify a new parameter category” since at least a parameter category must exist to classify the parameter being created.

### 1.5 Input and Output Data

**Input Data:**

* Typed data:
  * Code
  * Short name
  * Description


* Selected data:
  * Parameter category
  
**Output Data**

* (In)Success of the operation

### 1.6. System Sequence Diagram (SSD)

![US10-SSD](US10-SSD.svg)


### 1.7 Other Relevant Remarks

*Use this section to capture other relevant information that is related with this US such as (i) special requirements ; (ii) data and/or technology variations; (iii) how often this US is held.* 


## 2. OO Analysis

### 2.1. Relevant Domain Model Excerpt 

![US10-DM](US10-DM.svg)

### 2.2. Other Remarks

*Use this section to capture some additional notes/remarks that must be taken into consideration into the design activity. In some case, it might be usefull to add other analysis artifacts (e.g. activity or state diagrams).* 



## 3. Design - User Story Realization 

### 3.1. Rationale

**The rationale grounds on the SSD interactions and the identified input/output data.**

| Interaction ID | Question: Which class is responsible for... | Answer  | Justification (with patterns)  |
|:-------------  |:--------------------- |:------------|:---------------------------- |
| Step/Msg 1: asks to create a new Parameter | ... interacting with the actor? | ParameterUI | Pure Fabrication: there is no reason to assign this responsibility to any existing class in the Domain Model |
|                                            | ... coordinating the US? | ParameterController | Controller |
|                                            | ... instantiating a new Parameter? | Company | Creator (Rule 1): in the DM Company has a Parameter |
|                                            | ... knowing the user using the system? | UserSession | IE: cf. A&A component documentation |
|                                            | ... knowing to which organization the user belongs to? | System | IE: has registered all |
| Step/Msg 2: request data (code, short name, description) | n/a | | |
| Step/Msg 3: types requested data | ... saving the inputted data? | Parameter | IE: object created in step/msg 1 has its own data |
| Step/Msg 4: shows the parameter categories it can operate and asks to select one | ... knowing the parameter categories to show? | System | IE: parameter category are defined by the system |
| Step/Msg 5: selects the parameter category | ... saving the selected data? | Parameter | IE: object created in step/msg 1 has its own data |
| Step/Msg 6: confirms the selected parameter category | ... saving the selected parameter category? | Parameter | IE: object created in step 1 operates one or more parameter categories |
| Step/Msg 7: shows all data and requests a confirmation | ... validating the data locally (e.g.: mandatory vs non-mandatory data)? | Company | IE: knows its own data |
|                                                        | ... validating the data globally (e.g.: duplicated)? | Company | IE: knows all the Parameter objects |
| Step/Msg 8: confirms the data | ... saving the created Parameter? | Company | IE: adopts/records all the Parameter objects |
| Step/Msg 9: informs operation success | ... informing operation success? | ParameterUI | IE: responsible for user interaction |            

### Systematization ##

According to the taken rationale, the conceptual classes promoted to software classes are: 

 * Company
 * Parameter

Other software classes (i.e. Pure Fabrication) identified: 
 * ParameterUI  
 * ParameterController
 * ParameterStore

## 3.2. Sequence Diagram (SD)

![US10-SD](US10-SD.svg)

## 3.3. Class Diagram (CD)

![US10-CD](US10-CD.svg)


# 4. Tests 

### AC1

**Test 1:** Check that it is not possible to create an instance of Parameter class with code blank.

	@Test(expected = IllegalArgumentException.class)
    public void checkCodeBlank() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("","yes","aaa",parameterCategoryStore);
    }

**Test 2:** Check that it is not possible to create an instance of Parameter class with code not alphanumeric.

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeNotAlphaNumeric1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("****","yes","aaa",parameterCategoryStore);
    }

**Test 3:** Check that it is not possible to create an instance of Parameter class with code with more characters than the maximum.

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("112312312312312312312312","yes","aaa",parameterCategoryStore);
    }

### AC2

**Test 4:** Check that it is not possible to create an instance of Parameter class with short name blank.

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","",parameterCategoryStore);
    }

**Test 5:** Check that it is not possible to create an instance of Parameter class with short name with more characters than the maximum.

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aasdasdasdasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",parameterCategoryStore);
    }

### AC3

**Test 6:** Check that it is not possible to create an instance of Parameter class with description blank.

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","","aaa",parameterCategoryStore);
    }

**Test 7:** Check that it is not possible to create an instance of Parameter class with description with more characters than the maximum.

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaes","aaa",parameterCategoryStore);
    }

# 5. Construction (Implementation)

## Parameter

    public class Parameter {

        private String code;
        private String name;
        private String description;

        private ParameterCategoryStore pp;


        /**
        * Constructs an instance of Parameter
        *
        * @param code the Parameter's code
        * @param description the Parameter's description
        * @param name the Parameter's name
        * @param ppStore the Parameter's category list
        */

        public Parameter(String code, String description, String name,ParameterCategoryStore ppStore) {

            checkCode(code);
            checkName(name);
            checkDescription(description);
            checkCategoriesList(ppStore);

            this.code = code;
            this.name = name;
            this.description = description;
            this.pp = ppStore;

        }

        //Checks-----------------------------------------------------------------------------------------

        /**
        * Checks the Parameter's code (according to the acceptance criteria).
        *
        * @param code the Parameter's code
        */

        public void checkCode(String code) {

            if (StringUtils.isBlank(code))
                throw new IllegalArgumentException("Code cannot be blank.");


            if (!(code.matches("^[a-zA-Z0-9]*$")) || code.length() > 5)
                throw new IllegalArgumentException("Code not valid! Must be alphanumeric and have less than 5 chars.");

        }

        /**
        * Checks the Parameter's name (according to the acceptance criteira).
        *
        * @param name the Parameter's name
        */

        public void checkName(String name) {

            if (StringUtils.isBlank(name))
                throw new IllegalArgumentException("Name cannot be blank.");

            if (name.length() > 8)
                throw new IllegalArgumentException("Name not valid! Cannot have more than 8 chars.");

        }

        /**
        * Checks the Parameter's description (according to the acceptance criteria)
        *
        * @param description the Parameter's description
        */

        public void checkDescription(String description) {

            if (StringUtils.isBlank(description))
                throw new IllegalArgumentException("Description cannot be blank.");

            if (description.length() > 20)
                throw new IllegalArgumentException("Description not valid! Cannot have more than 15 chars.");

        }

        /**
        * Checks the Parameter's category list (according to the acceptance criteria)
        *
        * @param ppStore the Parameter's category list
        */

        public void checkCategoriesList(ParameterCategoryStore ppStore){
            if(ppStore.list.isEmpty()) {
                throw new IllegalArgumentException("Categories not valid! List is null!");
            }
        }

        //Get ------------------------------------------------------------------

        /**
        * Returns the code of the Parameter
        *
        * @return the code of the Parameter
        */

        public String getCode() {
            return code;
        }

        /**
        * Returns the description of the Parameter
        *
        * @return the description of the Parameter
        */

        public String getDescription() {
            return description;
        }

        /**
        * Returns the name of the Parameter
        *
        * @return the name of of the Parameter
        */

        public String getName() {
            return name;
        }

        /**
        * Returns the category list of the Parameter
        *
        * @return the category list of the Parameter
        */

        public ParameterCategoryStore getPp() {
            return pp;
        }

        //Sets---------------------------------------------------------------------

        /**
        * Modifies the category list of the Parameter
        *
        * @param pp modifies the category list of the Parameter
        */

        public void setPp(ParameterCategoryStore pp) {
            checkCategoriesList(pp);
            this.pp = pp;
        }

        /**
        * Modifies the name of the Parameter
        *
        * @param name modifies the name of the Parameter
        */

        public void setName(String name) {
            checkName(name);
            this.name = name;
        }

        /**
        * Modifies the description of the Parameter
        *
        * @param description modifies the description of the Parameter
        */

        public void setDescription(String description) {
            checkDescription(description);
            this.description = description;
        }

        /**
        * Modifies the code of the Parameter
        *
        * @param code modifies the code of the Parameter
        */

        public void setCode(String code) {
            checkCode(code);
            this.code = code;
        }

        /**
        * Returns the textual description of the Parameter in the format : Code, Description, Name.
        *
        * @return
        */


        @Override
        public String toString() {
            return
                    " Code: " + code  +
                            ", Description:" + description +
                            ", Name:" + name;

        }
    }

## Parameter Controller

    public class ParameterController {

        private Company company;
        private ParameterStore store;

        /**
        * Creates an empty Parameter controller.
        */

        public ParameterController(){
            this(App.getInstance().getCompany());
        }

        /**
        * Instance of a Parameter.
        *
        * @param company - the company that administrates the system
        */

        public ParameterController(Company company){
            this.company=company;
        }

        /**
        * Creates a Parameter(Calling the Parameter constructor implemented in the parameterStore)
        *
        * @param description the parameter's description
        * @param code the parameter's code
        * @param name the parameter's name
        * @param pcStore the parameter's category list
        */

        public void CreateParameter(String description,String code,String name,ParameterCategoryStore pcStore){
            store = company.getParameterStore();
            store.CreateParameter(description,code,name,pcStore);
        }

        /**
        * Transforms into string.
        *
        * @return the Parameter's info in string format
        */

        public String getPP(){ return store.getPp().toString(); }

        /**
        * Saves an instance of Parameter.
        *
        * @return the saving of an instance of a Parameter.
        */

        public boolean saveParameter() {
            return this.store.saveParameter();
        }

        /**
        * Returns the list of parameters already created
        *
        * @return the list of parameters already created
        */

        public List<Parameter> getParameterList() {
            return store.getParameterList();
        }
    }

##ParameterStore

    public class ParameterStore {

        List<Parameter> list;
        Parameter pp;

        /**
        * Constructor.
        */

        public ParameterStore() {
            this.list = new ArrayList<>();
        }

        /**
        * Creates a Parameter (Calling the Parameter constructor)
        *
        * @param description the Parameter's description
        * @param code        the Parameter's code
        * @param name        the Parameter's name
        * @param pcStore     the Parameter's category list
        * @return the parameter created
        */

        public Parameter CreateParameter(String description, String code, String name, ParameterCategoryStore pcStore) {
            return this.pp = new Parameter(code, description, name, pcStore);
        }

        /**
        * Validates a parameter
        *
        * @param pp the object Parameter
        * @return the validation of the Parameter being created
        */


        public boolean validateParameter(Parameter pp) {
            if (pp == null || listContain(pp)) {
                return false;
            }
            return true;
        }

        /**
        * Checks if the new objected created is already in the list
        *
        * @param pp the object parameter
        * @return true if the list contains the parameter and false if it doesn't
        */

        public boolean listContain(Parameter pp) {
            if (this.list.contains(pp)) {
                return true;
            } else {
                return false;
            }
        }

        /**
        * Saves an instance of parameter.
        *
        * @return the saving of an instance of a parameter.
        */

        public boolean saveParameter() {
            if (validateParameter(this.pp)) {
                listAdd(pp);
                return true;
            } else {
                return false;
            }
        }

        /**
        * Adds an instance of parameter to the list.
        *
        * @param pp - the parameter object
        * @return the addition of the parameter to the list
        */

        public boolean listAdd(Parameter pp) {
            list.add(pp);
            return true;
        }

        /**
        * Replaces the element of the specified position in the list with the specified element.
        *
        * @param i the index of the element to replace
        * @return the element previously at the specified postion
        */

        public Parameter getParameter(int i) {
            return list.get(i);
        }

        /**
        * Gets Parameter from the list.
        *
        * @return the parameter requested
        */

        public Parameter getPp() {
            return pp;
        }

        /**
        * Returns the list of parameters already created
        *
        * @return the list of parameters already created
        */

        public List<Parameter> getParameterList() {
            return list;
        }
    }

##ParameterUI

    public class ParameterUI implements Runnable {

        private ParameterController ctrl;
        private ParameterCategoryStore pcStore;

        public ParameterUI() {
            this.ctrl = new ParameterController();
            this.pcStore = new ParameterCategoryStore();
        }

        @Override
        public void run() {
            boolean count = true;
            boolean leave = false;
            if (this.pcStore.getParameterCategoryList() == null || this.pcStore.getParameterCategoryList().isEmpty()) {
                System.out.println("The list is empty! Please, try adding at least one parameter in order to create the laboratory.");
            } else {
                do {
                    boolean exception = false;
                    do {
                        ParameterCategory pc = (ParameterCategory) Utils.showAndSelectOne(this.pcStore.getParameterCategoryList(), "Select the categories");
                        this.pcStore.listAdd();
                        leave = Utils.confirm("Do you wish to select more parameters?");
                    } while (leave);
                    do {
                        try {
                            String name = Utils.readLineFromConsole("Please enter the name of the parameter");
                            String description = Utils.readLineFromConsole("Please enter the description of the parameter");
                            String code = Utils.readLineFromConsole("Please enter the code of the parameter");

                            ParameterCategoryStore pc = (ParameterCategoryStore) Utils.showAndSelectOne(this.pcStore.getParameterCategoryList(), "Select the categories");

                            ctrl.CreateParameter(description, code, name, pc);
                            exception = false;
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("Incorrect input of data (an error has ocurred), please try again.");
                            exception = true;
                        }
                    } while (exception);
                    count = Utils.confirm("Parameter created! Do you wish to save it?" + ctrl.getPP());
                    if (count) {
                        if (ctrl.saveParameter()) {
                            System.out.println("Parameter was saved with sucess!");
                        }
                    }
                }while (!count);
            }
        }
    }


# 6. Integration and Demo 

## Integration in the Company class

    public Parameter createParameter(String code, String description, String name, ParameterCategoryStore pcStore) {
        return new Parameter(code, description, name, pcStore);
    }

    ParameterStore parameterStore = new ParameterStore();

    private static ParameterStore parameterList;

    public static ParameterStore Parameter() {
        return parameterList = new ParameterStore();
    }
    
    public boolean validateParameter(Parameter pp) {
        parameterStore.validateParameter(pp);
        return true;
    }

    public boolean saveParameter() {
        parameterStore.saveParameter();
        return true;
    }

    public boolean listContainsParameter(Parameter pp) {
        parameterStore.listContain(pp);
        return true;
    }

    public boolean parameterListAdd(Parameter pp) {
        parameterStore.listAdd(pp);
        return true;
    }

    public Parameter getParameter(int i) {
        return parameterStore.getParameter(i);
    }

    public Parameter getPP() {
        return parameterStore.pp;
    }

    public ParameterStore getParameterStore() {
        return parameterStore;
    }

# 7. Observations

*In this section, it is suggested to present a critical perspective on the developed work, pointing, for example, to other alternatives and or future related work.*





