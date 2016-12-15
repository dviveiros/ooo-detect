#!/usr/bin/env bash

gcloud config set project d1-labs
gcloud config set container/cluster d1-labs-cluster-1
gcloud container clusters get-credentials d1-labs-cluster-1
