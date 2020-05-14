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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de tcInfDeclaracaoPrestacaoServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcInfDeclaracaoPrestacaoServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rps" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcInfRps" minOccurs="0"/>
 *         &lt;element name="Competencia" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsData"/>
 *         &lt;element name="Servico" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDadosServico"/>
 *         &lt;element name="Prestador" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoPrestador"/>
 *         &lt;element name="Tomador" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDadosTomador" minOccurs="0"/>
 *         &lt;element name="Intermediario" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDadosIntermediario" minOccurs="0"/>
 *         &lt;element name="ConstrucaoCivil" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcDadosConstrucaoCivil" minOccurs="0"/>
 *         &lt;element name="RegimeEspecialTributacao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsRegimeEspecialTributacao" minOccurs="0"/>
 *         &lt;element name="IncentivoFiscal" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsSimNao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcInfDeclaracaoPrestacaoServico", propOrder = {
    "rps",
    "competencia",
    "servico",
    "prestador",
    "tomador",
    "intermediario",
    "construcaoCivil",
    "regimeEspecialTributacao",
    "incentivoFiscal"
})
public class TcInfDeclaracaoPrestacaoServico {

    @XmlElement(name = "Rps")
    protected TcInfRps rps;
    @XmlElement(name = "Competencia", required = true)
    protected XMLGregorianCalendar competencia;
    @XmlElement(name = "Servico", required = true)
    protected TcDadosServico servico;
    @XmlElement(name = "Prestador", required = true)
    protected TcIdentificacaoPrestador prestador;
    @XmlElement(name = "Tomador")
    protected TcDadosTomador tomador;
    @XmlElement(name = "Intermediario")
    protected TcDadosIntermediario intermediario;
    @XmlElement(name = "ConstrucaoCivil")
    protected TcDadosConstrucaoCivil construcaoCivil;
    @XmlElement(name = "RegimeEspecialTributacao")
    protected Byte regimeEspecialTributacao;
    @XmlElement(name = "IncentivoFiscal")
    protected byte incentivoFiscal;

    /**
     * Obtém o valor da propriedade rps.
     * 
     * @return
     *     possible object is
     *     {@link TcInfRps }
     *     
     */
    public TcInfRps getRps() {
        return rps;
    }

    /**
     * Define o valor da propriedade rps.
     * 
     * @param value
     *     allowed object is
     *     {@link TcInfRps }
     *     
     */
    public void setRps(TcInfRps value) {
        this.rps = value;
    }

    /**
     * Obtém o valor da propriedade competencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompetencia() {
        return competencia;
    }

    /**
     * Define o valor da propriedade competencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompetencia(XMLGregorianCalendar value) {
        this.competencia = value;
    }

    /**
     * Obtém o valor da propriedade servico.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosServico }
     *     
     */
    public TcDadosServico getServico() {
        return servico;
    }

    /**
     * Define o valor da propriedade servico.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosServico }
     *     
     */
    public void setServico(TcDadosServico value) {
        this.servico = value;
    }

    /**
     * Obtém o valor da propriedade prestador.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public TcIdentificacaoPrestador getPrestador() {
        return prestador;
    }

    /**
     * Define o valor da propriedade prestador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoPrestador }
     *     
     */
    public void setPrestador(TcIdentificacaoPrestador value) {
        this.prestador = value;
    }

    /**
     * Obtém o valor da propriedade tomador.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosTomador }
     *     
     */
    public TcDadosTomador getTomador() {
        return tomador;
    }

    /**
     * Define o valor da propriedade tomador.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosTomador }
     *     
     */
    public void setTomador(TcDadosTomador value) {
        this.tomador = value;
    }

    /**
     * Obtém o valor da propriedade intermediario.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosIntermediario }
     *     
     */
    public TcDadosIntermediario getIntermediario() {
        return intermediario;
    }

    /**
     * Define o valor da propriedade intermediario.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosIntermediario }
     *     
     */
    public void setIntermediario(TcDadosIntermediario value) {
        this.intermediario = value;
    }

    /**
     * Obtém o valor da propriedade construcaoCivil.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosConstrucaoCivil }
     *     
     */
    public TcDadosConstrucaoCivil getConstrucaoCivil() {
        return construcaoCivil;
    }

    /**
     * Define o valor da propriedade construcaoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosConstrucaoCivil }
     *     
     */
    public void setConstrucaoCivil(TcDadosConstrucaoCivil value) {
        this.construcaoCivil = value;
    }

    /**
     * Obtém o valor da propriedade regimeEspecialTributacao.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRegimeEspecialTributacao() {
        return regimeEspecialTributacao;
    }

    /**
     * Define o valor da propriedade regimeEspecialTributacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRegimeEspecialTributacao(Byte value) {
        this.regimeEspecialTributacao = value;
    }

    /**
     * Obtém o valor da propriedade incentivoFiscal.
     * 
     */
    public byte getIncentivoFiscal() {
        return incentivoFiscal;
    }

    /**
     * Define o valor da propriedade incentivoFiscal.
     * 
     */
    public void setIncentivoFiscal(byte value) {
        this.incentivoFiscal = value;
    }

}
