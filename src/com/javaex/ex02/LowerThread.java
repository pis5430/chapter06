package com.javaex.ex02;

public class LowerThread extends Thread{

	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	
	@Override
	public void run() {
		 for (int ch = 'a'; ch <= 'z'; ch++) {
	            System.out.print(ch);
	            try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }       
	}

	
}
