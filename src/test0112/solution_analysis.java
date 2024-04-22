package test0112;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class solution_analysis {

	public int getMatrixMaxValue(int[][] matrix) {
	    int max = Integer.MIN_VALUE;
	    // max값을 자바의 Math 클래스의 Min_vaule를 활용하여 
	    // 최솟 값을 할당한다.
	    // Min_vlaue의 값은 `-2147483648' 이다. 
	    // 이를 활용하여, Int형으로 표현할 수 있는 큰 음수의 숫자가 들어오더라도
	    // 정확하게 반환 할 수 있다. 
	    for (int i = 0; i < matrix.length; i++) {
	    	//matrix의 1차원 배열의 길이 만큼 반복한다.
	        for (int j = 0; j < matrix[i].length; j++) {
	        	//matrix의 2차원 배열의 길이 만큼 반복한다. 
	            if (matrix[i][j] > max) {
	            // 만약 해당하는 2차원 배열의 요소가,
	            // Min_value 보다 크다면 , max에 해당 값을 할당한다. 
	                max = matrix[i][j];
	            }
	        }
	    }
	    return max;
	    //max값을 반환한다.
	}


	public static void main(String[] args) {
		int num;
		int sum = 0;   //sum의 초기화;

		for(int i=1; i<=50; i++)
		{
			num = new Random().nextInt(101); 
			//num을 최댓값 100의 범위 내에서 인트형의 난수를 새롭게 생성하는 것을 반복한다.. 
			System.out.print(num + "\t");
			//난수와, 이스케이프 스퀀스를 나란히 배열한다. 
			sum += num;
			//sum 값에 num을 더하여 저장한다. 
			if(i % 6 == 0)
				// 한 줄에 6가지 난수가 생성되면 줄을 바꾼다. 
				
				System.out.println();
		}
		System.out.println("\n합 = " + sum);
		
		// 내 코드 리뷰
//		Random random = new Random();
//		//랜덤클래스를 정의한다. 
//		int[] arr = new int[50];
		// 인덱스 50번 까지 랜덤한 함수를 담을 수 있는 배열을 사용한다. 
		
//		int cnt = 0;  // 아마 풀이 과정 중, cnt를 후위 증가연산자로 사용하여,
		// 인덱스를 지정하려 했던 것 같다.
//		int sum = 0; // 총합을 저장한 sum 변수 초기화;
//		for(int i =0; i<50; i++) {
//			arr[i] = random.nextInt(100);	 // random.nextInt(101)이 되었어야 했다.
//			// 해당 난수를 인덱스 i에 저장한다.
//			sum += arr[i];
			//바로 저장한 인수를 더한 뒤, sum에 할당한다.
			
//		}
//		
//	
//		for(int j = 0; j<arr.length; j++) {
		//arr의 길이만큼 반복한다, 50;
//			for(int s =0; s<6; s++) { 6글자씩 찍고 다음으로 넘어가도록 지정한다.
//				System.out.print(arr[j] + "\t");
				//하지만 여기서 cnt 연산자를 이용하여, arr의 인덱스 값을 계속해서 
				//카운팅 했어야 했다. 
				// 여기서 J를 인덱스로 활용하여, 한 줄에 인덱스 1번의 값이 6번 출력되는 꼴이 되어버렸따. 
//			}
//		System.out.println();
//		}
		
//		
//	
//	System.out.println("총합 : " + sum);
//	}
	}
	
	public int return_add(int a, int b) {
	    if (b < a) {  // b가 a보다 작은경우, 
	        int temp = a; //temp에 a값을 저장한다.
	        a = b;	//기존 a 값을 b로 할당한다.
	        b = temp;	//b 값을 기존 a값을 저장해둔 temp로 할당한다.
	    }
	    
	    int sum = 0; //a~b까지의 덧셈 반복, a로 시작해 b까지 증가
	    for (int i = a; i <= b; i++) {
	        sum +=i; //지속적으로 sum 에 값을 더해서 대입한다. 
	    }
	    return sum;
	}

	// 내 코드 리뷰
	/*public static int return_add(int a, int b) {
		int answer = 0;   *프로그래머스를 풀다보니, 자연스럽게 answer로 지정한 모습
		if(b < a) {	      *b가 a보다 작은 경우
			int tep = b;  * tep에 b 값을 할당한다.	
			int tem = a;  * tem에 a 값을 할당한다.	
			a= tep;
			b = tem;	 *각각 대입해 둔 것을 거꾸로 할당해, 값을 스위칭 한다. 
		}
		
		if(a == b) {     * a와 b가 같을 경우 a값을 할당한다.
						 * else if를 사용해도 상관 없었겠지만, 
						 * 왠지모를 위화감이 들었었다. 
						 * 
			answer = a;
		}
		else {			
			int sum =0;  *이 때 sum을 지정하지 않고, 그냥 answer을 활용하는 것이 더 나아보인다. 
			for(int i = a; i <=b; i++) {
				sum += i;
				
			}
			answer = sum;   *굳이 반복문 내 sum을 한번 더 정의하여 
							* 코드 한 줄을 더 사용했다. 
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		System.out.println(return_add(2,5));
		
	}*/
	public void gunchim(int g) { //우선 import java.awt.List를 사용하니 오류가 났다.
								// 그리하여 import java.util.List로 바꿔준다. 
		List<String> gun = new ArrayList<String>();
		//gun이라는 이름의 String 리스트를 생성한다. 
		// 이때 배열이랑 다르게 파이썬의 리스트와 더 유사해보인다. 
		gun.size();//ArrayList의 요소의 개수를 리턴한다	
		while(gun.size()<g) { //gun 리스트의 요소의 개수가 g의 숫자와 같을 때까지 반복한다. 
							  //정확히 말하자면, 작은 동안 반복한다. 
			if(g<10000) { //만약 g가 10000미만인 경우
				gun.add("군");	//gun에 "군"을 추가한다.
				if(gun.size()==g) { //만약 gun의 사이즈가 g와 동일하다면 해당 while문을 탈출한다..
					break;  //지속해서 군과 침을 삽입하여, size가 g와 동일 해졌을 때 탈출한다고 보는 게 더 옳은 분석인 것 같다. 
				}
				if(gun.size()%2!=0 || gun.size()==1) { //gun.size가 홀수 이거나, 1일 때, 침을 삽입한다. 
					gun.add("침");
				}
			}
			else { //상정 된 범위를 초과하였기에, 제대로 입력할 것을 요구한다. 
				System.out.println("범위내의 길이를 입력하세요");
				break;
			}
		}
		//while문 종료 
		for(String i : gun) {  // ?? ,, 
		    System.out.print(i); //아마 향상된 for문인것 같다. 
		    // gun의 리스트에서, 문자열 i의 값을 출력한다. 
		}	//배열의 끝까지 반복하고, 종료되는 구조인것 같다 
		
		//향상된 for문은 다음의 이유로 사용한다. 
		//1.간편한,가독성 좋은 코드
		//2. 배열 인덱스 문제 해결 (ArrayIndexOutOfBoundsException 예외를 피할 수 있다.)
		//하지만 이러한 단점을 안고 있다.
		//1.인덱스를 사용하지 못한다.(일반 for문의 (int i=0;) 할 때 i 같은 인덱스를 말하는 것) 하지만 방법이 있다.
//		★ 중요 ★
//		2.배열이나 ArrayList 값을 사용할 순 있지만 절대 수정할 수는 없다.
	
		
		// 내 코드 리뷰
		/*public static String gunchim(int g) {
			String answer= ""; *String answer을 정의한다. 
							   * String answer; 로 해도 되지 않았을까 생각해본다. 	
			
			String str = "";   "군침"을 1000번 반복한 글자를 저장하기 위한 요소
			String ans = "군침"; *제시된 키워드인 "군침을 정의한다"
			
			for(int s = 1; s <=1000; s++) {
				str += (s%2 != 0 ) ? ans.charAt(0): ans.charAt(1) ; 
						*삼항 연산자 이용하여, s가 1부터, 1000까지 (최대 1000), 
						*s가 홀수 임이 참일 때, "군침"의 첫 글자 "군"을 str에 넣는다. false일 경우 군침의 두번쨰 글자인 "침"을 str에 저장한다. 
			}
						*str은 "군" 과 "침"을 반복하여 총 1000글자가 되었따. 
				*
			for(int i = 0; i< g; i++) {
				answer +=str.charAt(i);
						*g의 수만큼, answer에 str의 요소를 차례대로 삽입한다. 			
			}
			return answer;*/ // answer값 반환
		}
	
	public String strange_word(String s) {
        char[] chars = s.toCharArray(); //캐릭터형 변수를 선언한다. 
        // s의 값을 char 배열에 삽입한다. 
        
        boolean isUpper = true;
        //isUpper 의 값을 트루로 한다.
        
        for (int i = 0; i < chars.length; i++) {
        	// char.length;의 길이 만큼 반복한다. 
            if (chars[i] == ' ') {
            	//만약 char의 인덱스 i 값이 공백일 경우
                isUpper = true;
                //isUpper의 값을 true 로 산정한다. 
            } 
            else {
                if (isUpper) {
                	//isUpper가 참인 경우, 
                    chars[i] = Character.toUpperCase(chars[i]);
                    //인덱스 char[i]의 값을 대문자로 바꾼다.
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                    //만약 isUpper가 true가 아니라면 소문자로 변환하여 저장.
                }
                isUpper = !isUpper;
                // 위 두가지 경우를 수행하고, isUpper의 반대값을 반환한다. 
                // true - > false;
            }
        }

        return String.valueOf(chars); //변환된 chars 값을 반환한다. 
        
        // 내 코드 리뷰
    	/*public static String strange_word(String str) {
    		String[] ans = str.split(" "); * str을 " " 공백 단위로 잘라 ans 배열에 저장한다. 		
    		
    							
    		String answer = "";  변환된 문자를 담을 변수 answer 선언
    		
    		
    		for(int i = 0; i < ans.length; i++) {  *ans 배열의 길이만큼, 반복한다.
    		
    			for(int s = 0; s < ans[i].length(); s++) { *ans의 인덱스 i번째의 길이 만큼 반복;
    			
     				if(s % 2 != 0 || s ==1) {  //만약 s가 홀수이거나 1일 경우, 	
     				
    					char odd =  ans[i].charAt(s); //그에 해당하는 문자를 odd에 저장한다.  
    					answer +=  Character.toLowerCase(odd);  // answer에 소문자로 변환하여 할당한다
    				}
    				
    				else {
    					char even = ans[i].charAt(s);
    					// 짝수인 경우. 
    					answer += Character.toUpperCase(even);
    					// 해당하는 문자를 대문자로 변환하여 할당한다. 
    				}
    			}
    			answer += " ";
    			
    			// ans의 i번쨰 인덱스에 대한 변환이 끝났다면, 공백을 추가한다. 
    			 *하지만 이렇게 해버리면, 마지막 작업 수행 이후에도 공백이 들어가 문제가 생길 수 있다. 
    		}

    			return answer; */
	}
        
        
}
	 
	
	


