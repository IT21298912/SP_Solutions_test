import java.util.List;

public class problem3 {

    public static void main(String[] args) {

        problem3 p3 =new problem3();
        p3.fibonacciSereis();
    }

    public problem3() {
    }

    public void fibonacciSereis(){
        long a = 0, b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < 100; i++) {
            long c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
