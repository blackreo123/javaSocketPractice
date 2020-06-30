package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread{
	
	private Socket m_socket;
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	
	try {
		BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));
		String receiveString;
		
		while(true) {
			receiveString=tmpbuf.readLine();
			
			
				System.out.println("상대방: "+receiveString);
			
		}
		
	} catch (Exception e) {
		e.getStackTrace();
	}
}
	public void setSocket(Socket _socket) {
		m_socket=_socket;
	}

}
