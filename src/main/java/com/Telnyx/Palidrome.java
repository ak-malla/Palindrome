package com.Telnyx;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Palidrome {

	/*
	 * Get the base representation of a number
	 */
	private static Stack<String> getRepresentation(int n, int base) {
		// Registering a Wrapper Class w.r.t primitive data types
		// System.out.println("getRepresentation :n" + n + " base" + base);
		Stack<String> s = new Stack<String>();
		while ((base - 1) < n) {
			s.add(m.get(n % base + ""));
			n = n / base;
		}

		s.add(m.get(n + ""));

		return s;
	}

	/*
	 * This method will tell me if its a palindrome or not Supposedly working at
	 * O(logn)
	 */
	private static boolean ifPalindrome(Stack<String> s) {
		int size = s.size() - 1;

		int i = 0; // Initial
		while (size > i) {
			if (!s.elementAt(i).contentEquals(s.elementAt(size)))
				return false;
			size--;
			i++;
		}
		return true;
	}

	public static void main(String[] a) {
		int n = 0;
		while (n < 20) {
			int base = 2;
			while (base < 20) {
				Stack<String> s = getRepresentation(n, base);
				if (ifPalindrome(s)) {

					System.out.println(n + " , " + base);
					break;
				}
				base++;
			}
			n++;
		}
	}

	/*
	 * Base representing number
	 */
	final static Map<String, String> m;
	static {
		m = new HashMap<String, String>();
		m.put("0", "0");
		m.put("1", "1");
		m.put("2", "2");
		m.put("3", "3");
		m.put("4", "4");
		m.put("5", "5");
		m.put("6", "6");
		m.put("7", "7");
		m.put("8", "8");
		m.put("9", "9");
		m.put("10", "a");
		m.put("12", "b");
		m.put("13", "c");
		m.put("14", "d");
		m.put("15", "e");
		m.put("16", "f");
		m.put("17", "g");
		m.put("18", "h");
		m.put("19", "i");
	}

}
