package main;

import java.util.Scanner;


public class CadastroPessoal {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
                
        long cpf, rg; 
        int codigo;
        
        String resposta = new String();
        String resposta2 = "Sim";
        String resposta3 = "";
        
        
        System.out.println("Digite o número da opção: \n"
                + "Inclusão - 1\n"
                + "Alteração - 2\n"
                + "Exclusão - 3\n"
                + "Sair - 4");
        
        while(resposta2.equals("Sim")){        
            
            codigo = grava.nextInt();
            
        
            switch(codigo){
                case 1:
                System.out.println("Digite seu CPF:");
                cpf = grava.nextLong();
                System.out.println("Digite seu RG:");
                rg = grava.nextLong();
            
                System.out.println("Cadastro realizado com sucesso! Deseja escolher outra opção?");
                resposta2 = grava.next();
              
                break;
                case 2:
                System.out.println("Digite seu CPF:");
                cpf = grava.nextInt();
                System.out.println("Digite seu RG:");
                rg = grava.nextInt();
            
                System.out.println("Alteração realizada com sucesso! Deseja escolher outra opção?");
                resposta2 = grava.next();
                
                break;
                case 3:
                System.out.println("Tem certeza que deseja exluir esses dados?\n"
                    + "Sim ou Não:");              
                
                        if(resposta.equals("Sim")){
                            System.out.println("Informações excluidas com sucesso! Deseja escolher outra opção?");
                            resposta2 = grava.next();
                        }
                        else if(resposta.equals("Não")){
                            System.out.println("Ação cancelada!");
                        }
                        //else{
                            //System.out.println("Por favor digite uma resposta válida! (Sim ou Não)");
                        //}
                    
                break;
                case 4:
                System.out.println("Saindo da aplicação...");
                resposta2 = "não";
                
                break;
                default:
                System.out.println("Opção inválida! Deseja escolher outra opção?");
                resposta2 = grava.next();
            }
        }
        System.out.println("Obrigado, volte sempre!");
    }    
}