import java.util.Scanner;


public class SimulatorEstacionamento {

	public static void main(String[] args) {
      try(Scanner entrada = new Scanner(System.in)){
    	  
    	  System.out.println("Informe o veiculo: (1)MOTO  (2)CARRO  (3)CAMINHAO");
    	  int opcaoVeiculo = entrada.nextInt(); 
    	  
    	  TipoVeiculo tipoVeiculo = TipoVeiculo.values()[opcaoVeiculo-1];
    	  
    	  double precoVeiculo = tipoVeiculo.getPrecoVeiculo();
    	  
    	  AbstractVeiculo  veiculo = tipoVeiculo.getVeiculo();
    	  
    	  System.out.println("Tipo de preco: (1)NORMAL  (2)PROMOCIONAL");
    	  int opcaoPreco = entrada.nextInt(); 
    	  
    	  TipoPreco tipoPreco= TipoPreco.values()[opcaoPreco -1];
    	  
    	  veiculo.preco = tipoPreco.calculaPreco(precoVeiculo);
    	  
    	  System.out.println("Tipo de veiculo: "+ veiculo.getClass().getSimpleName());
    	  veiculo.preco.getPreco(); 
    	  //  System.out.println("Preco: R$ "+veiculo.getPreco());
    	
    	  
    	  
      }
      
	  
	  
	  

	}

}
