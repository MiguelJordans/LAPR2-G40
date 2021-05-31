# US 004 - Register a Test to be performed to a registered Client.

## 1. Requirements Engineering

*In this section, it is suggested to capture the requirement description and specifications as provided by the client as well as any further clarification on it. It is also suggested to capture the requirements acceptance criteria and existing dependencies to other requirements. At last, identfy the involved input and output data and depicted an Actor-System interaction in order to fulfill the requirement.*


### 1.1. User Story Description

As a receptionist of the laboratory, I intend to register a test to be performed to a registered client.

### 1.2. Customer Specifications and Clarifications 

**From the specifications document:**

>“a receptionist asks the client’s citizen card number, the lab order which contains the type of test and parameters to be measured and registers
>in the application the test to be performed to that client.”


**From the client clarifications:**

>**Question**: Other than the attributes already mentioned (test code, NHS code, designation) are there any other attributes that characterize a test? On those attributes, what requirements are there? For example, the characters on a designation, the code length, etc
>
>**Answer**: The test attributes are:
>Test code : Sequential number with 12 digits. The code is automatically generated.
>NHS code: 12 alphanumeric characters.


>**Question**: When the receptionist chooses the test type, should the categories appear, and then when selecting the category, the receptionist can choose the parameters for the test? Or when the Receptionist chooses the test type, should appear all the parameters that it includes immediately?
>
>**Answer**: Firstly, the receptionist should choose a test type. Then choose a category from a set of categories. Last, the receptionist should choose a parameter.


>**Question**: Since the Client has a Lab Order which contains the type of test and all the parameters to be measured, all the parameters selected by the Receptionist need to be equal to the Lab Order's parameters?
>
>**Answer**: Yes. 

### 1.3. Acceptance Criteria

* **AC1**: The receptionist must select the parameters to be analyzed from all possible parameters in accordance with the test type.

### 1.4. Found out Dependencies

* There is a dependency to "US009 Specify a new type of test and its collecting methods" since at least a test type must exist to be selected by the receptionist and to be performed to a registered client. 
  

* There is a dependency to "US010 Specify a new parameter and categorize it" since at least a parameter must exist to be measured.

### 1.5 Input and Output Data

**Input Data:**

* Typed data:
    * Citizen Card Number
    * NHS code


* Selected data:
    * Test Type
    * Categories  
    * Parameter(s)


**Output Data:**

* List of test types
* List of test categories
* List of test parameters
* (In)Success of the operation


### 1.6. System Sequence Diagram (SSD)

### **Version 1**

![US04-SSD](US04_SSD.svg)



### 1.7 Other Relevant Remarks

*Use this section to capture other relevant information that is related with this US such as (i) special requirements ; (ii) data and/or technology variations; (iii) how often this US is held.* 


## 2. OO Analysis

### 2.1. Relevant Domain Model Excerpt 
*In this section, it is suggested to present an excerpt of the domain model that is seen as relevant to fulfill this requirement.* 

![US04-MD](US04_MD.svg)

### 2.2. Other Remarks

*Use this section to capture some additional notes/remarks that must be taken into consideration into the design activity. In some case, it might be usefull to add other analysis artifacts (e.g. activity or state diagrams).* 



## 3. Design - User Story Realization 

### 3.1. Rationale

**The rationale grounds on the SSD interactions and the identified input/output data.**

| Interaction ID | Question: Which class is responsible for... | Answer  | Justification (with patterns)  |
|:-------------  |:--------------------- |:------------|:---------------------------- |
| Step 1  		 |							 |             |                              |
| Step 2  		 |							 |             |                              |
| Step 3  		 |							 |             |                              |
| Step 4  		 |							 |             |                              |
| Step 5  		 |							 |             |                              |
| Step 6  		 |							 |             |                              |              

### Systematization ##

According to the taken rationale, the conceptual classes promoted to software classes are: 

 * Class1
 * Class2
 * Class3

Other software classes (i.e. Pure Fabrication) identified: 
 * xxxxUI  
 * xxxxController

## 3.2. Sequence Diagram (SD)

*In this section, it is suggested to present an UML dynamic view stating the sequence of domain related software objects' interactions that allows to fulfill the requirement.* 

![US04-SD](US04_SD.svg)

### **References**

**TestType DTO**

![US04-REF1](US04_TestType_DTO.svg)

**Category DTO**

![US04-REF2](US04_Category_DTO.svg)

**Parameter DTO** 

![US04-REF3](US04_Parameter_DTO.svg)

## 3.3. Class Diagram (CD)

*In this section, it is suggested to present an UML static view representing the main domain related software classes that are involved in fulfilling the requirement as well as and their relations, attributes and methods.*

![US04-CD](US04_CD.svg)

# 4. Tests 
*In this section, it is suggested to systematize how the tests were designed to allow a correct measurement of requirements fulfilling.* 

**_DO NOT COPY ALL DEVELOPED TESTS HERE_**

**Test 1:** Check that it is not possible to create an instance of the Example class with null values. 

	@Test(expected = IllegalArgumentException.class)
		public void ensureNullIsNotAllowed() {
		Exemplo instance = new Exemplo(null, null);
	}

*It is also recommended to organize this content by subsections.* 

# 5. Construction (Implementation)

*In this section, it is suggested to provide, if necessary, some evidence that the construction/implementation is in accordance with the previously carried out design. Furthermore, it is recommeded to mention/describe the existence of other relevant (e.g. configuration) files and highlight relevant commits.*

*It is also recommended to organize this content by subsections.* 

# 6. Integration and Demo 

*In this section, it is suggested to describe the efforts made to integrate this functionality with the other features of the system.*


# 7. Observations

*In this section, it is suggested to present a critical perspective on the developed work, pointing, for example, to other alternatives and or future related work.*





