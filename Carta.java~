/**
 * Classe Cartas
 *
 * Classe de controle das cartas do game
 *
 **/
public class Carta{
  
  //variáveis da classe
  static int qntdCartas = 0;
  
  //Seta para a propriedade a quantidade de cartas que o jogador escolheu
  public static void setQuantidadeDeCartas(int qntdCartas){
    Carta.qntdCartas = qntdCartas;
  }
  
  //Retorna as cartas do jogador
  public static int[] getCartas(){
    
    int cartasPorJogador = Carta.qntdCartas / 2;
    
    int[] cartas = new int[cartasPorJogador];
    
    for (int i = 0; i < cartas.length; i++) {
      cartas[i] = Carta.sorteiaCarta();
    }
    
    return cartas;
  }

  //Sorteia a carta pela qual os jogador irão jogar
  public static int sorteiaCarta(){
    return (int) ((Math.random() * 32) + 1) ;
  }
  
}