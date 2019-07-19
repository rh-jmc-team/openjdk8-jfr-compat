import jdk.jfr.Event;
import jdk.jfr.Label;

public class Test {

    @Label("RobotEvent_Storage_Request")
    static final class RobotEventStorageRequested extends Event {
        @Label("Requested")
        long requested;
        
        @Label("Available")
        long available;
    }
    
    public static void main(String args[]) {
        RobotEventStorageRequested jfrEvent = new RobotEventStorageRequested();
        jfrEvent.available = 1;
        jfrEvent.requested = 1;
        jfrEvent.commit();
    }
}
