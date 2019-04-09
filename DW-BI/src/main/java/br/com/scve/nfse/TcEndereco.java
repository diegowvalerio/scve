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
 * <p>Classe Java de tcEndereco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcEndereco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Endereco" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsEndereco" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroEndereco" minOccurs="0"/>
 *         &lt;element name="Complemento" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsComplementoEndereco" minOccurs="0"/>
 *         &lt;element name="Bairro" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsBairro" minOccurs="0"/>
 *         &lt;element name="CodigoMunicipio" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoMunicipioIbge" minOccurs="0"/>
 *         &lt;element name="Uf" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsUf" minOccurs="0"/>
 *         &lt;element name="CodigoPais" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoPaisBacen" minOccurs="0"/>
 *         &lt;element name="Cep" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCep" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcEndereco", propOrder = {
    "endereco",
    "numero",
    "complemento",
    "bairro",
    "codigoMunicipio",
    "uf",
    "codigoPais",
    "cep"
})
public class TcEndereco {

    @XmlElement(name = "Endereco")
    protected String endereco;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "Complemento")
    protected String complemento;
    @XmlElement(name = "Bairro")
    protected String bairro;
    @XmlElement(name = "CodigoMunicipio")
    protected Integer codigoMunicipio;
    @XmlElement(name = "Uf")
    protected String uf;
    @XmlElement(name = "CodigoPais")
    protected String codigoPais;
    @XmlElement(name = "Cep")
    protected String cep;

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade codigoMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Define o valor da propriedade codigoMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoMunicipio(Integer value) {
        this.codigoMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define o valor da propriedade codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

}
