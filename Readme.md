# Этот репозиторий является шаблонным репозиторием для микросервисов на Java Spring с использованием СУБД PostgreSQL и технологии CI

## Для запуска в продовом редиме введите:
- `docker run -d -e POSTGRES_HOST_AUTH_METHOD=trust -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=pg_service_db -p 5432:5432 postgres:14`
- `./gradlew bootRun`


## Для запуска в дебажном редиме введите:
- `./gradlew bootTestRun`

## Для CI необходимо просто пушить коммиты в PR