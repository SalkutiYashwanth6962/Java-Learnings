import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//keys should be comparable type in TreeMap(It should not be heterogeneous)
		//It will not accept null(keys) 
		//--In hashtable hashmap linked hashmap heterogeneous keys are allowed
		//--Whereas in TreeMap key should be comparable type 
		//in treemap entries are stored in natural sorting order and it will sort keys in ascending order
		Map<Integer,String> m=new TreeMap<>();
		m.put(101,"java");
		m.put(105, "python");
		m.put(103, "sql");
		m.put(108, "web");
		//System.out.println(m);
		
//		for(Map.Entry<Integer,String> entry:m.entrySet()) {
//			System.out.print("Key:"+entry.getKey()+" ");
//			System.out.println("Value:"+entry.getValue());
//			
//		}
		
		ArrayList<Entry<Integer,String>> al=new ArrayList<>(m.entrySet());
		System.out.println(al);
		Iterator<Entry<Integer,String>> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator<Entry<Integer,String>> itr1=al.listIterator();
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
	
		
	}
}