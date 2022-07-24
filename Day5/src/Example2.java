
public class Example2 {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 c = new Example2();
		Example2 c1 = c;
		c1.name ="C2TC";
		c = null;
		System.out.println(c.name);
	}

}
