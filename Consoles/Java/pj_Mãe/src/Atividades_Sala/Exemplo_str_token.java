
 
package Atividades_Sala;

import java.util.StringTokenizer;

public class Exemplo_str_token 
{
    

   public void Exemplo_Professor(String str_Text)
   {
       StringTokenizer st = new StringTokenizer(str_Text);
     
       while (st.hasMoreTokens()) 
        {
         System.out.println(st.nextToken());
        } 
   }
    
   
   
}
