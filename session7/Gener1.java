public class Gener1 {
    public static <V> void printArray(V[] elems){
        for (V v : elems ) {
            System.out.print(v+" ");
        }
        System.out.println();
    }
    

    // important
    public static <V> V f(V v){
        return v;
    }

    public static <V> String stringValueOf(V v){
        return v.toString();
    }

    public static void main(String[] args) {
        String[] s = new String[]{"1", "salam"};
        Integer[] i = new Integer[]{1, 3};
        printArray(s);
        printArray(i);

        f(1);
        f("salam");
        f(1.2);

    }
}
