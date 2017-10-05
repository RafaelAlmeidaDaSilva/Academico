using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exemploAula08._08
{


    interface IInstituicaoEnsino
    {
         void metodoA();

    }
    interface IInstitutoPesquisa
    {
        void metodoB();
    }
    interface IFaculdade : IInstituicaoEnsino
    {
        void metodoC();
    }
    interface IUniversidade : IInstituicaoEnsino, IInstitutoPesquisa
    {
        void metodoD();
    }


    class Instituto : IInstitutoPesquisa
    {
       public void metodoB()
        {
            Console.WriteLine("Metodo B da classe Instituto: IInstitutoPesquisa");
        }
    }

    class Universidade : IUniversidade
    {

        List<Professor> professores = new List<Professor>();

        public void metodoB()
        {
            Console.WriteLine("Metodo B da classe Universidade: IUniversidade");
        }

        public void metodoD()
        {
            Console.WriteLine("Metodo D da classe Universidade: IUniversidade");
        }

        public void metodoA()
        {
            Console.WriteLine("Metodo A da  classe Universidade: IUniversidade");
        }
    }


    class FaculdadeEstadual : List<Regimento>, IFaculdade
    {
        List<Professor> professores = new List<Professor>();

        public void metodoA()
        {
            Console.WriteLine("Metodo A FaculdadeEstadual: IFaculdade");
        }
        public void metodoC()
        {
            Console.WriteLine("Metodo C FaculdadeEstadual: IFaculdade");
        }
    }

    class UniversidadeEstadual : Universidade { }
    class UniversidadeFederal : Universidade { }
    class UniversidadeParticular : Universidade { }

    class Regimento { }
    class Pessoa { }
    class Professor : Pessoa { }

    class Program
    {
        static void Main(string[] args)
        {
            IUniversidade ie = new Universidade();
            ie.metodoA();
            ie.metodoB();
            ie.metodoD();

            IInstituicaoEnsino iie = ie;
            iie.metodoA();

            iie = new FaculdadeEstadual();
            iie.metodoA();

            IInstitutoPesquisa iip = ie;
            iip.metodoB();

            iip = new Instituto();
            iip.metodoB();
            
        }
    }
}
