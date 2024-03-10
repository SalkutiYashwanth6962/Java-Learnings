
public class ActionArray<Generics> {
  public void forEach(Generics[] data,Action<Generics> action) {
	  for(Generics t:data) {
		  action.action(t);
	  }
  }
}
