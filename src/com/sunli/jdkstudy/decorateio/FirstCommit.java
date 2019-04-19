package com.sunli.jdkstudy.decorateio;

import java.io.IOException;
import java.io.InputStream;

public class FirstCommit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		InputStream io = new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
