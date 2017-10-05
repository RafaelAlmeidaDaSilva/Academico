
package Atividades_Sala.Geometria;

import pj_mãe.Recursos.Scan_Texto;

public class Circulo extends Figuras  {
    
   double Pi = 3.14;
   double Diametro, Raio;
    
    public void Circulo()
    {
        Pedir_Diametro();
        Calcular_Raio();
        Calcular_Area();
        Calcular_Perimetro();
        Mostrar();
        
    }
    
    @Override
    void Calcular_Area()
    {
     
        this.Area = this.Pi * (this.Raio * this.Raio);
    }
    
   @Override
     void Calcular_Perimetro()
    {
        this.Perimetro = 2*(this.Pi * this.Raio);
    }
    
    private void Calcular_Raio()
    {
        this.Raio = this.Diametro /2;
    }
    
    private void Pedir_Diametro()
    {
        Scan_Texto scan = new Scan_Texto();
        System.out.print("Insira o Diametro do Circulo(em Métros): ");
        this.Diametro = scan.Entrada_Double();
    }
    
    private void Mostrar()
    { 
        System.out.println("Informações do Circulo: "
                          +"\nDiametro: "+this.Diametro
                          +"\nRaio: "+this.Raio
                          +"\nÀrea: "+this.Area+" m²"
                          +"\nPerimetro: "+this.Perimetro);    
    }
}
