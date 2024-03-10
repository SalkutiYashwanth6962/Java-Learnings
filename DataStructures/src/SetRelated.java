import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Set<Integer> s=new HashSet<>();
//    s.add(10);
//    s.add(8);
//    s.add(30);
//    s.add(8);//wont store duplicates and it will be stored in random order and allow only one null
//    System.out.println(s);
//	}
		
//		  Set<Integer> s=new LinkedHashSet<>();
//		    s.add(10);
//		    s.add(8);
//		    s.add(30);
		  
//		    s.add(null);
//		    
//		    s.add(8);//wont store duplicates and it will be stored in insertion order and allow only one null
//		    System.out.println(s);
		   //System.out.println(s.first());
		   //fetches first value
		  // System.out.println(s.last());
		//fetches last
		  // System.out.println(s.headSet(50));
		//before 50 elements in set but not 50
		//if element is not present it will lesser than value values.
		   //System.out.println(s.tailSet());
	      //from 50 to the last
		   //System.out.println(s.subSet(20,100));
		//between 20 and 100 and including 20 but not 100
//		    System.out.println(s.size());
//			}
//		 SortedSet<Integer> s=new TreeSet<>();
//		    s.add(10);
//		    s.add(8);
//		    s.add(30);
//		   // s.add(null);
//		    //if we add null it will throw a null pointer exception 
//		    
//		    s.add(8);//wont store duplicates and it will be stored in insertion order and allow only one null
//		    System.out.println(s);
//		    System.out.println(s.size());
//			}
		//internally implements Comparable and Comparator
		//wont store based on index
		 Set<Mobile> s=new TreeSet<>();
		  
		    s.add(new Mobile("oppo4",2345646));
		    s.add(new Mobile("oppo",23456));
		    s.add(new Mobile("vivo",23498));
		    
		    
		    
		    System.out.println(s);
		    System.out.println(s.size());
			}
		

}
