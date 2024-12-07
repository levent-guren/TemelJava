package web;

public class Server {
	public void execute(Request request) {
		if (request.getUrl().equals("/login")) {
			new LoginServlet().execute(request);
		} else if (request.getUrl().equals("/rapor")) {
			new RaporServlet().execute(request);
		}
	}
}
