package com.cg.xmlxsd;
import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
public class TestXml {

	public static void main(String[] args) {
		 System.out.println("PartFlowSyncMapping.xml validates against kor-rep-partFlow-sync-2.0.xsd? "+validateXMLSchema("kor-rep-partFlow-sync-2.0.xsd", "PartFlowSyncMapping.xml"));
	    

	}
	
	
public static boolean validateXMLSchema(String xsdPath, String xmlPath){
        
        try {
            SchemaFactory factory = 
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }

}
