package com.sunli.jdkstudy;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * װ����
 * @author hasee
 *
 */
public class MyFilterInputStream extends FilterInputStream{

	public MyFilterInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	 public int read() throws IOException {
		 System.out.println("��װ��װ����һ��");
		 return super.read();
	 } 

public static void main(String args[]) throws FileNotFoundException {
	
	InputStream i = new FileInputStream("aaaa");
	//װ��һ��fileinputstream����������������û�У���Ҫ�ӹ��ܣ�
	MyFilterInputStream a = new MyFilterInputStream(i);
	BufferedInputStream bf = new BufferedInputStream(a);
	//���ִ��벻�������Ǿ�����û���κ�����
	MyFilterInputStream a2 = new MyFilterInputStream(bf);
	
}

}
