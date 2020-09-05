public class Ex1 {
  public static int convert(String s) {
    if (s == null)
      return Integer.MIN_VALUE;
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException e) {
      return Integer.MIN_VALUE;
    }
  }
  public static void main(String[] args) {
    // use method
  }
}
