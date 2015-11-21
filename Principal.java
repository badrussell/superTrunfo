/**
 * 
 * *********************************************************
 *  Super Trunfo By                                        *
<<<<<<< HEAD
 *  ---> VÃ­tor Soares Vian <vitorvsv> <---                 * 
=======
 *  ---> Vítor Soares Vian <vitorvsv> <---                 * 
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
 *  ---> Carlos Eduardo da Silva Smolareck <smolareck> <---*
 * *********************************************************
 * 
 * Criado em: 16/10/2015
<<<<<<< HEAD
 * DescriÃ§Ã£o breve: Classe principal do jogo
=======
 * Descrição breve: Classe principal do jogo
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
 * 
 * 
 **/
public class Principal{
  public static void main(String SuperTrunfo[]) throws InterruptedException {
    
<<<<<<< HEAD
    //DeclaraÃ§Ã£o das variÃ¡veis
    int opcao;
    int qntdCartas;
    
    //Printa a mensagem de saudaÃ§Ã£o
    Mensagem.printaSaudacao();
    
    //Menu com as opÃ§Ãµes do jogo
    //ValidaÃ§Ã£o para que seja apenas valores vÃ¡lidos (ou seja presentes no menu)
    do{
      System.out.println("Selecione uma opÃ§Ã£o: ");
      System.out.println(" 1 - Iniciar o game \n 2 - InstruÃ§Ãµes \n 3 - Sobre \n 4 - Sair");
      opcao = Entrada.leiaInt();
    }while(opcao > 4 || opcao < 1);
    
    //Seleciona a aÃ§Ã£o segundo a opÃ§Ã£o escolhida pelo usuÃ¡rio
=======
    //Declaração das variáveis
    int opcao;
    int qntdCartas;
    
    //Printa a mensagem de saudação
    Mensagem.printaSaudacao();
    
    //Menu com as opções do jogo
    //Validação para que seja apenas valores válidos (ou seja presentes no menu)
    do{
      System.out.println("Selecione uma opção: ");
      System.out.println(" 1 - Iniciar o game \n 2 - Instruções \n 3 - Sobre \n 4 - Sair");
      opcao = Entrada.leiaInt();
    }while(opcao > 4 || opcao < 1);
    
    //Seleciona a ação segundo a opção escolhida pelo usuário
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
    //Printa a mensagem de sobre
    if (opcao == 3) {
     Mensagem.printaSobre();
    }else{
<<<<<<< HEAD
      //Printa as instruÃ§Ãµes do jogo
      if (opcao == 2) {
        Mensagem.printaInstrucoes();
      //OpÃ§Ã£o de sair do game  
=======
      //Printa as instruções do jogo
      if (opcao == 2) {
        Mensagem.printaInstrucoes();
      //Opção de sair do game  
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
      }else if(opcao == 4){
        Mensagem.printaSair();
      //Inicia o game
      }else{
        
<<<<<<< HEAD
        System.out.println("INICIANDO GAME... Carregando ConfiguraÃ§Ãµes...");
        Thread.sleep(3000);
=======
        System.out.println("INICIANDO GAME... Carregando Configurações...");
        //Thread.sleep(3000);
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
        
        do {
          qntdCartas = Entrada.leiaInt("Informe a quantidade de cartas que deseja jogar (10,20,32): ");
        }while(qntdCartas != 10 && qntdCartas != 20 && qntdCartas != 32);
        
        
        //Inicia o game
        Game.iniciar(qntdCartas);
        
      }
    }
  }
}
  