import java.util.Scanner;
public class TestA {

	public static void main(String[] args) {
		int a, b, n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		while(n!=0) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(a+b);
			n--;
		}

	}

}
