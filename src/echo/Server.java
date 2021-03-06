package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		//서버소켓 객체생성
		ServerSocket serverSocket = new ServerSocket();

		//아이피 포트번호
		//바인드 192.168.219.101   10001
		//serverSocket.bind(new InetSocketAddress("192.168.219.101", 10001));
		serverSocket.bind(new InetSocketAddress("192.168.219.101", 10001));
				
		System.out.println("<서버시작>");
		System.out.println("==================================================");		
		System.out.println("[연결을 기다리고 있습니다.]");
				
				
		//accept
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결되었습니다.]");

		
		// 서버 클래스 실행하고 --> cmd 가서 클라이언트 클래스 실행
		//메시지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		
		//메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//반복구간
		while(true) {
			//메세지 받기
			String msg = br.readLine();

			if(msg == null) {
				break;
			}
			
			System.out.println("받은메세지:" + msg);
			
			//메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
		
		}
		
		br.close();
		bw.close();
		
		System.out.println("==========================");
		System.out.println("<서버종료>");
		
		serverSocket.close();
		
	}

}
