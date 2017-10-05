
package Atividades_Sala.VinteEum;


import pj_mãe.Recursos.Scan_Texto;


public class Menu_VinteEUm {
    
    
        public void Cons_MenuVinteEUm()
    {
        boolean finaly_MenuVinteEUm;  
        do{
            int item = Menu_itens_VinteEUm();
            finaly_MenuVinteEUm = Selecao_iten_VinteEUm(item); 
          }while(finaly_MenuVinteEUm);
        
    }
    
    private int Menu_itens_VinteEUm()
    {
        System.out.println("<------------------------[ JOGO21 ]-------------------------------->");
        System.out.println("<- Digite o valor correspondente:                                    ->");
        System.out.println("<-                                                                   ->");
        System.out.println("<-                       1-SOLICITAR +1CARTA                         ->");
        System.out.println("<-                       2-MOSTRAR CARTAS                            ->");  
        System.out.println("<-                       3-EMBARALHAR                                ->");
        System.out.println("<-                       4-DESCER CARTAS                             ->");
        System.out.println("<-                                                      0-Sair       ->");
        System.out.println("<--------------------------------------------------------------------->");
        System.out.print("<-{");
        Scan_Texto scan = new Scan_Texto();
        return scan.Entrada_int();
    }
    
     private boolean Selecao_iten_VinteEUm(int item)
    {  
        switch (item) {
            case 0 :
                
                System.out.println("Fim. ");
                return false;
            case 1 :
                // SOLICITAR
                Scan_Texto.clearConsole();
                 
                 
                return true;
            case 2 :
                // MOSTRAR CARTAS
                Scan_Texto.clearConsole();
                 
                
                return true;
            case 3 :
                // EMBARALHAR CARTAS
                Scan_Texto.clearConsole();
                
               
                return true;
            case 4 :
                // DESCER CARTAS
                Scan_Texto.clearConsole();
                
                 
                return true;
            default:
                Scan_Texto.clearConsole();
                System.out.println("valor inválido!");
                return true;
        }
          
    }
    
}
