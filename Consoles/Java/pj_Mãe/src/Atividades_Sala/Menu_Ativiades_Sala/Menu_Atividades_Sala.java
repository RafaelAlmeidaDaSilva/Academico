
package Atividades_Sala.Menu_Ativiades_Sala;

import Atividades_Sala.Exemplo_str_token;
import Atividades_Sala.Matriz.Menu_matriz;
import Atividades_Sala.Geometria.Menu.Menu_Geometria;
import pj_mãe.Recursos.Scan_Texto;

public class Menu_Atividades_Sala {
    
    Scan_Texto scan = new Scan_Texto();
  
    public void Cons_Menu_Atividades_Sala()
    {
        boolean finaly_MenuSala;
        
        do{
            int item = Menu_itens_Sala();
            finaly_MenuSala = Selecao_iten_Sala(item); 
          }while(finaly_MenuSala != false);
        
    }
     
    private int Menu_itens_Sala()
    {
        System.out.println("<------------------------[MENU_ATIVIDADES_SALA]----------------------->");
        System.out.println("<- Digite o valor correspondente:                                    ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                       1-Exemplo_Matriz.java                       ->");
        System.out.println("<-                       2-Exemplo_str_token.java                    ->");
        System.out.println("<-                       3-Vinte e Um.java                           ->");
        System.out.println("<-                       4-Menu_Geometria.Java                       ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                                                      0-Sair       ->");
        System.out.println("<--------------------------------------------------------------------->");
        System.out.print("<-{");
       
        return scan.Entrada_int();
    }
    
    private boolean Selecao_iten_Sala(int item)
    {  
        switch (item) {
            case 0 :
                Scan_Texto.clearConsole();
                System.out.println("Fim[RAIZ Atividades_Sala]. ");
                return false;
            case 1 :
                 Scan_Texto.clearConsole();
                // EXEMPLO MATRIZ
                 Menu_matriz menuMatriz = new Menu_matriz();
                 menuMatriz.Cons_MenuMatriz();
                return true;
            case 2 :
                 Scan_Texto.clearConsole();
                // EXEMPLO STR_TOKEN
                Exemplo_str_token token = new Exemplo_str_token();
                token.Exemplo_Professor(scan.Entrada_str());
                return true;
            case 3 :
                 Scan_Texto.clearConsole();
                // JOGO 21
                return true;
            case 4 :
                 Scan_Texto.clearConsole();
                 Menu_Geometria menu_geometria= new Menu_Geometria();
                 menu_geometria.Cons_Menu_Geometria();
            default:
                Scan_Texto.clearConsole();
                System.out.println("valor inválido!");
                return true;
        }
          
    }
}
