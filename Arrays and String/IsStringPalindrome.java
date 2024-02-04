/*You are given a string 'S'. Your task is to check whether the string is palindrome or not. 
For checking palindrome, consider alphabets and numbers only and ignore the symbols and whitespaces.
Note :
String 'S' is NOT case sensitive.
Example :
Let S = “c1 O$d@eeD o1c”.
If we ignore the special characters, whitespaces and convert all uppercase letters to lowercase, 
we get S = “c1odeedo1c”, which is a palindrome. Hence, the given string is also a palindrome.
*/

public class IsStringPalindrome {

	/*
	 * public static boolean isPalindorme(String str) { String cleanedString =
	 * str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); return
	 * cleanedString.equals(new StringBuilder(cleanedString).reverse().toString());
	 * }
	 */

	public static boolean isPalindorme(String str) {
		String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		if (cleanedString.length() <= 1)
			return true;
		int len = cleanedString.length();
		for (int i = 0; i < len / 2; i++) {
			if (cleanedString.charAt(i) != cleanedString.charAt(len - 1 - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "c1 O$d@eeD o1c";
		System.out.println(isPalindorme(s1) ? "yes" : "no");
	}
}