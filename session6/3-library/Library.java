import java.util.*;

class Member {
  final String name;
  Book[] borrow;
  final long id;

  public Member(String name, long id) {
    this.name = name;
    this.id = id;

    this.borrow = new Book[50];
  }
}

class Book {
  String name;
  long id;

  public Book(String name, long id) {
    this.name = name;
    this.id = id;
  }
}

public class Library {
  static int[] counts = new int[50];
  static Book[] books = new Book[50];
  static int tedadKetab = 0;

  static Member[] members = new Member[50];
  static int tedadMember = 0;

  static void addBook(String[] commandArr) {
    long id = Long.parseLong(commandArr[1]);
    String name = commandArr[2];
    int count = Integer.parseInt(commandArr[3]);

    boolean peydaShode = false;
    for (int i = 0; i < tedadKetab; i++) {
      if (books[i].name.equals(name)) {
        counts[i] += count;
        peydaShode = true;
        break;
      }
    }
    if (peydaShode == false) {
      Book b = new Book(name, id);
      books[tedadKetab] = b;
      tedadKetab++;
    }
  }

  public static void addMember(String[] commandArr) {
    long id = Long.parseLong(commandArr[1]);
    String name = commandArr[2];
    Member m = new Member(name, id);
    members[tedadMember] = m;
    tedadMember++;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String command = sc.nextLine();
      String[] commandArr = command.split(" ");

      switch (commandArr[0]) {
      case "addBook":
        addBook(commandArr);
        break;
      case "addMember":
        addMember(commandArr);
        break;

      default:
      }
    }
  }
}
