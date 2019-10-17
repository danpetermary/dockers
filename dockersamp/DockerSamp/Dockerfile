FROM java:8-jre
ADD ./target/DockerSamp-0.0.1-SNAPSHOT.jar /usr/src/DockerSamp-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","DockerSamp-0.0.1-SNAPSHOT.jar"]