package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hello";
		String c="Hello";
		String d="hai";
		String b="This is a Java Program";
		System.out.println(a.charAt(0));//to select a letter
		System.out.println(a.length());// to check the length
		System.out.println(a.concat("Roshna"));//to concat this word
		System.out.println(b.contains("This"));//to check the word
		System.out.println(c.equals(a));//to check strings are equal
		System.out.println(a.equalsIgnoreCase(c));//to ignore case sensitivity
		System.out.println(d.compareTo(c));//to compare string
	}

}
