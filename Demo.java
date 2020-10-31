import java.util.Scanner;
class hilos implements Runnable //el Runnable es necesario para crear hilos ( Threads )
{
  private Thread hilito = null; //variable de tipo hilo (Thread)
  public hilos(String str) //constructor
  {
    hilito = new Thread(this,str); //creacion del hilo en nuestra variable hilito
    hilito.start(); //inicio del metodo run( es lo que hará nuesto hilo)
  }
  public void run() // esto es lo que harán los hilos (todos hacen lo mismo porque todos se ejecutan en el constructor)
  {
    for(int i=0;i<100;i++)
    {
      System.out.println(i+" "+ hilito.getName()); //visualizacion del nombre de cada hilo
      try
      {
        Thread.sleep((long)(Math.random()*1000)); // sleep 
      }
      catch (InterruptedException e){};
    }
    System.out.println("fin!" + hilito.getName()); //una vez que termina el for se imprime quien acabó
  }
}
public class Demo
{
  public static void main(String arg[]) //MAIN
  {
    Scanner lee = new Scanner(System.in); //variable de lectura
    hilos uno,dos,tres,cuatro,cinco; //objetos 
    String nom1,nom2,nom3,nom4,nom5;  //se leen el nombre de los hilos
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
    uno = new hilos(nom1);//creacion de los hilos con su respectivo nombre
    dos = new hilos(nom2);
    tres = new hilos(nom3);
    cuatro = new hilos(nom4);
    cinco = new hilos(nom5);
    System.out.println("main no hace nada");
  }

}
