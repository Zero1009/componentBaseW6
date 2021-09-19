import java.beans.*;
import java.io.Serializable;

/**
 * BoundProperty
 */
public class BoundProperty implements Serializable {

    public static final String VALUES_PROPERTY = "value";

    private String value;

    private PropertyChangeSupport propertySupport;

    public BoundProperty(){
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value){
        String oldValue = this.value;
        this.value= value;
        propertySupport.firePropertyChange(VALUES_PROPERTY, oldValue, this.value);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener (PropertyChangeListener listener){
        propertySupport.removePropertyChangeListener(listener);
    }
}