package br.com.scve.nfe;


import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.nfe.NfeWeb;
import br.com.samuelweb.nfe.dom.ConfiguracoesWebNfe;
import br.com.samuelweb.nfe.util.ConstantesUtil;
import br.com.samuelweb.nfe.util.Estados;
import br.inf.portalfiscal.nfe.schema_4.retConsStatServ.TRetConsStatServ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 */
public class StatusServicoWebTeste {

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


            TRetConsStatServ retorno = NfeWeb.statusServico(config, ConstantesUtil.NFE);
            System.out.println("Status:" + retorno.getCStat());
            System.out.println("Motivo:" + retorno.getXMotivo());
            System.out.println("Data:" + retorno.getDhRecbto());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}