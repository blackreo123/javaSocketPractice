package server;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	public static void main(String[] args) {
		try {
			ServerSocket s_soket=new ServerSocket(8889);
			Socket c_soket=s_soket.accept();
			
			ReceiveThread rec_thread = new ReceiveThread();
			rec_thread.setSocket(c_soket);
			SendThread send_thread = new SendThread();
			send_thread.setSocket(c_soket);
			
			rec_thread.start();
			send_thread.start();
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
}
