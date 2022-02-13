FROM openjdk:11-jdk

LABEL maintainer="mooh2jj@naver.com"

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
