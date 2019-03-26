import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BUY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BUY> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(!name.equals("q")) {
			System.out.print("Please enter name:");
			name = scanner.nextLine();
			System.out.print("Please enter quantity:");
			int qty = scanner.nextInt();
			items.add(new BUY(name,qty));
			for (BUY item:BUY) {
				System.out.println(item.name + "\t" + item.qty);
			}
		}
	}	
}
