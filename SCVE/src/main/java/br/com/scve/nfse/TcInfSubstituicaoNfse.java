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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tcInfSubstituicaoNfse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcInfSubstituicaoNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NfseSubstituidora" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsNumeroNfse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcInfSubstituicaoNfse", propOrder = {
    "nfseSubstituidora"
})
public class TcInfSubstituicaoNfse {

    @XmlElement(name = "NfseSubstituidora", required = true)
    protected BigInteger nfseSubstituidora;

    /**
     * Obtém o valor da propriedade nfseSubstituidora.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNfseSubstituidora() {
        return nfseSubstituidora;
    }

    /**
     * Define o valor da propriedade nfseSubstituidora.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNfseSubstituidora(BigInteger value) {
        this.nfseSubstituidora = value;
    }

}
