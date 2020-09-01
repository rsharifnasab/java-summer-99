public class Exce3 {
  static int taghsim(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("taghsim bar sefr");
    }
    return a / b;
  }
  public static void main(String[] args) {
    try {
      System.out.println(taghsim(5, 2));
      System.out.println(taghsim(1, 0));
      System.out.println(taghsim(5, 2)); // anjam nemishe
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
    System.out.println("good bye");

    try {
      int[] arr = new int[10];
      throw new ArrayIndexOutOfBoundsException();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("out of bound");
    }
  }
}
