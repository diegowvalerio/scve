package br.com.scve.fiscal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.nfe.NfeWeb;
import br.com.samuelweb.nfe.dom.ConfiguracoesWebNfe;
import br.com.samuelweb.nfe.util.ConstantesUtil;
import br.com.samuelweb.nfe.util.Estados;
import br.inf.portalfiscal.nfe.schema_4.retConsStatServ.TRetConsStatServ;


public class StatusServicoWebTeste {
	  public static void main(String args, String senha) {

	        try {

	            // Inicia As Certificado
	            Certificado certificado = CertificadoService.certificadoPfx(args, senha);
	            //Esse Objeto Você pode guardar em uma Session.
	            ConfiguracoesWebNfe config = ConfiguracoesWebNfe.iniciaConfiguracoes(Estados.GO,
	                    ConstantesUtil.AMBIENTE.HOMOLOGACAO,
	                    certificado,
	                    MethodHandles.lookup().lookupClass().getResource("/schemas").getPath(), //PEGAR SCHEMAS EM AMBIENTE WEB ESTA PASTA ESTA DENTRO DE RESOURCES
	                    false);


	            TRetConsStatServ retorno = NfeWeb.statusServico(config, ConstantesUtil.NFE);
	            System.out.println("Status:" + retorno.getCStat());
	            System.out.println("Motivo:" + retorno.getXMotivo());
	            System.out.println("Data:" + retorno.getDhRecbto());

	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }

	    }

}
