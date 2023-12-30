package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existResponse", propOrder = {"_return"})
public class ExistResponse {
	@XmlElement(name = "return")
	protected boolean _return;

	public boolean isReturn() {
		return this._return;
	}

	public void setReturn(boolean var1) {
		this._return = var1;
	}
}