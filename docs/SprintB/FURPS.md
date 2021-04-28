# Supplementary Specification (FURPS+)

## Functionality

_Specifies functionalities that:_

- _are common across several US/UC;_
- _are not related to US/UC, namely: Audit, Reporting and Security._

***


- Auditing
  
***
- Authentication
  
"Associating the samples with the client/test, and identifying each sample with a barcode."
***
- Communication
  
***
- Error management
  
***
- Event management
  
***
- Licensing
  
***
- Localisation

"The application must support the English language only."

***
- Online help
  
***
- Persistence

"Registers in the application the test to be performed to that client."

"In case of a new client, the receptionist registers the client in the application."

"Records the samples in the system."

"Recording the results in the software application."
  
***
- Printing
  
***
- Reporting

"The client receives the notification by SMS and e-mail."

"The company is also required to generate daily (automatic) reports."

  
***
- Scheduling
  
***
- Security

"The application must be authenticated with a password holding seven alphanumeric characters, including three capital letters and two digits."

***
- Transaction management

***

- Workflow

"Registers in the application the test to be performed to that client."

"In case of a new client, the receptionist registers the client in the application."

"Records the samples in the system."

"Recording the results in the software application."


***

###

## Usability 

_Evaluates the user interface. It has several subcategories,
among them: error prevention; interface aesthetics and design; help and
documentation; consistency and standards._
***


- Accessibility
  
"(To facilitate the access to the results) the application must allow ordering the clients by TIF and by name."

"Only the specialist doctor is allowed to access all client data."

***

- Aesthetics

***

- Consistency

"The user interface must be simple, intuitive and consistent."



###

## Reliability
_Refers to the integrity, compliance and interoperability of the software. The requirements to be considered are: frequency and severity of failure, possibility of recovery, possibility of prediction, accuracy, average time between failures._
***

At least two sorting algorithms should be evaluated and documented in the application user manual (in the annexes) that must be delivered with the application.
***

- Accuracy
  
"(To facilitate) The application uses an external module that is responsible for doing an automatic validation using test reference values."
***

- Availability
  
"the results of the clinical analyses and the report become available in the system."
"At the same time the results are also available in the central application."
***
- Recoverability

"Whenever the system fails, there should be no data loss.
The system should not fail more than 5 days in one year."
***

###

## Performance
_Evaluates the performance requirements of the software, namely: response time, start-up time, recovery time, memory consumption, CPU usage, load capacity and application availability._
***

Recovery time

"System has to recover quick from any problems that may appear".
***

- Response Time

"The company wants to decrease the number of tests waiting for its result."

"Any interface between a user and the system shall have a maximum response time of 3 seconds."
***
- Shutdown time
***
- Start-up time

"The system should start up in less than 10 seconds."

***

- Throughput

"The complexity analysis must be accompanied by the observation of the execution time of the algorithms for inputs of variable size in order to observe the asymptotic behaviour."

"It is intended that the choice of the ordering algorithm is based on the algorithm complexity (mainly the execution time)"

"The implemented algorithm should be analysed in terms of its worst-case time complexity, and it should be compared to a provided benchmark algorithm."


***
###

## Supportability
_The supportability requirements gathers several characteristics, such as:
testability, adaptability, maintainability, compatibility,
configurability, installability, scalability and more._ 

***

- Adaptability

"The system should be developed having in mind the need to easily support other kinds of tests."

"Such tests rely on measuring one or more parameters that can be grouped/organized by categories."
***

- Auditability
***
- Compatibility

"The application should run on all platforms for which there exists a Java Virtual Machine."
***
  
- Configurability

"The ordering algorithm to be used by the application must be defined through a configuration file."
***

- Installability
***

- Localizability

"The application must support the English language only."


***

- Maintainability
  
***

- Scalability

"The application should use object serialization to ensure data persistence between two runs of the application."

"The application should implement a brute-force algorithm (an algorithm which examines each subsequence) to determine the contiguous subsequence with maximum sum, for any interval of time registered."

"The application will be deployed to a machine with 8GB of RAM."
***

"The time complexity analysis of the algorithms should be properly documented in the application user manual (in the annexes) that must be delivered with the application."
***
- Testability

"The development team must implement unit tests for all methods except methods that implement Input/Output operations."

"The unit tests should be implemented using the JUnit 4 framework."

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
