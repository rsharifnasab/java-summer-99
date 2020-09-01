public class Main {
  public static void main(String[] args) {
    Judge[] judges =
        new Judge[] {new JafarOf(), new Torabi(), new Azarkar(), new Bolandi()};
    Performance p1 = new Performance(10);
    for (Judge j : judges) {
      System.out.println(j.score(p1));
    }
    System.out.println(new Torabi().score(new PeomPerformance(10, 20)));
  }
}
