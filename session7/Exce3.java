public class Exce3 {
    static int taghsim(int a, int b){
        if(b==0){
            throw new ArithmeticException("taghsim bar sefr");
        }
        return a/b;
    }
    public static void main(String[] args) {
        try{
            System.out.println(taghsim(5,2));
            System.out.println(taghsim(1,0));
            System.out.println(taghsim(5,2));
        } catch (ArithmeticException e){
            System.out.println("there was a problem");
            // e.printStackTracE();
        }
    }
}
