package bDIModel;

public class Goal {
	
	private String goalType, name, condition;
	
	public Goal(Goal goal) {
		goalType=goal.getGoalType();
		name=goal.getName();
		condition=goal.getCondition();
	}
	
	public String getGoalType() {
		return goalType;
	}
	public void setGoalType(String goalType) {
		this.goalType = goalType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

}
