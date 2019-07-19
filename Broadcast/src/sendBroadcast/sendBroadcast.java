package sendBroadcast;

import java.util.*;
import java.net.*;
import java.io.*;

public class sendBroadcast {

	public static void main(String[] args) throws IOException {
		System.out.println("Willkommen");
		System.out.println("Bitte geben sie ihre Nachricht ein: ");
		Scanner sc= new Scanner(System.in);
		String message = sc.next();
		Socket socket = new Socket("localhost", 8080);
		OutputStream outputStream = socket.getOutputStream();
		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
		
		dataOutputStream.writeUTF("Your message: "+ message);
		dataOutputStream.flush();
		dataOutputStream.close();
		socket.close();
	}
}