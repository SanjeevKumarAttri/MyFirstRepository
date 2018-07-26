package com.accenture.utilities;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XMLUtility{
public void readXML() throws JAXBException
{
	File f = new File("testData.xml");
	
	JAXBContext j =  JAXBContext.newInstance(Regdata.class);
	Unmarshaller u = j.createUnmarshaller();
	Regdata r = (Regdata)u.unmarshal(f);
		List<Data> mydata = r.getUserdata();
		for(Data d:mydata)
		{
			System.out.println("Firstname = "+d.getFirstname());
			System.out.println("Lastname = "+d.getLastname());
		}
}

public static void main(String args[]) throws JAXBException{
	XMLUtility x = new XMLUtility();
	x.readXML();
}
} 