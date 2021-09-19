import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Person  implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue());
        
    }
    
}
