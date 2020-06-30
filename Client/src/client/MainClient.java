package client;

import java.net.Socket;

import client.ReceiveThread;
import client.SendThread;

public class MainClient {

	public static void main(String[] args) {
		try {
			Socket c_soket = new Socket("192.168.0.6",8889);
			
			ReceiveThread rec_thread = new ReceiveThread();
			rec_thread.setSocket(c_soket);
			
			SendThread send_thread = new SendThread();
			send_thread.setSocket(c_soket);
			
			send_thread.start();
			rec_thread.start();
			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
