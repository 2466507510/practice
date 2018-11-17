package socket.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket=new ServerSocket(1111);
			System.out.println("监听在端口号：1111");
			Socket s=serverSocket.accept();
			System.out.println("有链接过来"+s);
			
			InputStream is=s.getInputStream();
			
			
			
			DataInputStream dis=new DataInputStream(is);
			String msg1=dis.readUTF();
			System.out.println(msg1);
			dis.close();
			
			is.close();
			s.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
