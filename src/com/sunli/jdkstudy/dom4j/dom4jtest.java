package com.sunli.jdkstudy.dom4j;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

public class dom4jtest {
	   
	   
	   public static void main(String args[]) {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new File("leaguetableexportfile(4).xml"));
			
		   
		   
	   }
}
