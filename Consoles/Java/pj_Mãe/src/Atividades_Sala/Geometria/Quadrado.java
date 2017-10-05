package Atividades_Sala.Geometria;

import pj_mãe.Recursos.Scan_Texto;

public class Quadrado extends Figuras
{

    private double dLado = 0.0;
    
    Scan_Texto scan = new Scan_Texto();
    
    public void Quadrado() 
    {
        Pedir_Lado();                // Inseri os valor do lado do quadrado
        Calcular_Perimetro();        // Calcula o perimetro do quadrado
        Calcular_Area();             // Calcula a area do quadrado
        Mostrar();                   // Mostra os resultado das variaveis
    }
    
    private void Mostrar()
    {
      System.out.println("\n<--------[ RESULTADO ]------->"
                            +"\n Lado: "      +this.dLado
                            +"\nPerimetro: "  +this.Perimetro
                            +"\nArea: "       +this.Area);
    }
    @Override
    void Calcular_Area() 
    {
        this.Area=(this.dLado * this.dLado);
    }
    @Override
     void Calcular_Perimetro() 
    {
        this.Perimetro=(this.dLado * 4);
    }

    private void Pedir_Lado() 
    {  
        System.out.print("Digite valor do lado do quadrado: ");
        dLado = scan.Entrada_Double();
    }
}
