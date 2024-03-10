import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo10Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//asList helps to store array/colection of elements in the list
    // List<Integer> l=new ArrayList<>();
     Integer[] i= {1,3,5,4,2};
     
     List<Integer> list=Arrays.asList(i);
     //forEach method helps to iterate over a collection
//     list.forEach((Integer n)->{
//    	 System.out.println(n);
//     });
     //higher order functions
     list.forEach(( n)->{
    	 System.out.println(n);
     });
     Mobile m=new Mobile();
     m.setBrand("vivo");
     m.setPrice(23456);
     Mobile m2=new Mobile();
     m2.setBrand("oppo");
     m2.setPrice(2345);
     Mobile m3=new Mobile();
     m3.setBrand("oneplus");
     m3.setPrice(234536);
     List<Mobile> list1=Arrays.asList(m,m2,m3);
     //before sorting
     list1.forEach((i1)->{System.out.println(i1);});
     //we can sorting in two ways 
     //1.by using the list.sort and the Collections.sort()
//     list1.sort((Mobile m5,Mobile m6)->(int)m5.getPrice()-(int)m6.getPrice());
//     System.out.println("***********");
//     
//     
//     list1.forEach(( n)->{
//    	 //after sorting
//    	 System.out.println(n);
//     });
     System.out.println("*********");
     Collections.sort(list1,(Mobile m5,Mobile m6)->(int)m5.getPrice()-(int)m6.getPrice());

     list1.forEach(( n)->{
    	 //after sorting
    	 System.out.println(n);
     });

	}
	

}
//queue does not allow null

