#!/bin/bash
# Instalacija Java
yum install -y java-11-amazon-corretto

# Postavljanje environment promenljivih
export HOST=""
export PORT="5432"
export DATABASE="movies_db"
export USERNAME="postgres"
export PASSWORD="postgres"

