package br.com.scve.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.scve.entidades.TipoEndereco;

@FacesConverter(forClass = TipoEndereco.class,value="conversorTipoEnde")
public class TipoEndeConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (TipoEndereco) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof TipoEndereco) {
        	TipoEndereco entity= (TipoEndereco) value;
            if (entity != null && entity instanceof TipoEndereco && entity.getIdtipoend() != null) {
                uiComponent.getAttributes().put( entity.getIdtipoend().toString(), entity);
                return entity.getIdtipoend().toString();
            }
        }
        return "";
    }
}