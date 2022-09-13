package com.shayam.test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MagicalBinaryString {
	public static String binaryString(String S) {
		if (S == null || S.length() == 0 || S.length() == 2) {
			return S;
		}
		
		PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
		int acc = 1, prev = 0;
		for (int i = 1; i <= S.length(); i++) {
			if (acc == 0) {
				if (!(prev == 0 && i == S.length()))
					pq.add(binaryString(S.substring(prev, i)));
				prev = i;
			}
			if (i == S.length())
				break;
			if (S.charAt(i) == '1') {
				acc++;
			} else {
				acc--;
			}
		}
		StringBuilder ans = new StringBuilder();
		while (!pq.isEmpty()) {
			ans.append(pq.poll());
		}
		if (ans.length() == 0) {
			ans.append('1');
			ans.append(binaryString(S.substring(1, S.length() - 1)));
			ans.append('0');
		}
		return ans.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count0=0,count1=0;
		String val = binaryString(str);
		for(int i=0;i<val.length();i++) {
			if(str.charAt(i)=='1') {
				count1++;
			}
			else if(str.charAt(i)=='0') {
				count0++;
			}
		}
		if(count0<=count1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
