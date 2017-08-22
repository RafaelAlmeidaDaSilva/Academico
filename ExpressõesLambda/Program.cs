using System;
using System.IO;
using System.Collections.Generic;
using System.Collections;
using System.Linq;


namespace ExpressõesLambda
{
        class Program
    {
        static void Main(string[] args)
        {
            var vrAtencao = "Valores args passado pelo arquivo Launch.json \n" + args ;
            foreach(var arg in args)
                Console.WriteLine(arg);

            // retorna todos os valores Impares
            int[] numbers = { 5, 4, 1, 3, 9, 8, 6, 7, 2, 0 };

            Console.WriteLine("Lista de inteiros:");
            foreach(var number in numbers)
                Console.WriteLine(number);

            int oddNumbers = numbers.Count(n => n % 2 == 1);
            Console.WriteLine("Quantidade de valores impares: {0} ",oddNumbers);

            int oldNumbers = numbers.Count(n => n % 2 == 0);
            Console.WriteLine("Quantidade de valores pares: {0}", oldNumbers);

            IEnumerable oldsNumbers = numbers.Where( n => n % 2 == 0); 
            IEnumerable oddsNumbers = numbers.Where( n => n % 2 == 1);
            

            Console.WriteLine("Valores ímpares:");
            foreach(var i in oddsNumbers)
                Console.WriteLine("{0}",i);    

            Console.WriteLine("Valores Pares: ");
            foreach(var i in oldsNumbers)
                Console.WriteLine("{0}",i);

            
            var SelecoesMundiais = new List<string>(new string[] {"USA", "Africa", "Mexico", "Mexico", "Brasil" });

            var MelhorSelecao = SelecoesMundiais.Cast<string>().Where(n => n == "Brasil").ToList();

            var MelhorSelecao2 = 
                        (from string p in SelecoesMundiais
                        where p == "Brasil"
                        select p).ToList();


            foreach(var t in MelhorSelecao)
                Console.WriteLine("Filtro: {0} ",t);

            foreach(var t in MelhorSelecao2)
                Console.WriteLine("Filtro 2: {0}",t);


            var semAmbiguidade = SelecoesMundiais.Distinct().ToList();

            semAmbiguidade.ForEach(n => ModificarString(n));
        }

        static string ModificarString(string arg)
        {
            return arg.ToUpper();     
        }
    }
}
