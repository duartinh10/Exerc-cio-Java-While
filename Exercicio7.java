/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Crie um algoritmo que peça o nome, a altura e o peso de várias pessoas 
e apresente o nome e peso da mais pesada e o nome e altura da mais alta.
Programe o algoritmo para parar quando o peso for 0 (zero)
*/
package DeverWhile;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int x;
        x = 1;
        String nome;
        //float peso;
        float altura;
        float maiorpeso;
        maiorpeso = 0;
        String nomepeso = null;
        float maioraltura;
        maioraltura = 0;
        String nomealtura = null;
            while(x != 0 )
            {   
                
                        System.out.println("Digite o seu nome: ");
                            nome = ler.next();
                                if("null".equals(nome))
                                {
                                    break;
                                }
                                System.out.println("Digite a sua altura: ");
                                    altura = ler.nextFloat();
               if(maioraltura < altura)
               {
                   maioraltura = altura;
                   nomealtura = nome;
               }
               if(maiorpeso < x)
               {
                   maiorpeso = x;
                   nomepeso = nome;
               }
                System.out.println("Digite o seu peso: ");
                    x = ler.nextInt();
            }
            System.out.printf("O nome %s e o peso %f da pessoa mais pesada!%n",nomepeso,maiorpeso);
            System.out.printf("O nome %s e o altura %f da pessoa mais alta!%n",nomealtura, maioraltura);
    }
    
}
