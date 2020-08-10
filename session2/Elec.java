class ElectronicDevice {
  int price;
}

public class Elec {

  static int compareTo(ElectronicDevice e1, ElectronicDevice e2) {
    if (e1.price > e2.price)
      return 1;
    else if (e1.price < e2.price)
      return -1;
    else
      return 0;
  }
  public static void main(String[] args) {
    ElectronicDevice e1 = new ElectronicDevice();
    e1.price = 100;

    ElectronicDevice e2 = new ElectronicDevice();
    e2.price = 200;

    System.out.println(compareTo(e1, e2));
  }
}
