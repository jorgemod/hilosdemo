import java.util.Scanner;
class hilos implements Runnable
{
  private Thread hilito = null;
  public hilos(String str)
  {
    hilito = new Thread(this,str);
    hilito.start();
  }
  public void run()
  {
    for(int i=0;i<100;i++)
    {
      System.out.println(i+" "+ hilito.getName());
      try
      {
        Thread.sleep((long)(Math.random()*1000));
      }
      catch (InterruptedException e){};
    }
    System.out.println("fin!" + hilito.getName());
  }
}
public class Demo
{
  public static void main(String arg[])
  {
    Scanner lee = new Scanner(System.in);
    hilos uno,dos,tres,cuatro,cinco;
    String nom1,nom2,nom3,nom4,nom5;
    System.out.println("dame el primer nombre");
    nom1 = lee.nextLine();
    System.out.println("dame el segundo nombre");
    nom2 = lee.nextLine();
    System.out.println("dame el tercer nombre");
    nom3 = lee.nextLine();
    System.out.println("dame el cuarto nombre");
    nom4 = lee.nextLine();
    System.out.println("dame el quinto nombre");
    nom5 = lee.nextLine();
    uno = new hilos(nom1);
    dos = new hilos(nom2);
    tres = new hilos(nom3);
    cuatro = new hilos(nom4);
    cinco = new hilos(nom5);
    System.out.println("main no hace nada");
  }

}