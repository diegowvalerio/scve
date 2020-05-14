//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tcValoresDeclaracaoServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcValoresDeclaracaoServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValorServicos" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor"/>
 *         &lt;element name="ValorDeducoes" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="AliquotaPis" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="RetidoPis" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao" minOccurs="0"/>
 *         &lt;element name="ValorPis" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="AliquotaCofins" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="RetidoCofins" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao" minOccurs="0"/>
 *         &lt;element name="ValorCofins" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="AliquotaInss" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="RetidoInss" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao" minOccurs="0"/>
 *         &lt;element name="ValorInss" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="AliquotaIr" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="RetidoIr" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao" minOccurs="0"/>
 *         &lt;element name="ValorIr" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="AliquotaCsll" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="RetidoCsll" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao" minOccurs="0"/>
 *         &lt;element name="ValorCsll" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="AliquotaCpp" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="RetidoCpp" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao" minOccurs="0"/>
 *         &lt;element name="ValorCpp" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="OutrasRetencoes" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="RetidoOutrasRetencoes" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao" minOccurs="0"/>
 *         &lt;element name="AliquotaTotTributos" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="ValTotTributos" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorIss" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="Aliquota" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="DescontoIncondicionado" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="DescontoCondicionado" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcValoresDeclaracaoServico", propOrder = {
    "valorServicos",
    "valorDeducoes",
    "aliquotaPis",
    "retidoPis",
    "valorPis",
    "aliquotaCofins",
    "retidoCofins",
    "valorCofins",
    "aliquotaInss",
    "retidoInss",
    "valorInss",
    "aliquotaIr",
    "retidoIr",
    "valorIr",
    "aliquotaCsll",
    "retidoCsll",
    "valorCsll",
    "aliquotaCpp",
    "retidoCpp",
    "valorCpp",
    "outrasRetencoes",
    "retidoOutrasRetencoes",
    "aliquotaTotTributos",
    "valTotTributos",
    "valorIss",
    "aliquota",
    "descontoIncondicionado",
    "descontoCondicionado"
})
public class TcValoresDeclaracaoServico {

    @XmlElement(name = "ValorServicos", required = true)
    protected BigDecimal valorServicos;
    @XmlElement(name = "ValorDeducoes")
    protected BigDecimal valorDeducoes;
    @XmlElement(name = "AliquotaPis")
    protected BigDecimal aliquotaPis;
    @XmlElement(name = "RetidoPis")
    protected Byte retidoPis;
    @XmlElement(name = "ValorPis")
    protected BigDecimal valorPis;
    @XmlElement(name = "AliquotaCofins")
    protected BigDecimal aliquotaCofins;
    @XmlElement(name = "RetidoCofins")
    protected Byte retidoCofins;
    @XmlElement(name = "ValorCofins")
    protected BigDecimal valorCofins;
    @XmlElement(name = "AliquotaInss")
    protected BigDecimal aliquotaInss;
    @XmlElement(name = "RetidoInss")
    protected Byte retidoInss;
    @XmlElement(name = "ValorInss")
    protected BigDecimal valorInss;
    @XmlElement(name = "AliquotaIr")
    protected BigDecimal aliquotaIr;
    @XmlElement(name = "RetidoIr")
    protected Byte retidoIr;
    @XmlElement(name = "ValorIr")
    protected BigDecimal valorIr;
    @XmlElement(name = "AliquotaCsll")
    protected BigDecimal aliquotaCsll;
    @XmlElement(name = "RetidoCsll")
    protected Byte retidoCsll;
    @XmlElement(name = "ValorCsll")
    protected BigDecimal valorCsll;
    @XmlElement(name = "AliquotaCpp")
    protected BigDecimal aliquotaCpp;
    @XmlElement(name = "RetidoCpp")
    protected Byte retidoCpp;
    @XmlElement(name = "ValorCpp")
    protected BigDecimal valorCpp;
    @XmlElement(name = "OutrasRetencoes")
    protected BigDecimal outrasRetencoes;
    @XmlElement(name = "RetidoOutrasRetencoes")
    protected Byte retidoOutrasRetencoes;
    @XmlElement(name = "AliquotaTotTributos")
    protected BigDecimal aliquotaTotTributos;
    @XmlElement(name = "ValTotTributos")
    protected BigDecimal valTotTributos;
    @XmlElement(name = "ValorIss")
    protected BigDecimal valorIss;
    @XmlElement(name = "Aliquota")
    protected BigDecimal aliquota;
    @XmlElement(name = "DescontoIncondicionado")
    protected BigDecimal descontoIncondicionado;
    @XmlElement(name = "DescontoCondicionado")
    protected BigDecimal descontoCondicionado;

    /**
     * Obtém o valor da propriedade valorServicos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorServicos() {
        return valorServicos;
    }

    /**
     * Define o valor da propriedade valorServicos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorServicos(BigDecimal value) {
        this.valorServicos = value;
    }

    /**
     * Obtém o valor da propriedade valorDeducoes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDeducoes() {
        return valorDeducoes;
    }

    /**
     * Define o valor da propriedade valorDeducoes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDeducoes(BigDecimal value) {
        this.valorDeducoes = value;
    }

    /**
     * Obtém o valor da propriedade aliquotaPis.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaPis() {
        return aliquotaPis;
    }

    /**
     * Define o valor da propriedade aliquotaPis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaPis(BigDecimal value) {
        this.aliquotaPis = value;
    }

    /**
     * Obtém o valor da propriedade retidoPis.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRetidoPis() {
        return retidoPis;
    }

    /**
     * Define o valor da propriedade retidoPis.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRetidoPis(Byte value) {
        this.retidoPis = value;
    }

    /**
     * Obtém o valor da propriedade valorPis.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPis() {
        return valorPis;
    }

    /**
     * Define o valor da propriedade valorPis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPis(BigDecimal value) {
        this.valorPis = value;
    }

    /**
     * Obtém o valor da propriedade aliquotaCofins.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaCofins() {
        return aliquotaCofins;
    }

    /**
     * Define o valor da propriedade aliquotaCofins.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaCofins(BigDecimal value) {
        this.aliquotaCofins = value;
    }

    /**
     * Obtém o valor da propriedade retidoCofins.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRetidoCofins() {
        return retidoCofins;
    }

    /**
     * Define o valor da propriedade retidoCofins.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRetidoCofins(Byte value) {
        this.retidoCofins = value;
    }

    /**
     * Obtém o valor da propriedade valorCofins.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCofins() {
        return valorCofins;
    }

    /**
     * Define o valor da propriedade valorCofins.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCofins(BigDecimal value) {
        this.valorCofins = value;
    }

    /**
     * Obtém o valor da propriedade aliquotaInss.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaInss() {
        return aliquotaInss;
    }

    /**
     * Define o valor da propriedade aliquotaInss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaInss(BigDecimal value) {
        this.aliquotaInss = value;
    }

    /**
     * Obtém o valor da propriedade retidoInss.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRetidoInss() {
        return retidoInss;
    }

    /**
     * Define o valor da propriedade retidoInss.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRetidoInss(Byte value) {
        this.retidoInss = value;
    }

    /**
     * Obtém o valor da propriedade valorInss.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorInss() {
        return valorInss;
    }

    /**
     * Define o valor da propriedade valorInss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorInss(BigDecimal value) {
        this.valorInss = value;
    }

    /**
     * Obtém o valor da propriedade aliquotaIr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaIr() {
        return aliquotaIr;
    }

    /**
     * Define o valor da propriedade aliquotaIr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaIr(BigDecimal value) {
        this.aliquotaIr = value;
    }

    /**
     * Obtém o valor da propriedade retidoIr.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRetidoIr() {
        return retidoIr;
    }

    /**
     * Define o valor da propriedade retidoIr.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRetidoIr(Byte value) {
        this.retidoIr = value;
    }

    /**
     * Obtém o valor da propriedade valorIr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIr() {
        return valorIr;
    }

    /**
     * Define o valor da propriedade valorIr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIr(BigDecimal value) {
        this.valorIr = value;
    }

    /**
     * Obtém o valor da propriedade aliquotaCsll.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaCsll() {
        return aliquotaCsll;
    }

    /**
     * Define o valor da propriedade aliquotaCsll.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaCsll(BigDecimal value) {
        this.aliquotaCsll = value;
    }

    /**
     * Obtém o valor da propriedade retidoCsll.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRetidoCsll() {
        return retidoCsll;
    }

    /**
     * Define o valor da propriedade retidoCsll.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRetidoCsll(Byte value) {
        this.retidoCsll = value;
    }

    /**
     * Obtém o valor da propriedade valorCsll.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCsll() {
        return valorCsll;
    }

    /**
     * Define o valor da propriedade valorCsll.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCsll(BigDecimal value) {
        this.valorCsll = value;
    }

    /**
     * Obtém o valor da propriedade aliquotaCpp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaCpp() {
        return aliquotaCpp;
    }

    /**
     * Define o valor da propriedade aliquotaCpp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaCpp(BigDecimal value) {
        this.aliquotaCpp = value;
    }

    /**
     * Obtém o valor da propriedade retidoCpp.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRetidoCpp() {
        return retidoCpp;
    }

    /**
     * Define o valor da propriedade retidoCpp.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRetidoCpp(Byte value) {
        this.retidoCpp = value;
    }

    /**
     * Obtém o valor da propriedade valorCpp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCpp() {
        return valorCpp;
    }

    /**
     * Define o valor da propriedade valorCpp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCpp(BigDecimal value) {
        this.valorCpp = value;
    }

    /**
     * Obtém o valor da propriedade outrasRetencoes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutrasRetencoes() {
        return outrasRetencoes;
    }

    /**
     * Define o valor da propriedade outrasRetencoes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutrasRetencoes(BigDecimal value) {
        this.outrasRetencoes = value;
    }

    /**
     * Obtém o valor da propriedade retidoOutrasRetencoes.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRetidoOutrasRetencoes() {
        return retidoOutrasRetencoes;
    }

    /**
     * Define o valor da propriedade retidoOutrasRetencoes.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRetidoOutrasRetencoes(Byte value) {
        this.retidoOutrasRetencoes = value;
    }

    /**
     * Obtém o valor da propriedade aliquotaTotTributos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaTotTributos() {
        return aliquotaTotTributos;
    }

    /**
     * Define o valor da propriedade aliquotaTotTributos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaTotTributos(BigDecimal value) {
        this.aliquotaTotTributos = value;
    }

    /**
     * Obtém o valor da propriedade valTotTributos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValTotTributos() {
        return valTotTributos;
    }

    /**
     * Define o valor da propriedade valTotTributos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValTotTributos(BigDecimal value) {
        this.valTotTributos = value;
    }

    /**
     * Obtém o valor da propriedade valorIss.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIss() {
        return valorIss;
    }

    /**
     * Define o valor da propriedade valorIss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIss(BigDecimal value) {
        this.valorIss = value;
    }

    /**
     * Obtém o valor da propriedade aliquota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquota() {
        return aliquota;
    }

    /**
     * Define o valor da propriedade aliquota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquota(BigDecimal value) {
        this.aliquota = value;
    }

    /**
     * Obtém o valor da propriedade descontoIncondicionado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescontoIncondicionado() {
        return descontoIncondicionado;
    }

    /**
     * Define o valor da propriedade descontoIncondicionado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescontoIncondicionado(BigDecimal value) {
        this.descontoIncondicionado = value;
    }

    /**
     * Obtém o valor da propriedade descontoCondicionado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescontoCondicionado() {
        return descontoCondicionado;
    }

    /**
     * Define o valor da propriedade descontoCondicionado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescontoCondicionado(BigDecimal value) {
        this.descontoCondicionado = value;
    }

}
