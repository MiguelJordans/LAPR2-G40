# US 7 - RegisterEmployee

## 1. Requirements Engineering

<<<<<<< HEAD

### 1.1. User Story Description

- As an administrator, I want to register a new employee.

=======
### 1.1. User Story Description

*As an administrator, I want to register a new employee*
>>>>>>> 620d64afa79b19022b2ac70872e41c76ae00a41b

### 1.2. Customer Specifications and Clarifications

**From the Specifications Document:**


**From the client clarifications:**

>**Question**: What kind of information does the company store about their employees?
> 
>**Answer**: All the roles that exist in the Many Labs company are characterized by the gollowing attributes: Employee ID, Organization Role, Name, Address, Phone Number, E-Mail and Standar Occupational Classification (SOC) code. The Specialist Doctor has an additional attribute: Doctor Index Number.


>**Question**: Are there any other employee roles than the ones specified in the documents?
> 
>**Answer**: No.


>**Question**: Do these roles have different contracts with ManyLabs (i.e. temporary contract, permanent contract, freelance, etc...)? If so, should this be registered in the system together with the employee role information?
> 
>**Answer**: Many Labs is known for making only permanent full-time contracts.Therefore, there is no need to register this type of information.


>**Question**: For the role id and respective description should we use any specific format or type?
> 
>**Answer**: From a previous answer: "All the roles that exist in the Many Labs company are characterized by the following attributes:
Employee ID; Organization Role; Name; Address; Phone Number; E-Mail; Standard Occupational Classification (SOC) code.


>**Question**:How should we generate the employee ID ? What type and length should it have ?
> 
>**Answer**:The employee ID should be generated from the initials of the employee name and should include a number. The number should have 5 digits and it increases automatically when a new employee is registered in the system. For instance, if the company has 20 employees and the administrator wants to register a specialist doctor with the name Ana Maria Santos Moura, then the the employee ID for this specialist doctor should be AMSM00021.


>**Question**: When the application is delivered , should it have default employees , ex:administrator,etc.. , or should be completly empty (without any user or employee)?
> 
>**Answer**:One Administrator must be registered before starting the application for the first time.


>**Question**: The apllication can add new employess but can it remove them , for example when one of them is fired ?
> 
>**Answer**: For now I do not want such feature.


>**Question**: The application should register the time when de employees log in and log out ?
> 
>**Answer**: No.
 

>**Question**: Should we validate if a new employee is the same as one that there is already inside the system ? Do we need to vallidate same atributes to check similarities ?
> 
>**Answer**: Yes. Yes.
 




### 1.3. Acceptance Criteria

* **AC1:** Each user must have a single role defined in the system. The "auth" component available on the repository must be reused (without modifications).

### 1.4. Found out Dependencies

*Identify here any found out dependency to other US and/or requirements.*

### 1.5 Input and Output Data

**Input Data:**

* Typed data:
    * Employee ID
    * Organization role
    * Name
    * Address
    * Phone number
    * Email
    * SOC code
    * Doctor Index Number

* Selected data:
    * Specialist Doctor role


**Output Data:**

* Confirmation email (which has the password)

### 1.6. System Sequence Diagram (SSD)

![US07_SSD](US07_SSD.svg)


### 1.7 Other Relevant Remarks

*Use this section to capture other relevant information that is related with this US such as (i) special requirements ; (ii) data and/or technology variations; (iii) how often this US is held.* 


## 2. OO Analysis

### 2.1. Relevant Domain Model Excerpt 
*In this section, it is suggested to present an excerpt of the domain model that is seen as relevant to fulfill this requirement.* 

![US07_MD](US07_MD.svg)

### 2.2. Other Remarks

*Use this section to capture some aditional notes/remarks that must be taken into consideration into the design activity. In some case, it might be usefull to add other analysis artifacts (e.g. activity or state diagrams).* 

## 3. Design - User Story Realization 

### 3.1. Rationale

**The rationale grounds on the SSD interactions and the identified input/output data.**

| Interaction ID | Question: Which class is responsible for... | Answer  | Justification (with patterns)  |
|:-------------  |:--------------------- |:------------|:---------------------------- |
| Step 1: ask to register a new employee|starting a new registering process|Company|                              |
| Step 2: request an authentication|    |             |                              |
| Step 3: type requested data( email, password)||             |                              |
| Step 4: request data (Employee ID, Organization Role, name, address, phone number, email, soc code, doctor index number)|n/a||                              |
| Step 5: type and select requested data 		 |saving the input data    | NewEmployee            |                              |
| Step 6: show the data and requests confirmation 		 |  validating the data  |  NewEmployee           |                              |              
| Step 7: confirm the data		 |saving the created new employee    |   Company   |                              |              
| Step 8: send confirmation email (which has the password)		 |sending the email |  Company           |                              |              

### Systematization ##

According to the taken rationale, the conceptual classes promoted to software classes are: 

 * Company
 * NewEmployee


Other software classes (i.e. Pure Fabrication) identified: 
 * CreateEmployeeUI
 * CreateEmployeeController

## 3.2. Sequence Diagram (SD)

**Alternative 1**

![US07-SD](US07_SD.svg)

**Alternative 2**
=======
*In this section, it is suggested to present an UML dynamic view stating the sequence of domain related software objects' interactions that allows to fulfill the requirement.*

![USXX-SD](USXX-SD.svg)

## 3.3. Class Diagram (CD)

*In this section, it is suggested to present an UML static view representing the main domain related software classes that are involved in fulfilling the requirement as well as and their relations, attributes and methods.*

![US07_CD](US07_CD.svg)

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




