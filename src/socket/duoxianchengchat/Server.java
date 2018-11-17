package socket.duoxianchengchat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket ss=new ServerSocket(1111);
			System.out.println("监听在端口号：1111");
			Socket s=ss.accept();
			
			SendThread st=new SendThread(s);
			ReceiveThread rt=new ReceiveThread(s);
			
			st.start();
			rt.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
