package codes;
/* 
 Example
 Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
 */

class UsernameValidator {
	public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
}

public class UserValidation {

	public static void main(String[] args) {
		String str="Samantha";
		if(str.matches(UsernameValidator.regularExpression)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
	}
}
