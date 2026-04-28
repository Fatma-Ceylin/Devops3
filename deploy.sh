#!/bin/bash

# Kullanıcı adını buraya açıkça yaz (Örn: fceylin)
IMAGE_NAME="fceylin/devops3-app:latest"
CONTAINER_NAME="app-webapp-1"

echo "Yeni imaj çekiliyor: $IMAGE_NAME"
docker pull $IMAGE_NAME

echo "Eski konteyner durduruluyor..."
docker stop $CONTAINER_NAME || true
docker rm $CONTAINER_NAME || true

echo "Yeni konteyner başlatılıyor..."
# Port eşlemesini senin sistemine göre (80:8081) ayarladım
docker run -d --name $CONTAINER_NAME -p 80:8081 $IMAGE_NAME