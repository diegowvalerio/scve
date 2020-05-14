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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="IdentificacaoRequerente" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoRequerente"/>
 *         &lt;element name="LoteRps" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcLoteRps"/>
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
    "identificacaoRequerente",
    "loteRps"
})
@XmlRootElement(name = "EnviarLoteRpsSincronoEnvio")
public class EnviarLoteRpsSincronoEnvio {

    @XmlElement(name = "IdentificacaoRequerente", required = true)
    protected TcIdentificacaoRequerente identificacaoRequerente;
    @XmlElement(name = "LoteRps", required = true)
    protected TcLoteRps loteRps;

    /**
     * Obtém o valor da propriedade identificacaoRequerente.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoRequerente }
     *     
     */
    public TcIdentificacaoRequerente getIdentificacaoRequerente() {
        return identificacaoRequerente;
    }

    /**
     * Define o valor da propriedade identificacaoRequerente.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoRequerente }
     *     
     */
    public void setIdentificacaoRequerente(TcIdentificacaoRequerente value) {
        this.identificacaoRequerente = value;
    }

    /**
     * Obtém o valor da propriedade loteRps.
     * 
     * @return
     *     possible object is
     *     {@link TcLoteRps }
     *     
     */
    public TcLoteRps getLoteRps() {
        return loteRps;
    }

    /**
     * Define o valor da propriedade loteRps.
     * 
     * @param value
     *     allowed object is
     *     {@link TcLoteRps }
     *     
     */
    public void setLoteRps(TcLoteRps value) {
        this.loteRps = value;
    }

}
