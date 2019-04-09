//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tcDadosServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcDadosServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Valores" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcValoresDeclaracaoServico"/>
 *         &lt;element name="IssRetido" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao"/>
 *         &lt;element name="ResponsavelRetencao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsResponsavelRetencao" minOccurs="0"/>
 *         &lt;element name="Discriminacao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsDiscriminacao"/>
 *         &lt;element name="CodigoTributacaoMunicipio" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoTributacao" minOccurs="0"/>
 *         &lt;element name="CodigoNbs" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoNbs" minOccurs="0"/>
 *         &lt;element name="CodigoMunicipio" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoMunicipioIbge"/>
 *         &lt;element name="CodigoPais" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoPaisBacen" minOccurs="0"/>
 *         &lt;element name="ExigibilidadeISS" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsExigibilidadeISS"/>
 *         &lt;element name="MunicipioIncidencia" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoMunicipioIbge"/>
 *         &lt;element name="NumeroProcesso" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroProcesso" minOccurs="0"/>
 *         &lt;element name="ListaItensServico">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemServico" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcItemServico" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDadosServico", propOrder = {
    "valores",
    "issRetido",
    "responsavelRetencao",
    "discriminacao",
    "codigoTributacaoMunicipio",
    "codigoNbs",
    "codigoMunicipio",
    "codigoPais",
    "exigibilidadeISS",
    "municipioIncidencia",
    "numeroProcesso",
    "listaItensServico"
})
public class TcDadosServico {

    @XmlElement(name = "Valores", required = true)
    protected TcValoresDeclaracaoServico valores;
    @XmlElement(name = "IssRetido")
    protected byte issRetido;
    @XmlElement(name = "ResponsavelRetencao")
    protected Byte responsavelRetencao;
    @XmlElement(name = "Discriminacao", required = true)
    protected String discriminacao;
    @XmlElement(name = "CodigoTributacaoMunicipio")
    protected String codigoTributacaoMunicipio;
    @XmlElement(name = "CodigoNbs")
    protected String codigoNbs;
    @XmlElement(name = "CodigoMunicipio")
    protected int codigoMunicipio;
    @XmlElement(name = "CodigoPais")
    protected String codigoPais;
    @XmlElement(name = "ExigibilidadeISS")
    protected byte exigibilidadeISS;
    @XmlElement(name = "MunicipioIncidencia")
    protected int municipioIncidencia;
    @XmlElement(name = "NumeroProcesso")
    protected String numeroProcesso;
    @XmlElement(name = "ListaItensServico", required = true)
    protected TcDadosServico.ListaItensServico listaItensServico;

    /**
     * Obtém o valor da propriedade valores.
     * 
     * @return
     *     possible object is
     *     {@link TcValoresDeclaracaoServico }
     *     
     */
    public TcValoresDeclaracaoServico getValores() {
        return valores;
    }

    /**
     * Define o valor da propriedade valores.
     * 
     * @param value
     *     allowed object is
     *     {@link TcValoresDeclaracaoServico }
     *     
     */
    public void setValores(TcValoresDeclaracaoServico value) {
        this.valores = value;
    }

    /**
     * Obtém o valor da propriedade issRetido.
     * 
     */
    public byte getIssRetido() {
        return issRetido;
    }

    /**
     * Define o valor da propriedade issRetido.
     * 
     */
    public void setIssRetido(byte value) {
        this.issRetido = value;
    }

    /**
     * Obtém o valor da propriedade responsavelRetencao.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getResponsavelRetencao() {
        return responsavelRetencao;
    }

    /**
     * Define o valor da propriedade responsavelRetencao.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setResponsavelRetencao(Byte value) {
        this.responsavelRetencao = value;
    }

    /**
     * Obtém o valor da propriedade discriminacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminacao() {
        return discriminacao;
    }

    /**
     * Define o valor da propriedade discriminacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminacao(String value) {
        this.discriminacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoTributacaoMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTributacaoMunicipio() {
        return codigoTributacaoMunicipio;
    }

    /**
     * Define o valor da propriedade codigoTributacaoMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTributacaoMunicipio(String value) {
        this.codigoTributacaoMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade codigoNbs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNbs() {
        return codigoNbs;
    }

    /**
     * Define o valor da propriedade codigoNbs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNbs(String value) {
        this.codigoNbs = value;
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
     * Obtém o valor da propriedade exigibilidadeISS.
     * 
     */
    public byte getExigibilidadeISS() {
        return exigibilidadeISS;
    }

    /**
     * Define o valor da propriedade exigibilidadeISS.
     * 
     */
    public void setExigibilidadeISS(byte value) {
        this.exigibilidadeISS = value;
    }

    /**
     * Obtém o valor da propriedade municipioIncidencia.
     * 
     */
    public int getMunicipioIncidencia() {
        return municipioIncidencia;
    }

    /**
     * Define o valor da propriedade municipioIncidencia.
     * 
     */
    public void setMunicipioIncidencia(int value) {
        this.municipioIncidencia = value;
    }

    /**
     * Obtém o valor da propriedade numeroProcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    /**
     * Define o valor da propriedade numeroProcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProcesso(String value) {
        this.numeroProcesso = value;
    }

    /**
     * Obtém o valor da propriedade listaItensServico.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosServico.ListaItensServico }
     *     
     */
    public TcDadosServico.ListaItensServico getListaItensServico() {
        return listaItensServico;
    }

    /**
     * Define o valor da propriedade listaItensServico.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosServico.ListaItensServico }
     *     
     */
    public void setListaItensServico(TcDadosServico.ListaItensServico value) {
        this.listaItensServico = value;
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
     *         &lt;element name="ItemServico" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcItemServico" maxOccurs="unbounded"/>
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
        "itemServico"
    })
    public static class ListaItensServico {

        @XmlElement(name = "ItemServico", required = true)
        protected List<TcItemServico> itemServico;

        /**
         * Gets the value of the itemServico property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemServico property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemServico().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TcItemServico }
         * 
         * 
         */
        public List<TcItemServico> getItemServico() {
            if (itemServico == null) {
                itemServico = new ArrayList<TcItemServico>();
            }
            return this.itemServico;
        }

    }

}
