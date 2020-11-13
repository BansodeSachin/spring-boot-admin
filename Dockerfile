FROM java:8
LABEL maintainer=“bansodesachin0@gmail.com”
VOLUME /tmp
EXPOSE 8086
ADD target/spring-bood-admin-1.0.0-SNAPSHOT.jar spring-boot-admin.jar
ENTRYPOINT ["java","-jar","spring-boot-admin.jar"]