
package pj_mãe;

import pj_mãe.Recursos.Scan_Texto;
import Atividades_Casa.Menu_Atividades_Casa.Menu_Atividades_Casa;
import Atividades_Sala.Menu_Ativiades_Sala.Menu_Atividades_Sala;


public class Menu_principal {
 
     Scan_Texto scan = new Scan_Texto();
    public void Cons_MenuPrincipal()
    {
        boolean finaly_MenuProgram ;
        
        do{
           int item = Menu_itens_Principal();
           finaly_MenuProgram = Selecao_iten_Principal(item); 
          }while(finaly_MenuProgram != false);
        
    }
    
    private int Menu_itens_Principal()
    {
        System.out.println("<------------------------# MENU_PRINCIPAL #----------------------------->");
        System.out.println("<- Digite o valor correspondente:                                    ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                       1-Atividades Sala                           ->");
        System.out.println("<-                       2-Atividades Casa                           ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                                                      0-Sair       ->");
        System.out.println("<--------------------------------------------------------------------->");
        System.out.print("<-{");
       
        return scan.Entrada_int();
    }
    
    private boolean Selecao_iten_Principal(int item)
    {  
        switch (item) 
        {
            case 0 :
                //SAIR.
                Scan_Texto.clearConsole();
                System.out.println("Fim[RAIZ MÃE]. ");
                return false;
            case 1 :
                 Scan_Texto.clearConsole();
                 // #Menu SALA
                 Menu_Atividades_Sala menu_sala = new Menu_Atividades_Sala();
                 menu_sala.Cons_Menu_Atividades_Sala();
                return true;
            case 2 :
                 // #Menu CASA 
                 Scan_Texto.clearConsole();
                 Menu_Atividades_Casa menu_casa = new Menu_Atividades_Casa();
                 menu_casa.Cons_Menu_Atividades_Casa();
                return true;
                
            default:
                Scan_Texto.clearConsole();
                System.out.println("valor inválido!");
                return true;
        }
          
    }
    
    
}

