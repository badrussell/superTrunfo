/**
 * Classe de Mensagem
 *
 * Aqui ficam contidas todas os print's do game. 
 **/
public class Mensagem{
  
  //Printa as instrucoes do game.
  public static void printaInstrucoes(){ 
    System.out.println("******Intru��es******");
    System.out.println();
    System.out.println("1 - O jogo tem a finalidade de obter todas as cartas do advers�rio e para isso voc� deve escolher uma caracter�stica presente na cara para ent�o comparar a com a mesma caracter�stica da carta do computador.");
    System.out.println("2 - As caracter�sticas s�o: Soco, Chute, Poder e Defesa");
    System.out.println("3 - Voc� pode selecionar a quantidade de cartas (10,20,32) sendo que voc� receber� metade das cartas enquanto o computador receber� a outra metade.");
    System.out.println("4 - Na primeira rodada o primeiro jogador � sorteado, apartir da primeira o ganhador da �ltima partida inicia a rodada.");
    System.out.println("5 - Caso os valores das caracter�sticas das cartas sejam iguais, ambos jogadores permanecem com as suas cartas.");
    System.out.println("6 - O jogador que obter todas as cartas do advers�rio vence o jogo.");
  }
  
  //Printa a mensagem de sair para o usuario.
  public static void printaSair(){  
    System.out.println("Obrigado por jogar nosso game! At� a pr�xima...");
  }
  
  //Printa a mensagem de saudacao para o usuario
  public static void printaSaudacao(){
    
    System.out.println("******Bem-vindo ao game Super Trunfo (Dragon Ball)******");
    System.out.println();
    System.out.println("Este game foi desenvolvido por \n\n => V�tor Soares Vian <https://github.com/vitorvsv> \n => Carlos Eduardo da Silva Smolareck <https://github.com/smolareck>");
    System.out.println();
    
  }
  
  //Printa a mensagem sobre do game
  public static void printaSobre(){
    
    System.out.println("Game Super Trunfo Dragon Ball");
    System.out.println();
    System.out.println("Este game tem fim avaliativo para a disciplina de Algoritmos e Programacao de 2015B - Univates.");
    System.out.println();
    System.out.println("Game desenvolvidor por: ");
    System.out.println();
    System.out.println("Vitor Soares Vian");
    System.out.println("Git Hub: https://github.com/vitorvsv");
    System.out.println("E-mail: vitorsoa@hotmail.com");
    System.out.println();
    System.out.println("CARLOS");
    System.out.println("escreva o que quiser apenas padronize");
    System.out.println("escreva o que quiser apenas padronize");
    
  }
  
  //Printa a mensagem para o usuario selecionar a caracteristica para comparar a carta
  public static void printaSelecionaCaracteristica(){
    System.out.println("Informe uma caracteristica para comparar");
    System.out.println("1 - Soco");
    System.out.println("2 - Chute");
    System.out.println("3 - Poder");
    System.out.println("4 - Defesa");
  }
  
}