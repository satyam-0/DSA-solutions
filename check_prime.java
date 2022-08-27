import java.util.*;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isprime = sc.nextInt();
        int i = 2;
        while (i < isprime) {
            if (isprime % i == 0) {
                System.out.println("this is not prime number");
                return;
            }
            i++;

        }
        System.out.println(" Congrats, this is a prime number");

	// adding comments through vim i git
	//
    }
}
