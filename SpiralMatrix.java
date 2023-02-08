package codes;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int row=3;
		int col=3;
		int top=0, bottom=row-1, left=0, right=col-1;
		int direction=0;
		while(top<=bottom && left<=right) {
			if(direction==0) {
				for (int i = left; i <=right; i++) {
					System.out.print(a[top][i]+" ");
					
				}
				top++;
			}
			else if(direction==1) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(a[i][right]+" ");
					
				}
				right--;
			}
			else if(direction==2) {
				for (int i = right; i >= left; i--) {
					System.out.print(a[bottom][i]+" ");
					
				}
				bottom--;
			}
			else if(direction==3) {
				for (int i = bottom; i >=top; i--) {
					System.out.print(a[i][left]+" ");
					
				}
				left++;
			}
			direction=(direction+1)%4;
		}
	}

}
