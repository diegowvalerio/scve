package br.com.scve.nfe;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import br.com.scve.nfse.Cabecalho;
import br.com.scve.nfse.ObjectFactory;
import br.com.scve.nfse.TcCompNfse;
import br.com.scve.nfse.TcInfNfse;
import br.com.scve.nfse.TcNfse;

public abstract class TesteXml {

	public static void main(String[] args) {
		
		TcCompNfse compNfse = new TcCompNfse();
		
		TcNfse nfse = new TcNfse();
		nfse.setVersao("111");
		
		TcInfNfse infnfse = new TcInfNfse();
		infnfse.setChaveAcesso("0202020202");
		infnfse.setCodigoVerificacao("1");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			infnfse.setDataEmissao(date2);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		nfse.setInfNfse(infnfse);
		
		compNfse.setNfse(nfse);
	
	try {
		info("XML Nfs-e: " + strValueOf(compNfse));
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		error(e.toString());  
	} 
		
	}
	
	private static String strValueOf(TcCompNfse compNfse) throws JAXBException {    
        JAXBContext context = JAXBContext.newInstance(TcCompNfse.class);    
        Marshaller marshaller = context.createMarshaller();    
        JAXBElement<TcCompNfse> element = new ObjectFactory().createCompNfse((compNfse));    
        //marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);    
        //marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);    
    
        StringWriter sw = new StringWriter();    
        marshaller.marshal(element, sw);    
    
        String xml = sw.toString();    
     
        return xml;    
    } 
	
	private static void error(String error) {    
        System.out.println("| ERROR: " + error);    
    }    
     
    private static void info(String info) {    
        System.out.println("| INFO: " + info);    
    } 

}
