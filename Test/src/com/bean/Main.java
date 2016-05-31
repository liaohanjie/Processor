package com.bean;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// 1601003896
		int i = 12;

		System.out.println(Integer.toBinaryString(i));

		int j = 1601003896;

		System.out.println(Integer.toBinaryString(j));

		System.out.println(Arrays.toString(intToBytes2(j)));

		System.out.println(Arrays.toString("12".getBytes()));

		System.out.println(Integer.toBinaryString(49));

		System.out.println(Integer.toBinaryString(50));
		
		
		
//		byte[] b = new byte[]{100,121,98,124,111};
//		byte[] encode = encode(b);
//		System.out.println(Arrays.toString(encode));
//		byte[] decode = decode(encode);
//		System.out.println(Arrays.toString(decode));
	}

	public static byte[] intToBytes(int value) {
		byte[] src = new byte[4];
		src[3] = (byte) ((value >> 24) & 0xFF);
		src[2] = (byte) ((value >> 16) & 0xFF);
		src[1] = (byte) ((value >> 8) & 0xFF);
		src[0] = (byte) (value & 0xFF);
		return src;
	}

	public static byte[] intToBytes2(int value) {
		byte[] src = new byte[4];
		src[0] = (byte) ((value >> 24) & 0xFF);
		src[1] = (byte) ((value >> 16) & 0xFF);
		src[2] = (byte) ((value >> 8) & 0xFF);
		src[3] = (byte) (value & 0xFF);
		return src;
	}

	public static byte[] decode(byte[] b) {
		// 解密
		byte[] b2 = new byte[b.length];
		for (int k = 0; k < b2.length; k++) {
			b2[k] = (byte) (~(b[k] - 8) & 0xFF);
		}
		return b2;
	}
	
	
	public static byte[] encode(byte[] b) {
		// 解密
		byte[] b2 = new byte[b.length];
		for (int k = 0; k < b2.length; k++) {
			b2[k] = (byte) ((~(b[k]) + 8) & 0xFF);
		}
		return b2;
	}
}
