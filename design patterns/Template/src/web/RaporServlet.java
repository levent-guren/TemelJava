package web;

public class RaporServlet extends BaseServlet {
	@Override
	public void doPost(Request request) {
		System.out.println("Post yontemi ile rapor servlet'i cagirildi: Parametreler: "
				+ request.getParametreler());
	}
}
