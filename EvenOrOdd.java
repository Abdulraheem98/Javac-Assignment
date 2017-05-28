import java.util.Scanner;

class EvenOrOdd
{
  public static void main (String args[])
  {
    int z;
    System.out.println("Enter an integer to check if it is even or odd");
    Scanner in = new Scanner(System.in);
    z = in.nextInt();
  if(z%2 ==0)
    System.out.println("You entered an even number.");
  else
    System.out.println("You entered an odd number.");
  }
}