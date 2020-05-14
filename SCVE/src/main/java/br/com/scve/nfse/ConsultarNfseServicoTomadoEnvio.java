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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="IdentificacaoRequerente" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoRequerente"/>
 *         &lt;element name="NumeroNfse" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="PeriodoEmissao" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="DataInicial" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     &lt;element name="DataFinal" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PeriodoCompetencia" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="DataInicial" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     &lt;element name="DataFinal" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Prestador" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoPrestador" minOccurs="0"/>
 *         &lt;element name="Tomador" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoTomador" minOccurs="0"/>
 *         &lt;element name="Intermediario" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoIntermediario" minOccurs="0"/>
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
    "numeroNfse",
    "periodoEmissao",
    "periodoCompetencia",
    "prestador",
    "tomador",
    "intermediario",
    "pagina"
})
@XmlRootElement(name = "ConsultarNfseServicoTomadoEnvio")
public class ConsultarNfseServicoTomadoEnvio {

    @XmlElement(name = "IdentificacaoRequerente", required = true)
    protected TcIdentificacaoRequerente identificacaoRequerente;
    @XmlElement(name = "NumeroNfse")
    protected BigInteger numeroNfse;
    @XmlElement(name = "PeriodoEmissao")
    protected ConsultarNfseServicoTomadoEnvio.PeriodoEmissao periodoEmissao;
    @XmlElement(name = "PeriodoCompetencia")
    protected ConsultarNfseServicoTomadoEnvio.PeriodoCompetencia periodoCompetencia;
    @XmlElement(name = "Prestador")
    protected TcIdentificacaoPrestador prestador;
    @XmlElement(name = "Tomador")
    protected TcIdentificacaoTomador tomador;
    @XmlElement(name = "Intermediario")
    protected TcIdentificacaoIntermediario intermediario;
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
     * Obtém o valor da propriedade numeroNfse.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroNfse() {
        return numeroNfse;
    }

    /**
     * Define o valor da propriedade numeroNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroNfse(BigInteger value) {
        this.numeroNfse = value;
    }

    /**
     * Obtém o valor da propriedade periodoEmissao.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarNfseServicoTomadoEnvio.PeriodoEmissao }
     *     
     */
    public ConsultarNfseServicoTomadoEnvio.PeriodoEmissao getPeriodoEmissao() {
        return periodoEmissao;
    }

    /**
     * Define o valor da propriedade periodoEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarNfseServicoTomadoEnvio.PeriodoEmissao }
     *     
     */
    public void setPeriodoEmissao(ConsultarNfseServicoTomadoEnvio.PeriodoEmissao value) {
        this.periodoEmissao = value;
    }

    /**
     * Obtém o valor da propriedade periodoCompetencia.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarNfseServicoTomadoEnvio.PeriodoCompetencia }
     *     
     */
    public ConsultarNfseServicoTomadoEnvio.PeriodoCompetencia getPeriodoCompetencia() {
        return periodoCompetencia;
    }

    /**
     * Define o valor da propriedade periodoCompetencia.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarNfseServicoTomadoEnvio.PeriodoCompetencia }
     *     
     */
    public void setPeriodoCompetencia(ConsultarNfseServicoTomadoEnvio.PeriodoCompetencia value) {
        this.periodoCompetencia = value;
    }

    /**
     * Obtém o valor da propriedade prestador.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public TcIdentificacaoPrestador getPrestador() {
        return prestador;
    }

    /**
     * Define o valor da propriedade prestador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public void setPrestador(TcIdentificacaoPrestador value) {
        this.prestador = value;
    }

    /**
     * Obtém o valor da propriedade tomador.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoTomador }
     *     
     */
    public TcIdentificacaoTomador getTomador() {
        return tomador;
    }

    /**
     * Define o valor da propriedade tomador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoTomador }
     *     
     */
    public void setTomador(TcIdentificacaoTomador value) {
        this.tomador = value;
    }

    /**
     * Obtém o valor da propriedade intermediario.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoIntermediario }
     *     
     */
    public TcIdentificacaoIntermediario getIntermediario() {
        return intermediario;
    }

    /**
     * Define o valor da propriedade intermediario.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoIntermediario }
     *     
     */
    public void setIntermediario(TcIdentificacaoIntermediario value) {
        this.intermediario = value;
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
     *         &lt;element name="DataInicial" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="DataFinal" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "dataInicial",
        "dataFinal"
    })
    public static class PeriodoCompetencia {

        @XmlElement(name = "DataInicial", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataInicial;
        @XmlElement(name = "DataFinal", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataFinal;

        /**
         * Obtém o valor da propriedade dataInicial.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataInicial() {
            return dataInicial;
        }

        /**
         * Define o valor da propriedade dataInicial.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataInicial(XMLGregorianCalendar value) {
            this.dataInicial = value;
        }

        /**
         * Obtém o valor da propriedade dataFinal.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataFinal() {
            return dataFinal;
        }

        /**
         * Define o valor da propriedade dataFinal.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataFinal(XMLGregorianCalendar value) {
            this.dataFinal = value;
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
     *         &lt;element name="DataInicial" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="DataFinal" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "dataInicial",
        "dataFinal"
    })
    public static class PeriodoEmissao {

        @XmlElement(name = "DataInicial", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataInicial;
        @XmlElement(name = "DataFinal", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataFinal;

        /**
         * Obtém o valor da propriedade dataInicial.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataInicial() {
            return dataInicial;
        }

        /**
         * Define o valor da propriedade dataInicial.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataInicial(XMLGregorianCalendar value) {
            this.dataInicial = value;
        }

        /**
         * Obtém o valor da propriedade dataFinal.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataFinal() {
            return dataFinal;
        }

        /**
         * Define o valor da propriedade dataFinal.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataFinal(XMLGregorianCalendar value) {
            this.dataFinal = value;
        }

    }

}
