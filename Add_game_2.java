import java.util.Random;
import java.util.Scanner;

public class Add_game_2 {
    public static int e = 0;
    public static int f = 0;


    public static void main(String[] args) {
        boolean playagain = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        for ( int i = 0; i<10; i++) {
            int a = random.nextInt(10, 100);
            int b = random.nextInt(10, 100);
            int d = a + b;

            System.out.println(a + " " + "+" + " " + b + " " + "=");
            int c = scanner.nextInt();
            if (a + b == c) {
                System.out.println("맞았습니다.");
                 e ++;
            } else {
                System.out.println("틀렸습니다. 답은 " + d + "입니다.");
                f ++;
            }
        }
        System.out.println("성적 측정 :" + "맞은 문제 :" + e + "틀린 문제 : " + f) ;
        System.out.println("종료합니다.");
        scanner.close();
    }
}
