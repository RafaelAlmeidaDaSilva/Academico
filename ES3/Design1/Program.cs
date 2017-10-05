using System;

namespace Design1
{
    class Program
    {

        static void Main(string[] args)
        {
            FrmCliente frmCli = new FrmCliente();
            frmCli.nome = "Rafael Almeida da Silva";
            frmCli.cpf = "999.999.999-99";
            frmCli.cidade = "Suzano";
            frmCli.lougradouro = "Rua Sem nome";
            frmCli.numero = "trinta e 10";
            frmCli.dependente = "Independentemente";

            frmCli.Salvar();
        }
    }

    class FrmCliente
    {
        public string nome {get; set;}
        public string cpf {get; set;}
        public string lougradouro { get; set; }
        public string numero { get; set; }
        public string credito{ get; set;}
        public string cidade {get; set;}

        public string dependente{get; set;}

        private bool validarCampos(){return true;}
        private bool validarCpf(){ return true;}
        private bool validarEndereco(){return true;}
        private bool validarDependente(){return true;}
        public void Salvar()
        {
            validarCampos();
            validarCpf();
            validarEndereco();
            validarDependente();
            Console.WriteLine("CLIENTE SALVO!");
        }
    }
}
