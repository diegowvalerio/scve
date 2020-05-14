//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de tcNfse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfNfse" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcInfNfse"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsVersao" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcNfse", propOrder = {
    "infNfse"
})
public class TcNfse {

    @XmlElement(name = "InfNfse", required = true)
    protected TcInfNfse infNfse;
    @XmlAttribute(name = "versao", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    /**
     * Obtém o valor da propriedade infNfse.
     * 
     * @return
     *     possible object is
     *     {@link TcInfNfse }
     *     
     */
    public TcInfNfse getInfNfse() {
        return infNfse;
    }

    /**
     * Define o valor da propriedade infNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link TcInfNfse }
     *     
     */
    public void setInfNfse(TcInfNfse value) {
        this.infNfse = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
