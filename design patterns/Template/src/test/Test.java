package test;

import java.util.HashMap;
import java.util.Map;

import web.Request;
import web.Request.RequestType;
import web.Server;

public class Test {
	public static void main(String[] args) {
		Server server = new Server();
		Request request = new Request();
		request.setUrl("/login");
		request.setTip(RequestType.GET);
		Map<String, String> parameterler = new HashMap<>();
		parameterler.put("username", "levent");
		parameterler.put("password", "pa$$w0rd");
		request.setParametreler(parameterler);

		server.execute(request);

		Request request2 = new Request();
		request2.setUrl("/rapor");
		request2.setTip(RequestType.POST);
		Map<String, String> parameterler2 = new HashMap<>();
		parameterler2.put("raporId", "143");
		parameterler2.put("ay", "2");
		parameterler2.put("kullanici", "ali@gmail.com");
		request2.setParametreler(parameterler2);

		server.execute(request2);

		Request request3 = new Request();
		request3.setUrl("/login");
		request3.setTip(RequestType.POST);
		Map<String, String> parameterler3 = new HashMap<>();
		parameterler3.put("username", "levent");
		parameterler3.put("password", "pa$$w0rd");
		request3.setParametreler(parameterler3);

		server.execute(request3);
	}
}
