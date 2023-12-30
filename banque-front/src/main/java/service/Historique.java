package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historique", propOrder = {"codecin", "date", "idActe"})
public class Historique {
	protected int codecin;
	protected String date;
	protected int idActe;

	public int getCodecin() {
		return this.codecin;
	}

	public void setCodecin(int var1) {
		this.codecin = var1;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String var1) {
		this.date = var1;
	}

	public int getIdActe() {
		return this.idActe;
	}

	public void setIdActe(int var1) {
		this.idActe = var1;
	}
}