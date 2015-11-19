/**
 * 
 * *********************************************************
 *  Super Trunfo By                                        *
 *  ---> V�tor Soares Vian <vitorvsv> <---                 * 
 *  ---> Carlos Eduardo da Silva Smolareck <smolareck> <---*
 * *********************************************************
 * 
 * Criado em: 16/10/2015
 * Descri��o breve: Classe principal do jogo
 * 
 * 
 **/
public class Principal{
  public static void main(String SuperTrunfo[]) throws InterruptedException {
    
    //Declara��o das vari�veis
    int opcao;
    int qntdCartas;
    
    //Printa a mensagem de sauda��o
    Mensagem.printaSaudacao();
    
    //Menu com as op��es do jogo
    //Valida��o para que seja apenas valores v�lidos (ou seja presentes no menu)
    do{
      System.out.println("Selecione uma op��o: ");
      System.out.println(" 1 - Iniciar o game \n 2 - Instru��es \n 3 - Sobre \n 4 - Sair");
      opcao = Entrada.leiaInt();
    }while(opcao > 4 || opcao < 1);
    
    //Seleciona a a��o segundo a op��o escolhida pelo usu�rio
    //Printa a mensagem de sobre
    if (opcao == 3) {
     Mensagem.printaSobre();
    }else{
      //Printa as instru��es do jogo
      if (opcao == 2) {
        Mensagem.printaInstrucoes();
      //Op��o de sair do game  
      }else if(opcao == 4){
        Mensagem.printaSair();
      //Inicia o game
      }else{
        
        System.out.println("INICIANDO GAME... Carregando Configura��es...");
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
  