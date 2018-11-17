package socket.server_client_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("localhost", 1111);
			
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			DataInputStream dis=new DataInputStream(is);
			DataOutputStream dos=new DataOutputStream(os);
			
			while(true) {
				Scanner sc=new Scanner(System.in);
				String msg=sc.next();
				dos.writeUTF(msg);
				
				String msg2=dis.readUTF();
				System.out.println("收到服务器消息"+msg2);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
