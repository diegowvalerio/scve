//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de tcSubstituicaoNfse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcSubstituicaoNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubstituicaoNfse" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcInfSubstituicaoNfse"/>
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
@XmlType(name = "tcSubstituicaoNfse", propOrder = {
    "substituicaoNfse"
})
public class TcSubstituicaoNfse {

    @XmlElement(name = "SubstituicaoNfse", required = true)
    protected TcInfSubstituicaoNfse substituicaoNfse;
    @XmlAttribute(name = "versao", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    /**
     * Obtém o valor da propriedade substituicaoNfse.
     * 
     * @return
     *     possible object is
     *     {@link TcInfSubstituicaoNfse }
     *     
     */
    public TcInfSubstituicaoNfse getSubstituicaoNfse() {
        return substituicaoNfse;
    }

    /**
     * Define o valor da propriedade substituicaoNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link TcInfSubstituicaoNfse }
     *     
     */
    public void setSubstituicaoNfse(TcInfSubstituicaoNfse value) {
        this.substituicaoNfse = value;
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

}
