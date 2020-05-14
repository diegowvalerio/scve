//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MensagemRetorno" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcMensagemRetorno" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mensagemRetorno"
})
@XmlRootElement(name = "ListaMensagemRetorno")
public class ListaMensagemRetorno {

    @XmlElement(name = "MensagemRetorno", required = true)
    protected List<TcMensagemRetorno> mensagemRetorno;

    /**
     * Gets the value of the mensagemRetorno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensagemRetorno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensagemRetorno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TcMensagemRetorno }
     * 
     * 
     */
    public List<TcMensagemRetorno> getMensagemRetorno() {
        if (mensagemRetorno == null) {
            mensagemRetorno = new ArrayList<TcMensagemRetorno>();
        }
        return this.mensagemRetorno;
    }

}
