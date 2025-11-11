FROM maven:3.9-amazoncorretto-11-alpine As Builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package

FROM amazoncorretto:17-alpine-jdk
WORKDIR /webapps
COPY --from=Builder /app/target/*.jar /webapps/app.jar
CMD ["java", "-jar","app.jar"]
 
