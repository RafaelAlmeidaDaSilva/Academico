using System;

namespace exemploAula22._08
{
    interface IRecurso {
        double receber();
    }
    class Estagiario: IRecurso
    {
        public double receber()
        {
            return 2;
        }

    }

    abstract class AbstractFuncionario: IRecurso
    {
        String cargo;
        protected Double desconto;
        protected Double salario;

        public double receber()
        {
          return abscalcSalario() - abscalcDesconto() ;
        }

         public abstract double abscalcSalario();
         public abstract double abscalcDesconto();
    }

    interface IAcionista 
    {
         void  calcPLR (Double lucro);
    }
    class FuncionarioPJ: AbstractFuncionario
    {   
        int Horas;
        int vlHoras;

        public override double abscalcSalario()
        {
            salario += 500;
            return salario;
        }

        public override double abscalcDesconto()
        {
           salario += 200;
           return salario;
        }
    }
    class FuncionarioCLT: AbstractFuncionario , IAcionista
    {
        

        public void calcPLR(Double lucro)
        {
            
        }
        public override double abscalcSalario()
        {
            salario += 500;
            return salario;
        }

        public override double abscalcDesconto()
        {
           salario += 200;
           return salario;
        }
    }

    class FuncionarioTemp: FuncionarioCLT
    {
        Double ajudaCusto;
     
    }

    class Program
    {
        static void Main(string[] args)
        {
            AbstractFuncionario fclt = new FuncionarioCLT();
            AbstractFuncionario fpj = new FuncionarioPJ();
            AbstractFuncionario ft = new FuncionarioTemp();

            fclt.abscalcDesconto();
            fclt.abscalcSalario();
            fpj.abscalcDesconto();
            fpj.abscalcSalario();
            ft.abscalcDesconto();
            ft.abscalcSalario();
            
            IRecurso recurso = fclt;

            recurso.receber();
            ((AbstractFuncionario)recurso).abscalcDesconto();
            ((AbstractFuncionario)recurso).abscalcSalario();
            
        }
    }
}
