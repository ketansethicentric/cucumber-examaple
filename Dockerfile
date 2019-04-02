FROM openjdk:8u191-jre-alpine3.8

RUN apk add curl jq

# Workspace
WORKDIR /usr/share/centric

# ADD .jar under target from host
# into this image
ADD target/cucumber-example-docker-tests.jar			cucumber-example-docker-tests.jar
ADD target/cucumber-example-docker.jar 					cucumber-example-docker.jar
ADD target/libs											libs


ADD src/test/resources									src/test/resources




ENTRYPOINT java -cp cucumber-example-docker.jar:cucumber-example-docker-tests.jar:libs/* -DHUB_HOST=$HUB_HOST -DBROWSER=$BROWSER -Dcucumber.options="--tags $TAG" org.junit.runner.JUnitCore com.amazon.runner.RunnerTest