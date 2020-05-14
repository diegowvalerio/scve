package br.com.scve.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.scve.entidades.Empresa;

@FacesConverter(forClass = Empresa.class,value="conversorEmpresa")
public class EmpresaConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Empresa) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Empresa) {
        	Empresa entity= (Empresa) value;
            if (entity != null && entity instanceof Empresa && entity.getIdpessoa() != null) {
                uiComponent.getAttributes().put( entity.getIdpessoa().toString(), entity);
                return entity.getIdpessoa().toString();
            }
        }
        return "";
    }
}