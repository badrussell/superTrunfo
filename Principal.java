/**
 * 
 * *********************************************************
 *  Super Trunfo By                                        *
 *  ---> Vítor Soares Vian <vitorvsv> <---                 * 
 *  ---> Carlos Eduardo da Silva Smolareck <smolareck> <---*
 * *********************************************************
 * 
 * Criado em: 16/10/2015
 * Descrição breve: Classe principal do jogo
 * 
 * 
 **/
public class Principal{
  public static void main(String SuperTrunfo[]){
    
    //Declaração das variáveis
    int opcao;
    
    //Printa a mensagem de saudação
    Mensagem.printaSaudacao();
    
    //Menu com as opções do jogo
    //validação para que seja apenas valores válidos (ou seja presentes no menu)
    do{
      System.out.println("Selecione uma opção: ");
      System.out.println(" 1 - Iniciar o game \n 2 - Instruções \n 3 - Sobre \n 4 - Sair");
      opcao = Entrada.leiaInt();
    }while(opcao > 4 || opcao < 1);
    
    //Seleciona a ação segundo a opção escolhida pelo usuário
    //Printa a mensagem de sobre
    if (opcao == 3) {
     Mensagem.printaSobre();
    }else{
      //Printa as instruções do jogo
      if (opcao == 2) {
        Mensagem.printaInstrucoes();
      //Inicia o game  
      }else if(opcao == 4){
        Mensagem.printaSair();
      }else{
        System.out.println("INICIAR GAME");
      }
    }
    
  }
}