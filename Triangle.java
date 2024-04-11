import java.util.Scanner;

public class Triangle {

    int under;
    int height;
    public Triangle () {}
    public double getArea () {
        return under*height*0.5;
    }
    public static void main(String[] args) {

            System.out.println("밑변을 입력해주세요 >>");
            Scanner scanner = new Scanner(System.in);
            Triangle a;
            a = new Triangle();
            a.under = scanner.nextInt();
            System.out.println("높이를 입력해주세요.");

            a.height = scanner.nextInt();
            System.out.println("삼각형의 면적은" + a.getArea());
        }

}
