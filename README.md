# workspace-qualidadedesoftware

# Testes da Calculadora

## Objetivo dos Testes
Os testes da classe `Calculadora` têm como objetivo garantir a precisão das operações de adição, subtração, multiplicação, divisão, fatorial e potência incluindo a validação de entradas para evitar overflow e underflow. Os testes verificam diferentes cenários, como a adição de números positivos, negativos e zeros, bem como casos em que os resultados ultrapassam os limites máximos e mínimos permitidos.

Os testes estão organizados na classe `OperadoresTest`, que utiliza o framework de testes JUnit. Os seguintes testes foram implementados:

## Estrutura dos Testes de Adição

- **A soma de dois números positivos**: Verifica se a soma de dois números positivos retorna o valor correto.
- **A soma de um número negativo e um número positivo**: Verifica se a soma de um número negativo e um positivo resulta em um valor correto.
- **A soma de dois números negativos**: Verifica se a soma de dois números negativos mantém o sinal.
- **A soma com zero**: Verifica se a adição de zero retorna o próprio número.
- **Exceção para soma acima do limite máximo**: Testa se uma exceção é lançada quando a soma ultrapassa o valor máximo permitido para um inteiro.
- **Exceção para soma abaixo do limite mínimo**: Testa se uma exceção é lançada quando a soma ultrapassa o valor mínimo permitido para um inteiro.

## Estrutura dos Testes de Subtração


## Como Executar os Testes
Para executar os testes, você pode utilizar o Maven com o seguinte comando no terminal:

```bash
mvn test

