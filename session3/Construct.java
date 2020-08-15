class Player {
  String field1 = "inline";
  int field2 = 1;

  // no arg constructor
  public Player() {
    field1 = "constructor";
    field2 = 3;
  }
}

public class Construct {
  public static void main(String[] args) {
    Player p;
    System.out.println(p.field1);

    p = new Player();

    System.out.println(p.field1);
  }
}
