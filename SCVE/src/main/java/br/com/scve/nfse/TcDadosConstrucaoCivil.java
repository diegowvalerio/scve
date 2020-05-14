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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tcDadosConstrucaoCivil complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcDadosConstrucaoCivil">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoObra" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoObra" minOccurs="0"/>
 *         &lt;element name="NumeroAlvaraConstrucao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroAlvara" minOccurs="0"/>
 *         &lt;element name="Art" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsArt"/>
 *         &lt;element name="Incorporacao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDadosConstrucaoCivil", propOrder = {
    "codigoObra",
    "numeroAlvaraConstrucao",
    "art",
    "incorporacao"
})
public class TcDadosConstrucaoCivil {

    @XmlElement(name = "CodigoObra")
    protected String codigoObra;
    @XmlElement(name = "NumeroAlvaraConstrucao")
    protected BigInteger numeroAlvaraConstrucao;
    @XmlElement(name = "Art", required = true)
    protected String art;
    @XmlElement(name = "Incorporacao")
    protected Byte incorporacao;

    /**
     * Obtém o valor da propriedade codigoObra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoObra() {
        return codigoObra;
    }

    /**
     * Define o valor da propriedade codigoObra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoObra(String value) {
        this.codigoObra = value;
    }

    /**
     * Obtém o valor da propriedade numeroAlvaraConstrucao.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroAlvaraConstrucao() {
        return numeroAlvaraConstrucao;
    }

    /**
     * Define o valor da propriedade numeroAlvaraConstrucao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroAlvaraConstrucao(BigInteger value) {
        this.numeroAlvaraConstrucao = value;
    }

    /**
     * Obtém o valor da propriedade art.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArt() {
        return art;
    }

    /**
     * Define o valor da propriedade art.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArt(String value) {
        this.art = value;
    }

    /**
     * Obtém o valor da propriedade incorporacao.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIncorporacao() {
        return incorporacao;
    }

    /**
     * Define o valor da propriedade incorporacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIncorporacao(Byte value) {
        this.incorporacao = value;
    }

}
