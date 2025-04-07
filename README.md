# Calculadora Simples em Java
Este é um projeto de uma calculadora simples desenvolvida em Java, que realiza operações matemáticas básicas como soma, subtração, multiplicação e divisão. O projeto é focado em ensinar conceitos básicos de programação, como o uso de operadores, controle de fluxo e interação com o usuário no console.

Funcionalidades

Operações suportadas:
* Soma
* Subtração
* Multiplicação
* Divisão

O usuário pode:
* Inserir dois números
* Escolher uma operação
* Ver o resultado da operação.

Como usar
1. Clone o repositório para a sua máquina local.
2. No terminal, navegue até a pasta do projeto.
3. Execute o programa.
4. O programa pedirá que você insira dois números e a operação que deseja realizar. A calculadora irá então exibir o resultado no console.

**Nota**: Se o usuário tentar dividir por zero, o programa irá exibir uma mensagem de erro.


O código é simples e direto, focando na lógica de operações matemáticas. A estrutura do código é a seguinte:
1. **Entrada de dados**: O programa solicita ao usuário a entrada de dois números e a operação.
2. **Processamento**: A operação desejada é realizada entre os dois números.
3. **Saída**: O resultado da operação é exibido no console.

Como funciona o código
O código realiza as operações utilizando `if` e `switch` para determinar qual operação será feita. Ele utiliza a entrada do usuário para decidir o tipo de operação a ser realizada e então executa a operação. Exemplo de código simples:
````
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicita a operação
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        // Solicita o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        // Realiza o cálculo conforme a operação
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

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);
    }
}
````

Tecnologias Utilizadas

**Java**: A calculadora foi construída utilizando a linguagem de programação Java, um dos principais pilares da programação orientada a objetos.

Contribuição
1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/alguma-feature`).
3. Commit suas alterações (`git commit -am 'Adicionando uma nova feature'`).
4. Push para a branch (`git push origin feature/alguma-feature`).
5. Abra um pull request.

Licença
Este projeto está sob a licença MIT - consulte o arquivo LICENSE para mais detalhes.
