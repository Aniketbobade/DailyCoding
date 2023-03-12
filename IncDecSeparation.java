package codes;

public class IncDecSeparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,1,3,6,8,2,9,0,10};
		int incA[]=new int[a.length];
		int decA[]=new int[a.length];
		
		if(a[0]>a[1]){
			decA[0]=a[0];
			incA[0]=a[1];
		}else {
			decA[0]=a[1];
			incA[0]=a[0];
		}
		int decIndex=1;
		int incIndex=1;
		boolean IsNotpossible=true;
		
		for (int i = 2; i < a.length; i++) {
			if(a[i]>incA[incIndex-1]) {
				incA[incIndex++]=a[i];
			}else if (a[i]<decA[decIndex-1]) {
				decA[decIndex++]=a[i];
			}else {
				System.out.println("not possible");
				IsNotpossible=true;
			}
		}
		if(IsNotpossible) {
			for (int i = 0; i < incIndex; i++) {
				System.out.print(incA[i]+" ");
			}
			System.out.println();
			for (int i = 0; i < decIndex; i++) {
				System.out.print(decA[i]+" ");
			}
		}
	}

}
