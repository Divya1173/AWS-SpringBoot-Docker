FROM openjdk:8
EXPOSE 8080
ADD target/CodeCommit-0.0.1-SNAPSHOT.jar CodeCommit-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CodeCommit-0.0.1-SNAPSHOT.jar"]
