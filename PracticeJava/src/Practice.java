import java.util.Scanner;

interface Stack{
	
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{
	
	private int size;
	private int capacity;
	
	public StringStack(int size) {
		this.size = size;
	}
	
	public int length() {
		
	}
	
	public int capacity() {
		
		
	}
	
	public String pop() {
		
	}
	
	public boolean push(String val) {
		
	}
	
}
public class Practice{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scanner.nextInt();
		StringStack stringStack = new StringStack(size);
		
		
	}
}
