import java.util.Scanner;


public class Perimeter {

	char[][] mtx;
	int row, col, per;
	
	public void solve () {
		Scanner s = new Scanner (System.in);
		row = s.nextInt();
		while (row != 0) {
			col = s.nextInt();
			int cx = s.nextInt();
			int cy = s.nextInt();
			per = 0;
			cx--;
			cy--;
			mtx = new char[row][col];
			for (int i = 0; i < row; i++) {
					mtx[i] = s.next().toCharArray();
			}
			addPer(cx,cy);
			System.out.println(per);
			row = s.nextInt();
		}
		
		s.close();
		
	}
	
	public void addPer(int a, int b) {
		if(mtx[a][b] != '-') {
			mtx[a][b] = '-';
			if (!ex(a-1, b)) {
				per++;
			}
			else {
				addPer(a-1,b);
			}
			if (!ex(a+1, b)) {
				per++;
			}
			else {
				addPer(a+1,b);
			}
			if (!ex(a,b-1)) {
				per++;
			}
			else {
				addPer(a,b-1);
			}
			if(!ex(a,b+1)) {
				per++;
			}
			else {
				addPer(a,b+1);
			}
			
			if(ex(a-1,b-1)) 
				addPer(a-1,b-1);
			if(ex(a-1,b+1))
				addPer(a-1,b+1);
			if(ex(a+1,b+1))
				addPer(a+1,b+1);
			if(ex(a+1,b-1))
				addPer(a+1,b-1);
		}
		
	}

	public boolean ex (int a, int b) {
		if (a >= 0 && b >= 0 && a < row && b < col) {
			return mtx[a][b] != '.';
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perimeter p = new Perimeter();
		p.solve();
	}

}
