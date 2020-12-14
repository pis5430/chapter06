package com.javaex.ex04;

public class UpperRunnableImpl implements Runnable {

	@Override
	public void run() {
        for (int ch = 'A'; ch < 'Z'; ch++) {
        		System.out.print(ch);
        	
        }

		
	}

}
