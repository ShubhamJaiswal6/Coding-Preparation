/*
Problem Statement:
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
*/

import java.util.Scanner;

public class IsUniqueCharacterString {

	public static boolean isUnique(String str) {
		if (str.length() > 128)
			return false;
		int[] arr = new int[128];
		for (char c : str.toCharArray()) {
			if (arr[c] == 1)
				return false;
			arr[c]++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isUnique(s));
	}

}
