package com.class9;

public class NestedLoopMore7 {
//	55555
//	4444
//	333
//	22
//	1
	public static void main(String[] args) {
		for (int x = 5; x >= 1; x--) {
			for (int y = 1; y <= x; y++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
