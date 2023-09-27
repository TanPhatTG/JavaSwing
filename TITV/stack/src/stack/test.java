package stack;

import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap noi dung vao: ");
		String content = sc.nextLine();
		
		for (int i = 0; i < content.length(); i++) {
			stack.push(content.charAt(i)+"");
		}
		
		for (int i = 0; i < content.length(); i++) {
			System.out.print(stack.pop());
		}
		
	}
	
}
