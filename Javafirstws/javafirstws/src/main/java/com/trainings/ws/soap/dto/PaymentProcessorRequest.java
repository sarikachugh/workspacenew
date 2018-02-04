package com.trainings.ws.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessorRequest")             //for serialize and deserialize and object of class should appear in wsdl file
@XmlAccessorType(XmlAccessType.FIELD)                 //annotation present at field level/ getter setter level
public class PaymentProcessorRequest {

	@XmlElement(name="creditCardInfo", required=true)         //field should present in the xml schema/ xml file
	private CreditCardInfo creditCardInfo;
	@XmlElement(name="double", required=true)
	private Double amount;

	public CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
