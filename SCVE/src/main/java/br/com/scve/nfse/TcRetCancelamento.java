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
 *         &lt;element name="NfseCancelamento" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcCancelamentoNfse"/>
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
    "nfseCancelamento"
})
@XmlRootElement(name = "tcRetCancelamento")
public class TcRetCancelamento {

    @XmlElement(name = "NfseCancelamento", required = true)
    protected TcCancelamentoNfse nfseCancelamento;

    /**
     * Obtém o valor da propriedade nfseCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link TcCancelamentoNfse }
     *     
     */
    public TcCancelamentoNfse getNfseCancelamento() {
        return nfseCancelamento;
    }

    /**
     * Define o valor da propriedade nfseCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TcCancelamentoNfse }
     *     
     */
    public void setNfseCancelamento(TcCancelamentoNfse value) {
        this.nfseCancelamento = value;
    }

}
