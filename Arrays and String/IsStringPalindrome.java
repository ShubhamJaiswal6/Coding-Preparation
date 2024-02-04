
public class IsStringPalindrome {

	public static boolean isPalindorme(String str) {
		String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		return cleanedString.equals(new StringBuilder(cleanedString).reverse().toString());
	}
	
	public static void main(String[] args) {
		String s1 = "c1 O$d@eeD o1c";
		System.out.println(isPalindorme(s1)?"yes":"no");
	}

}
