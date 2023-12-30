package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getComptesResponse", propOrder = {"_return"})
public class GetComptesResponse {
	@XmlElement(name = "return")
	protected List<Compte> _return;

	public List<Compte> getReturn() {
		if (this._return == null) {
			this._return = new ArrayList();
		}

		return this._return;
	}
}