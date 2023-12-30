package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCompte", propOrder = {"arg0"})
public class GetCompte {
	protected int arg0;

	public int getArg0() {
		return this.arg0;
	}

	public void setArg0(int var1) {
		this.arg0 = var1;
	}
}