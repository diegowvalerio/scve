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


/**
 * <p>Classe Java de tcPedidoCancelamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcPedidoCancelamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfPedidoCancelamento" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcInfPedidoCancelamento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcPedidoCancelamento", propOrder = {
    "infPedidoCancelamento"
})
public class TcPedidoCancelamento {

    @XmlElement(name = "InfPedidoCancelamento", required = true)
    protected TcInfPedidoCancelamento infPedidoCancelamento;

    /**
     * Obtém o valor da propriedade infPedidoCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link TcInfPedidoCancelamento }
     *     
     */
    public TcInfPedidoCancelamento getInfPedidoCancelamento() {
        return infPedidoCancelamento;
    }

    /**
     * Define o valor da propriedade infPedidoCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TcInfPedidoCancelamento }
     *     
     */
    public void setInfPedidoCancelamento(TcInfPedidoCancelamento value) {
        this.infPedidoCancelamento = value;
    }

}
