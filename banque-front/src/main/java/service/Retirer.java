package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retirer", propOrder = {"arg0", "arg1"})
public class Retirer {
	protected Compte arg0;
	protected float arg1;

	public Compte getArg0() {
		return this.arg0;
	}

	public void setArg0(Compte var1) {
		this.arg0 = var1;
	}

	public float getArg1() {
		return this.arg1;
	}

	public void setArg1(float var1) {
		this.arg1 = var1;
	}
}