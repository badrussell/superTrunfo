/**
 * 
 * *********************************************************
 *  Super Trunfo By                                        *
<<<<<<< HEAD
 *  ---> Vítor Soares Vian <vitorvsv> <---                 * 
=======
 *  ---> V�tor Soares Vian <vitorvsv> <---                 * 
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
 *  ---> Carlos Eduardo da Silva Smolareck <smolareck> <---*
 * *********************************************************
 * 
 * Criado em: 16/10/2015
<<<<<<< HEAD
 * Descrição breve: Classe principal do jogo
=======
 * Descri��o breve: Classe principal do jogo
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
 * 
 * 
 **/
public class Principal{
  public static void main(String SuperTrunfo[]) throws InterruptedException {
    
<<<<<<< HEAD
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
=======
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
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
    //Printa a mensagem de sobre
    if (opcao == 3) {
     Mensagem.printaSobre();
    }else{
<<<<<<< HEAD
      //Printa as instruções do jogo
      if (opcao == 2) {
        Mensagem.printaInstrucoes();
      //Opção de sair do game  
=======
      //Printa as instru��es do jogo
      if (opcao == 2) {
        Mensagem.printaInstrucoes();
      //Op��o de sair do game  
>>>>>>> e8671a74c32abdd53198f5075bb90f8391927f0d
      }else if(opcao == 4){
        Mensagem.printaSair();
      //Inicia o game
      }else{
        
<<<<<<< HEAD
        System.out.println("INICIANDO GAME... Carregando Configurações...");
        Thread.sleep(3000);
=======
        System.out.println("INICIANDO GAME... Carregando Configura��es...");
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
  