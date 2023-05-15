FROM openjdk:17-oracle

WORKDIR /app

COPY target/dev-dslist.jar /app/dev-deslist.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "dev-deslist.jar" ]