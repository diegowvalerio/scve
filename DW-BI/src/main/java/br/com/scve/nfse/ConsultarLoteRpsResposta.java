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
 *         &lt;element name="Situacao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSituacaoLoteRps"/>
 *         &lt;choice>
 *           &lt;element name="ListaNfse">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse" maxOccurs="50"/>
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
    "situacao",
    "listaNfse",
    "listaMensagemRetorno",
    "listaMensagemRetornoLote"
})
@XmlRootElement(name = "ConsultarLoteRpsResposta")
public class ConsultarLoteRpsResposta {

    @XmlElement(name = "Situacao")
    protected byte situacao;
    @XmlElement(name = "ListaNfse")
    protected ConsultarLoteRpsResposta.ListaNfse listaNfse;
    @XmlElement(name = "ListaMensagemRetorno")
    protected ListaMensagemRetorno listaMensagemRetorno;
    @XmlElement(name = "ListaMensagemRetornoLote")
    protected ListaMensagemRetornoLote listaMensagemRetornoLote;

    /**
     * Obtém o valor da propriedade situacao.
     * 
     */
    public byte getSituacao() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     */
    public void setSituacao(byte value) {
        this.situacao = value;
    }

    /**
     * Obtém o valor da propriedade listaNfse.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarLoteRpsResposta.ListaNfse }
     *     
     */
    public ConsultarLoteRpsResposta.ListaNfse getListaNfse() {
        return listaNfse;
    }

    /**
     * Define o valor da propriedade listaNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarLoteRpsResposta.ListaNfse }
     *     
     */
    public void setListaNfse(ConsultarLoteRpsResposta.ListaNfse value) {
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
     *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse" maxOccurs="50"/>
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
