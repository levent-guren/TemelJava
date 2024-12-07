package test;

import chat.ChatServer;
import chat.Client;

public class Test {
	public static void main(String[] args) {
		ChatServer chatServer = new ChatServer();

		Client client1 = new Client("Ali", chatServer);
		Client client2 = new Client("Ayse", chatServer);
		Client client3 = new Client("Kerim", chatServer);
		Client client4 = new Client("Melisa", chatServer);

		client1.join("global chat");
		chatServer.addRoom("global chat");
		client1.join("global chat");
		client2.join("global chat");
		client3.join("global chat");
		client4.join("global chat");
		client2.sendMessage("hello");
		client4.leave("global chat");
		client3.sendMessage("hi");
		client3.leave("global chat");

		chatServer.addRoom("new meeting");
		client3.join("new meeting");
		client4.join("new meeting");
		client3.sendMessage("how are you?");
		client1.sendMessage("Are you hear the news?");

		chatServer.removeRoom("new meeting");
		client3.sendMessage("how are you?");
	}
}
