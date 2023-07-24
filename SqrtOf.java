import java.util.Scanner;

public class SqrtOf {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        System.out.println(Math.sqrt(num));
        System.out.println(sqrt(num));
//        System.out.println("add is"+new Testing().add(4,5));
    }
    static double sqrt(double n){
        double x = n;
        double root;// here we are finding the square of a particular number
        while (true){
            root = (x+(n/x)) * 0.5;
            if (Math.abs(root - x) < 0.00000000001){
                break;
            }
            x = root;
        }
        return root;
    }
}





