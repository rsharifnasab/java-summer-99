class MyException1 extends Exception{} // checked 
class MyException2 extends RuntimeException{} // checked 




public class Exce6 {
    public static void main(String[] args) {
        throw new MyException2();
        //throw new MyException1();
        //throw new MyException3("haminjuri", 1);
    }
}

class MyException3 extends RuntimeException{  // checked 
    int error_no;
    public MyException3(String reason,int error_no){
        super(reason);
        this.error_no = error_no;
    }

}
