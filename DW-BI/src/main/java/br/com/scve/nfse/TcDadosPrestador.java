//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: AM.02.19 �s 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tcDadosPrestador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcDadosPrestador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacaoPrestador" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoPrestador"/>
 *         &lt;element name="RazaoSocial" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsRazaoSocial"/>
 *         &lt;element name="NomeFantasia" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNomeFantasia" minOccurs="0"/>
 *         &lt;element name="Endereco" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcEndereco"/>
 *         &lt;element name="Contato" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcContato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDadosPrestador", propOrder = {
    "identificacaoPrestador",
    "razaoSocial",
    "nomeFantasia",
    "endereco",
    "contato"
})
public class TcDadosPrestador {

    @XmlElement(name = "IdentificacaoPrestador", required = true)
    protected TcIdentificacaoPrestador identificacaoPrestador;
    @XmlElement(name = "RazaoSocial", required = true)
    protected String razaoSocial;
    @XmlElement(name = "NomeFantasia")
    protected String nomeFantasia;
    @XmlElement(name = "Endereco", required = true)
    protected TcEndereco endereco;
    @XmlElement(name = "Contato")
    protected TcContato contato;

    /**
     * Obt�m o valor da propriedade identificacaoPrestador.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public TcIdentificacaoPrestador getIdentificacaoPrestador() {
        return identificacaoPrestador;
    }

    /**
     * Define o valor da propriedade identificacaoPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public void setIdentificacaoPrestador(TcIdentificacaoPrestador value) {
        this.identificacaoPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade razaoSocial.
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
     * Obt�m o valor da propriedade nomeFantasia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Define o valor da propriedade nomeFantasia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFantasia(String value) {
        this.nomeFantasia = value;
    }

    /**
     * Obt�m o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link TcEndereco }
     *     
     */
    public TcEndereco getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link TcEndereco }
     *     
     */
    public void setEndereco(TcEndereco value) {
        this.endereco = value;
    }

    /**
     * Obt�m o valor da propriedade contato.
     * 
     * @return
     *     possible object is
     *     {@link TcContato }
     *     
     */
    public TcContato getContato() {
        return contato;
    }

    /**
     * Define o valor da propriedade contato.
     * 
     * @param value
     *     allowed object is
     *     {@link TcContato }
     *     
     */
    public void setContato(TcContato value) {
        this.contato = value;
    }

}
