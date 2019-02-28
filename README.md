# desafio-api-meta

# Como executar a aplicação:
Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git.

git clone https://github.com/daviddener22/desafio-api-meta.git</br>
cd desafio-api-meta</br>
mvn spring-boot:run</br>
Acesse http://localhost:8080/api/contatos</br>
Utilize o usuário "user" e a senha que é impressa no terminal ao executar a aplicação para autenticar.</br>
# APIs endpoints</br>
GET http://localhost:8080/api/contatos [lista todos os contatos]</br>
GET http://localhost:8080/api/contatos/{idContato} [lista um contato por ID]</br>
POST http://localhost:8080/api/contatos [cadastra um novo contato]</br>
PUT http://localhost:8080/api/contatos/{idContato} [atualiza os dados de um contato]</br>
DELETE http://localhost:8080/api/contatos/{idContato} [remove um contato por ID]</br>
