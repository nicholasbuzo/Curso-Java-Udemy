# Introdução Java
Um projeto em java é organizado por classes.

Classes são agrupadas por Packages.

Módulo => Agrupamento Lógico de pacotes com classes.

## Operadores Aritméticos
+, -, *, / e mod(resto)

## Variáveis e tipos básicos
Sintaxe:
```
<tipo> <nome> = <valor inicial>;
# Exemplo:
int idade = 25;
String nome = "Bruno";
double peso = 65.2;
```
### Tipos básicos:
Numéricos inteiros => byte, short, int, long

Numéricos com decimais => float e double

Caractere Unicode => char

Valor verdade => boolean

String => Cadeia de caracteres

### Convenção para nome das variáveis
Não começar com dígito, usar primeira letra minúscula e camel case

## Operações básicas de programação
Entradas de dados => Input (leitura)

Processamento de dados => Atribuição

Saída de dados => Output (escrita)

### Saída de dados
```
System.out.print("Hello World") // Sem quebra de linha
System.out.println("Hello World") // Com quebra de linha
```
Imprimindo uma variável com casas decimais:
```
System.out.printf("%.4f%n", pi); // %.xf define qtd. de x números decimais
// %n => quebra de linha
```
#### Concatenação
```
System.out.println("Resultado: " + soma + " dólares");
System.out.printf("%s tem %d e pesa %.2fkg\n", nome, idade, peso);
/* Marcadores
* %d => Inteiros
* %s => Strings
*/
```

### Processamento de dados
```
<variavel> = <expressao>;
```
