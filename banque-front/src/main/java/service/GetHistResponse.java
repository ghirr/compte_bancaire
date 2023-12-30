package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHistResponse", propOrder = {"_return"})
public class GetHistResponse {
	@XmlElement(name = "return")
	protected List<Historique> _return;

	public List<Historique> getReturn() {
		if (this._return == null) {
			this._return = new ArrayList();
		}

		return this._return;
	}
}