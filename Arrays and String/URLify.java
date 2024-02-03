/*
Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the 
additional characters, and that you are given the "true" length of the string. (Note: If Implementing in Java, please use a character array
so that you can perform this operation in place.)

Example
Input:  "Mr John Smith    ", 13
Output: "Mr%20John%20Smith"
*/

public class URLify {

	public static String urlifyTheString(char[] ch, int len) {
		int j = ch.length - 1;
		for (int i = len - 1; i >= 0; i--) {
			if (ch[i] != ' ') {
				ch[j--] = ch[i];
			} else {
				ch[j--] = '0';
				ch[j--] = '2';
				ch[j--] = '%';
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		int n = 13;
		System.out.println(urlifyTheString(str.toCharArray(), n));
		System.out.println(urlifyTheString("Shubham Jaiswal  ".toCharArray(), 15));
	}

}
