package test0112;

public class java_quiz1_�ż��� {
	public static void main(String[] args) {
		int[][] quiz1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int mnum = 0;
		for(int i= 0; i < quiz1.length; i++) {
			
			for(int j = 0; j< quiz1[i].length; j++) { //3�� ���ݺ�
				if(mnum < quiz1[i][j]) {
					mnum= quiz1[i][j];
				}
			}
		}
	
		System.out.println(mnum);
	
	}
}
