import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		//printing the individual elements
		for(Integer ele:al) {
			System.out.println(ele);
		}
		//sorting the elements
		Collections.sort(al);
		//Arrays.sort
		System.out.println(al);
		//finding the max element
		System.out.println(Collections.max(al));
		//to get any index value(like second max)
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the user input");
		int userInput=sc.nextInt();
		System.out.println(al.get(al.size()-userInput));
		
		int maxele=al.get(0);
		for(int i=0;i<al.size();i++) {
			if(maxele<al.get(i)) {
				maxele=al.get(i);
			}
		}
		System.out.println("Maximum Element is:"+maxele);
		
		
	}

}
