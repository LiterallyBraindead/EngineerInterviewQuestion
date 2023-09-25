import java.util.InputMismatchException;
import java.util.Scanner;

public class InterviewQuestion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int first, second, third;
        first = Integer.MIN_VALUE;
        second = Integer.MIN_VALUE;
        third = Integer.MIN_VALUE;

        while(scanner.hasNext()){
            try{
                first = scanner.nextInt();
                second = scanner.nextInt();
                third = scanner.nextInt();
                if(first != Integer.MIN_VALUE && second != Integer.MIN_VALUE && third != Integer.MIN_VALUE) break;
            }catch (InputMismatchException e){
                System.out.println("That is not an integer!");
                scanner.next();
            }
        }

        scanner.close();
        System.out.println(mathFunction(first, second, third));
    }

    public static String mathFunction(int first, int second, int value){
        StringBuilder builder = new StringBuilder();

        if (first + second == value) builder.append("+");
        if (first - second == value) builder.append("-");
        if (second != 0) {
            if (first / second == value) builder.append("/");
        }
        if (first * second == value) builder.append("*");
        if(builder.toString().length() > 0) return builder.toString();

        return "none";
    }
}
