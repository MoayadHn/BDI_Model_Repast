package bDIModel;

import java.util.ArrayList;

public class BDIModel {
	ArrayList<Agent> AgentList;
	BDIModel(ArrayList<XMLmodel> XMLmodels){
		/*int size = XMLmodels.size();
		for(int i = 0; i < size; i++){
			Agent myAgent = new Agent(XMLmodels.get(i));
			AgentList.add(myAgent);
		} */
		for (XMLmodel model : XMLmodels) {
			Agent myAgent = new Agent(model);
			AgentList.add(myAgent);
		}
		Step();
	}
	
	public void Step(){
		int size = AgentList.size();
		for(int a = 0; a < size; a++){
			Agent temp = (Agent)AgentList.get(a);
			Action(temp);
		}
	}
	
	private void Action(Agent agent){
		//Check the belief's of the Agent
		ArrayList<Belief> beliefs = agent.getBeliefs();
		//get the agent's plans
		ArrayList<Plan> plans = agent.getPlans();
		//get the agent's goals
		ArrayList<Goal> goals = agent.getGoals();
		//Logically Weed out Plans and Goals using Beliefs
		ArrayList<Plan> viable = LogicFunction(beliefs,plans,goals);
		//Prioritize plans based on PriorityValue
		viable = sortPlans(viable);
	}
	
	private ArrayList<Plan> sortPlans(ArrayList<Plan> list){
		int size = list.size();
		int max = list.get(0).getPriorityValue();
		for(int a = 0; a < size; a++){
			//Sort the list
		}
		return list;
	}
	
	private ArrayList<Plan> LogicFunction(ArrayList<Belief> beliefs, ArrayList<Plan> plans, ArrayList<Goal> goals) {
		ArrayList<Plan> viableplans = null;
			//If plans and goals use the existing beliefs add them to viableplans
		return viableplans;
		//	
	}
	
}
