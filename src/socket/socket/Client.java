package socket.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket=new Socket("localhost", 1111);
			
			OutputStream os=socket.getOutputStream();
			
			DataOutputStream dos=new DataOutputStream(os);
			
			Scanner sc=new Scanner(System.in);
			String msg=sc.next();
			dos.writeUTF(msg);
			sc.close();
			dos.close();
			os.close();
			System.out.println(socket);
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
