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


/**
 * <p>Classe Java de tcCompNfse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcCompNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}Nfse"/>
 *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}NfseCancelamento" minOccurs="0"/>
 *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}NfseSubstituicao" minOccurs="0"/>
 *         &lt;element name="Xml" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsXml" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcCompNfse", propOrder = {
    "nfse",
    "nfseCancelamento",
    "nfseSubstituicao",
    "xml"
})
public class TcCompNfse {

    @XmlElement(name = "Nfse", required = true)
    protected TcNfse nfse;
    @XmlElement(name = "NfseCancelamento")
    protected TcCancelamentoNfse nfseCancelamento;
    @XmlElement(name = "NfseSubstituicao")
    protected TcSubstituicaoNfse nfseSubstituicao;
    @XmlElement(name = "Xml")
    protected String xml;

    /**
     * Obtém o valor da propriedade nfse.
     * 
     * @return
     *     possible object is
     *     {@link TcNfse }
     *     
     */
    public TcNfse getNfse() {
        return nfse;
    }

    /**
     * Define o valor da propriedade nfse.
     * 
     * @param value
     *     allowed object is
     *     {@link TcNfse }
     *     
     */
    public void setNfse(TcNfse value) {
        this.nfse = value;
    }

    /**
     * Obtém o valor da propriedade nfseCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link TcCancelamentoNfse }
     *     
     */
    public TcCancelamentoNfse getNfseCancelamento() {
        return nfseCancelamento;
    }

    /**
     * Define o valor da propriedade nfseCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TcCancelamentoNfse }
     *     
     */
    public void setNfseCancelamento(TcCancelamentoNfse value) {
        this.nfseCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade nfseSubstituicao.
     * 
     * @return
     *     possible object is
     *     {@link TcSubstituicaoNfse }
     *     
     */
    public TcSubstituicaoNfse getNfseSubstituicao() {
        return nfseSubstituicao;
    }

    /**
     * Define o valor da propriedade nfseSubstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link TcSubstituicaoNfse }
     *     
     */
    public void setNfseSubstituicao(TcSubstituicaoNfse value) {
        this.nfseSubstituicao = value;
    }

    /**
     * Obtém o valor da propriedade xml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXml() {
        return xml;
    }

    /**
     * Define o valor da propriedade xml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXml(String value) {
        this.xml = value;
    }

}
