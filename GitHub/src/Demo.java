
public class Demo {
	public static void main(String[] args) {
		String org="RUTU";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
			System.out.print(rev)
		}
		System.out.println(rev);
	}

}
