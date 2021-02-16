
public class TaskDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task a = new Task();
		Task b = new Task("Sweeping");
		a.setTask("Homework");
		a.setPriority(10);
		a.setComplexity(3);
		b.setPriority(4);
		b.setComplexity(3);
		System.out.println(a.compareTo(b));
	}

}
