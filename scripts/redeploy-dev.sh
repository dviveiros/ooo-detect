#!/usr/bin/env bash

bash ./dev.sh

kubectl get rc ooo-email-detect-dev > /dev/null 2>&1;
if [ $? -ne 0 ]; then
  echo "Replication controller does not exist, creating.";
  kubectl create -f ../email-based-detection/kubernetes/rc-dev.yaml;
else
  echo "Updating rc and performing rolling update";
  kubectl apply -f ../email-based-detection/kubernetes/rc-dev.yaml;
  kubectl rolling-update ooo-email-detect-dev --image=$1;
  if [ $? -ne 0 ]; then
    echo "Could not perform rolling update"
      exit 1;
  fi;
fi
