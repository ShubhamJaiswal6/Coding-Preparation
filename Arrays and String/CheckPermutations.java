/*
Problem Statement:
Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
*/

import java.util.Scanner;

public class CheckPermutations {

	public static boolean checkPermutations(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int[] ch = new int[128];
		for (char c : s1.toCharArray()) {
			ch[c]++;
		}
		for (char c : s2.toCharArray()) {
			if (ch[c] == 0)
				return false;
			ch[c]--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(checkPermutations(s1, s2));
	}
}
