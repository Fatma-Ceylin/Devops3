#!/bin/bash
#clean the old container , pull the new one
docker pull ${{ secrets.DOCKERHUB_USERNAME }}/devops3-app:latest
docker stop my-app-container || true
docker rm my-app-container || true
docker run -d --name my-app-container -p 80:8080 ${{ secrets.DOCKERHUB_USERNAME }}/devops3-app:latest