import java.util.ArrayList;


public class Agent {
	private ArrayList<Belief> Beliefs;
	private ArrayList<Plan> Plans;
	private ArrayList<Goal> Goals;
	private ArrayList<Event> Events;
	
	public Agent(XMLmodel inputmodel) {
		
	}

	public ArrayList<Belief> getBeliefs() {
		return this.Beliefs;
	}
	
	public ArrayList<Plan> getPlans(){
		return this.Plans;
	}
	
	public ArrayList<Goal> getGoals(){
		return this.Goals;
	}
	
	public ArrayList<Event> getEvents(){
		return this.Events;
	}
}
