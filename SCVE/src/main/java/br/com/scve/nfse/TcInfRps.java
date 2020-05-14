//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de tcInfRps complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcInfRps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacaoRps" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoRps"/>
 *         &lt;element name="DataEmissao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsData"/>
 *         &lt;element name="Status" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsStatusRps"/>
 *         &lt;element name="RpsSubstituido" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoRps" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcInfRps", propOrder = {
    "identificacaoRps",
    "dataEmissao",
    "status",
    "rpsSubstituido"
})
public class TcInfRps {

    @XmlElement(name = "IdentificacaoRps", required = true)
    protected TcIdentificacaoRps identificacaoRps;
    @XmlElement(name = "DataEmissao", required = true)
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name = "Status")
    protected byte status;
    @XmlElement(name = "RpsSubstituido")
    protected TcIdentificacaoRps rpsSubstituido;

    /**
     * Obtém o valor da propriedade identificacaoRps.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoRps }
     *     
     */
    public TcIdentificacaoRps getIdentificacaoRps() {
        return identificacaoRps;
    }

    /**
     * Define o valor da propriedade identificacaoRps.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoRps }
     *     
     */
    public void setIdentificacaoRps(TcIdentificacaoRps value) {
        this.identificacaoRps = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     */
    public void setStatus(byte value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade rpsSubstituido.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoRps }
     *     
     */
    public TcIdentificacaoRps getRpsSubstituido() {
        return rpsSubstituido;
    }

    /**
     * Define o valor da propriedade rpsSubstituido.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoRps }
     *     
     */
    public void setRpsSubstituido(TcIdentificacaoRps value) {
        this.rpsSubstituido = value;
    }

}
