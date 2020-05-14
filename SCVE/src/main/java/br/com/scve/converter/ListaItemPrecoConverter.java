package br.com.scve.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

//import br.com.scve.entidades.TipoMv;

@FacesConverter(forClass = br.com.scve.entidades.ListaPrecoItem.class,value="conversorListaPrecoItem")
public class ListaItemPrecoConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (br.com.scve.entidades.ListaPrecoItem) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof br.com.scve.entidades.ListaPrecoItem) {
        	br.com.scve.entidades.ListaPrecoItem entity= (br.com.scve.entidades.ListaPrecoItem) value;
            if (entity != null && entity instanceof br.com.scve.entidades.ListaPrecoItem && entity.getId() != null) {
                uiComponent.getAttributes().put( entity.getId().toString(), entity);
                return entity.getId().toString();
            }
        }
        return "";
    }
}