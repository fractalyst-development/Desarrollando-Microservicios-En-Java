FROM jeanblanchard/java:8
LABEL org.label-schema.schema-version="0.0.1-alpha"
LABEL org.label-schema.build-date="2019-12-12"
LABEL org.label-schema.name="poc_microservicio"
LABEL org.label-schema.description="PoC Simple Microservicio en MicroProfile. Ejecución (Típicamente http://172.17.0.2:8080/api/libros)"
LABEL org.label-schema.url="http://www.fractalyst.com.mx/"
LABEL org.label-schema.vendor="fractalyst.com.mx"
LABEL org.label-schema.docker.cmd="docker run --name poc_ms_mp_slim poc_microservicio_slim:microprofile"
COPY target/MicroServicioMPDemo-microbundle.jar MicroServicioMPDemo-microbundle.jar
CMD java -jar MicroServicioMPDemo-microbundle.jar
