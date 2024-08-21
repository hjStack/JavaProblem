import java.util.Scanner;

public class letter {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int test_n=sc.nextInt();
        String numbers= sc.next();
        int sum=0;

        for(int i=0; i<test_n; i++){
            sum += numbers.charAt(i)-'0';
        }

        System.out.println(sum);
    };
}

