import java.util.*; 
import javax.swing.*;
import java.io.*;
import java.util.regex.*;

public class retornoLeitura{
  public static void main(String SuperTrunfo[]){
    
    try {
      FileReader arq = new FileReader("cartas.txt");
      BufferedReader lerArq = new BufferedReader(arq);
      String linha = lerArq.readLine(); // l� a primeira linha
      // a vari�vel "linha" recebe o valor "null" quando o processo  de repeti��o atingir o final do arquivo texto 
      while (linha != null) { 
        
       
        /*
        if(linha.split("=")[0] != null){
          // String columnArray[] = linha.split(Pattern.quote("."));
          String columnArray[] = linha.split(".");
          System.out.println(columnArray[0]);
        }*/
        
        linha = lerArq.readLine(); // l� da segunda at� a �ltima linha
      }
      
      arq.close(); 
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
    } 
    System.out.println(); 
  }
}