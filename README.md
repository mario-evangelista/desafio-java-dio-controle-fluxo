## Controle de Fluxo - Desafio - Java - DIO - Santander Dev Week 2024

**Introdução**

Este desafio visa implementar um programa em Java que recebe dois números inteiros como entrada, realiza a contagem entre eles e imprime os números na tela. O programa também valida se o primeiro número é maior que o segundo, lançando uma exceção personalizada caso essa condição seja verdadeira.

**1. Objetivo do README**

Este README fornece instruções detalhadas para baixar, compilar e executar o código do Desafio Controle de Fluxo em Java. Além disso, inclui informações sobre o funcionamento do programa, sua estrutura e dicas para aprimorá-lo.

**2. Pré-requisitos**

Para executar o código deste desafio, você precisará de:

* **Java Development Kit (JDK):** Instale a versão mais recente do JDK em seu sistema operacional. Você pode encontrar o download em [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/).
* **Editor de Código:** Utilize um editor de código de sua preferência, como Visual Studio Code, Sublime Text ou IntelliJ IDEA.

**3. Baixando o Código**

1. Clone este repositório em seu diretório local:

```bash
git clone https://github.com/mario-evangelista/desafio-java-dio-controle-fluxo.git
```

2. Acesse o diretório clonado:

```bash
cd controle-fluxo
```

**4. Compilando o Código**

1. Utilize o comando `javac` para compilar os arquivos Java:

```bash
javac Contador.java ParametrosInvalidosException.java
```

**5. Executando o Código**

1. Execute o programa usando o comando `java`:

```bash
java Contador
```

2. Digite dois números inteiros conforme solicitado.
3. O programa imprimirá os números na tela ou exibirá uma mensagem de erro caso a ordem dos parâmetros esteja incorreta.

**6. Funcionamento do Código**

O código principal está dividido em três classes:

* **Contador.java:** Contém o método `main` e a lógica principal da contagem.
* **ParametrosInvalidosException.java:** Define a exceção personalizada para validar a ordem dos parâmetros.
* **TesteContador.java (Opcional):** Classe de teste para verificar o funcionamento do programa.

**7. Estrutura do Código**

**Contador.java:**

* **Método `main`:** Lê dois números inteiros do usuário, tenta chamar o método `contar` para realizar a contagem e captura a exceção `ParametrosInvalidosException` caso ocorra.
* **Método `contar`:** Valida se o primeiro parâmetro é maior que o segundo, lançando a exceção `ParametrosInvalidosException` se essa condição for verdadeira. Calcula a contagem e utiliza um loop `for` para imprimir os números na tela.

**ParametrosInvalidosException.java:**

* Define uma exceção personalizada para validar a ordem dos parâmetros e herda da classe `Exception`.

**8. Melhorias Possíveis**

* Implementar validação para garantir que os valores digitados sejam realmente números inteiros.
* Adicionar funcionalidades para lidar com outros tipos de erros, como entradas vazias ou valores fora do intervalo esperado.
* Implementar testes unitários para garantir a robustez do código.

**9. Contribuições**

Sinta-se à vontade para contribuir com este projeto! Envie suas sugestões, correções de bugs ou novas funcionalidades através de pull requests.

**10. Agradecimentos**

Agradecemos a todos que contribuíram para este projeto e esperamos que ele seja útil para você aprender sobre controle de fluxo em Java!

## Contato

Para mais informações, entre em contato através do email: mario@gmail.com

<br>
**Meu Perfil na DIO:** [https://www.dio.me/users/mariojbe](https://www.dio.me/users/mariojbe)

<br>
Developed by Mário Evangelista
