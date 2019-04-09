//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de tcLoteRps complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcLoteRps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroLote" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroLote"/>
 *         &lt;element name="CpfCnpj" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcCpfCnpj"/>
 *         &lt;element name="InscricaoMunicipal" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsInscricaoMunicipal" minOccurs="0"/>
 *         &lt;element name="QuantidadeRps" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsQuantidadeRps"/>
 *         &lt;element name="ListaRps">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Rps" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDeclaracaoPrestacaoServico" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsVersao" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcLoteRps", propOrder = {
    "numeroLote",
    "cpfCnpj",
    "inscricaoMunicipal",
    "quantidadeRps",
    "listaRps"
})
public class TcLoteRps {

    @XmlElement(name = "NumeroLote", required = true)
    protected BigInteger numeroLote;
    @XmlElement(name = "CpfCnpj", required = true)
    protected TcCpfCnpj cpfCnpj;
    @XmlElement(name = "InscricaoMunicipal")
    protected String inscricaoMunicipal;
    @XmlElement(name = "QuantidadeRps")
    protected int quantidadeRps;
    @XmlElement(name = "ListaRps", required = true)
    protected TcLoteRps.ListaRps listaRps;
    @XmlAttribute(name = "versao", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroLote(BigInteger value) {
        this.numeroLote = value;
    }

    /**
     * Obtém o valor da propriedade cpfCnpj.
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
     * Obtém o valor da propriedade inscricaoMunicipal.
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
     * Obtém o valor da propriedade quantidadeRps.
     * 
     */
    public int getQuantidadeRps() {
        return quantidadeRps;
    }

    /**
     * Define o valor da propriedade quantidadeRps.
     * 
     */
    public void setQuantidadeRps(int value) {
        this.quantidadeRps = value;
    }

    /**
     * Obtém o valor da propriedade listaRps.
     * 
     * @return
     *     possible object is
     *     {@link TcLoteRps.ListaRps }
     *     
     */
    public TcLoteRps.ListaRps getListaRps() {
        return listaRps;
    }

    /**
     * Define o valor da propriedade listaRps.
     * 
     * @param value
     *     allowed object is
     *     {@link TcLoteRps.ListaRps }
     *     
     */
    public void setListaRps(TcLoteRps.ListaRps value) {
        this.listaRps = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Rps" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDeclaracaoPrestacaoServico" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rps"
    })
    public static class ListaRps {

        @XmlElement(name = "Rps", required = true)
        protected List<TcDeclaracaoPrestacaoServico> rps;

        /**
         * Gets the value of the rps property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rps property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRps().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcDeclaracaoPrestacaoServico }
         * 
         * 
         */
        public List<TcDeclaracaoPrestacaoServico> getRps() {
            if (rps == null) {
                rps = new ArrayList<TcDeclaracaoPrestacaoServico>();
            }
            return this.rps;
        }

    }

}
