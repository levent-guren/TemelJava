package chat;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private String name;
	private List<Client> clients = new ArrayList<>();

	public Room(String name) {
		this.name = name;
	}

	public void join(Client client) {
		clients.add(client);
	}

	public void leave(Client client) {
		clients.remove(client);
	}

	public void sendMessage(String message) {
		clients.forEach(c -> c.messageReceived(message));
	}

	public void removeRoom() {
		sendMessage("Room is closing");
		while (clients.size() > 0) {
			clients.get(0).leave(name);
		}
	}

}
