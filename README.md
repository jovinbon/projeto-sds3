# DSVendas
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/jovinbon/projeto-sds3/blob/master/LICENSE) 

# Sobre o projeto

https://dsvendas-cfontes.netlify.app

DSVEndas é uma aplicação full stack web construída durante o evento **Semana Spring React** (#sds5), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em um gerenciador de vendas, onde os dados são mostrados no dashboard apresentando duas (2) informações em gráficos: barras e rosca em valores de percentual de sucesso e dos totais de vendas de cada vendedor. 
É apresentado abaixo dos gráficos uma tabela paginada com as informações da data, nome do vendedor, nome do cliente visitado, negócios fechados e valores em R$.

Observação: ao clicar no link acima aguarde uns minutos após clicar no botão "Acessar dashboard" para que a página do dashbord carregue!

## Layout tela inicial
![Tela inicial](https://github.com/jovinbon/assets/blob/main/telainicial.png)

## Layout do dashboard
![Tela dashboard](https://github.com/jovinbon/assets/blob/main/dashbordvendas.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/jovinbon/assets/blob/main/modeloconceitual.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/jovinbon/projeto-sds3

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/jovinbon/projeto-sds3

# entrar na pasta do projeto front end web
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Cristiano Alves Fontes

https://www.linkedin.com/in/cristiano-fontes-15503369
