
# Simple Demo App Spring Boot with Hexagonal Architecture and DDD

Um simples crud com Spring Boot demonstrando o uso da arquitetura Hexagonal, com essa arquitetura podemos separar as camadas do sistema separadas em 3 partes. Assim conseguimos ter um código de fácil manutenção, com baixo acoplamento e alta coesão. Essa arquitetura permite que qualquer camada do sistema seja testável de forma independe ou conjunta.




## Documentação da API

#### Retorna todos os itens

```http
  POST /product
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `sku` | `string` | **Obrigatório**. Código único do produto |
| `name` | `string` | **Obrigatório**. Nome do produto |
| `price` | `string` | **Obrigatório**. Preço do produto |
| `quantity` | `string` | **Obrigatório**. Quantidade do produto |

#### Exemplo request

{
    "sku": "XYZ",
    "name": "Product X",
    "price": 19.90,
    "quantity": 10 
}

#### Exemplo response

200 - OK

```http
  GET /product
```

#### Exemplo retorno

[
    {
        "sku": "100193-A",
        "name": null,
        "price": 100.0,
        "quantity": null
    }
]

```http
  PUT /product/${sku}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `sku` | `string` | **Obrigatório**. Código único do produto |
| `name` | `string` | **Obrigatório**. Nome do produto |
| `price` | `string` | **Obrigatório**. Preço do produto |
| `quantity` | `string` | **Obrigatório**. Quantidade do produto |

#### Exemplo request

{
    "name": "Product X",
    "price": 19.90,
    "quantity": 10 
}


## Tecnologias, APIs, bibliotecas, frameworks e outros

- Java 17
- Spring Boot 3
- Lombok
- Modelmapper
- Arquitetura Hexagonal


## Referência

 - [Hands-on Hexagonal Architecture With Spring Boot](https://medium.com/javarevisited/hands-on-hexagonal-architecture-with-spring-boot-ca61f88bed8b)
 - [Arquitetura Hexagonal com Spring Boot](http://rdrblog.com.br/java/spring/arquitetura-hexagonal-com-spring-boot/)
 - [Organizing Layers Using Hexagonal Architecture, DDD, and Spring](https://www.baeldung.com/hexagonal-architecture-ddd-spring)


## Autores

- [Carlos Martins](https://github.com/guttomarttins)

