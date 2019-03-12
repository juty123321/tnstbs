import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
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
		
		Random random = new Random(47);
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<10000;i++) {
			int r = random.nextInt(20);
			Integer freg = m.get(r);
		}
	

	}

}