/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Faça um algoritmo que leia um conjunto de números (X) e imprima 
a quantidade de números pares (QPares) e a quantidade de números impares (QImpares) lidos. 
Admita que o valor 9999 é utilizado como sentinela para fim de leitura.
*/
package DeverWhile;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int x;
        x = 0;
        int contimpar;
        contimpar = 0;
        int contpar;
        contpar = 0;
        while(x != 9999)
        {
            System.out.println("Digite um numero: ");
            x = ler.nextInt();
            if(x % 2 == 0)
            {
                contpar = contpar +1;
            }
            else if((x % 2 != 0) & x < 9999)
            {
                contimpar = contimpar +1;
            }
        }
        System.out.printf("A quandidade de valores Par foi: %d %n",contpar);
        System.out.printf("A quandidade de valores Impar foi: %d %n",contimpar);
    }
    
}
