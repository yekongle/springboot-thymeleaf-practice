FROM java:8

VOLUME /tmp

ADD target/spring-boot-starter-parent-0.0.1-SNAPSHOT.jar /app/spring-boot-starter-parent-0.0.1-SNAPSHOT.jar

WORKDIR /app/

EXPOSE 8090

CMD ["java", "-jar", "/app/spring-boot-starter-parent-0.0.1-SNAPSHOT.jar"]