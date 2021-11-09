package ChainofResponsibilityExample02;

public abstract class Employee {
	public Employee supervisor;
	public abstract void ApplyLeave(String EmployeeName,int NumberofDaysLeaves, int NumberofDays);
	public void setNextSupervisor(Employee supervisor) {
		this.supervisor=supervisor;
	}
}
