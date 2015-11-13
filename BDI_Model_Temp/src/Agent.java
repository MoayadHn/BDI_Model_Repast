package bDIModel;

import java.util.ArrayList;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class Agent {
	private ArrayList<Belief> Beliefs;
	private ArrayList<Plan> Plans;
	private ArrayList<Goal> Goals;
	private ArrayList<Event> Events;
	private ArrayList<Import> Imports;
	
	private String agentName;
	//private String imports;
	
	public Agent(XMLmodel inputmodel) {
		
		/*
		String name=inputmodel.getname();
		String imports=inputmodel.getImports();
		ArrayList<Event> events=inputmodel.getEvents();
		ArrayList<Belief> beliefs=inputmodel.getBeliefs();
		ArrayList<Plan> plans=inputmodel.getPlans();
		ArrayList<Goal> goals=inputmodel.getGoals(); 
		
		agentName=inputmodel.getname();
		Imports=inputmodel.getImports();
		Events=inputmodel.getEvents();
		Beliefs=inputmodel.getBeliefs();
		Plans=inputmodel.getPlans();
		Goals=inputmodel.getGoals(); */
	
		
		String name=inputmodel.getname();
		ArrayList<Import> imports=inputmodel.getImports();
		ArrayList<Event> events=inputmodel.getEvents();
		ArrayList<Belief> beliefs=inputmodel.getBeliefs();
		ArrayList<Plan> plans=inputmodel.getPlans();
		ArrayList<Goal> goals=inputmodel.getGoals(); 
		
		setAgentName(name);
		
		for (Import imp : imports) {
			Import tempimport = new Import(imp);
			Imports.add(tempimport);
		}
		
		for (Event event : events) {
			Event tempevent = new Event(event); 
			Events.add(tempevent);
		}
		
		for (Belief belief : beliefs) {
			Belief tempbelief = new Belief(belief);
			Beliefs.add(tempbelief);
		}
		
		for (Plan plan : plans) {
			Plan tempplan = new Plan(plan);
			Plans.add(tempplan);
		}
		
		for (Goal goal : goals) {
			Goal tempgoal = new Goal(goal);
			Goals.add(tempgoal);
		}
		
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
	
	
/*	private void importFiles(String imports) {
		//import files
	}
*/
	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	
}
