/* 
Aqui começa o nosso estudo sobre a sintaxe do Java:
- TODO arquivo Java que formos escrever, precisa estar dentro
de uma classe. Somos obrigados a declarar uma classe em todo
arquivo que formos escrever.
- o nome da CLASSE tem que ser igual ao nome do ARQUIVO
obrigatoriamente. Eu posso sim, declarar outras classes dentro
do arquivo, mas eu preciso que pelo menos UMA tenha o nome do
arquivo. Essa classe TEM QUE TER o "public" na frente dela; ou
seja, a classe que for publica dentro do arquivo tem que ter o
nome do arquivo.
*/ 
public class Main {
    public static void main(String[] args) {
        /*
         * DECLARANDO VARIÁVEIS
         * Vamos começar falando sobre declarar variáveis no java. Aqui,
         * temos duas formas de declaração:
         * 
         * ## Especificando o tipo da variável
         * Nessa forma, nós colocamos o tipo, o nome e o valor atribuído a ela:
         * >> int MinhaIdade = 19;
         * 
         * ## Utilizando o var
         * Não estamos falando do VAR do futebol. Aqui, apenas utilizando a palavra
         * "var", já podemos criar a variável, sem necessariamente especificar o tipo dela:
         * >> var meuNome = "Vineolson";
         * O Java, por si só, vai INFERIR tipo da minha variável, sem que eu especifique.
         */

         /*
          * TIPOS PRIMITIVOS: quais são os tipos de variável?
          *
          * ## Números inteiros
          *
          * - byte: 8 bits -> -128 a 127
          * - short: 16 bits -> -32.768 a 32.767
          * - int: 32 bits -> -2.147.483.648 a 2.147.483.647
          * - long: 64 bits -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
          *
          * ## Números Decimais
          *
          * - float: 32 bits -> precisao simples (19.23, 55.0)
          * - double: 64 bits -> precisao dupla (19.9999999, 23.500) para muitos numeros depois da virgula
          *
          * ## Textos
          *
          * - String: representar palavras e frases ("")
          * - char: representar um unico caracter ('')
          *
          * ## Verdadeiro ou Falso
          *
          * - boolean: true ou false. 0 ou 1. Verdadeiro ou Falso.
          *
          */

    }
}