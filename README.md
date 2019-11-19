# API RESTful Challenge_Backend
API RESTful com Spring Boot, Java 8, MongoDB, Docker e Spring Security 
### Como executar a aplicação
Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git e o Docker.

git clone https://github.com/karinnadias/backend_challenge.git  
mvn spring-boot:run  
Dentro da pasta do projeto executar: docker-compose up
Acesse  http://localhost:8080/api/campain  
Utilize o usuário "user" e a senha que é impressa no terminal ao executar a aplicação para autenticar.

### APIs endpoints (acessei utilizando o Postman)
GET http://localhost:8080/api/campain [lista todas as campain]  
GET http://localhost:8080/api/campain/{id} [lista uma campain por ID]    
POST http://localhost:8080/api/campain [cadastra um nova campain]  
PUT http://localhost:8080/api/campain/{id} [atualiza os dados de uma campain]  

### Importando o projeto no Eclipse
No terminal, execute a seguinte operação:
mvn eclipse:eclipse


## No Eclipse importe o projeto como projeto Maven.
