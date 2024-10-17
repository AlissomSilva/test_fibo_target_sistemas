# Fibonacci Sequence Checker

Este projeto implementa um programa em Java para calcular a sequência de Fibonacci e verificar se um número informado pertence ou não à sequência.

## Descrição

A sequência de Fibonacci começa com 0 e 1, e o próximo valor é sempre a soma dos dois valores anteriores. O programa recebe um número como entrada, calcula a sequência de Fibonacci até o valor informado, e retorna uma mensagem informando se o número faz parte da sequência.

### Exemplo

Dada a sequência de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

- **Entrada:** 8
- **Saída:** O número 8 pertence à sequência de Fibonacci.

- **Entrada:** 7
- **Saída:** O número 7 não pertence à sequência de Fibonacci.

## Pré-requisitos

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) versão 8 ou superior instalado.
- [Git](https://git-scm.com/downloads) para controle de versão.

## Como executar o projeto

### 1. Clonar o repositório

Clone o repositório para sua máquina local:


git clone https://github.com/AlissomSilva/test_fibo_target_sistemas.git


### 2. Navegar até o diretório do projeto
bash

cd test_fibo_target_sistemas

### 3. Compilar o código
Compile o código Java usando o seguinte comando:



javac FibonacciChecker.java

### 4. Executar o programa
Após compilar o código, execute o programa:


java FibonacciChecker
Você pode alterar o número a ser verificado no código-fonte ou adaptar o programa para receber o número via entrada do usuário.

### Estrutura do Projeto
test_fibo_target_sistemas/
│
├── README.md               # Instruções do projeto
├── FibonacciChecker.java    # Implementação do cálculo e verificação de Fibonacci
### Explicação do Código
O código em Java segue a seguinte lógica:

Calcula a sequência de Fibonacci iterativamente.
Verifica se o número informado pertence à sequência.
Exibe a sequência calculada e uma mensagem informando se o número está ou não presente.
Funções principais:
isFibonacci(int number): Retorna true se o número pertence à sequência de Fibonacci.
generateFibonacci(int limit): Gera a sequência de Fibonacci até um determinado limite.
