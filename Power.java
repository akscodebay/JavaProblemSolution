import java.util.function.BiFunction; 
public class Power
{
	public static void main(String[] args) {
	    double x=3, y=3;
		BiFunction<Double, Double, Double> bi = (i,j)->Math.pow(i,j);
		System.out.println(bi.apply(x,y));
	}
}
