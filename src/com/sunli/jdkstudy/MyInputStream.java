package com.sunli.jdkstudy;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyInputStream extends InputStream{

	/**
     * The string from which bytes are read.
     */
    protected String buffer;
    /**
     * The index of the next character to read from the input stream buffer.
     *
     * @see        java.io.StringBufferInputStream#buffer
     */
    protected int pos;
	
    /**
     * The number of valid characters in the input stream buffer.
     *
     * @see        java.io.StringBufferInputStream#buffer
     */
    protected int count;
	
    public  int read() {
        return (pos < count) ? (buffer.charAt(pos++) & 0xFF) : -1;
    }
	
    public MyInputStream(String s) {
        this.buffer = s;
        count = s.length();
    }
    public int getLen() {
    	return count;
    }
	
}
