public class DBCliente {

	private ICliente cliente;
	
	public DBCliente(ICliente cliente)
	{
		this.cliente = cliente;
		
	}
	
	public void setCliente(ICliente cliente) {
		this.cliente = cliente;
	}
	
	public ICliente getCliente() {
		return cliente;
	}
	
}
