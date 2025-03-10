FROM tomcat:9.0-jdk17
COPY build/libs/gradle-springboot-test-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]

