import java.util.Random;

public class Random {
    public static void main(String[] args) {
        int[] intArray = new int[50];

        Random random = new Random();


        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10);
        }

        int a = 0;
        int b = 0;
        int c = 0;


        for (int i = 0; i < 50; i++) {
            System.out.print(intArray[i]);
            if ((i+1)%5 == 0)
                System.out.println("/");//교수님 이거 이해가 안됩니다 왜 줄 바꿈이 이루어 지는거죠?

            if (intArray[i] % 2 == 0) {
                a++;
            }
            if (intArray[i] % 3 == 0) {
                b++;
            }
            if (intArray[i] % 5 == 0) {
                c++;
            }
        }


        System.out.println("2의 배수 개수: " + a);
        System.out.println("3의 배수 개수: " + b);
        System.out.println("5의 배수 개수: " + c);
    }
}
