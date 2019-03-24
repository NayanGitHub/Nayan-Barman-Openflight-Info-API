Instructions to run the program #Nayan-Barman-Openflight-Info-API :

Step1: 
Take the project from my git Repository
git clone https://github.com/NayanGitHub/Nayan-Barman-Openflight-Info-API.git

Step2:
Import into IDE: STS or Eclipse with STS plugin
Go to New->Import->Existing Maven Projects
Browse the location, select the Nayan-Barman-Openflight-Info-API/pom.xml and click Finish

Step3:
Do a Maven build in the IDE or in the git bash with the command mvn clean install

I am loading the data from csv files(Airlines.csv, Airports.csv, Routes.csv)
from the location C:\\All_Data\\WorkFile\\. These files are stored under folder misc for usage and reference.

Step4:
In the IDE go to the file com.flights.info.rest.SpringBootOpenflightInfoApiH2Application and run the file as Spring Boot App

The H2 database is accessible and viewable through the url: http://localhost:8080/h2/ with the below JDBC details:
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:~/test
User Name: sa
Password:

Step5:
I am using Swagger tool to generate an interactive API console for users to quickly learn about the APIs and experiment with requests and response.
The url for Swagger UI is: localhost:8080/swagger-ui.html

You can see 2 APIs under Airlines Controller:

list all flights out for a particular airport --> GET   /api/airlines/in/{dest_airport}  
list all flights in for a particular airport --> GET   /api/airlines/out/{source_airport} 

And you can see 1 API under Routes Controller:
display the airlines route for a given source & destination --> GET  /api/routes/airlines/{source_airport}/{dest_airport}

