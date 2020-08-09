package stackLinkedLists;

public class App {

	public static void main(String[] args) {
		
		Stack<Integer> myStack = new Stack<>();
		
		myStack.push(10);
		myStack.push(100);
		myStack.push(1000);
		
		System.out.println(myStack.size());
		
		// Last In First Out
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
