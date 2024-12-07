package chat;

import java.util.HashMap;
import java.util.Map;

public class ChatServer {
	private Map<String, Room> rooms = new HashMap<>();

	public void addRoom(String roomName) {
		rooms.put(roomName, new Room(roomName));
	}

	public void removeRoom(String roomName) {
		Room room = rooms.get(roomName);
		if (room != null) {
			room.removeRoom();
			rooms.remove(roomName);
		}
	}

	public Room join(Client client, String roomName) {
		Room room = rooms.get(roomName);
		if (room != null) {
			room.join(client);
		}
		return room;
	}

	public void leave(Client client, String roomName) {
		Room room = rooms.get(roomName);
		if (room != null) {
			room.leave(client);
		}
	}

}
