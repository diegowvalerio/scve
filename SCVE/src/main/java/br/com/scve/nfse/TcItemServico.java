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
 * <p>Classe Java de tcItemServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcItemServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemListaServico" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsItemListaServico"/>
 *         &lt;element name="CodigoCnae" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoCnae"/>
 *         &lt;element name="Descricao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsDescricao"/>
 *         &lt;element name="Unidade" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsUnidade" minOccurs="0"/>
 *         &lt;element name="Tributavel" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao"/>
 *         &lt;element name="Quantidade" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValorQuantidade"/>
 *         &lt;element name="ValorUnitario" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValorUnitario"/>
 *         &lt;element name="ValorDesconto" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorLiquido" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor"/>
 *         &lt;element name="DadosDeducao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDadosDeducao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcItemServico", propOrder = {
    "itemListaServico",
    "codigoCnae",
    "descricao",
    "unidade",
    "tributavel",
    "quantidade",
    "valorUnitario",
    "valorDesconto",
    "valorLiquido",
    "dadosDeducao"
})
public class TcItemServico {

    @XmlElement(name = "ItemListaServico", required = true)
    protected String itemListaServico;
    @XmlElement(name = "CodigoCnae")
    protected int codigoCnae;
    @XmlElement(name = "Descricao", required = true)
    protected String descricao;
    @XmlElement(name = "Unidade")
    protected TsUnidade unidade;
    @XmlElement(name = "Tributavel")
    protected byte tributavel;
    @XmlElement(name = "Quantidade", required = true)
    protected BigDecimal quantidade;
    @XmlElement(name = "ValorUnitario", required = true)
    protected BigDecimal valorUnitario;
    @XmlElement(name = "ValorDesconto")
    protected BigDecimal valorDesconto;
    @XmlElement(name = "ValorLiquido", required = true)
    protected BigDecimal valorLiquido;
    @XmlElement(name = "DadosDeducao")
    protected TcDadosDeducao dadosDeducao;

    /**
     * Obtém o valor da propriedade itemListaServico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemListaServico() {
        return itemListaServico;
    }

    /**
     * Define o valor da propriedade itemListaServico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemListaServico(String value) {
        this.itemListaServico = value;
    }

    /**
     * Obtém o valor da propriedade codigoCnae.
     * 
     */
    public int getCodigoCnae() {
        return codigoCnae;
    }

    /**
     * Define o valor da propriedade codigoCnae.
     * 
     */
    public void setCodigoCnae(int value) {
        this.codigoCnae = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade unidade.
     * 
     * @return
     *     possible object is
     *     {@link TsUnidade }
     *     
     */
    public TsUnidade getUnidade() {
        return unidade;
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     * @param value
     *     allowed object is
     *     {@link TsUnidade }
     *     
     */
    public void setUnidade(TsUnidade value) {
        this.unidade = value;
    }

    /**
     * Obtém o valor da propriedade tributavel.
     * 
     */
    public byte getTributavel() {
        return tributavel;
    }

    /**
     * Define o valor da propriedade tributavel.
     * 
     */
    public void setTributavel(byte value) {
        this.tributavel = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidade(BigDecimal value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade valorUnitario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define o valor da propriedade valorUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorUnitario(BigDecimal value) {
        this.valorUnitario = value;
    }

    /**
     * Obtém o valor da propriedade valorDesconto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    /**
     * Define o valor da propriedade valorDesconto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDesconto(BigDecimal value) {
        this.valorDesconto = value;
    }

    /**
     * Obtém o valor da propriedade valorLiquido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    /**
     * Define o valor da propriedade valorLiquido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiquido(BigDecimal value) {
        this.valorLiquido = value;
    }

    /**
     * Obtém o valor da propriedade dadosDeducao.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosDeducao }
     *     
     */
    public TcDadosDeducao getDadosDeducao() {
        return dadosDeducao;
    }

    /**
     * Define o valor da propriedade dadosDeducao.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosDeducao }
     *     
     */
    public void setDadosDeducao(TcDadosDeducao value) {
        this.dadosDeducao = value;
    }

}
