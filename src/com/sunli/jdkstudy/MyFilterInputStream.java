package com.sunli.jdkstudy;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * 装饰类
 * @author hasee
 *
 */
public class MyFilterInputStream extends FilterInputStream{

	public MyFilterInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	 public int read() throws IOException {
		 System.out.println("假装我装饰了一下");
		 return super.read();
	 } 

public static void main(String args[]) throws FileNotFoundException {
	
	InputStream i = new FileInputStream("aaaa");
	//装饰一个fileinputstream（但是这里面卵用没有，需要加功能）
	MyFilterInputStream a = new MyFilterInputStream(i);
	BufferedInputStream bf = new BufferedInputStream(a);
	//这种代码不报错，但是就属于没有任何意义
	MyFilterInputStream a2 = new MyFilterInputStream(bf);
	
}

}
