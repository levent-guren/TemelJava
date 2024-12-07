package chat;

public class Client {
	private String name;
	private ChatServer chatServer;
	private Room room;

	public Client(String name, ChatServer chatServer) {
		this.name = name;
		this.chatServer = chatServer;
	}

	public void join(String roomName) {
		room = chatServer.join(this, roomName);
		if (room == null) {
			System.out.println(name + " cannot join " + roomName + " room");
		} else {
			System.out.println(name + " joined " + roomName + " room");
		}
	}

	public void leave(String roomName) {
		chatServer.leave(this, roomName);
		room = null;
		System.out.println(name + " left " + roomName + " room");
	}

	public void sendMessage(String message) {
		if (room != null) {
			room.sendMessage(message);
		} else {
			System.out.println(name + " not joined any room");
		}
	}

	public void messageReceived(String message) {
		System.out.println(name + " received:" + message);
	}

}
