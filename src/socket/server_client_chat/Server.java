package socket.server_client_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			ServerSocket ss=new ServerSocket(1111);
			System.out.println("监听在端口号：1111");
			Socket s=ss.accept();
			
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			DataInputStream dis=new DataInputStream(is);
			DataOutputStream dos=new DataOutputStream(os);
			
			while(true) {
				String msg=dis.readUTF();
				System.out.println("收到客户端消息："+msg);
				
				Scanner sc=new Scanner(System.in);
				String msg2=sc.next();
				dos.writeUTF(msg2);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
