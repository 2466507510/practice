package socket.duoxianchengchat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("localhost", 1111);
			
			SendThread st=new SendThread(s);
			ReceiveThread rt=new ReceiveThread(s);
			
			st.start();
			rt.start();			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
