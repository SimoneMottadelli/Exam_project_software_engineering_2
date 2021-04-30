# Assignment one
### Team members:
Rota Claudio (816050), Mottadelli Simone Paolo (820786)
### Repository link:
https://gitlab.com/claudiom4sir/2019_assignment1_myapp
### Branches used:
master, claudio, simone-tests
### Description of the application:
The application (myapp) is a Spring-Boot app developed in Java and organized using Maven. 
It has a client-server architecture: the client is represented by a html page, while the server 
is a simple Java Servlet that can interact with a MySql database.
The system allows users to perform the following operations: 
*  save their names and email addresses in the system
*  see all the users registered in the system

To perform the first operation, inside the html page there is a form containing two fields, 
"name" and "email", which users have to fill with their data. These data are sent to a Java Servlet
and saved into a MySql database. Instead, to perform the second operation, the Java Servlet queries 
the MySql database to find the list of the users registered to the system and returns it.
More specifically, a user is modelled with the User Java class and the use of the Hibernate framework
makes it easy to materialize/dematerialize records into/from the MySql database.
### Stages developed and brief description:
Since the application is organized using Maven, most of the jobs of the pipeline are performed using Maven commands.
*  build: it simply compiles the app;
*  verify: it performs a static analysis of the code and it is composed by two jobs:
   the first one tries to find code violations, while the second one generates a
   site report of the app. Since the first job fails because of several violations,
   we allowed it to fail in order to make the pipeline successfully executable. 
   These jobs produce some output files that are saved as a artifacts;
*  unit-test: it runs simple tests on the User class;
*  integration-test: it tests the interactions between the Servlet and the MySql database;
*  package: it generates the application jar file and saves it as an artifact
*  release: it builds a docker image with the app and pushes it to the Gitlab registry
*  deploy: it enstablishes an ssh connection with the virtual machine that hosts the app, it pulls the image just stored on the Gitlab
    registry and finally it runs a container using that image

The package, release and deploy stages are executed only when pushing on the master branch.
We used a cache in order to avoid downloading the Maven dependencies multiple times.
In order to run the integration tests, we used the MySql service provided by Gitlab and, to distinguish 
unit tests from integration tests, we created two groups inside the app and used JUnit categories.
### How to use the app:
The application is publicly available at the following link: http://52.179.20.217:8080/ .
If such link does not work, it is because the virtual machine that hosts the application is not running. 
Please, contact us.
**Note that the virtual machine that hosts our application will expire on 14/11/2019 and, thus, we will no
longer be able to start it.**
### Problems found:
Most of the problems have been encountered during the release and the deploy stages,
because we did not know anything about Docker and how it worked.
Another problem we have encountered was related to commit messages: we realized that most 
of the commit messages were not explanatory and that the history of the project was 
not clear, so we fixed them using the "git rebase" command.
