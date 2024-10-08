# workspace-qualidadedesoftware

# Testes da Calculadora

## Objetivo dos Testes
Os testes da classe `Operacoes` têm como objetivo garantir a precisão das operações de adição, subtração, multiplicação, divisão, fatorial e potência incluindo a validação de entradas para evitar overflow e underflow. Os testes verificam diferentes cenários, como a adição de números positivos, negativos e zeros, bem como casos em que os resultados ultrapassam os limites máximos e mínimos permitidos.

Os testes estão organizados na classe `OperadoresTest`, que utiliza o framework de testes JUnit. Os seguintes testes foram implementados:

## Testes de Adição



- **A soma de dois números positivos**: Verifica se a soma de dois números positivos retorna o valor correto.
- **A soma de um número negativo e um número positivo**: Verifica se a soma de um número negativo e um positivo resulta em um valor correto.
- **A soma de dois números negativos**: Verifica se a soma de dois números negativos mantém o sinal.
- **A soma com zero**: Verifica se a adição de zero retorna o próprio número.
- **Exceção para soma acima do limite máximo**: Testa se uma exceção é lançada quando a soma ultrapassa o valor máximo permitido para um inteiro.
- **Exceção para soma abaixo do limite mínimo**: Testa se uma exceção é lançada quando a soma ultrapassa o valor mínimo permitido para um inteiro.

---

## Testes de Subtração

- **A subtração de dois números positivos**: Verifica se a subtração de dois números positivos retorna o valor correto.
- **A subtração de um número positivo e um número negativo**: Verifica se a subtração de um número positivo e um negativo retorna o valor correto.
- **A subtração de dois números negativos**: Verifica se a subtração de dois números negativos retorna o valor correto.
- **A subtração de um número por zero**: Verifica se a subtração de um número por zero resulta no próprio número.
- **Exceção para subtração acima do limite máximo**: Testa se uma exceção é lançada quando a subtração ultrapassa o valor máximo permitido.
- **Exceção para subtração abaixo do limite mínimo**: Testa se uma exceção é lançada quando a subtração ultrapassa o valor mínimo permitido.

---

## **Testes de Multiplicação**

- **A multiplicação de dois números positivos**: Verifica se a multiplicação de dois números positivos retorna o valor correto.
- **A multiplicação de um número positivo e um número negativo**: Verifica se a multiplicação de um número positivo e um negativo retorna o valor correto.
- **A multiplicação de dois números negativos**: Verifica se a multiplicação de dois números negativos retorna o valor correto.
- **A multiplicação com zero**: Verifica se a multiplicação de um número por zero retorna zero.
- **Exceção para multiplicação acima do limite máximo**: Testa se uma exceção é lançada quando a multiplicação ultrapassa o valor máximo permitido.
- **Exceção para multiplicação abaixo do limite mínimo**: Testa se uma exceção é lançada quando a multiplicação ultrapassa o valor mínimo permitido.

---

## **Testes de Divisão**

- **A divisão com dividendo e divisor positivos**: Verifica se a divisão de dois números positivos retorna o valor correto.
- **A divisão com dividendo positivo e divisor negativo**: Verifica se a divisão de um número positivo por um negativo retorna o valor correto.
- **A divisão com dividendo negativo e divisor positivo**: Verifica se a divisão de um número negativo por um positivo retorna o valor correto.
- **A divisão com dividendo e divisor negativos**: Verifica se a divisão de dois números negativos retorna o valor correto.
- **A divisão com dividendo zero**: Verifica se a divisão de zero por um número positivo retorna zero.
- **Exceção para divisão por zero**: Testa se uma exceção é lançada ao tentar dividir por zero.
- **Exceção para divisão acima do limite máximo**: Testa se uma exceção é lançada quando a divisão ultrapassa o valor máximo permitido.
- **Exceção para divisão abaixo do limite mínimo**: Testa se uma exceção é lançada quando a divisão ultrapassa o valor mínimo permitido.

---

## **Testes de Fatorial**

- **Fatorial não definido para números negativos**: Testa se uma exceção é lançada ao tentar calcular o fatorial de um número negativo.
- **Fatorial de zero**: Verifica se o fatorial de zero retorna o valor correto.
- **Fatorial de número positivo**: Verifica se o fatorial de um número positivo retorna o valor correto.
- **Fatorial de números grandes possitivos**: Verifica se o valor digitado é maior que o limite permitido.
- **Fatorial de números grandes negativos**: Verifica se o valo digitado é menor que o limite mínimo permitido.
---

## **Testes de Potência**

- **Potência com expoente zero**: Verifica se a potência de um número com expoente zero retorna o valor correto.
- **Potência com base e expoente positivos**: Verifica se a potência de dois números positivos retorna o valor correto.
- **Potência com expoente negativo**: Verifica se a potência de um número com expoente negativo retorna o valor correto.
- **Potência com base e expoente negativos**: Verifica se a potência de dois números negativos retorna o valor correto.

---

## Como Executar os Testes
Para executar os testes, você pode utilizar o Maven com o seguinte comando no terminal:

```bash
mvn test

