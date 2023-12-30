package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveCompte", propOrder = {"arg0"})
public class SaveCompte {
	protected Compte arg0;

	public Compte getArg0() {
		return this.arg0;
	}

	public void setArg0(Compte var1) {
		this.arg0 = var1;
	}
}