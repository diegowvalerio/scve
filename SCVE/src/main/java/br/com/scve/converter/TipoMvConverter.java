package br.com.scve.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.scve.entidades.TipoMv;

@FacesConverter(forClass = TipoMv.class,value="conversorTipomv")
public class TipoMvConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (TipoMv) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof TipoMv) {
        	TipoMv entity= (TipoMv) value;
            if (entity != null && entity instanceof TipoMv && entity.getIdmv() != null) {
                uiComponent.getAttributes().put( entity.getIdmv().toString(), entity);
                return entity.getIdmv().toString();
            }
        }
        return "";
    }
}