/*

Enunciado: 

Crie uma classe Data com as seguintes capacidades:

Gerar saída da data em múltiplos formatos, como: DD/MM/AAAA; Agosto 08, 2017; DDD AAAA;
Utilize construtores sobrecarregados para criar objetos Data inicializados com datas no formato definido em cima.

- No primeiro caso, o construtor deve receber 3 valores inteiros.
- No segundo caso, deve receber uma String e 2 valores inteiros.
- No terceiro caso deve receber 2 valores inteiros, o primeiro representando o número de dias no ano.

Faça uma classe principal que implemente o método main que deverá instanciar 2 objetos de cada formato e depois imprimir cada um deles.

*/

package poo.lista3.Ex4;

public class Main {
    
    public static void main(String[] args) {
     
     System.out.println("Data 1: ");   
     Data data1 = new Data (15, 04, 1994);
     System.out.println(data1.primeiroCaso());

     System.out.println("Data 2: ");   
     Data data4 = new Data (17, 02, 1967);
     System.out.println(data4.primeiroCaso());
     
     System.out.println("Data 3: ");   
     Data data2 = new Data ("Abril", 8, 1968);
     System.out.println(data2.segundoCaso());
     
     System.out.println("Data 4: "); 
     Data data5 = new Data ("Outubro", 4, 1991);
     System.out.println(data5.segundoCaso());
     
     System.out.println("Ano: ");   
     Data data3 = new Data (365, 2022);
     System.out.println(data3.terceiroCaso());
     
     System.out.println("Ano bissexto qualquer: ");   
     Data data6 = new Data (366, 2008);
     System.out.println(data6.terceiroCaso());

    }
}
