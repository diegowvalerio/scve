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
 * <p>Classe Java de tcIdentificacaoRequerente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcIdentificacaoRequerente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CpfCnpj" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcCpfCnpj"/>
 *         &lt;element name="InscricaoMunicipal" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsInscricaoMunicipal"/>
 *         &lt;element name="Senha" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSenha"/>
 *         &lt;element name="Homologa" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsHomologa"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcIdentificacaoRequerente", propOrder = {
    "cpfCnpj",
    "inscricaoMunicipal",
    "senha",
    "homologa"
})
public class TcIdentificacaoRequerente {

    @XmlElement(name = "CpfCnpj", required = true)
    protected TcCpfCnpj cpfCnpj;
    @XmlElement(name = "InscricaoMunicipal", required = true)
    protected String inscricaoMunicipal;
    @XmlElement(name = "Senha", required = true)
    protected String senha;
    @XmlElement(name = "Homologa")
    protected boolean homologa;

    /**
     * Obt�m o valor da propriedade cpfCnpj.
     * 
     * @return
     *     possible object is
     *     {@link TcCpfCnpj }
     *     
     */
    public TcCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Define o valor da propriedade cpfCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link TcCpfCnpj }
     *     
     */
    public void setCpfCnpj(TcCpfCnpj value) {
        this.cpfCnpj = value;
    }

    /**
     * Obt�m o valor da propriedade inscricaoMunicipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    /**
     * Define o valor da propriedade inscricaoMunicipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoMunicipal(String value) {
        this.inscricaoMunicipal = value;
    }

    /**
     * Obt�m o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obt�m o valor da propriedade homologa.
     * 
     */
    public boolean isHomologa() {
        return homologa;
    }

    /**
     * Define o valor da propriedade homologa.
     * 
     */
    public void setHomologa(boolean value) {
        this.homologa = value;
    }

}
