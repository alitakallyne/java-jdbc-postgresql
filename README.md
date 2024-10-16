# Projeto: Estudo de Java com PostgreSQL utilizando JDBC

Este repositório contém um projeto dedicado ao estudo de Java com integração ao banco de dados PostgreSQL, utilizando o JDBC (Java Database Connectivity). O objetivo é explorar os conceitos de manipulação de dados (DML) e definição de dados (DDL) no contexto de um banco de dados relacional.

## Tecnologias Utilizadas
- **Java**: Linguagem principal para o desenvolvimento do projeto.
- **PostgreSQL**: Banco de dados relacional para armazenamento e manipulação de dados.
- **JDBC (Java Database Connectivity)**: API Java para conexão e execução de operações no banco de dados.

## Objetivos do Projeto
- Aprender a configurar e utilizar o JDBC para conectar uma aplicação Java ao banco de dados PostgreSQL.
- Explorar comandos DDL (Data Definition Language) como `CREATE`, `ALTER`, `DROP` para definir e modificar a estrutura do banco de dados.
- Praticar comandos DML (Data Manipulation Language) como `INSERT`, `UPDATE`, `DELETE`, `SELECT` para manipulação de dados.
  
## Estrutura do Projeto
- **src/**: Contém o código-fonte Java com as implementações de conexão ao banco, execução de consultas e manipulações.
- **resources/**: Arquivos auxiliares, como scripts SQL para a criação e modificação de tabelas.

## Requisitos
- **Java 17+**
- **PostgreSQL**: Versão 10 ou superior
- **JDBC Driver**: PostgreSQL JDBC Driver

## Como Executar
1. Clone o repositório:  
   `git clone https://github.com/alitakallyne/java-jdbc-postgresql.git`
2. Configure as credenciais do banco de dados no arquivo de propriedades (caso necessário).
3. Compile e execute a aplicação para testar as funcionalidades de conexão e manipulação de dados no PostgreSQL.

## Próximos Passos
- Implementar transações no banco de dados com controle de commits e rollbacks.
- Explorar operações mais complexas, como joins e subconsultas.
