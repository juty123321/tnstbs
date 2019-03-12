import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Hybpwiehjt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		//int[] freqs = new int[20];
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<20;i++) {
			//int r = random.nextInt(20);
			list.add(0);
			//freqs[r]++;
		}
		for (int i=0;i<10000;i++) {
			int r = random.nextInt(20);
			Integer freq = list.get(r);
			list.set(r, freq + 1);
		}
		System.out.println(list);
		//Set<Integer> intset = new HashSet
		
		

	}

}
