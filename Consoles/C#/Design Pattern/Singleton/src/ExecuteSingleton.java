
public class ExecuteSingleton {

	public static void main(String[] args) {
		
		// Singleton � o designer patterns que te permite trabalhar com valores de
		// um objeto est�tico na mem�ria. Limita que apenas possa ter um objeto
		// na memoria, ou seja, s� pode ser inst�nciado apenas uma vez.
		
		// Fac�litando para iniciantes em Orienta��o a Objetos.
		// E o Limitandos com a utiliza��o de apenas um objeto na mem�ria.
		// Bem utilizado com acesso dinamico a banco de dados. (N/ em projetos grandes)
		
		Singleton single = Singleton.getInstance();
		single.setValor(10);
		System.out.println("Object reference: single(Singleton) valor = "+single.getValor());
		
		

	}
	
}
