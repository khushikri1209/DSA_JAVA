public class J10CheckSameData {
    
	public static void main(String[] args)
	{
		String s1 = "Java Exercise";
		String s2 = "Tutor joes";
		String s3 = "Java Exercise";
		boolean equ1 = s1.equals(s2);
		boolean equ2 = s1.equals(s3);
		System.out.println("'" + s1 + "' equals '" +s2 + "' ? " + equ1);
		System.out.println("'" + s1 + "' equals '" +s3 + "' ? " + equ2);
	}
}


