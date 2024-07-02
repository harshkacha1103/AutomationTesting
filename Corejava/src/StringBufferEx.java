
public class StringBufferEx {
	
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("Hello ");//mutable String
		//sf.append("Java");
		//sf.insert(1, "Java");
		//sf.reverse();
		//sf.delete(1, 3);
		sf.replace(1, 3, "Java");
		System.out.println(sf);
	}

}
