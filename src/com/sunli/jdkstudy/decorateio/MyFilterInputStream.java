package com.sunli.jdkstudy.decorateio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * ×°ÊÎÀà
 * @author hasee
 *
 */
public class MyFilterInputStream extends FilterInputStream{

	public MyFilterInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException {
		System.out.println("×°ÊÎmyinputstream");
		return super.read();
	}
	public static void main(String[] args) throws IOException {
		MyInputStream my = new MyInputStream("fcdf");
		MyFilterInputStream my1 = new MyFilterInputStream(my);
		
		byte b[] = new byte[10];
		byte c[] = new byte[10];
		for(int i=0;i<my.getLen();i++) {
			my1.read(b);
			System.out.println(("fcdf".charAt(i) & 0xFF));
			c[i] = (byte)("fcdf".charAt(i) & 0xFF);
		}
		String cache1 = new String(b);
		System.out.println(new String(cache1.getBytes("gbk"),"utf-8"));
		System.out.println(new String(c));
		
	}



}
