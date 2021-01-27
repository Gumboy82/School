
public class Task implements Priority, Complexity, Comparable{
	private String job;
	private int priority;
	private int complexity;
	
	//Constructors
	public Task() {
		job = "";
	}
	public Task(String j)
	{
		job = j;
	}
	
	
	//Methods
	public String getTask()
	{
		return job;
	}
	public void setTask(String j)
	{
		job = j;
	}
	public String toString()
	{
		return "Task[job = "+job+", priority = "+priority+"]";
	}
	public int getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}
	
	public void setPriority(int prio) {
		// TODO Auto-generated method stub
		priority = prio;
	}
	@Override
	public int getComplexity() {
		// TODO Auto-generated method stub
		return complexity;
	}
	@Override
	public void setComplexity(int c) {
		// TODO Auto-generated method stub
		complexity = c;
	}
}
