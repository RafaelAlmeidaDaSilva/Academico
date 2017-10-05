
package pj_mãe.Recursos;

import java.util.Scanner;

public class Scan_Texto
{
    
      public String Entrada_str()
      {
        Scanner Entrada ;
        Entrada = new Scanner(System.in);  
        String Text = Entrada.nextLine(); // pega a linha (Conjuto de tokens)
        return Text;
      }
      public int Entrada_int()
      {
        Scanner Entrada ;
        Entrada = new Scanner(System.in);  
        int Text = Entrada.nextInt(); // pega a linha (Conjuto de tokens)
        return Text;
      }
        public Double Entrada_Double()
      {
        Scanner Entrada ;
        Entrada = new Scanner(System.in);  
        double Text = Entrada.nextDouble(); // pega a linha (Conjuto de tokens)
        return Text;
      }
      
      public static void clearConsole(){

        try{
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");

            }else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e){
        //  Tratar Exceptions
        }
    }
}
