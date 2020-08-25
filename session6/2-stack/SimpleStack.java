public class SimpleStack {

  private String[] inner;
  private int noe;

  public SimpleStack(/* */) {
    // todo
    this.inner = new String[100];
    this.noe = 0;
  }

  public void clear() {
    this.noe = 0;
    this.inner = new String[100];
  }

  public int size() { return this.noe; }
  public boolean empty() { return (size() == 0); }

  public String pop() {
    if (empty())
      return "error";

    else {
      String temp = this.inner[noe - 1];
      this.inner[noe - 1] = null; // GC

      noe--;
      return temp;
    }
  }

  public void push(String element) {
    this.inner[noe] = element;

    this.noe++;
  }

  public String peek() {
    if (empty())
      return "error";
    return this.inner[noe - 1];
  }

  @Override
  public String toString() {
    String s = "[";
    for (int i = 0; i < noe; i++) {
      s = s + " " + inner[i];
    }
    s = s + "]";
    return s;
  }

  public void pushAll(String... elements) {
    for (String s : elements) {
      push(s);
    }
  }

  public int search(String elem) {
    for (int i = 0; i < noe; i++) {
      if (inner[i].equals(elem))
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println("hello");
    SimpleStack st = new SimpleStack();
    st.pushAll("ps1", "ps2", "ps3");
    st.push("1");
    st.push("2");
    System.out.println(st.search("ps1"));
    System.out.println(st);
    String t = st.pop();
    System.out.println("t : " + t);
    t = st.pop();
    System.out.println("t : " + t);

    System.out.println(st);
  }
}
