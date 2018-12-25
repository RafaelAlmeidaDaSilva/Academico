using System;
using System.Collections.Generic;
using System.Reflection;

namespace facadeEspecifico
{
    class Program
    {
        static void Main(string[] args)
        {
            Movimento movimento = new Movimento();
            Empenho empenho = new Empenho();

            IMovimento facadeMovimento = new FacadeMovimento();
            facadeMovimento.movimentar(movimento);

            IEmpenho facadeEmpenho = new FacadeEmpenho();
            facadeEmpenho.empenhar(empenho);

                        
            
           

            //metro, trem, transporte, veiculo ... movimento.
            //Impulso, velocidade, poder, potência, energia, empenho.
                

            // Movimento x Empenho  = Massa 
            // E = M * C²
            // Ambos são propriedades por isso não se possuem.
            // A generalização e a melhor opção para isso.
            // Como adotar uma especificação dinâmica ?
                // soluções 
                        // delegate + reflection
                        // builder de facade + reflection 
                        // instancias dinamicas = builder + singleton 
            // Reflection e uma tecnologia que proporciona alterar caracteristica internas  
            // 
            

        

        }
    }

    class builderFacade 
    {
         
    }

    class Particula   
    {  
       public string  movimento {get; set;}

       public double  energia {get; set;}

       void calcEnergia(){}
       void calcMassa(){}

       void calcVibracao(){}
       
    }
    class Entidade
    {

    }

    class IDao{}
    interface ICommand
    {
        void execute(Entidade e);
    }
    abstract class AbsCommand : ICommand
    {
        public abstract void execute(Entidade e);
    }
    abstract class AbsBaseCommand : AbsCommand
    {


    }
    class SalvarCommand : AbsBaseCommand
    {
        public override void execute(Entidade e)
        {
            throw new NotImplementedException();
        }
    }
    class SelecionarCommand : AbsBaseCommand
    {
        public override void execute(Entidade e)
        {
            throw new NotImplementedException();
        }
    }
    abstract class AbstracAltCommand : AbsCommand
    {

    }
    interface IStrategy
    {
        void processar(Entidade e);
    }
    class DadosObrigatorios : IStrategy
    {
        public void processar(Entidade e)
        {
            throw new NotImplementedException();
        }
    }
    class DaoMovimento : IDao
    {
        public void alterar(Entidade e)
        {
            throw new NotImplementedException();
        }

        public void cosultar(Entidade e)
        {
            throw new NotImplementedException();
        }

        public void excluir(Entidade e)
        {
            throw new NotImplementedException();
        }

        public void salvar(Entidade e)
        {
            throw new NotImplementedException();
        }
    }
    class DaoEmpenho : IDao
    {
        public void alterar(Entidade e)
        {
            throw new NotImplementedException();
        }

        public void cosultar(Entidade e)
        {
            throw new NotImplementedException();
        }

        public void excluir(Entidade e)
        {
            throw new NotImplementedException();
        }

        public void salvar(Entidade e)
        {
            throw new NotImplementedException();
        }
    }
    class Movimento : Entidade { public string moviment { get; set; }  }
    class Empenho : Entidade { }
    class Resultado
    {
        public List<Entidade> entidades { get; set; }
        
        public Entidade entidade { get; set; }
        public string msg { get; set; }


    }
    interface IMovimento
    {
        void movimentar(Movimento m);
    }

    interface IEmpenho
    {

        void empenhar(Empenho e);


    }

    abstract class AbsFacade : IPersistence
    {
        protected Dictionary<string, IDao> daos = new Dictionary<string, IDao>();
        protected Dictionary<string, Dictionary<string, List<IStrategy>>> rns;

        public AbsFacade()
        {


        }

        public Resultado alterar(Entidade e)
        {

            // Implementacao generica de selecionar
            throw new NotImplementedException();
        }

        public Resultado excluir(Entidade e)
        {
            // Implementacao generica de selecionar
            throw new NotImplementedException();
        }

        public Resultado salvar(Entidade e)
        {
            // Implementaçao generica de salvar 

            throw new NotImplementedException();
        }

        public Resultado selecionar(Entidade e)
        {
            // Implementacao generica de selecionar
            throw new NotImplementedException();
        }
    }

    class FacadeMovimento : AbsFacade, IMovimento
    {

        public FacadeMovimento()
        {
            // Implementacao de daos 
            Dictionary<string, List<IStrategy>> rn = new Dictionary<string, List<IStrategy>>();
            List<IStrategy> strategy = new List<IStrategy>();
            strategy.Add(new DadosObrigatorios());
            rn.Add(new Empenho().GetType().FullName.ToString(), strategy);
            daos.Add(new Movimento().GetType().FullName.ToString(), new DaoMovimento()); //elimina

        }

        public void movimentar(Movimento m)
        {
            salvar(m);
        }
    }

    class FacadeEmpenho : AbsFacade, IEmpenho
    {
        public FacadeEmpenho()
        {

            // Implementacao de daos
            daos.Add(new Empenho().GetType().FullName.ToString(), new DaoEmpenho());

            // Implementacao rns 
            Dictionary<string, List<IStrategy>> rn = new Dictionary<string, List<IStrategy>>();
            List<IStrategy> strategy = new List<IStrategy>();
            strategy.Add(new DadosObrigatorios());

            rn.Add(new Empenho().GetType().FullName.ToString(), strategy);
            rns.Add(new Empenho().GetType().FullName.ToString(), rn);

        }



        public void empenhar(Empenho e)
        {
            // Implementar empenho
            // salva empenho

            // alteracao de item

            // alterar processo
            // consultar itens da Ficha

        }
    }

    interface IPersistence
    {
        Resultado create(Entidade e);
        Resultado select(Entidade e);
        Resultado read(Entidade e);
        Resultado delete(Entidade e);

    }

}
