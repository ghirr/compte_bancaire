package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "BanqueWS", targetNamespace = "http://Service/", wsdlLocation = "http://localhost:8082/?wsdl")
public class BanqueWS extends Service {
	private static final URL BANQUEWS_WSDL_LOCATION;
	private static final WebServiceException BANQUEWS_EXCEPTION;
	private static final QName BANQUEWS_QNAME = new QName("http://Service/", "BanqueWS");

	public BanqueWS() {
		super(__getWsdlLocation(), BANQUEWS_QNAME);
	}

	public BanqueWS(WebServiceFeature... var1) {
		super(__getWsdlLocation(), BANQUEWS_QNAME, var1);
	}

	public BanqueWS(URL var1) {
		super(var1, BANQUEWS_QNAME);
	}

	public BanqueWS(URL var1, WebServiceFeature... var2) {
		super(var1, BANQUEWS_QNAME, var2);
	}

	public BanqueWS(URL var1, QName var2) {
		super(var1, var2);
	}

	public BanqueWS(URL var1, QName var2, WebServiceFeature... var3) {
		super(var1, var2, var3);
	}

	@WebEndpoint(name = "Banque_ServicePort")
	public BanqueService getBanqueServicePort() {
		return (BanqueService) super.getPort(new QName("http://Service/", "Banque_ServicePort"), BanqueService.class);
	}

	@WebEndpoint(name = "Banque_ServicePort")
	public BanqueService getBanqueServicePort(WebServiceFeature... var1) {
		return (BanqueService) super.getPort(new QName("http://Service/", "Banque_ServicePort"), BanqueService.class,
				var1);
	}

	private static URL __getWsdlLocation() {
		if (BANQUEWS_EXCEPTION != null) {
			throw BANQUEWS_EXCEPTION;
		} else {
			return BANQUEWS_WSDL_LOCATION;
		}
	}

	static {
		URL var0 = null;
		WebServiceException var1 = null;

		try {
			var0 = new URL("http://localhost:8082/?wsdl");
		} catch (MalformedURLException var3) {
			var1 = new WebServiceException(var3);
		}

		BANQUEWS_WSDL_LOCATION = var0;
		BANQUEWS_EXCEPTION = var1;
	}
}