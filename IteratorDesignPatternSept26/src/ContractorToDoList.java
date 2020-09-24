
public class ContractorToDoList {

	private String address;
	private ToDo[] todos = new ToDo[2];
	private int count;
	
	public ContractorToDoList(String address) {
		this.address = address;
		
	}
	
	public void addToDo() {
		
	}
	
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
		
	}
	
	public String getAddress() {
		
	}
	
	public double TotalCost() {
		
	}
	
	private ToDo[] growArray(ToDo[] todo[]) {
		
	}
}
