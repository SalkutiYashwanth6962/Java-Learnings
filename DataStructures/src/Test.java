class Test{
  public static void main(String[] args) {
		Demo6 d=new Demo6();
		d.setGenerics("java");
		System.out.println(d.getGenerics());
		d.setGenerics(4);
		System.out.println(d.getGenerics());
		Demo6<Integer> d3=new Demo6<>(5000);
           System.out.println(d3.getGenerics());
		
}
}