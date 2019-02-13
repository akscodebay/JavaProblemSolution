interface Access{  
    void access();  
}
class SimpleClass {
    int roll;
    String name;
    
    SimpleClass(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public int getRoll()
    {
        return roll;
    }
    
    public void setRoll(int roll)
    {
        this.roll=roll;
    }
    
    public void intialized()
    {
        System.out.println("instance created");
    }
}
public class ReferenceMethod
{
	public static void main(String[] args) {
		SimpleClass sc = new SimpleClass("aks",1);
		Access access = sc::intialized;
		access.access();
	}
}
