package application;

import entities.Pessoa;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args)  {
    	

        Pessoa p = new Pessoa();

        Scanner sc = new Scanner(System.in);
        int opcao = 1;
            
                    while (opcao != 0) {

            System.out.println("-------------------------------------------");
            System.out.println("|        CADASTRO DE DADOS DO USUARIO:    |");
            System.out.println("|                                         |");
            System.out.println("|[1]CADASTRAR                 [2]ALTERAR  |");
            System.out.println("|[3]EXCLUIR                   [4]RELATORIO|");
            System.out.println("|                [0]SAIR                  |");
            System.out.println("-------------------------------------------");

            System.out.print("Escolha a Opção correspondente a função:");
            opcao = sc.nextInt();

            switch (opcao) {
             
                case 1: 
                    
                    p.incluir();
                    break;
                    
                case 2:
                    
                    p.alterar();
                    break;
                    
                case 3:

                    p.remover();
                    break;
                    
                case 4:
                    
                    p.relatorio();
                    break;
                    
                case 0:
                    System.out.println("Saiu");
                    break;
                    
                default:
                    
                    System.out.println("Opção incorreta");

            }

        }
         
        



    }

}
