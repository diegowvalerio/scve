package br.com.scve.validador;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("cpfValidador")
public class ValidadorCPF implements Validator{

	@Override
	public void validate(FacesContext fc, UIComponent ui1, Object valor) throws ValidatorException {
		if(!CPF.validar(valor.toString())){
			FacesMessage msg = new FacesMessage("CPF INV�LIDO","Por favor, informe um valor v�lido!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
		
	}

}
