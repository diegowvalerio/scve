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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de tcInfNfse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcInfNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Numero" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse"/>
 *         &lt;element name="CodigoVerificacao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoVerificacao"/>
 *         &lt;element name="DataEmissao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsData"/>
 *         &lt;element name="NfseSubstituida" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse" minOccurs="0"/>
 *         &lt;element name="OutrasInformacoes" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsOutrasInformacoes" minOccurs="0"/>
 *         &lt;element name="ValoresNfse" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcValoresNfse"/>
 *         &lt;element name="ValorCredito" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="PrestadorServico" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDadosPrestador"/>
 *         &lt;element name="OrgaoGerador" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoOrgaoGerador"/>
 *         &lt;element name="DeclaracaoPrestacaoServico" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDeclaracaoPrestacaoServico"/>
 *         &lt;element name="ChaveAcesso" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsChaveAcesso"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcInfNfse", propOrder = {
    "numero",
    "codigoVerificacao",
    "dataEmissao",
    "nfseSubstituida",
    "outrasInformacoes",
    "valoresNfse",
    "valorCredito",
    "prestadorServico",
    "orgaoGerador",
    "declaracaoPrestacaoServico",
    "chaveAcesso"
})
public class TcInfNfse {

    @XmlElement(name = "Numero", required = true)
    protected BigInteger numero;
    @XmlElement(name = "CodigoVerificacao", required = true)
    protected String codigoVerificacao;
    @XmlElement(name = "DataEmissao", required = true)
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name = "NfseSubstituida")
    protected BigInteger nfseSubstituida;
    @XmlElement(name = "OutrasInformacoes")
    protected String outrasInformacoes;
    @XmlElement(name = "ValoresNfse", required = true)
    protected TcValoresNfse valoresNfse;
    @XmlElement(name = "ValorCredito")
    protected BigDecimal valorCredito;
    @XmlElement(name = "PrestadorServico", required = true)
    protected TcDadosPrestador prestadorServico;
    @XmlElement(name = "OrgaoGerador", required = true)
    protected TcIdentificacaoOrgaoGerador orgaoGerador;
    @XmlElement(name = "DeclaracaoPrestacaoServico", required = true)
    protected TcDeclaracaoPrestacaoServico declaracaoPrestacaoServico;
    @XmlElement(name = "ChaveAcesso", required = true)
    protected String chaveAcesso;

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumero(BigInteger value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade codigoVerificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerificacao() {
        return codigoVerificacao;
    }

    /**
     * Define o valor da propriedade codigoVerificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerificacao(String value) {
        this.codigoVerificacao = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Obtém o valor da propriedade nfseSubstituida.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNfseSubstituida() {
        return nfseSubstituida;
    }

    /**
     * Define o valor da propriedade nfseSubstituida.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNfseSubstituida(BigInteger value) {
        this.nfseSubstituida = value;
    }

    /**
     * Obtém o valor da propriedade outrasInformacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    /**
     * Define o valor da propriedade outrasInformacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutrasInformacoes(String value) {
        this.outrasInformacoes = value;
    }

    /**
     * Obtém o valor da propriedade valoresNfse.
     * 
     * @return
     *     possible object is
     *     {@link TcValoresNfse }
     *     
     */
    public TcValoresNfse getValoresNfse() {
        return valoresNfse;
    }

    /**
     * Define o valor da propriedade valoresNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link TcValoresNfse }
     *     
     */
    public void setValoresNfse(TcValoresNfse value) {
        this.valoresNfse = value;
    }

    /**
     * Obtém o valor da propriedade valorCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCredito() {
        return valorCredito;
    }

    /**
     * Define o valor da propriedade valorCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCredito(BigDecimal value) {
        this.valorCredito = value;
    }

    /**
     * Obtém o valor da propriedade prestadorServico.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosPrestador }
     *     
     */
    public TcDadosPrestador getPrestadorServico() {
        return prestadorServico;
    }

    /**
     * Define o valor da propriedade prestadorServico.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosPrestador }
     *     
     */
    public void setPrestadorServico(TcDadosPrestador value) {
        this.prestadorServico = value;
    }

    /**
     * Obtém o valor da propriedade orgaoGerador.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoOrgaoGerador }
     *     
     */
    public TcIdentificacaoOrgaoGerador getOrgaoGerador() {
        return orgaoGerador;
    }

    /**
     * Define o valor da propriedade orgaoGerador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoOrgaoGerador }
     *     
     */
    public void setOrgaoGerador(TcIdentificacaoOrgaoGerador value) {
        this.orgaoGerador = value;
    }

    /**
     * Obtém o valor da propriedade declaracaoPrestacaoServico.
     * 
     * @return
     *     possible object is
     *     {@link TcDeclaracaoPrestacaoServico }
     *     
     */
    public TcDeclaracaoPrestacaoServico getDeclaracaoPrestacaoServico() {
        return declaracaoPrestacaoServico;
    }

    /**
     * Define o valor da propriedade declaracaoPrestacaoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDeclaracaoPrestacaoServico }
     *     
     */
    public void setDeclaracaoPrestacaoServico(TcDeclaracaoPrestacaoServico value) {
        this.declaracaoPrestacaoServico = value;
    }

    /**
     * Obtém o valor da propriedade chaveAcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    /**
     * Define o valor da propriedade chaveAcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaveAcesso(String value) {
        this.chaveAcesso = value;
    }

}
