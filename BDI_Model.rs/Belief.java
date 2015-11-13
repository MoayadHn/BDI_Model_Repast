package bDIModel;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Belief {
	String name,fact;
	String initDate, validatedDate;
	
	public Belief(Belief belief) {
		name=belief.getname();
		fact=belief.getfact();
		initDate=belief.getDate();
		validatedDate=initDate;
	}

	public String getname() {
		return this.name;
	}
	
	public String getfact() {
		return this.fact;
	}

	public void setfact(String value) {
		this.fact=value;
	}

	public void delete() {
		this.fact=null;
	}
	
	public String getVaidatedDate(Belief belief) {
		return this.validatedDate;
	}
	
	public void updateValidatedDate(String date) {
		this.validatedDate=date;
	}
	
	public String getDate() {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	    Date dateobj = new Date();
	    String date= df.format(dateobj);
	    return date;
	}
	
}
