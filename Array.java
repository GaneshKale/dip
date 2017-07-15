import java.util.Scanner;

public class Array {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int number[] = new int[5];
        System.out.print("Enter the five numbers:");
        String resultHolder = " ";
        for (int i = 0; i < 5; i++) {
            number[i] = in.nextInt();
            String localResult = "Number[" + i + "]is:";

            //System.out.println("The Enter Number is:");

            if (number[i] % 2 == 0) {

                System.out.println("Number is even number" + number[i]);
                int Result = number[i] * number[i];
                System.out.println("The Square is:" + Result);
            } else {

                System.out.println("Number is odd number:" + number[i]);
                int Cube = number[i] * number[i] * number[i];
                System.out.println("The Cube is :" + Cube);
            }
        }
    }
}
