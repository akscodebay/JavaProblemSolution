import java.util.function.Function;
class Factorial {
    public long calculateFactorial(long num)
    {
        if(num==1)
        return 1;
        return num*calculateFactorial(num-1);
    }
}
public class FindFactorial
{
	public static void main(String[] args) {
		 Function<Long, Long> func= new Factorial()::calculateFactorial;
		 System.out.println(func.apply(5L));
	}
}
