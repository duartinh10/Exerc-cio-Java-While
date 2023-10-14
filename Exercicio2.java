/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Faça um algoritmo que leia um conjunto de números (X) e imprima sua soma (Soma) e sua média (Media). 
Admita que o valor 9999 é utilizado como sentinela para fim de leitura.Ex.: 1, 2, 3 => Soma=6 Media=2
*/
package DeverWhile;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int x;
        x = 0;
        int xsoma;
        xsoma = 0;
        int cont;
        cont = 0;
        int media = 0;
        //se o valor de x for 9999 o while nao vai funcionar
        while(x != 9999)
        {
            //essa primeira parte e para retornar o valor de x
            System.out.println("Digite um numero: ");
                x = ler.nextInt();
                if(x != 9999)
                {
                    //aqui vai realizar as operações propostas
                    xsoma = xsoma + x;
                        cont += 1;
                            media = xsoma/cont;
                }
        }
        System.out.printf("A soma dos numeros é %d %n",xsoma);
        System.out.printf("A media é %d ",media);
    }
    
}
