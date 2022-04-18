FROM java:8
MAINTAINER Mike
ADD ./target/k8s-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
RUN bash -c 'touch /app.jar'
ENTRYPOINT["java","-jar","app.jar"]