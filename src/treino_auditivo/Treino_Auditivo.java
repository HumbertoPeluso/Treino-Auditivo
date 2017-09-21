/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treino_auditivo;

import java.util.Scanner;

/**
 *
 * @author Humberto
 */
public class Treino_Auditivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        Player player = new Player();
        System.out.print("Pressione: \n (1) para tocar a nota Dó \n (2) Para tocar a nota Ré \n "
                + "(3) Para tocar a nota Mi \n (4) Para sair ");
     
        NotaMusical c4 = new NotaMusical("C4", "sons//C4.wav", "1", player);
        NotaMusical d4 = new NotaMusical("D4", "sons//D4.wav", "2", player);
        NotaMusical e4 = new NotaMusical("E4", "sons//E4.wav", "3", player);
        
        String controle = ler.next();
        
        while(controle !=null){
        switch (controle){
            
            case "1":
                c4.tocarSom();
                break;
            case "2":
                d4.tocarSom();
                break;
            case "3":
                e4.tocarSom();
                break;
            case "4":
                System.exit(0);
        }
         controle = ler.next();
        }
        
            
        }
            
    }
    
    

