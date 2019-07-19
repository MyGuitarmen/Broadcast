package recBroadcast;

import java.net.*;
import java.io.*;

public class recBroadcast {
		public static void main(String[] args) throws IOException {
			System.out.println("Willkommen");
			ServerSocket Verbindung = new ServerSocket(8080);
			System.out.println("Verbindung wird hergestellt...");
			Socket socket = Verbindung.accept();
			System.out.println("Die Verbindung zu "+ socket +" konnte Hergestellt werden!");
			
			InputStream inputStream = socket.getInputStream();
			DataInputStream dataInputStream = new DataInputStream(inputStream);
			String message = dataInputStream.readUTF();
			java.util.Date date = new java.util.Date();
			System.out.println(date+" : "+ message);
			Verbindung.close();
			socket.close();
		}
}
