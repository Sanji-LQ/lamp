import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        int sum=0;
        for (int i =0; i<next.length();i++) {
            char c = next.charAt(i);
            int t=Integer.parseInt(String.valueOf(c));
            sum+=t;
        }
        System.out.println(sum);
    }
}

