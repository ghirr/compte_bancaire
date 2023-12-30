package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {"code", "pass", "solde"})
public class Compte {
	protected int code;
	protected String pass;
	protected float solde;

	public int getCode() {
		return this.code;
	}

	public void setCode(int var1) {
		this.code = var1;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String var1) {
		this.pass = var1;
	}

	public float getSolde() {
		return this.solde;
	}

	public void setSolde(float var1) {
		this.solde = var1;
	}
}