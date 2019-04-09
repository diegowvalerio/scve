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
 *       &lt;choice>
 *         &lt;element name="RetSubstituicao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NfseSubstituida">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse"/>
 *                             &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemRetorno" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NfseSubstituidora">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemRetorno"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retSubstituicao",
    "listaMensagemRetorno"
})
@XmlRootElement(name = "SubstituirNfseResposta")
public class SubstituirNfseResposta {

    @XmlElement(name = "RetSubstituicao")
    protected SubstituirNfseResposta.RetSubstituicao retSubstituicao;
    @XmlElement(name = "ListaMensagemRetorno")
    protected ListaMensagemRetorno listaMensagemRetorno;

    /**
     * Obtém o valor da propriedade retSubstituicao.
     * 
     * @return
     *     possible object is
     *     {@link SubstituirNfseResposta.RetSubstituicao }
     *     
     */
    public SubstituirNfseResposta.RetSubstituicao getRetSubstituicao() {
        return retSubstituicao;
    }

    /**
     * Define o valor da propriedade retSubstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstituirNfseResposta.RetSubstituicao }
     *     
     */
    public void setRetSubstituicao(SubstituirNfseResposta.RetSubstituicao value) {
        this.retSubstituicao = value;
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NfseSubstituida">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse"/>
     *                   &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemRetorno" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NfseSubstituidora">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "nfseSubstituida",
        "nfseSubstituidora"
    })
    public static class RetSubstituicao {

        @XmlElement(name = "NfseSubstituida", required = true)
        protected SubstituirNfseResposta.RetSubstituicao.NfseSubstituida nfseSubstituida;
        @XmlElement(name = "NfseSubstituidora", required = true)
        protected SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora nfseSubstituidora;

        /**
         * Obtém o valor da propriedade nfseSubstituida.
         * 
         * @return
         *     possible object is
         *     {@link SubstituirNfseResposta.RetSubstituicao.NfseSubstituida }
         *     
         */
        public SubstituirNfseResposta.RetSubstituicao.NfseSubstituida getNfseSubstituida() {
            return nfseSubstituida;
        }

        /**
         * Define o valor da propriedade nfseSubstituida.
         * 
         * @param value
         *     allowed object is
         *     {@link SubstituirNfseResposta.RetSubstituicao.NfseSubstituida }
         *     
         */
        public void setNfseSubstituida(SubstituirNfseResposta.RetSubstituicao.NfseSubstituida value) {
            this.nfseSubstituida = value;
        }

        /**
         * Obtém o valor da propriedade nfseSubstituidora.
         * 
         * @return
         *     possible object is
         *     {@link SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora }
         *     
         */
        public SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora getNfseSubstituidora() {
            return nfseSubstituidora;
        }

        /**
         * Define o valor da propriedade nfseSubstituidora.
         * 
         * @param value
         *     allowed object is
         *     {@link SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora }
         *     
         */
        public void setNfseSubstituidora(SubstituirNfseResposta.RetSubstituicao.NfseSubstituidora value) {
            this.nfseSubstituidora = value;
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
         *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse"/>
         *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemRetorno" minOccurs="0"/>
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
            "listaMensagemRetorno"
        })
        public static class NfseSubstituida {

            @XmlElement(name = "CompNfse", required = true)
            protected TcCompNfse compNfse;
            @XmlElement(name = "ListaMensagemRetorno")
            protected ListaMensagemRetorno listaMensagemRetorno;

            /**
             * Obtém o valor da propriedade compNfse.
             * 
             * @return
             *     possible object is
             *     {@link TcCompNfse }
             *     
             */
            public TcCompNfse getCompNfse() {
                return compNfse;
            }

            /**
             * Define o valor da propriedade compNfse.
             * 
             * @param value
             *     allowed object is
             *     {@link TcCompNfse }
             *     
             */
            public void setCompNfse(TcCompNfse value) {
                this.compNfse = value;
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
         *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}CompNfse"/>
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
            "compNfse"
        })
        public static class NfseSubstituidora {

            @XmlElement(name = "CompNfse", required = true)
            protected TcCompNfse compNfse;

            /**
             * Obtém o valor da propriedade compNfse.
             * 
             * @return
             *     possible object is
             *     {@link TcCompNfse }
             *     
             */
            public TcCompNfse getCompNfse() {
                return compNfse;
            }

            /**
             * Define o valor da propriedade compNfse.
             * 
             * @param value
             *     allowed object is
             *     {@link TcCompNfse }
             *     
             */
            public void setCompNfse(TcCompNfse value) {
                this.compNfse = value;
            }

        }

    }

}
