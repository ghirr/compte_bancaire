package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transfert", propOrder = {"arg0", "arg1"})
public class Transfert {
	protected Compte arg0;
	protected Float arg1;

	public Compte getArg0() {
		return this.arg0;
	}

	public void setArg0(Compte var1) {
		this.arg0 = var1;
	}

	public Float getArg1() {
		return this.arg1;
	}

	public void setArg1(Float var1) {
		this.arg1 = var1;
	}
}