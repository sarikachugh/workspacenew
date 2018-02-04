package com.trainings.ws.soap.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessorResponse")
public class PaymentProcessorResponse {

	private boolean result;     //auto serialize into xml even if you not annotate it with the @XmlElement annoattion and appear in wsdl by this name

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
}
