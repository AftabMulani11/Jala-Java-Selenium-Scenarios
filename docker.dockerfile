FROM UBUNTU


MAINTAINER Aftab Mulani <aftabmulani001@gmail.com>

RUN sudo yum update

RUN sudo yum install maven

RUN sudo mvn package