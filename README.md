# RMI-Calculadora

<details>
  <summary> <h3> Sumário </h3> </summary>

  - [Descrição](#descricao)
  - [Pre-requisitos](#pre_requisitos)
  - [Execução](#execucao)
  - [Referências](#referencais)
    
</details>

<a id="descricao"></a>
## 📜 Descrição:

A solução proposta implementa um serviço remoto usando RMI em Java. No caso,  uma Calculadora que fornece as quatros operações básicas.

- No Package **common** contém  Interfaces, como CalcInterface, que definem os métodos  e a comunicação entre o Sercer o Client.

- No Package **server** contém a lógica e a implementação das interfaces em **common**. No Server.java cria as instâncias das implementações e as vinculam em um registro RMI .

- No Package **Client** contém o Cliente RMI (Client.java) que procura as referências nos registros e realiza chamadas remotas das implementações no Server Side.  

<a id="pre_requisitos"></a>
## 💻 Pré-requiusitos

- [Java 9 ou superior](https://www.oracle.com/br/java/technologies/downloads/)


<a id="execucao"></a>
## 🪛 Execução:

- 1º No Root execute o comando abaixo no terminal:

 ```
  javac common/*.java server/*.java clinet/*.java
```

- 2º Inicialize rmiregistry:

 ```
  rmiregistry
```

- 3º Inicialize o Server em um terminal separado:

 ```
  java server/Server
```

- 4º Inicialize o Client em um terminal separado:

 ```
  java client/Client
```

FIM

<a id="referencias"></a>
## Referências

- [Aula dirigida](https://github.com/alinebrito/AulaPraticaRMI)


