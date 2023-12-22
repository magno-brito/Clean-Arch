# Clean-Arch

Este repositório tem como objetivo principal registrar minha jornada para a aprendizagem de dois tipos de arquitetura: controller-service-repository e a clean arch. Estes dois tipos de arquitetura foram muito presentes em minha jornada de aprendizagem. Inicialmente este projeto foi desenvolvido com a arquitetura c-e-r e em seguida fiz adaptação para a clean arch. 

## Controller-Service-Repository

Este modelo de arquitetura faz a separação entre a arquitetura em 4 partes: controller, service, repository e model. A figura abaixo mostra a organização desta arquitetura.

<img src="https://github.com/magno-brito/Clean-Arch/assets/84158231/e1a9668f-f59d-43c6-a315-77b8eaac02de" > 

- O usuário faz as requisições para o sistema e esta requisição chega a camada @controller. Geralmente esta camada apresenta os endpoints da aplicação. Por exemplo se o domínio for www.teste.com, é na camada de controller que podemos setar uma uri como endpoint do tipo "/user". Assim temos o seguint endpoit: "www.teste.com/user". A classe controller faz a comunicação direta com a camada @service.
- A camada service contém as regras de negócios da aplicação e é através dela que podemos nos comunicar com o modelo (model) do sistema. Geralmente os modelos são criados para mapear tabelas do banco de dados.
- A camada @repository é uma interface responsável por fazer a comunicação com o banco de dados. Geralmente ela extends uma interface que implementa o CRUD.

## Clean Arch

