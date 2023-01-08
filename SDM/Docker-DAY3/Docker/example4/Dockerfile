#FROM openjdk:17-alpine
# FROM openjdk
# COPY App.class .
# CMD java App

FROM ubuntu
RUN apt update
RUN apt install -y openjdk-11-jdk
WORKDIR myapp
COPY App.class .
CMD java App