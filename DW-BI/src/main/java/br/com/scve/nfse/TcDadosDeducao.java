//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tcDadosDeducao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcDadosDeducao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDeducao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsTipoDeducao"/>
 *         &lt;element name="Cpf" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCpf" minOccurs="0"/>
 *         &lt;element name="Cnpj" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCnpj" minOccurs="0"/>
 *         &lt;element name="NumeroNotaFiscalReferencia" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse" minOccurs="0"/>
 *         &lt;element name="ValorTotalNotaFiscal" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="PercentualADeduzir" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorADeduzir" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDadosDeducao", propOrder = {
    "tipoDeducao",
    "cpf",
    "cnpj",
    "numeroNotaFiscalReferencia",
    "valorTotalNotaFiscal",
    "percentualADeduzir",
    "valorADeduzir"
})
public class TcDadosDeducao {

    @XmlElement(name = "TipoDeducao", required = true)
    protected String tipoDeducao;
    @XmlElement(name = "Cpf")
    protected String cpf;
    @XmlElement(name = "Cnpj")
    protected String cnpj;
    @XmlElement(name = "NumeroNotaFiscalReferencia")
    protected BigInteger numeroNotaFiscalReferencia;
    @XmlElement(name = "ValorTotalNotaFiscal")
    protected BigDecimal valorTotalNotaFiscal;
    @XmlElement(name = "PercentualADeduzir")
    protected BigDecimal percentualADeduzir;
    @XmlElement(name = "ValorADeduzir")
    protected BigDecimal valorADeduzir;

    /**
     * Obtém o valor da propriedade tipoDeducao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeducao() {
        return tipoDeducao;
    }

    /**
     * Define o valor da propriedade tipoDeducao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeducao(String value) {
        this.tipoDeducao = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade numeroNotaFiscalReferencia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroNotaFiscalReferencia() {
        return numeroNotaFiscalReferencia;
    }

    /**
     * Define o valor da propriedade numeroNotaFiscalReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroNotaFiscalReferencia(BigInteger value) {
        this.numeroNotaFiscalReferencia = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalNotaFiscal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalNotaFiscal() {
        return valorTotalNotaFiscal;
    }

    /**
     * Define o valor da propriedade valorTotalNotaFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalNotaFiscal(BigDecimal value) {
        this.valorTotalNotaFiscal = value;
    }

    /**
     * Obtém o valor da propriedade percentualADeduzir.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentualADeduzir() {
        return percentualADeduzir;
    }

    /**
     * Define o valor da propriedade percentualADeduzir.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentualADeduzir(BigDecimal value) {
        this.percentualADeduzir = value;
    }

    /**
     * Obtém o valor da propriedade valorADeduzir.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorADeduzir() {
        return valorADeduzir;
    }

    /**
     * Define o valor da propriedade valorADeduzir.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorADeduzir(BigDecimal value) {
        this.valorADeduzir = value;
    }

}
