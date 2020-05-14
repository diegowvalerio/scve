package br.com.scve.fiscal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;
import java.time.LocalDate;
import java.util.Date;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.nfe.NfeWeb;
import br.com.samuelweb.nfe.dom.ConfiguracoesWebNfe;
import br.com.samuelweb.nfe.util.ConstantesUtil;
import br.com.samuelweb.nfe.util.Estados;
import br.inf.portalfiscal.nfe.schema_4.retConsStatServ.TRetConsStatServ;


public class CertificadoEmpresa {
	  public static LocalDate main(byte[] args, String senha) {
		    LocalDate data = null;
	        try {
	        	
	            // Inicia As Certificado
	            Certificado certificado = CertificadoService.certificadoPfxBytes(args, senha);
	            data = certificado.getVencimento();
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
			return data;

	    }

}
