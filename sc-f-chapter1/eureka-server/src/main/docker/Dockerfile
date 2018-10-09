FROM java:8
VOLUME /tmp
ADD sc-f-chapter1.jar eureka-server.jar
RUN bash -c 'touch /eureka-server.jar' -e 'port = 8761'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar"]