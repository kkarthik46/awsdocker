From openjdk:8
EXPOSE 8084
Add target/springjpademoproj-0.0.1-SNAPSHOT.war springjpademoproj-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/springjpademoproj-0.0.1-SNAPSHOT.war" ]