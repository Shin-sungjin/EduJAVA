package QuizAnswer;

import java.util.Arrays;

public class Analist_Exam0103 {

	int jolra_gine(int n, int[] times){ // 여기도 분석 x
		int n = 10;   //입국 심사대 대기 인원 10인
		int[] times = {3,15,7,11,31};  //심사관 5인, 각각 걸리는 시간.
		int answer = 0;
		int timeslength = times.length;
		while(n!=0) { // 사람수가 0이되면 종료
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
	        long answer = 0;     // while 문이 끝나고 값을 반환
	        
	        
	        Arrays.sort(times); //배열 오름차순 정렬  
	        //가장 빠른 심사관이 가장 앞으로 오도록 정렬
	        
	        long left = 0;
	        //
	        
	        long right = (long) n * times[times.length - 1]; 
	        // right 는 대기인원 * times의 최댓값을 곱한 값 = 6 * 31 =186
	        // 가장 오래 걸리는 대기 시간?
	        
	        while (left <= right) {  //left가 right 보다 작거나 같을 때 = > left의 심사대가 rigth 심사대의 대기 시간보다 작을 때
	        
	        	long mid = (left + right) / 2;  //mid는 대기 시간 평균값인 것 같네요
	            
	        	long sum = 0;  //심사위원 수?
	            
	        	for (int i = 0; i < times.length; i++) {    //심사대 갯수만큼 반복
	            
	        		sum += mid / times[i];                        
	        					//평균값 나누기 각 심사대의 소요 시간 이 sum 값으로 할당
	        	}
	            
	        	if (sum < n) {    //sum 값이 대기 인원수보다 작을 때 아래 코드 실행
	            
	        		left = mid + 1;    //left 는 평균 대기 시간 + 1;
	            
	        	} else { 
	                right = mid - 1;   //아니라면 rigth의 평균 대기시간에서 -1;
	                answer = mid;       // answer에 평균 대기 시간 값 할당
	            
	        	}
	        
	        }
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		
		int n = 10;
	
		int[] times = {3,15,7,11,31};
		
		Analist_Exam0103 immigration = new Analist_Exam0103();
		
		long answer = immigration.solution(n, times); 
		//answer은 iimmigration.soluthion 기능을 활용해 ,n과 time 할당
		// soulution 기능이 뭔지 모르겠습니다...
		System.out.println(answer);
		
	}
}
