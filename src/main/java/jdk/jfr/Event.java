package jdk.jfr;

abstract public class Event {
	
	protected Event() {
	}

    final public void begin() {
    }

    final public void end() {
    }

    final public void commit() {
    }
    
    final public boolean isEnabled() {
    	return false;
    }
    
    final public boolean shouldCommit() {
    	return false;
    }
    
    final public void set(int index, Object value) {
    }

}
