import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int c = 1;
        int n = scanner.nextInt();
        while (c < n) {
            System.out.println(c);
            c = i * i;
            i++;
        }
    }
}