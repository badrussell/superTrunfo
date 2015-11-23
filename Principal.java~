/**
 * 
 * *********************************************************
 *  Super Trunfo By                                        *
 *  ---> Vitor Soares Vian <vitorvsv> <---                 * 
 *  ---> Carlos Eduardo da Silva Smolareck <smolareck> <---*
 * *********************************************************
 * 
 * Criado em: 16/10/2015
 * Descriaoo breve: Classe principal do jogo
 * 
 * 
 **/
public class Principal{
  public static void main(String SuperTrunfo[]) throws InterruptedException {
    
    //Declaracao das variaveis
    int opcao;
    int qntdCartas;
    
    //Printa a mensagem de saudacao
    Mensagem.printaSaudacao();
    
    //Menu com as opcoes do jogo
    //Validacao para que seja apenas valores validos (ou seja presentes no menu)
    do{
      System.out.println("Selecione uma opcao: ");
      System.out.println(" 1 - Iniciar o game \n 2 - Instrucoes \n 3 - Sobre \n 4 - Sair");
      opcao = Entrada.leiaInt();
    }while(opcao > 4 || opcao < 1);
    
    //Seleciona a acao segundo a opcao escolhida pelo usuario
    //Printa a mensagem de sobre
    if (opcao == 3) {
     Mensagem.printaSobre();
    }else{
      //Printa as instrucoes do jogo
      if (opcao == 2) {
        Mensagem.printaInstrucoes();
      //Opcao de sair do game  
      }else if(opcao == 4){
        Mensagem.printaSair();
      //Inicia o game
      }else{
        
        System.out.println("INICIANDO GAME... Carregando Configuracoes...");
        //Thread.sleep(3000);
        
        do {
          qntdCartas = Entrada.leiaInt("Informe a quantidade de cartas que deseja jogar (10,20,32): ");
        }while(qntdCartas != 10 && qntdCartas != 20 && qntdCartas != 32);
        
        
        //Inicia o game
        Game.iniciar(qntdCartas);
        
      }
    }
  }
}
  