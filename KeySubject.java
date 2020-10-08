

/**
 *
 * @author skryu
 */
import java.util.ArrayList;
import java.util.List;

public class KeySubject {
    
    private int state;
    private final List<Observer> observers = new ArrayList<>();
    
    public void add(Observer o){
        observers.add(o);
    }
    
    public int getState(){
        return state;
    }
    
    public void setState(int value){
        this.state = value;
        execute();
    }
    
    private void execute(){
        for(Observer obv : observers){
            obv.update();
        }
    }
}

