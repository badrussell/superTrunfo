import java.util.*; 
import javax.swing.*;
import java.io.*;

public class Leitura{
  
  static  String[][] cartasDeRetorno = new String[5][32];
  
  public static void setCartas(){
  
    String[][] cartas = new String[5][32];
    
    //Preenchendo a matriz cartas
    //Primeira Coluna
    cartas[0][0] = "Nome";
    cartas[0][0] = "Soco";
    cartas[0][0] = "Chute";
    cartas[0][0] = "Poder";
    cartas[0][0] = "Defesa";
    
    // 1 Carta Goku
    cartas[1][0] = "Goku";
    cartas[1][1] = "1000";
    cartas[1][2] = "1000";
    cartas[1][3] = "1000";
    cartas[1][4] = "1000";

    // 2 Carta Bulma
    cartas[2][0] = "Bulma";
    cartas[2][1] = "500";
    cartas[2][2] = "300";
    cartas[2][3] = "800";
    cartas[2][4] = "600";
   
    // 3 Carta Yamcha
    cartas[3][0] = "Yamcha";
    cartas[3][1] = "500";
    cartas[3][2] = "300";
    cartas[3][3] = "200";
    cartas[3][4] = "500";

    // 4 Carta Yamcha
    cartas[4][0] = "Kuririn";
    cartas[4][1] = "100";
    cartas[4][2] = "800";
    cartas[4][3] = "500";
    cartas[4][4] = "900";

    // 5 Carta Tenshinhan
    cartas[5][0] = "Tenshinhan";
    cartas[5][1] = "200";
    cartas[5][2] = "600";
    cartas[5][3] = "100";
    cartas[5][4] = "700";
        
    // 6 Carta Piccolo
    cartas[6][0] = "Piccolo";
    cartas[6][1] = "600";
    cartas[6][2] = "600";
    cartas[6][3] = "750";
    cartas[6][4] = "550";
        
    // 7 Carta Piccolo
    cartas[7][0] = "Gohan";
    cartas[7][1] = "630";
    cartas[7][2] = "650";
    cartas[7][3] = "550";
    cartas[7][4] = "740";
    
    // 8 Carta Vegeta
    cartas[8][0] = "Vegeta";
    cartas[8][1] = "780";
    cartas[8][2] = "950";
    cartas[8][3] = "782";
    cartas[8][4] = "654";
  
    // 9 Carta Trunks
    cartas[9][0] = "Trunks";
    cartas[9][1] = "840";
    cartas[9][2] = "890";
    cartas[9][3] = "660";
    cartas[9][4] = "350";
  
    // 10 Carta Pilaf
    cartas[10][0] = "Pilaf";
    cartas[10][1] = "220";
    cartas[10][2] = "100";
    cartas[10][3] = "350";
    cartas[10][4] = "221";
  
    // 11 Carta Pilaf
    cartas[11][0] = "Freeza";
    cartas[11][1] = "660";
    cartas[11][2] = "582";
    cartas[11][3] = "770";
    cartas[11][4] = "480";
  
    // 12 Carta Pilaf
    cartas[12][0] = "Majin Boo";
    cartas[12][1] = "880";
    cartas[12][2] = "960";
    cartas[12][3] = "890";
    cartas[12][4] = "550";
  
    
    // 13 Carta Cell
    cartas[13][0] = "Majin Boo";
    cartas[13][1] = "665";
    cartas[13][2] = "537";
    cartas[13][3] = "789";
    cartas[13][4] = "648";
  
    // 14 Carta Baby
    cartas[14][0] = "Baby";
    cartas[14][1] = "574";
    cartas[14][2] = "453";
    cartas[14][3] = "689";
    cartas[14][4] = "231";
  
    // 15 Chaos
    cartas[15][0] = "Chaos";
    cartas[15][1] = "580";
    cartas[15][2] = "960";
    cartas[15][3] = "689";
    cartas[15][4] = "574";
  
    // 16 Chi-Chi
    cartas[16][0] = "Chi-Chi";
    cartas[16][1] = "785";
    cartas[16][2] = "598";
    cartas[16][3] = "472";
    cartas[16][4] = "169";
  
    
    // 17 Dende
    cartas[17][0] = "Dende";
    cartas[17][1] = "368";
    cartas[17][2] = "584";
    cartas[17][3] = "790";
    cartas[17][4] = "684";
  
    // 18 Kaiohs
    cartas[18][0] = "Kaiohs";
    cartas[18][1] = "910";
    cartas[18][2] = "154";
    cartas[18][3] = "789";
    cartas[18][4] = "550";
  
    // 19 Kami Sama
    cartas[19][0] = "Kami Sama";
    cartas[19][1] = "713";
    cartas[19][2] = "359";
    cartas[19][3] = "426";
    cartas[19][4] = "957";
  
    // 20 Kami Sama
    cartas[20][0] = "Lunch";
    cartas[20][1] = "624";
    cartas[20][2] = "159";
    cartas[20][3] = "357";
    cartas[20][4] = "984";
  
    // 21 Kami Sama
    cartas[21][0] = "Mestre Kame";
    cartas[21][1] = "259";
    cartas[21][2] = "369";
    cartas[21][3] = "741";
    cartas[21][4] = "880";
  
    // 22 Kami Sama
    cartas[22][0] = "Mr. Satan";
    cartas[22][1] = "123";
    cartas[22][2] = "459";
    cartas[22][3] = "254";
    cartas[22][4] = "123";
  
    // 23 Kami Sama
    cartas[23][0] = "Oolong";
    cartas[23][1] = "486";
    cartas[23][2] = "478";
    cartas[23][3] = "590";
    cartas[23][4] = "257";
  
    // 24 Kami Sama
    cartas[24][0] = "Pan";
    cartas[24][1] = "637";
    cartas[24][2] = "524";
    cartas[24][3] = "136";
    cartas[24][4] = "486";
  
    // 25 Pual
    cartas[25][0] = "Pual";
    cartas[25][1] = "625";
    cartas[25][2] = "362";
    cartas[25][3] = "254";
    cartas[25][4] = "486";
  
    // 26 Shenlong
    cartas[26][0] = "Shenlong";
    cartas[26][1] = "301";
    cartas[26][2] = "250";
    cartas[26][3] = "220";
    cartas[26][4] = "280";
  
    // 27 Goten
    cartas[27][0] = "Goten";
    cartas[27][1] = "236";
    cartas[27][2] = "485";
    cartas[27][3] = "751";
    cartas[27][4] = "249";
  
    // 28 Uub
    cartas[28][0] = "Uub";
    cartas[28][1] = "765";
    cartas[28][2] = "345";
    cartas[28][3] = "654";
    cartas[28][4] = "763";
  
    // 29 Videl
    cartas[29][0] = "Videl";
    cartas[29][1] = "286";
    cartas[29][2] = "357";
    cartas[29][3] = "651";
    cartas[29][4] = "159";
  
    // 30 Videl
    cartas[30][0] = "Yajirobe";
    cartas[30][1] = "358";
    cartas[30][2] = "841";
    cartas[30][3] = "125";
    cartas[30][4] = "666";
  
    // 31 Babidi
    cartas[31][0] = "Babidi";
    cartas[31][1] = "368";
    cartas[31][2] = "541";
    cartas[31][3] = "197";
    cartas[31][4] = "254";
  
    // 32 Bardock
    cartas[32][0] = "Bardock";
    cartas[32][1] = "652";
    cartas[32][2] = "235";
    cartas[32][3] = "487";
    cartas[32][4] = "253";
  
    Leitura.cartasDeRetorno = cartas;
   
  }
  
  public static String[][] getCartas(){
    return Leitura.cartasDeRetorno;
  } 
  
}