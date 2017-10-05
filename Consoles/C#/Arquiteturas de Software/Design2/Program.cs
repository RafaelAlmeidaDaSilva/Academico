using System;

namespace Design2
{
    class Program
    {
        static void Main(string[] args)
        {
            FrmCliente  frmCliente = new FrmCliente();
            frmCliente.getCliente("Rafael Almeida da Silva","999.999.999-99");
            frmCliente.getEndereco( "Sem nome","Qualquer", "99999-999", "3010");
            frmCliente.getDependente("Nome de Santo","Filho");
            
            frmCliente.ValidarCampos();
            frmCliente.cliente.salvar();
            
        }
    }

    class FrmCliente
    {
        public Cliente cliente;
        
        public void ValidarCampos(){}
        public void getCliente(string nome, string cpf){

            cliente.nome = nome;
            cliente.cpf = cpf;    
        }
        public void getEndereco(string lougradouro, string cidade, string numero, string cep)
        {
            cliente.end.lougradouro = lougradouro;
            cliente.end.cidade = cidade;
            cliente.end.numero = numero;
            cliente.end.cep = cep;      
        }

        public void getDependente(string nome,string descricao)
        {
            cliente.dependente.nome = nome;
            cliente.dependente.parente.descricao = descricao;
        }

    }

    class Pessoa
    {
        public string nome { get; set; }
    }

    class Cliente : Pessoa
    {
        public string cpf { get; set; }
        public string credito {get; set;}
        public Dependente dependente { get; set; }
        public Endereco end {get; set;}
        private bool validarCpf(){ return true;}
        private bool validarCredito(){ return true;}
        public void salvar()
        {   
            validarCpf();
            validarCredito();
            end.validarCep();
            dependente.validarDependente();
            dependente.parente.validarParentesco();
            Console.WriteLine("CLIENTE SALVO");
        }
    }

    class Endereco 
    {
        public string lougradouro { get; set; }
        public string numero { get; set; }
        public string cidade{ get; set; }
        public string cep {get; set;}
        public void validarCep(){}
    }

    class Dependente: Pessoa
    {
        public Parentesco parente;
        public void validarDependente(){}
    }

    class Parentesco
    {
        public string descricao { get; set; }
        public void validarParentesco(){}
    } 

}
