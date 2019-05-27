## Recuperando todas as notas
curl localhost:8080/notes

## Criando uma nota
curl -X POST localhost:8080/notes -H 'Content-Type: application/json' -d '{ "title": "Nota de teste 2", "description": "Teste para o Spring Boot" }'

## Atualizando uma nota
curl -X PUT localhost:8080/notes/4 -H 'Content-Type: application/json' -d '{ "title": "Nota de teste 4", "description": "Teste para o Spring Boot" }'

## Deletando uma nota
curl -X DELETE localhost:8080/notes/2

## Referência
https://medium.com/collabcode/implementando-uma-crud-api-no-spring-boot-com-kotlin-parte-1-c6e281d0f8f8

