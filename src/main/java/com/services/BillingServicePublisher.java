package com.services;

import javax.xml.ws.Endpoint;
 

public class BillingServicePublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8888/ELMockWS/BillingService", new BillingService());
    }
 
}