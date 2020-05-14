package br.com.scve.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.scve.entidades.ListaPreco;

@FacesConverter(forClass = ListaPreco.class,value="conversorLista")
public class ListaPrecoConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (ListaPreco) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof ListaPreco) {
        	ListaPreco entity= (ListaPreco) value;
            if (entity != null && entity instanceof ListaPreco && entity.getIdlista() != null) {
                uiComponent.getAttributes().put( entity.getIdlista().toString(), entity);
                return entity.getIdlista().toString();
            }
        }
        return "";
    }
}