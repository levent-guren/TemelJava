package web;

import web.Request.RequestType;

public abstract class BaseServlet {
	public void doGet(Request request) {
		throw new RuntimeException("Get not supported");
	}

	public void doPost(Request request) {
		throw new RuntimeException("Post not supported");
	}

	public void execute(Request request) {
		if (request.getTip() == RequestType.GET) {
			doGet(request);
		} else if (request.getTip() == RequestType.POST) {
			doPost(request);
		}
	}
}
