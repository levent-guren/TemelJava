package web;

public class LoginServlet extends BaseServlet {
	@Override
	public void doGet(Request request) {
		System.out.println("Get yontemi ile login servlet'i cagirildi: Parametreler: "
				+ request.getParametreler());
	}
}
