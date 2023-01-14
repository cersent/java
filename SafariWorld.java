import java.util.Scanner;
public class SafariWorld {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N;
        N = scan.nextLong();
        long M;
        M = scan.nextLong();

        if(N-M <0) {
            System.out.println(-(N-M));
        }
        else {
            System.out.println(N-M);
        }
    }
}
