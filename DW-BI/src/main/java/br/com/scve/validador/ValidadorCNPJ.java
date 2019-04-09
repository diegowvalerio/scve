package br.com.scve.validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("cnpjValidador")
public class ValidadorCNPJ implements Validator{

	@Override
	public void validate(FacesContext fc, UIComponent ui1, Object valor) throws ValidatorException {
		if(!CNPJ.isCNPJ(valor.toString())){
			FacesMessage msg = new FacesMessage("CNPJ Inv�lido","Por favor, informe um valor v�lido!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
		
	}

}
