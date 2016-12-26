#!/usr/bin/env bash

./prod.sh

# Expose the container as a service on port 8080
kubectl create -f ./email-based-detection/kubernetes/services-prd.yaml

# List the services to get the IP
kubectl get services
echo Repeat the command \'kubectl get services\' in a few minutes to get the external IP... it takes a while

./dev.sh
