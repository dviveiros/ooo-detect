FROM java:8
MAINTAINER Daniel Viveiros "viveiros@ciandt.com"

ADD build/install/email-based-detection/ /usr/src/app
ADD src/main/resources/application.yml /usr/src/app/application.yml
ADD src/main/resources/application-dev.yml /usr/src/app/application-dev.yml
ADD src/main/resources/application-prd.yml /usr/src/app/application-prd.yml

EXPOSE 8080
EXPOSE 8081

CMD /usr/src/app/bin/email-based-detection --env=${ENV} --spring.profiles.active=${ENV}