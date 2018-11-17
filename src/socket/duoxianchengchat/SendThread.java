package socket.duoxianchengchat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {

	private Socket s;

	public SendThread(Socket s) {
		this.s = s;
	}
	private Scanner sc=new Scanner(System.in);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			OutputStream os=s.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			while(true) {
				String msg=sc.next();
				dos.writeUTF(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
}
