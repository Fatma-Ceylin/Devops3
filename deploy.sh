#!/bin/bash

cd /home/ec2-user/app

echo "--- Yeni imajlar DockerHub'dan çekiliyor ---"
# Docker compose dosyasındaki imajların (webapp vb.) en güncel halini çeker
docker-compose pull

echo "--- Sistem yeniden başlatılıyor (Database + Uygulama) ---"
# Eski konteynerleri durdurur ve yenilerini ayağa kaldırır
docker-compose up -d --remove-orphans

echo "--- Temizlik yapılıyor ---"
# Eski/isimsiz imajları silerek sunucuda yer açar
docker image prune -f

echo "--- Güncel Konteynır Durumu ---"
docker ps