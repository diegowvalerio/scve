//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: AM.02.19 �s 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tcMensagemRetorno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tcMensagemRetorno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsCodigoMensagemAlerta"/>
 *         &lt;element name="Mensagem" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsDescricaoMensagemAlerta"/>
 *         &lt;element name="Correcao" type="{http://shad.elotech.com.br/schemas/iss/nfse_v2_03.xsd}tsDescricaoMensagemAlerta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcMensagemRetorno", propOrder = {
    "codigo",
    "mensagem",
    "correcao"
})
public class TcMensagemRetorno {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Mensagem", required = true)
    protected String mensagem;
    @XmlElement(name = "Correcao")
    protected String correcao;

    /**
     * Obt�m o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obt�m o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Obt�m o valor da propriedade correcao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrecao() {
        return correcao;
    }

    /**
     * Define o valor da propriedade correcao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrecao(String value) {
        this.correcao = value;
    }

}
