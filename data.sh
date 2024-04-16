#!/bin/bash
# Instalacija Java
yum install -y java-11-amazon-corretto

# Postavljanje environment promenljivih
export HOST="database-movies.c342ug4mmfb2.eu-north-1.rds.amazonaws.com"
export PORT="5432"
export DATABASE="initial_database_movies"
export USERNAME="postgres"
export PASSWORD="postgres"

