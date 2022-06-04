#!/bin/bash

APP_NAME="currency_converter"
APP_VERSION="1.0"

docker container kill $APP_NAME

docker container rm $APP_NAME

docker build -t ${APP_NAME}:${APP_VERSION} -f ./Dockerfile .

docker run --name ${APP_NAME} -p 8080:8080 -p 9990:9990 -p 8443:8443 ${APP_NAME}:${APP_VERSION}