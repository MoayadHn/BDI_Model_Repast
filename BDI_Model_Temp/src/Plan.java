package bDIModel;

public class Plan {
	int PriorityValue;
	String name, code;
	Event event;
	
	public Plan(Plan plan) {
		name=plan.getname();
		code=plan.getcode();
		event=plan.getevent();
		PriorityValue=plan.getPriorityValue();
	}

	private Event getevent() {
		return this.event;
	}

	public int getPriorityValue() {
		return this.PriorityValue;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getcode() {
		return this.code;
	}
	
	public void validateBelief(Belief belief) {
		String fact=belief.getfact();
		String date=belief.getDate();
		if(valid(fact)) {
			belief.updateValidatedDate(date);
		} else {
			deleteBelief(belief);
		}
	}
	
	private boolean valid(String fact) {
		if(this.event.execute()) {
			return true;
		} else {
			return false;
		}
		
	}

	public void updateBelief(Belief belief, String value) {
		belief.setfact(value);
	}
	
	public void deleteBelief(Belief belief) {
		belief.delete();
	}
	
}
