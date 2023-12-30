package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transfertResponse", propOrder = {"_return"})
public class TransfertResponse {
	@XmlElement(name = "return")
	protected int _return;

	public int getReturn() {
		return this._return;
	}

	public void setReturn(int var1) {
		this._return = var1;
	}
}