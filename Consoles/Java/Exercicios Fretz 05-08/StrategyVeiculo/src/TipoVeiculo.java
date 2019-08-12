
import preco.AbstractPrecoEstacionamento;

public enum TipoVeiculo {
	
	MOTO{

		@Override
		public double getPrecoVeiculo() {
			// TODO Auto-generated method stub
			return 20.0;
		}

		@Override
		public AbstractVeiculo getVeiculo() {
			// TODO Auto-generated method stub
			return new Moto();
		}},
	CARRO{

		@Override
		public double getPrecoVeiculo() {
			// TODO Auto-generated method stub
			return 50.0;
		}

		@Override
		public AbstractVeiculo getVeiculo() {
			// TODO Auto-generated method stub
			return new Carro();
		}},
	CAMINHAO{

		@Override
		public double getPrecoVeiculo() {
			// TODO Auto-generated method stub
			return 70.0;
		}

		@Override
		public AbstractVeiculo getVeiculo() {
			// TODO Auto-generated method stub
			return new Caminhao();
		}};
	
	public abstract double getPrecoVeiculo();
	public abstract AbstractVeiculo getVeiculo();
	
}
