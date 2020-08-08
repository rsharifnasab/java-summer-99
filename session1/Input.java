import java.util.Scanner;
public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println("the int was " + n);

    String s = sc.next();

    double d = sc.nextDouble();

    if (sc.hasNextInt()) {
      System.out.println("you enterred int:" + sc.nextInt());
    } else {
      System.out.println("not an int");
    }
  }
}
