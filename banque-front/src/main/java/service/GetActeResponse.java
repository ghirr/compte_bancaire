package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActeResponse", propOrder = {"_return"})
public class GetActeResponse {
	@XmlElement(name = "return")
	protected String _return;

	public String getReturn() {
		return this._return;
	}

	public void setReturn(String var1) {
		this._return = var1;
	}
}