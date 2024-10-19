# Microserviço Biblioteca

## Descrição
Este projeto é um microserviço para gerenciar uma biblioteca. Ele permite adicionar, remover e buscar livros, além de gerenciar empréstimos e devoluções.

## Tecnologias Utilizadas
- **Linguagem:** Java
- **Framework:** Springboot
- **Banco de Dados:** CosmosDB
- **Containerização:** Docker

## Funcionalidades
- Adicionar novos livros;
- Remover livros existentes;
- Buscar por Livros;
- Gerenciar empréstimos e devoluções de livros;

## Como Executar o Projeto
1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/microservbiblioteca.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd microservbiblioteca
    ```
3. Construa e inicie os containers Docker:
    ```bash
    docker-compose up --build
    ```

## Endpoints
- `GET /livros` - Lista todos os livros
- `POST /livros` - Adiciona um novo livro
- `GET /livros/{id}` - Busca um livro pelo ID
- `PUT /livros/{id}` - Atualiza as informações de um livro
- `DELETE /livros/{id}` - Remove um livro

## Contribuição
1. Faça um fork do projeto
2. Crie uma branch para sua feature:
    ```bash
    git checkout -b minha-feature
    ```
3. Commit suas mudanças:
    ```bash
    git commit -m 'Adiciona minha feature'
    ```
4. Envie para o repositório remoto:
    ```bash
    git push origin minha-feature
    ```
5. Abra um Pull Request

## Contato
Para mais informações, entre em contato pelo email: davipinheiro.dev@gmail.com
