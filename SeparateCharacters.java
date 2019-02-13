import java.util.function.Consumer;  
public class SeparateCharacters
{
	public static void main(String[] args) {
		Consumer<String> consumer= (str)->System.out.println(str.replace(""," ").trim());
		consumer.accept("hello");
		
	}
}
