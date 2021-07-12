import java.math.BigInteger;

public class StringComparison {

	public static void main(String[] args) {
		
		String str = "saad";
		System.out.println("Text: "+str);

		str.getBytes();
		String binary = new BigInteger(str.getBytes()).toString(2);
		System.out.println("As binary: "+binary);
		
		String str2 = "saad";
		System.out.println("Text: "+str2);

		String binary2 = new BigInteger(str.getBytes()).toString(2);
		System.out.println("As binary: "+binary2);

//		String text2 = new String(new BigInteger(binary, 2).toByteArray());
//		System.out.println("As text: "+text2);
	}

}
