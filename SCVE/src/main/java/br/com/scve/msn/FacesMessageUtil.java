package br.com.scve.msn;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
public class FacesMessageUtil {
	
	public static void addMensagemInfo(String messageKey) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informa��o", messageKey));
		
	}
	public static void addMensagemError(String messageKey) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro !", messageKey));
	}
	public static void addMensagemWarn(String messageKey) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aten��o !", messageKey));
	}
}
