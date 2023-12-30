package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setHistorique", propOrder = {"arg0", "arg1"})
public class SetHistorique {
	protected int arg0;
	protected int arg1;

	public int getArg0() {
		return this.arg0;
	}

	public void setArg0(int var1) {
		this.arg0 = var1;
	}

	public int getArg1() {
		return this.arg1;
	}

	public void setArg1(int var1) {
		this.arg1 = var1;
	}
}