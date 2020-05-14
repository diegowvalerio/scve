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
 *       &lt;sequence>
 *         &lt;element name="IdentificacaoRequerente" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoRequerente"/>
 *         &lt;element name="SubstituicaoNfse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Pedido" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcPedidoCancelamento"/>
 *                   &lt;element name="Rps" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDeclaracaoPrestacaoServico"/>
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
    "identificacaoRequerente",
    "substituicaoNfse"
})
@XmlRootElement(name = "SubstituirNfseEnvio")
public class SubstituirNfseEnvio {

    @XmlElement(name = "IdentificacaoRequerente", required = true)
    protected TcIdentificacaoRequerente identificacaoRequerente;
    @XmlElement(name = "SubstituicaoNfse", required = true)
    protected SubstituirNfseEnvio.SubstituicaoNfse substituicaoNfse;

    /**
     * Obtém o valor da propriedade identificacaoRequerente.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoRequerente }
     *     
     */
    public TcIdentificacaoRequerente getIdentificacaoRequerente() {
        return identificacaoRequerente;
    }

    /**
     * Define o valor da propriedade identificacaoRequerente.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoRequerente }
     *     
     */
    public void setIdentificacaoRequerente(TcIdentificacaoRequerente value) {
        this.identificacaoRequerente = value;
    }

    /**
     * Obtém o valor da propriedade substituicaoNfse.
     * 
     * @return
     *     possible object is
     *     {@link SubstituirNfseEnvio.SubstituicaoNfse }
     *     
     */
    public SubstituirNfseEnvio.SubstituicaoNfse getSubstituicaoNfse() {
        return substituicaoNfse;
    }

    /**
     * Define o valor da propriedade substituicaoNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstituirNfseEnvio.SubstituicaoNfse }
     *     
     */
    public void setSubstituicaoNfse(SubstituirNfseEnvio.SubstituicaoNfse value) {
        this.substituicaoNfse = value;
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
     *         &lt;element name="Pedido" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcPedidoCancelamento"/>
     *         &lt;element name="Rps" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDeclaracaoPrestacaoServico"/>
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
        "pedido",
        "rps"
    })
    public static class SubstituicaoNfse {

        @XmlElement(name = "Pedido", required = true)
        protected TcPedidoCancelamento pedido;
        @XmlElement(name = "Rps", required = true)
        protected TcDeclaracaoPrestacaoServico rps;

        /**
         * Obtém o valor da propriedade pedido.
         * 
         * @return
         *     possible object is
         *     {@link TcPedidoCancelamento }
         *     
         */
        public TcPedidoCancelamento getPedido() {
            return pedido;
        }

        /**
         * Define o valor da propriedade pedido.
         * 
         * @param value
         *     allowed object is
         *     {@link TcPedidoCancelamento }
         *     
         */
        public void setPedido(TcPedidoCancelamento value) {
            this.pedido = value;
        }

        /**
         * Obtém o valor da propriedade rps.
         * 
         * @return
         *     possible object is
         *     {@link TcDeclaracaoPrestacaoServico }
         *     
         */
        public TcDeclaracaoPrestacaoServico getRps() {
            return rps;
        }

        /**
         * Define o valor da propriedade rps.
         * 
         * @param value
         *     allowed object is
         *     {@link TcDeclaracaoPrestacaoServico }
         *     
         */
        public void setRps(TcDeclaracaoPrestacaoServico value) {
            this.rps = value;
        }

    }

}
