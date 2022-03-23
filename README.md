# Pet Store App

**Problem :**
•	GET /pets: The backend returns a page of available pets in the PetStore. This is an example of the HTTP integration type. The URL of the integration endpoint is http://petstore-demo-endpoint.execute-api.com/petstore/pets.
•	POST /pets: for write access to the API's /pets resource that is integrated with the backend /petstore/pets resource. Upon receiving a correct request, the backend adds the specified pet to the PetStore and returns the result to the caller. The integration is also HTTP.
•	GET /pets/{petId}: for read access to a pet as identified by a petId value as specified as a path variable of the incoming request URL. The backend returns the specified pet found in the PetStore. The URL of the backend HTTP endpoint is http://petstore-demo-endpoint.execute-api.com/petstore/pets/n, where n is an integer as the identifier of the 


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes

### Prerequisites

JDk 1.11or higher, Eclipse or any IDE, Postman to test APIs

### Tech Stack

Java, Maven, SpringBoot, Swagger

### Running

if you run application as Java Application or SpringBoot App, its going to deployed on default port 8080 in embeded tomcat server

You can change the port number by configuring the value for server.port in application.properties file.

Once started , you can see that Only one API are created with  following requests and responses
 /codeRanges method type of Post.
 
Example

Swagger Url:
http://localhost:8080/swagger-ui/index.html?configUrl=/api-docs/swagger-config#/

<img width="951" alt="swagger" src="https://user-images.githubusercontent.com/53008196/159786802-af4c3780-6d7c-49d5-a631-cc062a3d26f8.png">
 

To Run test cases you can use mvn test command or right click and run as Junit in eclipse
