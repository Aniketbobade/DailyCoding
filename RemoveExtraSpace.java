package codes;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  Aniket   bobade  Software Engineer  ";
		String str[]=s.split(" ");
		String res="";
		for (String string : str) {
			if(!string.isBlank())
				res=res+string+" ";
		}
		System.out.println(res);
	}

}
