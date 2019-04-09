package br.com.scve.nfe;

import java.lang.invoke.MethodHandles;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.nfe.NfeWeb;
import br.com.samuelweb.nfe.dom.ConfiguracoesWebNfe;
import br.com.samuelweb.nfe.exception.NfeException;
import br.com.samuelweb.nfe.util.ConstantesUtil;
import br.com.samuelweb.nfe.util.Estados;
import br.inf.portalfiscal.nfe.schema_4.retConsSitNFe.TRetConsSitNFe;

public class ConsultaXmlTeste {
	

    public static void main(String[] args) {

        try {

        	// Inicia As Certificado
            Certificado certificado = CertificadoService.certificadoPfx("Y:/certificados/N P FONTANA MARCHEZAN METAIS.pfx", "1234");
            //Esse Objeto Você pode guardar em uma Session.
            ConfiguracoesWebNfe config = ConfiguracoesWebNfe.iniciaConfiguracoes(Estados.PR,
                    ConstantesUtil.AMBIENTE.HOMOLOGACAO,
                    certificado,
                    MethodHandles.lookup().lookupClass().getResource("/schemas").getPath(), //PEGAR SCHEMAS EM AMBIENTE WEB ESTA PASTA ESTA DENTRO DE RESOURCES
                    false);

            String chave = "41190105271495000107550010000123391000362174";
            TRetConsSitNFe retorno = NfeWeb.consultaXml(config,chave, ConstantesUtil.NFE);
            System.out.println("Status:" + retorno.getCStat());
            System.out.println("Motivo:" + retorno.getXMotivo());
            System.out.println("Data:" + retorno.getProtNFe().getInfProt().getDhRecbto());

        } catch (CertificadoException | NfeException e) {
            System.err.println(e.getMessage());
        }

    }

}
