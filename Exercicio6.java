/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Foi feita uma pesquisa com um grupo de alunos de uma universidade, 
na qual se perguntou para cada aluno o número de vezes 
que utilizou o restaurante da universidade no último mês. Construa um algoritmo que determine: 
a) O percentual de alunos que utilizaram menos que 10 vezes o restaurante; 
b) O percentual de alunos que utilizaram entre 10 e 15 vezes; 
c) O percentual de alunos que utilizaram o restaurante acima de 15 vezes. 
*/
package DeverWhile;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int x;
        x = 0;
        int base;
        base = 0;
        int cont1;
        cont1 = 0;
        int cont2;
        cont2 = 0;
        int cont3;
        cont3 = 0;
        int per1;
        int per2;
        int per3;
        int teste;
        while(x != 9999)
        {
            System.out.println("Quantas vezes vc usou o restaurante: ");
                x = ler.nextInt(); 
                    base = base + 1;

            if(x < 10)
            {
                cont1 = cont1 + 1;
                
            }
            else if(x >= 10 & x < 15)
            {
                cont2 = cont2 + 1;
            }
            else if(x > 15 & x < 9999)
            {
                cont3 = cont3 + 1;
            }
        }
            per1 = (cont1/base)*100;
            per2 = (cont2/base)*100;
            per3 = (cont3/base)*100;
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.printf("O percentual de Alunos que frequentou 10 vezes é %d  %n",cont1);
            System.out.printf("O percentual de Alunos que frequentou entre 10 a 15 é %d  %n",cont2);
                System.out.printf("O percentual de Alunos que frequentou acime de 15 é %d  %n",cont3);
    }
    
}
