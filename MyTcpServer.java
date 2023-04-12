import java.util.*;
import java.io.*;
import java.net.*;

public class MyTcpServer {
	public static void main(String[] args) throws Exception {
		try {
				
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
		System.out.println("Waiting for Client..");
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		String str = din.readUTF();
		System.out.println("message : " + str);
		
		ss.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
		