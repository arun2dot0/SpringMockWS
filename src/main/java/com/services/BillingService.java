package com.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import junit.framework.Assert;
//import javax.xml.ws.BindingType;
//import javax.jws.soap.SOAPBinding;
//import javax.jws.soap.SOAPBinding.Style;
//import javax.jws.soap.SOAPBinding.Use;
@WebService(
        serviceName = "BillingService",
        portName = "BillingServicePort",
        targetNamespace = "http://api.eastlink.ca/billingService"
   //     endpointInterface = "BillingService"
        )
//@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) 
public class BillingService {

	@WebMethod
	public String sayHello()
	{
		return "Hello World";
	}
	
	@WebMethod
	public String purchase(String accountNum, String productID, String charge)
	{
		Assert.assertNotNull(accountNum);
		Assert.assertNotNull(productID);
		
		if(accountNum.startsWith("0"))
		{
			return "ERROR";
		}
		else
		{
			return "SUCCESS";
		}
		
	}
}
