FROM java:8
VOLUME /tmp
ADD service-feigns-0.0.1-SNAPSHOT.jar service-feign.jar
RUN bash -c 'touch /service-feign.jar' -e 'port = 8765'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-feign.jar"]