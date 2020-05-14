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
 *       &lt;choice>
 *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcRetCancelamento"/>
 *         &lt;element ref="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}ListaMensagemRetorno"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tcRetCancelamento",
    "listaMensagemRetorno"
})
@XmlRootElement(name = "CancelarNfseResposta")
public class CancelarNfseResposta {

    protected TcRetCancelamento tcRetCancelamento;
    @XmlElement(name = "ListaMensagemRetorno")
    protected ListaMensagemRetorno listaMensagemRetorno;

    /**
     * Obtém o valor da propriedade tcRetCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link TcRetCancelamento }
     *     
     */
    public TcRetCancelamento getTcRetCancelamento() {
        return tcRetCancelamento;
    }

    /**
     * Define o valor da propriedade tcRetCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TcRetCancelamento }
     *     
     */
    public void setTcRetCancelamento(TcRetCancelamento value) {
        this.tcRetCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade listaMensagemRetorno.
     * 
     * @return
     *     possible object is
     *     {@link ListaMensagemRetorno }
     *     
     */
    public ListaMensagemRetorno getListaMensagemRetorno() {
        return listaMensagemRetorno;
    }

    /**
     * Define o valor da propriedade listaMensagemRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMensagemRetorno }
     *     
     */
    public void setListaMensagemRetorno(ListaMensagemRetorno value) {
        this.listaMensagemRetorno = value;
    }

}
