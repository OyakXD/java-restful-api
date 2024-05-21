# Santander Dev WEEK 2023
 Java RESTful Api para a dev week 2023 

 ## Diagrama de classes

 ```mermaid
classDiagram
    class Usuario {
        - String name
        - Conta account
        - List~Feature~ features
        - List~Cartao~ card
        - List~Noticia~ news
    }
    
    class Conta {
        - String accountNumber
        - String accountAgency
        - float accountBalance
        - float accountLimit
    }
    
    class Feature {
        - String icon
        - String description
    }
    
    class Cartao {
        - String number
        - float limit
    }
    
    class Noticia {
        - String icon
        - String description
    }
    
    Usuario --> Conta
    Usuario --> Feature
    Usuario --> Cartao
    Usuario --> Noticia
```
