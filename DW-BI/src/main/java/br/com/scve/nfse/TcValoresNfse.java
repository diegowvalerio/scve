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
 * <p>Classe Java de tcValoresNfse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcValoresNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseCalculo" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="Aliquota" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="ValorIss" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorLiquidoNfse" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcValoresNfse", propOrder = {
    "baseCalculo",
    "aliquota",
    "valorIss",
    "valorLiquidoNfse"
})
public class TcValoresNfse {

    @XmlElement(name = "BaseCalculo")
    protected BigDecimal baseCalculo;
    @XmlElement(name = "Aliquota")
    protected BigDecimal aliquota;
    @XmlElement(name = "ValorIss")
    protected BigDecimal valorIss;
    @XmlElement(name = "ValorLiquidoNfse", required = true)
    protected BigDecimal valorLiquidoNfse;

    /**
     * Obtém o valor da propriedade baseCalculo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseCalculo() {
        return baseCalculo;
    }

    /**
     * Define o valor da propriedade baseCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseCalculo(BigDecimal value) {
        this.baseCalculo = value;
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
     * Obtém o valor da propriedade valorLiquidoNfse.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiquidoNfse() {
        return valorLiquidoNfse;
    }

    /**
     * Define o valor da propriedade valorLiquidoNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiquidoNfse(BigDecimal value) {
        this.valorLiquidoNfse = value;
    }

}
