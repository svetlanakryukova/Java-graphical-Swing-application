
/**
 *
 * @author skryu
 */
public class Go extends Observer{
    
    public Go(KeySubject subject){
        this.subject = subject;
        this.subject.add(this);
    }
    
    @Override
    public void update(){
        Time newTime = new Time();
        newTime.run();
       
    }
    
}
