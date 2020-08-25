import java.util.Scanner;

class Member {
  String name;
  int id;
  Book[] booksBorrowed;
  int index;

  public Member(String name, int id) {
    this.name = name;
    this.id = id;
    booksBorrowed = new Book[5];
    index = 0;
  }
}

class Book {
  String name;
  int id;
  int count;

  public Book(String name, int id, int count) {
    this.name = name;
    this.id = id;
    this.count = count;
  }
}

class Library {
  static Book[] books = new Book[50];
  static Member[] members = new Member[50];
  static int bookIndex = 0, memberIndex = 0;

  static void addBook(Book book) {
    for (int i = 0; i < bookIndex; i++) {
      Book b = books[i];
      if (b.id == book.id) {
        b.count += book.count;
        return;
      }
    }
    books[bookIndex] = book;
    bookIndex++;
  }

  static void addMember(Member member) {
    members[memberIndex] = member;
    memberIndex++;
  }

  static void get(int bookID, int memberID) {
    Book b = books[0];
    Member m = members[0];
    for (int i = 0; i < bookIndex; i++) {
      b = books[i];
      if (b.id == bookID) {
        if (b.count == 0) {
          System.out.println("NotAvailable : " + b.name + " " + b.id);
          return;
        } else
          break;
      }
    }
    for (int i = 0; i < memberIndex; i++) {
      m = members[i];
      if (m.id == memberID) {
        if (m.index == 5) {
          System.out.println("MaxReached : " + m.name + " " + m.id);
          return;
        } else
          break;
      }
    }
    b.count--;
    m.booksBorrowed[m.index] = b;
    m.index++;
  }

  static void ret(int mID, int bID) {
    Member m = members[0];
    for (int i = 0; i < memberIndex; i++) {
      m = members[i];
      if (m.id == mID)
        break;
    }
    Book b = m.booksBorrowed[0];
    int b_index = 0;
    for (int j = 0; j < m.index; j++) {
      b = m.booksBorrowed[j];
      if (b.id == bID) {
        b_index = j;
        break;
      }
    }

    for (int i = b_index; i < m.index - 1; i++) {
      m.booksBorrowed[i] = m.booksBorrowed[i + 1];
    }
    m.index--;
    b.count++;
  }

  static void memStat() {
    for (int i = 0; i < memberIndex; i++) {
      String bookStr = "";
      Member m = members[i];
      for (int j = 0; j < m.index; j++) {
        Book b = m.booksBorrowed[j];
        bookStr = bookStr + b.name + " " + b.id;
        if (j < m.index - 1)
          bookStr = bookStr + " - ";
      }
      System.out.println(m.name + " " + m.id + " [" + bookStr + "]");
    }
  }

  static void bookStat() {
    for (int i = 0; i < bookIndex; i++) {
      Book b = books[i];
      System.out.println(b.name + " " + b.id + " " + b.count);
    }
  }

  public static void main(String[] args) {
    String cmnd;
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      cmnd = scanner.nextLine();

      String[] cmndArr = cmnd.split(" ");
      switch (cmndArr[0]) {
      case "addBook":
        addBook(new Book(cmndArr[2], Integer.parseInt(cmndArr[1]),
                         Integer.parseInt(cmndArr[3])));
        break;
      case "addMember":
        addMember(new Member(cmndArr[2], Integer.parseInt(cmndArr[1])));
        break;
      case "get":
        get(Integer.parseInt(cmndArr[2]), Integer.parseInt(cmndArr[1]));
        break;
      case "return":
        ret(Integer.parseInt(cmndArr[1]), Integer.parseInt(cmndArr[2]));
        break;
      case "memberStat":
        memStat();
        break;
      case "bookStat":
        bookStat();
      }
    }
  }
}
