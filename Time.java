/**
 *
 * @author skryu
 */
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Time implements Runnable {
    
    @Override
    public void run(){
        for(int i = 100; i >= 0 ; i--){
            try {
                 sleep(200);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
