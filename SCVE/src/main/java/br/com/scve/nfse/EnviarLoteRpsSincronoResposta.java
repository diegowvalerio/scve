//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="NumeroLote" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroLote"/>
 *         &lt;element name="DataRecebimento" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsData"/>
 *         &lt;choice>
 *           &lt;element name="ListaNfse">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse" maxOccurs="unbounded"/>
 *                     &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemAlertaRetorno" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemRetorno"/>
 *           &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemRetornoLote"/>
 *         &lt;/choice>
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
    "numeroLote",
    "dataRecebimento",
    "listaNfse",
    "listaMensagemRetorno",
    "listaMensagemRetornoLote"
})
@XmlRootElement(name = "EnviarLoteRpsSincronoResposta")
public class EnviarLoteRpsSincronoResposta {

    @XmlElement(name = "NumeroLote", required = true)
    protected BigInteger numeroLote;
    @XmlElement(name = "DataRecebimento", required = true)
    protected XMLGregorianCalendar dataRecebimento;
    @XmlElement(name = "ListaNfse")
    protected EnviarLoteRpsSincronoResposta.ListaNfse listaNfse;
    @XmlElement(name = "ListaMensagemRetorno")
    protected ListaMensagemRetorno listaMensagemRetorno;
    @XmlElement(name = "ListaMensagemRetornoLote")
    protected ListaMensagemRetornoLote listaMensagemRetornoLote;

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroLote(BigInteger value) {
        this.numeroLote = value;
    }

    /**
     * Obtém o valor da propriedade dataRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRecebimento() {
        return dataRecebimento;
    }

    /**
     * Define o valor da propriedade dataRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRecebimento(XMLGregorianCalendar value) {
        this.dataRecebimento = value;
    }

    /**
     * Obtém o valor da propriedade listaNfse.
     * 
     * @return
     *     possible object is
     *     {@link EnviarLoteRpsSincronoResposta.ListaNfse }
     *     
     */
    public EnviarLoteRpsSincronoResposta.ListaNfse getListaNfse() {
        return listaNfse;
    }

    /**
     * Define o valor da propriedade listaNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link EnviarLoteRpsSincronoResposta.ListaNfse }
     *     
     */
    public void setListaNfse(EnviarLoteRpsSincronoResposta.ListaNfse value) {
        this.listaNfse = value;
    }

    /**
     * Obtém o valor da propriedade listaMensagemRetorno.
     * 
     * @return
     *     possible object is
     *     {@link ListaMensagemRetorno }
     *     
     */
    public ListaMensagemRetorno getListaMensagemRetorno() {
        return listaMensagemRetorno;
    }

    /**
     * Define o valor da propriedade listaMensagemRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMensagemRetorno }
     *     
     */
    public void setListaMensagemRetorno(ListaMensagemRetorno value) {
        this.listaMensagemRetorno = value;
    }

    /**
     * Obtém o valor da propriedade listaMensagemRetornoLote.
     * 
     * @return
     *     possible object is
     *     {@link ListaMensagemRetornoLote }
     *     
     */
    public ListaMensagemRetornoLote getListaMensagemRetornoLote() {
        return listaMensagemRetornoLote;
    }

    /**
     * Define o valor da propriedade listaMensagemRetornoLote.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMensagemRetornoLote }
     *     
     */
    public void setListaMensagemRetornoLote(ListaMensagemRetornoLote value) {
        this.listaMensagemRetornoLote = value;
    }


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
     *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemAlertaRetorno" minOccurs="0"/>
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
        "compNfse",
        "listaMensagemAlertaRetorno"
    })
    public static class ListaNfse {

        @XmlElement(name = "CompNfse", required = true)
        protected List<TcCompNfse> compNfse;
        @XmlElement(name = "ListaMensagemAlertaRetorno")
        protected ListaMensagemAlertaRetorno listaMensagemAlertaRetorno;

        /**
         * Gets the value of the compNfse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compNfse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompNfse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcCompNfse }
         * 
         * 
         */
        public List<TcCompNfse> getCompNfse() {
            if (compNfse == null) {
                compNfse = new ArrayList<TcCompNfse>();
            }
            return this.compNfse;
        }

        /**
         * Obtém o valor da propriedade listaMensagemAlertaRetorno.
         * 
         * @return
         *     possible object is
         *     {@link ListaMensagemAlertaRetorno }
         *     
         */
        public ListaMensagemAlertaRetorno getListaMensagemAlertaRetorno() {
            return listaMensagemAlertaRetorno;
        }

        /**
         * Define o valor da propriedade listaMensagemAlertaRetorno.
         * 
         * @param value
         *     allowed object is
         *     {@link ListaMensagemAlertaRetorno }
         *     
         */
        public void setListaMensagemAlertaRetorno(ListaMensagemAlertaRetorno value) {
            this.listaMensagemAlertaRetorno = value;
        }

    }

}
