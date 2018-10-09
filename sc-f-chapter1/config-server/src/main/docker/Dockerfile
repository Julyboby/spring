FROM java:8
VOLUME /tmp
ADD sc-f-chapter1.jar config-server.jar
RUN bash -c 'touch /config-server.jar' -e 'port = 8767'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-server.jar"]