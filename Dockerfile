FROM maven:3.9.11-amazoncorretto-25
WORKDIR /app

COPY pom.xml .
COPY src ./src

COPY src/main/resources/appsettings.docker.properties src/main/resources/appsettings.properties

RUN mvn clean package

CMD ["java", "-jar", "target/Zamowienia_Laby-1.0.jar"]

