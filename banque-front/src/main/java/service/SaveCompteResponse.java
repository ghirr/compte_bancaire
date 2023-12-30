package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveCompteResponse", propOrder = {"_return"})
public class SaveCompteResponse {
	@XmlElement(name = "return")
	protected Compte _return;

	public Compte getReturn() {
		return this._return;
	}

	public void setReturn(Compte var1) {
		this._return = var1;
	}
}