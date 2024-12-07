package web;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Request {
	public static enum RequestType {
		GET, POST
	}

	private RequestType tip;
	private String url;
	private Map<String, String> parametreler = new HashMap<>();
}
