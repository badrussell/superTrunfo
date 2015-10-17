/**
 * Escreve na tela as intruções do jogo. 
 * 
 **/
public class Instrucao{
  public static void printaInstrucoes(){
    
    System.out.println("******Intruções******");
    System.out.println();
    System.out.println("1 - O jogo tem a finalidade de obter todas as cartas do adversário e para isso você deve escolher uma característica presente na cara para então comparar a com a mesma característica da carta do computador.");
    System.out.println("2 - As características são: Soco, Chute, Poder e Defesa");
    System.out.println("3 - Você pode selecionar a quantidade de cartas (10,20,32) sendo que você receberá metade das cartas enquanto o computador receberá a outra metade.");
    System.out.println("4 - Na primeira rodada o primeiro jogador é sorteado, apartir da primeira o ganhador da última partida inicia a rodada.");
    System.out.println("5 - Caso os valores das características das cartas sejam iguais, ambos jogadores permanecem com as suas cartas.");
    System.out.println("6 - O jogador que obter todas as cartas do adversário vence o jogo.");
    
  }
}