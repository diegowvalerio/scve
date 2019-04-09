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
 * <p>Classe Java de tcInfPedidoCancelamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcInfPedidoCancelamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacaoNfse" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tcIdentificacaoNfse"/>
 *         &lt;element name="ChaveAcesso" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsChaveAcesso"/>
 *         &lt;element name="CodigoCancelamento" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoCancelamentoNfse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcInfPedidoCancelamento", propOrder = {
    "identificacaoNfse",
    "chaveAcesso",
    "codigoCancelamento"
})
public class TcInfPedidoCancelamento {

    @XmlElement(name = "IdentificacaoNfse", required = true)
    protected TcIdentificacaoNfse identificacaoNfse;
    @XmlElement(name = "ChaveAcesso", required = true)
    protected String chaveAcesso;
    @XmlElement(name = "CodigoCancelamento")
    protected byte codigoCancelamento;

    /**
     * Obtém o valor da propriedade identificacaoNfse.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoNfse }
     *     
     */
    public TcIdentificacaoNfse getIdentificacaoNfse() {
        return identificacaoNfse;
    }

    /**
     * Define o valor da propriedade identificacaoNfse.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoNfse }
     *     
     */
    public void setIdentificacaoNfse(TcIdentificacaoNfse value) {
        this.identificacaoNfse = value;
    }

    /**
     * Obtém o valor da propriedade chaveAcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    /**
     * Define o valor da propriedade chaveAcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaveAcesso(String value) {
        this.chaveAcesso = value;
    }

    /**
     * Obtém o valor da propriedade codigoCancelamento.
     * 
     */
    public byte getCodigoCancelamento() {
        return codigoCancelamento;
    }

    /**
     * Define o valor da propriedade codigoCancelamento.
     * 
     */
    public void setCodigoCancelamento(byte value) {
        this.codigoCancelamento = value;
    }

}
