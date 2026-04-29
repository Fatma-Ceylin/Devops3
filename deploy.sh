#!/bin/bash

cd /home/ec2-user/app

echo "--- New images are being pulled ---"
# pulls the last versions of images inside the docker compose file
docker-compose pull

echo "--- System is being restarted: Our database + application ---"
# stops old containers and makes up the new ones
docker-compose up -d --remove-orphans

echo "--- Old and unused images are being cleaned ---"
# removes old images and recesses
docker image prune -f

echo "--- Status of containers ---"
docker ps