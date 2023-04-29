package codes;

import java.util.Scanner;
import java.util.Stack;

public class BracketsBalancing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		boolean res=ispar(x);
		if(res) {
			System.out.println("balance");
		}else {
			System.out.println("Not balance");
		}
		
	}

	static boolean ispar(String x)
	{
	    Stack<Character> stack = new Stack<>();
	    for(int i=0;i<x.length();i++){
	        char c = x.charAt(i);
	        if(c=='{' || c=='[' || c=='('){
	            stack.push(c);
	        }
	        else if(c=='}' || c==']' || c==')'){
	            if(stack.isEmpty()){
	                return false;
	            }
	            char top = stack.pop();
	            if((c=='}' && top!='{') || (c==']' && top!='[') || (c==')' && top!='(')){
	                return false;
	            }
	        }
	    }
	    return stack.isEmpty();
	}

}
