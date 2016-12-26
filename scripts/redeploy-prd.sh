#!/usr/bin/env bash

bash ./prod.sh

if [ $# -eq 0 ]
  then
    echo "You must inform the tag to be deployed"
    exit 1
fi

kubectl get rc ooo-email-detect-prd > /dev/null 2>&1;
if [ $? -ne 0 ]; then
  echo "Replication controller does not exist, creating.";
  kubectl create -f ../email-based-detection/kubernetes/rc-prd.yaml;
else
  echo "Updating rc and performing rolling update";
  kubectl apply -f ../email-based-detection/kubernetes/rc-prd.yaml;
  kubectl rolling-update ooo-email-detect-prd --image=$1;
  if [ $? -ne 0 ]; then
    echo "Could not perform rolling update"
      exit 1;
  fi;
fi

bash ./dev.sh
