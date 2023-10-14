/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Faça um algoritmo que calcule e imprime a soma dos inteiros de 1 a 10.
Utilize as estruturas ENQUANTO-FACA para fazer um laço 
com as instruções de cálculo e incremento. 
O laço deve terminar quando o valor de x se tornar 11.
*/
package DeverWhile;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int x;
        x = 1;
        int somax;
        somax = 0;
        while(x != 11 & x != 0)
        {
            System.out.println("Digite um numero de 1 a 10: ");
                x = ler.nextInt();
            if(x >= 0 & x <11)
            {
                    somax = somax + x;
            }
        }
        System.out.printf("A soma dos numeros é: %d %n",somax);
    }
    
}
