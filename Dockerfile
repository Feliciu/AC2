FROM openjdk:11-oracle as build


COPY .mvn  .mvn
COPY mvnw .
COPY pom.xml  . 
COPY src src

RUN ./mvnw -B package

FROM openjdk:11-oracle

COPY  --from=build target/app-1.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar","app-1.jar"]