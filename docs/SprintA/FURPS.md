# Supplementary Specification (FURPS+)

## Functionality

_Specifies functionalities that:_

- _are common across several US/UC;_
- _are not related to US/UC, namely: Audit, Reporting and Security._



"Registers in the application the test to be performed to that client."
- Workflow
- Persistence

"In case of a new client, the receptionist registers the client in the application."
- Workflow
- Persistence

"Records the samples in the system."
- Workflow
- Persistence

"Associating the samples with the client/test, and identifying each sample with a barcode."
- Authentication

"Recording the results in the software application."
- Workflow
- Persistence

"The client receives the notification by SMS and e-mail."
- Report

"The company is also required to generate daily (automatic) reports."
- Report

"The application must be authenticated with a password holding seven alphanumeric characters, including three capital letters and two digits."
- Security

###

## Usability 

_Evaluates the user interface. It has several subcategories,
among them: error prevention; interface aesthetics and design; help and
documentation; consistency and standards._


"(To facilitate the access to the results) the application must allow ordering the clients by TIF and by name."
- Accessibility

"Only the specialist doctor is allowed to access all client data."
- Accessibility

"The user interface must be simple, intuitive and consistent."
- Aesthetics

###

## Reliability
_Refers to the integrity, compliance and interoperability of the software. The requirements to be considered are: frequency and severity of failure, possibility of recovery, possibility of prediction, accuracy, average time between failures._


"(To facilitate) The application uses an external module that is responsible for doing an automatic validation using test reference values."
- Accuracy

"the results of the clinical analyses and the report become available in the system."
- Availability

"At the same time the results are also available in the central application."
- Availability

"Whenever the system fails, there should be no data loss."
- Recoverability

"The system should not fail more than 5 days in one year."
- Recoverability

"At least two sorting algorithms should be evaluated and documented in the application user manual (in the annexes) that must be delivered with the application."

###

## Performance
_Evaluates the performance requirements of the software, namely: response time, start-up time, recovery time, memory consumption, CPU usage, load capacity and application availability._


"The company wants to decrease the number of tests waiting for its result."
- Response Time

"It is intended that the choice of the ordering algorithm is based on the algorithm complexity (mainly the execution time)"

"The complexity analysis must be accompanied by the observation of the execution time of the algorithms for inputs of variable size in order to observe the asymptotic behaviour."
- Throughput

"Any interface between a user and the system shall have a maximum response time of 3 seconds."
- Response Time

"The system should start up in less than 10 seconds."
- Start-up time

"The implemented algorithm should be analysed in terms of its worst-case time complexity, and it should be compared to a provided benchmark algorithm."
- Throughput

###

## Supportability
_The supportability requirements gathers several characteristics, such as:
testability, adaptability, maintainability, compatibility,
configurability, installability, scalability and more._ 

"The application must support the English language only."
- Localizability

"The system should be developed having in mind the need to easily support other kinds of tests."
- Adaptability

"Such tests rely on measuring one or more parameters that can be grouped/organized by categories."
- Adaptability

"The ordering algorithm to be used by the application must be defined through a configuration file."
- Configurability

"The development team must implement unit tests for all methods except methods that implement Input/Output operations."
- Testability

"The unit tests should be implemented using the JUnit 4 framework."
- Testability

"The application should use object serialization to ensure data persistence between two runs of the application."
- Scalability

"The application should implement a brute-force algorithm (an algorithm which examines each subsequence) to determine the contiguous subsequence with maximum sum, for any interval of time registered."
- Scalability

"The application will be deployed to a machine with 8GB of RAM."
- Scalability

"The application should run on all platforms for which there exists a Java Virtual Machine."
- Compatibility

"The time complexity analysis of the algorithms should be properly documented in the application user manual (in the annexes) that must be delivered with the application."


###

### Design Constraints

_Specifies or constraints the system design process. Examples may include: programming languages, software process, mandatory standards/patterns, use of development tools, class library, etc._

###

### Implementation Constraints

_Specifies or constraints the code or construction of a system such
such as: mandatory standards/patterns, implementation languages,
database integrity, resource limits, operating system._


"The application must be developed in Java language"
- Implementation languages

"Using the IntelliJ IDE or NetBeans."
- Platform Support

"The JaCoCo plugin should be used to generate the coverage report."
- Platform Support

"The NHS required that both simple linear and multiple linear regression algorithms should be evaluated to select the best model."
- Standards-compliance

"The accuracy of the prediction models should be analysed and documented in the application user manual (in the annexes) that must be delivered with the application."
- Standards-compliance

"Adopt recognized coding standards (e.g., CamelCase)."
- Standards-compliance

"Use Javadoc to generate useful documentation for Java code."
- Standards-compliance

###

### Interface Constraints
_Specifies or constraints the features inherent to the interaction of the
system being developed with other external systems._


"that is automatically generated using an external API"
- External Systems
  
"all the information demanded by the NHS (and) should send them to the NHS using their API."
- External Systems

"All the images/figures produced during the sofware development process should be recorded in SVG format."
- Interface formats

The application graphical interface is to be developed in JavaFX 11."
- Interface formats

###

### Physical Constraints

_Specifies a limitation or physical requirement regarding the hardware used to house the system, as for example: material, shape, size or weight._
