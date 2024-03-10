//Generics related
public class Demo6<Generics>{
   private Generics T;
   Demo6(){
	   this.T=T;
	   
   }
   Demo6(Generics T){
	   this.T=T;
	   
   }
   public void setGenerics(Generics T) {
	   this.T=T;
   }
   public Generics getGenerics() {
	   return T;
   }
   public void displayGenerics() {
	   System.out.println(T);
   }
}
//Object[] o= new Object[5];