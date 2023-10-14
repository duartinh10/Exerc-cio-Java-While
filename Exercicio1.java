/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
 Dada a massa inicial, em gramas, 
 faça um programa que determine o tempo necessário 
 para que essa massa se torne menor que 0,05 gramas
*/
package DeverWhile;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float massa;
        //int metademassa;
        System.out.println("Digite a massa: ");
            massa = ler.nextFloat();
        //metademassa = massa/2;
        while (massa > 0.05)
        {
            //massa = massa/metademassa;
            massa = massa/2;
            System.out.println(massa);
                
        }
    }
    
}
