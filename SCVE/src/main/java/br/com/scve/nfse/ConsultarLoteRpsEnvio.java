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
 *         &lt;element name="NumeroLote" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroLote"/>
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
    "numeroLote"
})
@XmlRootElement(name = "ConsultarLoteRpsEnvio")
public class ConsultarLoteRpsEnvio {

    @XmlElement(name = "IdentificacaoRequerente", required = true)
    protected TcIdentificacaoRequerente identificacaoRequerente;
    @XmlElement(name = "NumeroLote", required = true)
    protected BigInteger numeroLote;

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

}
