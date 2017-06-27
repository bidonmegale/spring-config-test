# spring-config-server

Principal projeto, quando ele está de pé lê os arquivos no repositório [springconfig-repo](https://github.com/cezbatistao/springconfig-repo) que podem ser acessados via uma REST API disposnibilizada pela lib spring-cloud-config-server.

Para rodar:
`
mvn spring-boot:run
`

Para verificar que está no ar, basta acessar a seguinte url: [http://localhost:8888/configserver/sampleconfig/default](http://localhost:8888/configserver/sampleconfig/default)

Entendendo os paramentros:
* http://localhost:8888/configserver é o contexto da aplicação
* sampleconfig é o nome do arquivo de configuração definido no repositório [springconfig-repo](https://github.com/cezbatistao/springconfig-repo)
* default é o ambiente(profile)

Para mais detalhes verificar artigo: [Externalizando configurações com Spring Cloud Config](https://cezbatistao.wordpress.com/2016/05/18/externalizando-configuracoes-com-spring-cloud/)
