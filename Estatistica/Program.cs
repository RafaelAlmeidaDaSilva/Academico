using System;
using System.Collections.Generic;
namespace Estatistica
{

    class Media
    {
        double e;
        public double aritmetica(IList<int> arranjo)
        {
           
             foreach (var item in arranjo)
                 e += item;

             return arranjo.Count / e;
        }

        public double geometrica(IList<int> arranjo)
        {
            var Atot = 0;
            foreach(var item in arranjo)
                Atot *= item ;
            
            return Math.Pow(e,Convert.ToDouble(1.0/arranjo.Count)) ; 

        }

        public double harmonica(IList<int> arranjo)
        {
                foreach (var item in arranjo)
                  e +=  1 / item;
            
            return arranjo.Count/e;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            List<int> list = new List<int> (new int[]{
                1,4,22,4,3,24,1,3
            });

            Console.WriteLine("Amostra: ");
            list.ForEach(n => Console.WriteLine(n));
            Media media = new Media();        
            Console.WriteLine("Média Aritmética:{0}", media.aritmetica(list));
            Console.WriteLine("Média Geométrica:{0}", media.geometrica(list));
            Console.WriteLine("Média Harmonica:{0}", media.harmonica(list));
            

        }
    }
}
