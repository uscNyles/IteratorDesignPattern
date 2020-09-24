import java.util.Iterator;

public class ToDoIterator implements Iterator{

	private ToDo[] todos;
	private int position;
	
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	
	@Override
	public ToDo next() {
		if(!hasNext())return null;
		ToDo todo = todos[position];
		position += 1;
		return todo;
	}

	@Override
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		} else {
		return true;
		}
	}
}
