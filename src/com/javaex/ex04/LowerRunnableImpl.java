package com.javaex.ex04;

public class LowerRunnableImpl implements Runnable {

	@Override
	public void run() {
        for (int ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }

		
	}

}
