package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setHistoriqueResponse", propOrder = {"_return"})
public class SetHistoriqueResponse {
	@XmlElement(name = "return")
	protected int _return;

	public int getReturn() {
		return this._return;
	}

	public void setReturn(int var1) {
		this._return = var1;
	}
}