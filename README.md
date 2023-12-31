# Estudando Java
Repositório de exercícios básicos de lógica de programação e POO em linguagem Java, feitos durante curso de graduação da XP Educação - IGTI.

Nos exercícios de lógica, foram vistos conceitos de estruturas de dados e estruturas de decisão.

Em Programação Orientada a Objetos, foram estudados conceitos de Herança, Encapsulamento e Polimorfismo.

## Desafio final

Desenvolvimento de programa para calcular áreas de algumas figuras geométricas.

Funcionamento:

Deve-se criar um Menu Inicial com as seguintes opções:

1) Calcular área do Triângulo Retângulo;
2) Calcular área do Círculo;
3) Calcular área do Quadrado;
4) Finalizar programa.

Após a pessoa usuária selecionar uma das opções de Cálculo de Área, o programa deve solicitar todas as medidas em metros necessárias para o cálculo.
Feitos os cálculos, imprimir o resultado do Cálculo da Área e voltar a exibir o Menu Inicial.
Caso não haja mais cálculos a serem realizados, basta selecionar a opção "Finalizar programa" e ele deve ser encerrado.

Lembre-se de desenvolver o programa utilizando os conceitos de Orientação a Objetos que julgar mais adequados.

### Desenvolvimento

Foi criada a classe abstrata ```Figura Geométrica``` para o molde das figuras e utilizada a herança para implementação do código.
Figura ```Círculo``` necessita de refatoração.

Para a calculadora, foram utilizadas as estruturas de decisão ```Do/While``` para a exibição e finalização do Menu Inicial e ```Switch/Case``` para escolha das opções de figuras e seus respectivos cálculos.

### Edit

Incluindo exercícios de módulos vistos no curso livre **Java Fundamentos**, da [FIAP](https://eucapacito.com.br/curso-ec/java-fundamentos).
