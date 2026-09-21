package com.languagefundamentals.methods;

public class BugTracker {

	int bugid;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getBugid()
	{
		System.out.println("Bug ID :"+bugid);
		return bugid;
	}
	String getApplicationName()
	{
		System.out.println("Bug Applicatio Name : "+applicationName);
		return applicationName;
	}
	String getBugTitle()
	{
		System.out.println("Bug Title : "+bugTitle);
		return bugTitle;
	}
	String getSeverity()
	{
		System.out.println("Your "+applicationName+" Bug Severity : "+severity);
		return severity;
	}
	String getPriority()
	{
		System.out.println("Bug Title "+bugTitle+" Priority : "+priority);
		return priority;
	}
	String getStatus()
	{
		System.out.println("Current Status of Bug : "+status);
		return status;
		
	}
	
	String getAssignedDeveloper(int bugid,String developerName)
	{
		this.bugid=bugid;
		assignedDeveloper=developerName;
		System.out.println("The Bug in "+applicationName+" Application is handled by : "+assignedDeveloper);
		return assignedDeveloper;
		
	}
	String updateStatus(String newStatus)
	{
		newStatus=status;
		System.out.println("The " +applicationName+" Application Bug status : "+status );
		return status;
	}
	void displayBugSummary()
	{
		System.out.println("************** APPLICATION BUG DETAILS ***************");
		getBugid();
		getApplicationName();
		getBugTitle();
		getSeverity();
		getPriority();
		
	}
	
	public static void main(String[] args) {
		BugTracker b=new BugTracker();
		b.bugid=003;
		b.applicationName="bookMyShow";
		b.bugTitle="Payment Method";
		b.severity="High";
		b.priority="High";
		b.status="Active";
		b.assignedDeveloper="Not Assigned";
		b.displayBugSummary();
		
		System.out.println("\n**************** Assinged To Developer **************");
		
		b.getAssignedDeveloper(3,"Sunil");
		b.updateStatus("In Developement:");
		
		

	}

}
