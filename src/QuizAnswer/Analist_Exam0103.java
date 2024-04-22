package QuizAnswer;

import java.util.Arrays;

public class Analist_Exam0103 {

	int jolra_gine(int n, int[] times){ // ���⵵ �м� x
		int n = 10;   //�Ա� �ɻ�� ��� �ο� 10��
		int[] times = {3,15,7,11,31};  //�ɻ�� 5��, ���� �ɸ��� �ð�.
		int answer = 0;
		int timeslength = times.length;
		while(n!=0) { // ������� 0�̵Ǹ� ����
			answer ++;
		for(int i=0; i<timeslength; i++) {   
				if(answer%times[i]==0) { 
					n--;
				}
			}			
		}
		
		return answer;		
	}	
	

	    public long solution(int n, int[] times) { 
	        long answer = 0;     // while ���� ������ ���� ��ȯ
	        
	        
	        Arrays.sort(times); //�迭 �������� ����  
	        //���� ���� �ɻ���� ���� ������ ������ ����
	        
	        long left = 0;
	        //
	        
	        long right = (long) n * times[times.length - 1]; 
	        // right �� ����ο� * times�� �ִ��� ���� �� = 6 * 31 =186
	        // ���� ���� �ɸ��� ��� �ð�?
	        
	        while (left <= right) {  //left�� right ���� �۰ų� ���� �� = > left�� �ɻ�밡 rigth �ɻ���� ��� �ð����� ���� ��
	        
	        	long mid = (left + right) / 2;  //mid�� ��� �ð� ��հ��� �� ���׿�
	            
	        	long sum = 0;  //�ɻ����� ��?
	            
	        	for (int i = 0; i < times.length; i++) {    //�ɻ�� ������ŭ �ݺ�
	            
	        		sum += mid / times[i];                        
	        					//��հ� ������ �� �ɻ���� �ҿ� �ð� �� sum ������ �Ҵ�
	        	}
	            
	        	if (sum < n) {    //sum ���� ��� �ο������� ���� �� �Ʒ� �ڵ� ����
	            
	        		left = mid + 1;    //left �� ��� ��� �ð� + 1;
	            
	        	} else { 
	                right = mid - 1;   //�ƴ϶�� rigth�� ��� ���ð����� -1;
	                answer = mid;       // answer�� ��� ��� �ð� �� �Ҵ�
	            
	        	}
	        
	        }
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		
		int n = 10;
	
		int[] times = {3,15,7,11,31};
		
		Analist_Exam0103 immigration = new Analist_Exam0103();
		
		long answer = immigration.solution(n, times); 
		//answer�� iimmigration.soluthion ����� Ȱ���� ,n�� time �Ҵ�
		// soulution ����� ���� �𸣰ڽ��ϴ�...
		System.out.println(answer);
		
	}
}
