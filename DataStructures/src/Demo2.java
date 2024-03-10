import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Object[] o=new Object[5];
		//auto boxing
		o[0]=100;
		o[1]="JAVA";
		o[2]='a';
		o[3]=true;
		System.out.println(Arrays.toString(o));
//		for(Object e:o) {
//			//auto unboxing 
//			System.out.println(e);
//		}
		
		
	}

}
