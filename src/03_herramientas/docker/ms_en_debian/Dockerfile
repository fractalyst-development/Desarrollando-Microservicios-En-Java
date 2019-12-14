FROM debian
LABEL org.label-schema.schema-version="0.0.1-alpha"
LABEL org.label-schema.build-date="2019-12-12"
LABEL org.label-schema.name="poc_microservicio"
LABEL org.label-schema.description="PoC Microservicio en MicroProfile. Construcción y ejecución (Típicamente http://172.17.0.2:8080/api/libros)"
LABEL org.label-schema.url="http://www.fractalyst.com.mx/"
LABEL org.label-schema.vendor="fractalyst.com.mx"
LABEL org.label-schema.docker.cmd="docker run -name poc_ms_mp poc_microservicio:microprofile"
RUN apt-get update && apt-get install -y \
    maven
WORKDIR /app
COPY pom.xml /app/pom.xml
COPY src /app/src
RUN mvn package
ENTRYPOINT java -jar target/MicroServicioMPDemo-microbundle.jar