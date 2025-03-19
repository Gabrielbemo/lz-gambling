# lz-gambling


## Local development

### Database

You need to create a local database, there is a docker-compose file to help handle a local PostgreSQL.
This docker-compose give you a PostgeSQL and pgAdmin.

Start the docker compose:
```shell
docker-compose up -d
```

Create a new db connection inside pgAdmin:
```shell
host name = postgres_container
port = 5432
user = postgres
pass = 12345
```

Access pgAdmin
```
http://localhost:5050/browser/
```

Create a Database inside paAdmin called ***GAMBLING***

Some helpfully sql scripts
```sql
SELECT *
FROM megasena_draws
ORDER BY data_sorteio DESC;

SELECT *
FROM mega_sena_draws_update_history_entity
;

DELETE FROM megasena_draws where id != 2000;
DELETE FROM mega_sena_draws_update_history_entity;
```

### Java project

```shell
.mvnw clean install spring-boot:run
```

### Local Test

Update MegaSenaDraws with a file:
```shell

cd src/main/resources/resultados

curl -X POST http://localhost:8080/v1/mega-sena/update-all-draws \
-H "Content-Type: multipart/form-data" \
-F "file=@Mega-Sena-2025-01-15.xlsx"
```
