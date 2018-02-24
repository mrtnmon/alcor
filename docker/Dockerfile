FROM java:8
ADD artifact-0.1.0.jar artifact.jar
RUN sh -c 'touch /artifact.jar'
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://spring-mongo/users","-Djava.security.egd=file:/dev/./urandom","-jar","/artifact.jar"]