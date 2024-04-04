import java.sql.SQLOutput;
import java.util.Scanner;

public class Circle {
    int radious;

    public Main () {}
    public double getArea() {
        return 3.14*radious*radious;
    }
    public double getCircle() {
        return 2*3.14*radious;
    }


    public static void main(String[] args) {
        int b =2;

        Main a;
        a = new Main();
        Scanner scanner = new Scanner(System.in);
        a.radious= scanner.nextInt();
        System.out.println("원의 넓이 :" + a.getArea());
        System.out.println("원의 둘레 :" + a.getCircle());


        }
}