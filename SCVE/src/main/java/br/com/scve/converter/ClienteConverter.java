package br.com.scve.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.scve.entidades.Cliente;

@FacesConverter(forClass = Cliente.class,value="conversorCliente")
public class ClienteConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Cliente) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Cliente) {
        	Cliente entity= (Cliente) value;
            if (entity != null && entity instanceof Cliente && entity.getIdpessoa() != null) {
                uiComponent.getAttributes().put( entity.getIdpessoa().toString(), entity);
                return entity.getIdpessoa().toString();
            }
        }
        return "";
    }
}