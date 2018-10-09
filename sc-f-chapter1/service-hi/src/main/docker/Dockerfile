FROM java:8
VOLUME /tmp
ADD sc-f-chapter1.jar service-hi.jar
RUN bash -c 'touch /service-hi.jar'
EXPOSE 8762
EXPOSE 8763
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-hi.jar"]