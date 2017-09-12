using System;

namespace Design2
{
    class Program
    {
        static void Main(string[] args)
        {
            FrmCliente  formularioCliente = new FrmCliente();
            formularioCliente.cliente.nome = "Rafael Almeida da Silva";
        }
    }

    class FrmCliente
    {
        Cliente cliente;
        
        public void ValidarCampos(){}
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
        private bool validarCpf(){}
        private bool validarCredito(){}
        public void salvar()
        {   
            validarCpf();
            validarCredito();
            validarCep();
            validarDependente();
            ValidarParentesco();
            Console.WriteLine("CLIENTE SALVO");
        }
    }

    class Endereco 
    {
        public string Lougradouro { get; set; }
        public string numero { get; set; }
        public string cidade{ get; set; }
        public string cep {get; set;}
        public void validarCep(){}
    }

    class Dependente: Pessoa
    {
        Parentesco parente;
        public void validarDependente(){}
    }

    class Parentesco
    {
        public string descricao { get; set; }
        public void ValidarParentesco(){}
    } 

}
