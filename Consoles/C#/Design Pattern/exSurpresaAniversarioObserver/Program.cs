using System;
using System.Threading;

namespace exSurpresaAniversarioObserver
{
    public class ChegadaAniversarianteEvent
    {   
        public DateTime horaDeChegada{get; set;}
    }
    interface IChegadaAniversariante
    {
        void chegou(ChegadaAniversarianteEvent event);
    }

// abstract class BaseThread
// {
//   private Thread _thread;

//   protected BaseThread() { _thread = new Thread(new ThreadStart(this.RunThread)); }

//   // Thread methods / properties
//   public void Start() { _thread.Start(); }
//   public void Join() { _thread.Join(); }
//   public bool IsAlive { get { return _thread.IsAlive; } }

//   // Override in base class
//   public abstract void RunThread();
// }

// public MyThread : BaseThread
// {
//   public override void RunThread() {
//     // Do some stuff
//   }
// }
    class Porteiro
    {

    }

    class Namorada: IChegadaAniversariante
    {
        public void chegou(ChegadaAniversarianteEvent event){}
    }
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }
    }
}
