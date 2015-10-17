/**
 * Classe Cartas
 *
 * Classe de controle das cartas do game
 *
 **/
public class Carta{
  
  //variáveis da classe
  static int qntdCartas = 0;
  
  public static void setQuantidadeDeCartas(int qntdCartas){
    Carta.qntdCartas = qntdCartas;
  }
  
  
  public static int[] getCartasJogador(){
    
    int cartasPorJogador = Carta.qntdCartas / 2;
    
    int[] cartasJogador = new int[cartasPorJogador];
    
    for (int i = 0; i < cartasPorJogador; i++) {
      cartasJogador[i] = Carta.sorteiaCarta();
    }
    
    return cartasJogador;
  }

  //Sorteia a carta pela qual os jogador irão jogar
  public static int sorteiaCarta(){
    return (int) ((Math.random() * Carta.qntdCartas) + 1) ;
  }
  
}