# US 12 - RecordTheResultsOfAGivenTest

## 1. Requirements Engineering

*In this section, it is suggested to capture the requirement description and specifications as provided by the client as well as any further clarification on it. It is also suggested capturing the requirements' acceptance criteria and existing dependencies to other requirements. At last, identify the involved input and output data and depicted an Actor-System interaction in order to fulfill the requirement.*


### 1.1. User Story Description

*As a clinical chemistry technologist, I intend to record the results of a given test.*

### 1.2. Customer Specifications and Clarifications 

**From the specifications document:**

> “At the company's headquarters, the clinical chemistry technologist receives the samples (delivered by a courier) and performs the chemical analysis, recording the results in the software application.”

> “… the application uses an external module that is responsible for doing an automatic validation using test reference values.”

> “At the same time, the results are also available in the central application where the medical lab technicians who collect the samples, the clinical chemistry technologist, the specialist doctor, and the laboratory coordinator can check them.”

**From the client clarifications:**

> **Question:** When the Clinical Chemistry Technologist wants to record the results of a test, how does he have access to that test? By an internal code, NHS code…?
> 
> **Answer:** Each sample has a unique barcode. The Clinical Chemistry Technologist should use the sample barcode number to find the test for which the sample was collected.

> **Question:** Should the system present a result for each test parameter or a single result for the test to be recorded?
> 
> **Answer:** The Clinical Chemistry Technologist should register a value/result for each parameter of the test.

> **Question:** Are the reference values, for each parameter, going to be delivered to the groups? If so, when and how?
> 
> **Answer:** You should use the APIs available in moodle to obtain the reference values.

### 1.3. Acceptance Criteria

* **AC1:** The application should use an external module that is responsible for providing the test reference values. The application can use an external module for each type of test. For instance, when the results are for blood tests parameters, the external module BloodReferenceValues1API can be used. When the results are for Covid-19 tests parameters, the external module CovidReferenceValues1API can be used. In any case, the API request should include, at most:
  * (i) a key to access the module (e.g.: “KEY1234”);
  * (ii) a parameter identifier;
  * (iii) the reference date;
  * (iv) reference measurement unit (e.g.: "mg").
* **AC2:** Each test result is characterized by a parameter code, a result and metric.
* **AC3:** Each test parameter is characterized by a test result.
* **AC4:** Each sample has a unique barcode.
* **AC5:** The Clinical Chemistry Technologist should use the sample barcode number to find the test for which the sample was collected.
* **AC6:** The Clinical Chemistry Technologist should register a value/result for each parameter of the test.

### 1.4. Found out Dependencies

**From Sprint B:**

There is a dependency to:
* **"US07 Register a new employee"** since at least a Clinical Chemistry Technologist must be registered in the system.
* **“US09 Specify a new type of test and its collecting methods”** since at least a type of test must exist to record its results.
* **“US10 Specify a new parameter and categorize it”** since at least a parameter must exist to record its results.

**From Sprint C:**

* **"US04 Register a test to be performed to a registered client"** since at least one test must be registered in the system.
* **"US05 Record the samples collected in the scope of a given test"** since each test must have an associated sample recorded in the system.

### 1.5 Input and Output Data

**Input Data:**

* Typed data:
  * Sample barcode number
  * Value/result (for each parameter)


* Selected data:
  * Test parameter


**Output Data:**

* List of test parameters
* (In)Success of the operation

### 1.6. System Sequence Diagram (SSD)

*Insert here a SSD depicting the envisioned Actor-System interactions and throughout which data is inputted and outputted to fulfill the requirement. All interactions must be numbered.*

![US12_SSD](US12_SSD.svg)


### 1.7 Other Relevant Remarks

*Use this section to capture other relevant information that is related with this US such as (i) special requirements ; (ii) data and/or technology variations; (iii) how often this US is held.* 


## 2. OO Analysis

### 2.1. Relevant Domain Model Excerpt 
*In this section, it is suggested to present an excerpt of the domain model that is seen as relevant to fulfill this requirement.* 

![US12_DM](US12_DM.svg)

### 2.2. Other Remarks

*Use this section to capture some additional notes/remarks that must be taken into consideration into the design activity. In some case, it might be usefull to add other analysis artifacts (e.g. activity or state diagrams).* 



## 3. Design - User Story Realization 

### 3.1. Rationale

**The rationale grounds on the SSD interactions and the identified input/output data.**

| Interaction ID | Question: Which class is responsible for... | Answer  | Justification (with patterns)  |
|:-------------  |:--------------------- |:------------|:---------------------------- |
| Step/Msg 1: asks to record the results of a given test | ... interacting with the actor? | TestResultUI | Pure Fabrication: there is no reason to assign this responsibility to any existing class in the Domain Model |
|                                                        | ... coordinating the US? | TestResultController | Controller |
| Step/Msg 2: request sample barcode number | n/a | | |
| Step/Msg 3: types the sample barcode number | ... knowing TestStore? | Company | IE: TestStore is initialized in Company |
|                                             | ... knowing all the existent test? | TestStore | IE: knows its own tests |
| Step/Msg 4: shows one parameter at a time and requests each value/result | n/a | | |
| Step/Msg 5: types the value/result | ... knowing and getting the reference values? | ExternalModule | Protected Variation: It is necessary to know which adapter to use in order to get the reference values for the correct API |
|                                    | ... getting the ExternalModule? | TestType | IE: knows what API to get depending on the type of test |
|                                    | ... creating the TestParameterResult object? | TestParameter | Creator: TestParameterResult is an attribute of TestParameter |
|                                    | ... validating and saving the typed data? | ReferenceValue | IE: knows its own data |
|                                    | ... changing the test state? | Test | IE: After the tests being recorded, Test must change its state |
| Step/Msg 6: informs operation success | ... informing operation success? | RecordTestResultUI | IE: responsible for user interaction |


### Systematization ##

According to the taken rationale, the conceptual classes promoted to software classes are: 

 * TestParameter
 * TestParameterResult

Other software classes (i.e. Pure Fabrication) identified: 
 * RecordTestResultUI  
 * RecordTestResultController
 * ExternalModule
 * RefValue
 * RefValueAdapter (1 for each API)
 * TestParameterDTO
 * TestParameterMapper

## 3.2. Sequence Diagram (SD)

![US12_SD](US12_SD.svg)
  

* SD_AddTestResult(parameterCode, result, metric)
![SD_AddTestResult(parameterCode, result, metric)](SD_AddTestResult.svg)


## 3.3. Class Diagram (CD)

*In this section, it is suggested to present an UML static view representing the main domain related software classes that are involved in fulfilling the requirement as well as and their relations, attributes and methods.*

![US12_CD](US12_CD.svg)

# 4. Tests 
*In this section, it is suggested to systematize how the tests were designed to allow a correct measurement of requirements fulfilling.* 

**_DO NOT COPY ALL DEVELOPED TESTS HERE_**

**Test 1:** Check that it is not possible to create an instance of the Example class with null values. 

	@Test(expected = IllegalArgumentException.class)
		public void ensureNullIsNotAllowed() {
		Exemplo instance = new Exemplo(null, null);
	}

*It is also recommended organizing this content by subsections.* 

# 5. Construction (Implementation)

*In this section, it is suggested to provide, if necessary, some evidence that the construction/implementation is in accordance with the previously carried out design. Furthermore, it is recommeded to mention/describe the existence of other relevant (e.g. configuration) files and highlight relevant commits.*

*It is also recommended organizing this content by subsections.* 

# 6. Integration and Demo 

*In this section, it is suggested to describe the efforts made to integrate this functionality with the other features of the system.*


# 7. Observations

*In this section, it is suggested to present a critical perspective on the developed work, pointing, for example, to other alternatives and or future related work.*





