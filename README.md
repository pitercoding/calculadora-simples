# 🧮 Calculadora Simples em Java

Um projeto didático que implementa uma calculadora básica em **Java**, capaz de realizar as quatro operações aritméticas fundamentais: **adição, subtração, multiplicação e divisão**. 

Ideal para quem está começando a aprender programação e deseja entender conceitos como **operadores matemáticos**, **estruturas de controle de fluxo** (`if` / `switch`) e **interação com o usuário** via console.

## ✨ Funcionalidades Principais

### 🔢 Operações Suportadas
- ➕ Soma  
- ➖ Subtração  
- ✖️ Multiplicação  
- ➗ Divisão  

### 👤 Interação com o Usuário

- Permite a inserção de dois números reais.  
- Solicita a escolha da operação desejada.  
- Exibe o resultado da operação realizada.  

### ⚠️ Tratamento de Erros

- Implementa verificação para evitar **divisão por zero**, exibindo uma mensagem informativa ao usuário.  

## 🚀 Como Utilizar

Siga estes passos para executar a calculadora em sua máquina:

### 1️⃣ Clone o Repositório
```bash
git clone https://github.com/pitercoding/calculadora-simples
```

### 2️⃣ Navegue até a Pasta do Projeto
```bash
cd calculadora-simples
```

### 3️⃣ Compile e Execute o Programa:

Abra um terminal na pasta do projeto e execute os comandos abaixo:
```bash
javac CalculadoraSimples.java
java CalculadoraSimples
```
O programa será iniciado e solicitará que você insira os números e a operação desejada diretamente no console.

## ⚙️ Entendendo o Código

O código segue um fluxo simples e direto:

1.  **Entrada de Dados:** Utiliza a classe `Scanner` para receber a entrada do usuário para os dois números e a operação a ser realizada.
2.  **Processamento:** Emprega uma estrutura `switch` (com alternativas `if` para a divisão por zero) para determinar qual operação matemática executar com base na entrada do usuário.
3.  **Saída:** O resultado final do cálculo é impresso no console.

### 🧩 Exemplo de Código

```java
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close(); // Boa prática: fechar o Scanner
    }
}
```

## 🛠️ Tecnologias Utilizadas

* Java: A linguagem de programação principal utilizada para o desenvolvimento da calculadora.

## 🤝 Contribuição

Contribuições são bem-vindas! Se você tiver alguma sugestão de melhoria ou quiser adicionar novas funcionalidades, siga os passos abaixo:

1. Faça um **fork** do repositório.
2. Crie uma **branch** para sua funcionalidade.
```bash
git checkout -b feature/nova-funcionalidade
```
3. Faça o **commit** das suas alterações.
```bash
git commit -am 'Adiciona nova funcionalidade'
```
4. Envie para o seu repositório remoto:
```bash
git push origin feature/nova-funcionalidade
```
5. Abra um **pull request**.
   
## 📜 Licença

Este projeto está licenciado sob a **Licença MIT**. 

## 🌐 Sobre o Projeto

Uma **calculadora simples** desenvolvida como um exercício prático para demonstrar os **fundamentos da programação em Java**.
