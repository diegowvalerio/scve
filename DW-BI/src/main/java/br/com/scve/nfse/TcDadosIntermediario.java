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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tcDadosIntermediario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcDadosIntermediario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacaoIntermediario" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoIntermediario"/>
 *         &lt;element name="RazaoSocial" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsRazaoSocial"/>
 *         &lt;element name="CodigoMunicipio" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoMunicipioIbge"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDadosIntermediario", propOrder = {
    "identificacaoIntermediario",
    "razaoSocial",
    "codigoMunicipio"
})
public class TcDadosIntermediario {

    @XmlElement(name = "IdentificacaoIntermediario", required = true)
    protected TcIdentificacaoIntermediario identificacaoIntermediario;
    @XmlElement(name = "RazaoSocial", required = true)
    protected String razaoSocial;
    @XmlElement(name = "CodigoMunicipio")
    protected int codigoMunicipio;

    /**
     * Obtém o valor da propriedade identificacaoIntermediario.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoIntermediario }
     *     
     */
    public TcIdentificacaoIntermediario getIdentificacaoIntermediario() {
        return identificacaoIntermediario;
    }

    /**
     * Define o valor da propriedade identificacaoIntermediario.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoIntermediario }
     *     
     */
    public void setIdentificacaoIntermediario(TcIdentificacaoIntermediario value) {
        this.identificacaoIntermediario = value;
    }

    /**
     * Obtém o valor da propriedade razaoSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define o valor da propriedade razaoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Obtém o valor da propriedade codigoMunicipio.
     * 
     */
    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define o valor da propriedade codigoMunicipio.
     * 
     */
    public void setCodigoMunicipio(int value) {
        this.codigoMunicipio = value;
    }

}
