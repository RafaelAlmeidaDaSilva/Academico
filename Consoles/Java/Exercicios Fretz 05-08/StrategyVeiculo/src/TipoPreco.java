import preco.AbstractPrecoEstacionamento;
import preco.PrecoNormal;
import preco.PrecoPromocional;



public enum TipoPreco {
	NORMAL{

		@Override
		public AbstractPrecoEstacionamento calculaPreco(double precoVeiculo) {
	
			return new PrecoNormal(precoVeiculo) ;
		}
		},
	PROMOCIONAL{

		@Override
		public  AbstractPrecoEstacionamento calculaPreco(double precoVeiculo) {
			// TODO Auto-generated method stub
			return new PrecoPromocional(precoVeiculo);
		}
		};
	
	public abstract AbstractPrecoEstacionamento calculaPreco(double precoVeiculo);
	
}
