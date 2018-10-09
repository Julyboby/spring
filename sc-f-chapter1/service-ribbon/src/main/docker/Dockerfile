FROM java:8
VOLUME /tmp
ADD eureka-server.jar eureka-server.jar
RUN bash -c 'touch /eureka-server.jar' -e 'port = 8761'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar"]

ADD config-server.jar config-server.jar
RUN bash -c 'touch /config-server.jar' -e 'port = 8767'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-server.jar"]

ADD service-hi.jar service-hi.jar
RUN bash -c 'touch /server-hi.jar' -e 'port = 8762' -e 'port = 8763'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/server-hi.jar"]

ADD config-client.jar config-client.jar
RUN bash -c 'touch /config-client.jar' -e 'port = 8768'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-client.jar"]


ADD service-feigns-0.0.1-SNAPSHOT.jar service-feign.jar
RUN bash -c 'touch /service-feign.jar' -e 'port = 8765'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-feign.jar"]

ADD service-ribbon.jar service-ribbon.jar
RUN bash -c 'touch /service-ribbon.jar' -e 'port = 8764'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-ribbon.jar"]

ADD service-zuul.jar service-zuul.jar
RUN bash -c 'touch /service-zuul.jar' -e 'port = 8766'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-zuul.jar"]