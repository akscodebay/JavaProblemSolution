import java.util.function.BiFunction;  
public class Authenticate
{
	public static void main(String[] args) {
		BiFunction<String, String, Boolean> bi = (username,password)->username.equals("aks")&&password.equals("aks")?true:false;
		System.out.println(bi.apply("aks","ks"));
		
	}
}
