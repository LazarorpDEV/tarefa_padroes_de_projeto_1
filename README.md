# Tarefa - Padroes de Projeto 1

Exercicio em Java: fabrica de carros usando o padrao **Abstract Factory**.

## Como funciona

O Abstract Factory permite criar familias de objetos relacionados por meio
 de interfaces. Neste projeto, cada montadora forma uma familia com dois
 tipos de produto: sedan e SUV.

- `FabricaDeCarros`: fabrica abstrata, com os metodos criarSedan e criarSuv.
- `FabricaToyota`: cria Corolla e CorollaCross.
- `FabricaHonda`: cria Civic e Hrv.
- `Sedan` e `Suv`: interfaces dos produtos.
- `Corolla`, `CorollaCross`, `Civic` e `Hrv`: produtos concretos.
- `Concessionaria`: cliente que recebe uma fabrica e usa as interfaces.
- `Main`: demonstra as duas familias.

A Concessionaria nao precisa conhecer as classes concretas dos carros.
A fabrica recebida determina quais produtos serao criados. Para adicionar
outra montadora, podemos implementar outra fabrica e os seus produtos.

Abstract Factory e Factory Method sao padroes distintos. Como o enunciado
cita uma fabrica de carros e Abstract Factory, este exemplo implementa
Abstract Factory com duas familias e dois tipos de produto por familia.

## Executar

Requisito: JDK instalado (Java 8 ou superior).
Abra o terminal dentro da pasta tarefa_padroes_de_projeto_1:

```shell
javac -encoding UTF-8 *.java
java Main
```

Saida esperada:

```text
=== Familia Toyota ===
Sedan Toyota: Corolla
SUV Toyota: Corolla Cross

=== Familia Honda ===
Sedan Honda: Civic
SUV Honda: HR-V
```

## Referencia de estudo

https://refactoring.guru/pt-br/design-patterns/abstract-factory/java/example

O exemplo de carros deste repositorio foi elaborado para a atividade.
