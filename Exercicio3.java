/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Faça um algoritmo que leia um conjunto de dados numéricos (X) e imprima o maior (Maximo) dentre eles. 
Admita que o valor 9999 é utilizado como sentinela. Ex: 1, 2, 3 => Maior = 3
*/
package DeverWhile;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int x;
        x = 0;
        int xmaior;
        xmaior = 0;
        while(x != 9999)
        {
            System.out.println("Digite um numero: ");
                x = ler.nextInt();
                if(xmaior < x & x != 9999)
                {
                    xmaior = x;
                }
        }
        System.out.printf("O maior numero digitado é: %d %n",xmaior);
    }
    
}
