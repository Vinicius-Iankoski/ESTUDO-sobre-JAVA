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

import java.util.ArrayList;

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
          * - - long precisa terminar com um "L" no final. Ex: long = 1000000L;
          * 
          * ## Números Decimais
          *
          * - float: 32 bits -> precisao simples (19.23, 55.0)
          * - - float precisa terminar com um "f" no final. Ex: float = 10.5f;
          * - double: 64 bits -> precisao dupla (19.9999999, 23.500) para muitos numeros depois da virgula
          *
          * Saber essas coisas é bom para entendermos como economizar a memória.
          *
          * ## Textos
          *
          * - String: representar palavras e frases ("") - na verdade, String é uma classe, não um tipo primitivo.
          * - char: representar um unico caracter ('')
          *
          * ## Verdadeiro ou Falso
          *
          * - boolean: true ou false. 0 ou 1. Verdadeiro ou Falso.
          *
          */

// --> CONDICIONAIS
    boolean bool = false;
    String str = "uma frase";

    if (str.equals("uma frasae")) {
            System.out.println("Verdadeiro!");
    } else if (str == "uma frase") {
        System.out.println("Como você adivinhou isso?");
    }
    else {
            System.out.println("Falso!");
        }

// --> VETORES/ARRAYS
    int[] grupoDeInteiros = {1, 2, 3};
    // Desta forma que deixamos, o tamanho do array é fixo baseado no tanto de itens que possui.
    int[] arrayTeste = new int[5];
    // Desta forma, nós criamos o array sem necessariamente ter valores, porém com um tamanho {length} definido. 
    grupoDeInteiros[2] = 5;
    System.out.println(grupoDeInteiros[2]);

// --> ArrayList
/*
 * É uma classe que precisa ser importada de "import java.util.ArrayList;"
 * Extremamente útil, pois serve para criarmos listas dinâmicas.
 * - listas que não precisam de um tamanho fixo. Ou seja, podemos
 * facilmente adicionar e deletar elementos delas.
 *
 * Para adicionarmos e deletarmos elementos nele, temos que nos utilizar dos métodos. ".add", ".delete", ".get(0)".
 * 
 */
    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("jorge"); 
    nomes.add("robinsos");
    nomes.remove("jorge");
    nomes.remove(0);
    // podemos remover tanto pelo conteudo quanto pelo indice.
    
// LOOPS - Sintaxe
    for (int i = 0; i < grupoDeInteiros.length; i++){
        System.out.println(grupoDeInteiros[i]);
    };
    // "i" se chama iterador. O ArrayList tem uma maneira específica
    // de se fazer o processo nos loops, porém não foi passado
    // no vídeo da Fernanda.
    System.out.println("------------");
    grupoDeInteiros[2] = 3;
    for (int numeros : grupoDeInteiros){
        System.out.println(numeros);
    }
    // Sintaxe muito boa para arrays/vetores.
    // o int representa o tipo de conteudo que temos na array
    // selecionada (grupoDeInteiros), e numeros é o nosso iterador.

    System.out.println("------------");
    int contador = 0;
    while(contador < 10){
        System.out.println("Loop do while");
        contador++;
        // é fundamental colocar o contador++, do contrário, o while
        // NUNCA terá fim.
    }

    }
}