//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import java.math.BigInteger;
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
 *         &lt;element name="Faixa">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NumeroNfseInicial" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse"/>
 *                   &lt;element name="NumeroNfseFinal" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pagina" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsPagina"/>
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
    "faixa",
    "pagina"
})
@XmlRootElement(name = "ConsultarNfseFaixaEnvio")
public class ConsultarNfseFaixaEnvio {

    @XmlElement(name = "IdentificacaoRequerente", required = true)
    protected TcIdentificacaoRequerente identificacaoRequerente;
    @XmlElement(name = "Faixa", required = true)
    protected ConsultarNfseFaixaEnvio.Faixa faixa;
    @XmlElement(name = "Pagina")
    protected int pagina;

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
     * Obtém o valor da propriedade faixa.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarNfseFaixaEnvio.Faixa }
     *     
     */
    public ConsultarNfseFaixaEnvio.Faixa getFaixa() {
        return faixa;
    }

    /**
     * Define o valor da propriedade faixa.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarNfseFaixaEnvio.Faixa }
     *     
     */
    public void setFaixa(ConsultarNfseFaixaEnvio.Faixa value) {
        this.faixa = value;
    }

    /**
     * Obtém o valor da propriedade pagina.
     * 
     */
    public int getPagina() {
        return pagina;
    }

    /**
     * Define o valor da propriedade pagina.
     * 
     */
    public void setPagina(int value) {
        this.pagina = value;
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
     *         &lt;element name="NumeroNfseInicial" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse"/>
     *         &lt;element name="NumeroNfseFinal" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse" minOccurs="0"/>
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
        "numeroNfseInicial",
        "numeroNfseFinal"
    })
    public static class Faixa {

        @XmlElement(name = "NumeroNfseInicial", required = true)
        protected BigInteger numeroNfseInicial;
        @XmlElement(name = "NumeroNfseFinal")
        protected BigInteger numeroNfseFinal;

        /**
         * Obtém o valor da propriedade numeroNfseInicial.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumeroNfseInicial() {
            return numeroNfseInicial;
        }

        /**
         * Define o valor da propriedade numeroNfseInicial.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumeroNfseInicial(BigInteger value) {
            this.numeroNfseInicial = value;
        }

        /**
         * Obtém o valor da propriedade numeroNfseFinal.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumeroNfseFinal() {
            return numeroNfseFinal;
        }

        /**
         * Define o valor da propriedade numeroNfseFinal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumeroNfseFinal(BigInteger value) {
            this.numeroNfseFinal = value;
        }

    }

}
