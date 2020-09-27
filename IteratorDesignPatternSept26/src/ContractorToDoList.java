import java.util.ArrayList;

public class ContractorToDoList {

	private String address;
	private ToDo[] todos = new ToDo[2];
	private int count;
	
	public ContractorToDoList(String address) {
		this.address = address;
		
	}
	
	public void addToDo(String title, String description, 
			double price, String contact, 
			ArrayList<String> supplies) {
		
		if (count >= todos.length) {
			this.growArray(todos);
		
		} else {
			ToDo tempTodo = new ToDo( title,  description, 
				price,  contact,  supplies);
			todos[count] = tempTodo;
			count++; 
		}
	}
	
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
		
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public double getTotalCost() {
		int totalPrice = 0;
		
		for( int i =0; todos.length>i; i++) {
			totalPrice += todos[i].getPrice();
		}
		
		return totalPrice;
	}
	
	private ToDo[] growArray(ToDo[] todo) {
		
		 ToDo[] tempTodo = new ToDo[todo.length * 2];
		 
		    for(int i = 0; todo.length <=i; i++) {
		    	tempTodo[i] = todo[i];
		    }
		    todo = tempTodo;
		    return todo;
	}
		
}
