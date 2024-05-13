import java.util.Random;
import java.util.Scanner;

public class Add_game_4 {
    public static int e = 0;
    public static int f = 0;
    public static int[] a = new int[10]; // 랜덤 숫자 배열
    public static int[] b = new int[10]; // 랜덤 숫자 배열
    public static int[] c = new int[10]; // 사용자 입력 배열
    public static int[] d = new int[10]; // 정답 배열


    public static void main(String[] args) {

        boolean again = true;
        while (again) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                a[i] = random.nextInt(10, 100);
                b[i] = random.nextInt(10, 100);
                d[i] = a[i] + b[i];
                System.out.println(a[i] + "+" + b[i] + "=");
                c[i] = scanner.nextInt();
                if (c[i] == d[i]) {
                    System.out.println("맞았습니다.");
                    e++;
                } else {
                    System.out.println("틀렸습니다. 정답은" + d[i] + "입니다.");
                    f++;
                }
            }
            System.out.println("성적출력 : 맞은 문제 :" + e + "틀린 문제 :" + f);
            if (f == 0) {
                System.out.println("다 맞추셨네요 틀린문제가 없습니다.");
            }
            else {
                System.out.println("틀린 문제입니다.");
                for (int i = 0; i < f; i++) {
                    if (c[i] != d[i]) {
                        System.out.println(a[i] + "+" + b[i] + "=");
                        c[i] = scanner.nextInt();
                        d[i] = a[i] + b[i];
                        if (c[i] == d[i]) {
                            System.out.println("맞았습니다.");

                        } else {
                            System.out.println("틀렸습니다. 정답은" + d[i] + "입니다.");
                        }

                    }
                }
                System.out.println("더 하시려면 y를 눌러주세요.");
                String answer = scanner.next();
                again = answer.equals("y");
            }
        }
        System.out.println("종료합니다.");
    }
}





