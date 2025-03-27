# As bases do Java
Java é uma linguagem *POO* (Orientada a Objetos), ou seja, se utiliza da **interação** de objetos. O Java te força a seguir esse paradigma.
- Linguagens como *JavaScript, Python* são **multiparadigmas**, pois não seguimos *apenas um* paradigma para trabalhar. Podemos fazer tanto POO, como um paradigma *procedural* ou até mesmo *funcional*, por exemplo.
- **Linguagem fortemente tipada**. Cada variável deve ser definida com seu tipo. No Java, não podemos alterar o *tipo* de uma variável depois dela ter sido criada.
- Java é uma linguagem portátil, **independente de plataforma**. Ou seja, um programa compilado, um executável do Java vai rodar em diferentes sistemas operacionais. Isso acontece graças a **JVM**.

## Java Virtual Machine (JVM)
Ambiente de execução que vai interpretar o bytecode do Java. Diferente de outras linguagens, que compilam o código e transformam em *linguagem de máquina*, o Java transforma o código em *bytecode*, que é lido pela **JVM**. Ou seja, não é feito para o computador ler, mas para a **JVM** ler, e ela que vai converter isso em instruções para o nosso computador em específico.
- Obviamente que, sabendo disso, podemos dizer que é praticamente obrigatório ter a **JVM** instalada no computador.
- É a **JVM** que vai fazer o *gerenciamento de memória*, *coleta de lixo* do nosso programa, *reciclar variáveis que não estão sendo utilizadas*, *segurança*, etc.

## Java Development Kit (JDK)
É aqui onde colocamos o nosso código, que vai ser transformado em *bytecode* posteriormente. É necessário instalar tanto a **JVM** quanto o **JDK** para poder codar em Java.