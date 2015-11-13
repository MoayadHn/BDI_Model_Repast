package bDIModel;

public class Event {
	String name,code;
	public Event(Event event) {
		name=event.getname();
		code=event.getcode();
	}
	public boolean execute() {
		//handle code execution here
		return false;
	}
	public String getname() {
		return this.name;
	}
	
	public String getcode() {
		return this.code;
	}
}
