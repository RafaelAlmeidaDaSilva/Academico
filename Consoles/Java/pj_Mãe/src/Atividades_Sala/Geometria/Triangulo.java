
/*
                                        *TRIANGULO EQUILATERO*
 */
package Atividades_Sala.Geometria;


import pj_mãe.Recursos.Scan_Texto;

public class Triangulo extends Figuras{
 
    private Double dAlturaA, dAlturaB, dBase;
    
    
    public void  Triangulo ()
    {
      Pedir_Lados();         // Metodo que pede os lados de um triangulo Equilatero 
      Calcular_Perimetro();  // Calcula o perimetro do triangulo 
      Calcular_Area();       // Calcula a Area do triagulo
      Mostrar();             // Mostra os valores calculados.
        
    }
    
    private void Mostrar() 
    {
       System.out.println("\n<--------[ RESULTADO ]------->\n Lado A: " +this.dAlturaA
               +"Lado B: "+this.dAlturaB
               +"\n Base: "+this.dBase
               +"\nPerimetro: "+this.Perimetro
               +"\nArea: "+this.Area+ " m²"); 
    }
    
    private void Pedir_Lados()
    {
        Scan_Texto scan = new Scan_Texto();
        
        System.out.print("Digite o valor da Base: ");
        this.dBase = scan.Entrada_Double();
        
        System.out.print("Digite o valor do lado A: ");
        this.dAlturaA = scan.Entrada_Double();
        
        System.out.print("Digite o valor do lado B: ");
        this.dAlturaB = scan.Entrada_Double();
           
    }
    
    @Override
     void Calcular_Perimetro()
    {
       this.Perimetro =(dAlturaA + dAlturaB +dBase);
    }
     
    @Override
    void Calcular_Area()
    {
        if (this.dAlturaA > this.dAlturaB)
            
            this.Area = ((this.dBase * Altura(this.dAlturaA, (this.dBase/2) ))/2);
        else
            this.Area = ((this.dBase * Altura(this.dAlturaB, (this.dBase/2) ))/2);
        
        
    }
    
    private double Altura(Double Hipotenusa, Double CatetoOposto)
    {  
       return (Hipotenusa*Hipotenusa)-(CatetoOposto*CatetoOposto);
    }
}
