package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		
		//준비
		Thread thread = new DigitThread(); //섞어쓰지
		
		
		//스레드 시작 --> 출장
		//thread.run() 이렇게 실행하면 안됨
		thread.start();

		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
            Thread.sleep(1000);
        }

		
		
	}

}
