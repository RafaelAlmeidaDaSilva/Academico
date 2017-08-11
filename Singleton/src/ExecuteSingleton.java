
public class ExecuteSingleton {

	public static void main(String[] args) {
		
		// Singleton é o designer patterns que te permite trabalhar com valores de
		// um objeto estático na memória. Limita que apenas possa ter um objeto
		// na memoria, ou seja, só pode ser instânciado apenas uma vez.
		
		// Facílitando para iniciantes em Orientação a Objetos.
		// E o Limitandos com a utilização de apenas um objeto na memória.
		// Bem utilizado com acesso dinamico a banco de dados. (N/ em projetos grandes)
		
		Singleton single = Singleton.getInstance();
		single.setValor(10);
		System.out.println("Object reference: single(Singleton) valor = "+single.getValor());
		
		

	}
	
}
