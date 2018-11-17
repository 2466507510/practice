package socket.duoxianchengchat;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ReceiveThread extends Thread {
	private Socket s;

	public ReceiveThread(Socket s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			InputStream is=s.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			
			while(true) {
				String msg=dis.readUTF();
				System.out.println(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
