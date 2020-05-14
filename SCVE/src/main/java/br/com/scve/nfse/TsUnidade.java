//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: AM.02.19 às 08:08:07 AM BRT 
//


package br.com.scve.nfse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tsUnidade.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tsUnidade">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UN"/>
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="M2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tsUnidade")
@XmlEnum
public enum TsUnidade {

    UN("UN"),
    HS("HS"),
    @XmlEnumValue("M2")
    M_2("M2");
    private final String value;

    TsUnidade(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TsUnidade fromValue(String v) {
        for (TsUnidade c: TsUnidade.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
