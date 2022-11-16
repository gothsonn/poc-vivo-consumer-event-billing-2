FROM maven:3.8.6-openjdk-11 as build

COPY . .
RUN rm settings.xml || true
RUN mvn -B -f pom.xml clean package -DskipTests=true
#    -Pdocker -DprofileIdEnabled=true

FROM openjdk:11.0.16-jdk
COPY --from=build target/*.jar application.jar
EXPOSE 9000
ENTRYPOINT ["java", "-Dspring.profiles.active=kafka", "-jar", "application.jar"]