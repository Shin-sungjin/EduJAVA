package test0112;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class solution_analysis {

	public int getMatrixMaxValue(int[][] matrix) {
	    int max = Integer.MIN_VALUE;
	    // max���� �ڹ��� Math Ŭ������ Min_vaule�� Ȱ���Ͽ� 
	    // �ּ� ���� �Ҵ��Ѵ�.
	    // Min_vlaue�� ���� `-2147483648' �̴�. 
	    // �̸� Ȱ���Ͽ�, Int������ ǥ���� �� �ִ� ū ������ ���ڰ� ��������
	    // ��Ȯ�ϰ� ��ȯ �� �� �ִ�. 
	    for (int i = 0; i < matrix.length; i++) {
	    	//matrix�� 1���� �迭�� ���� ��ŭ �ݺ��Ѵ�.
	        for (int j = 0; j < matrix[i].length; j++) {
	        	//matrix�� 2���� �迭�� ���� ��ŭ �ݺ��Ѵ�. 
	            if (matrix[i][j] > max) {
	            // ���� �ش��ϴ� 2���� �迭�� ��Ұ�,
	            // Min_value ���� ũ�ٸ� , max�� �ش� ���� �Ҵ��Ѵ�. 
	                max = matrix[i][j];
	            }
	        }
	    }
	    return max;
	    //max���� ��ȯ�Ѵ�.
	}


	public static void main(String[] args) {
		int num;
		int sum = 0;   //sum�� �ʱ�ȭ;

		for(int i=1; i<=50; i++)
		{
			num = new Random().nextInt(101); 
			//num�� �ִ� 100�� ���� ������ ��Ʈ���� ������ ���Ӱ� �����ϴ� ���� �ݺ��Ѵ�.. 
			System.out.print(num + "\t");
			//������, �̽������� �������� ������ �迭�Ѵ�. 
			sum += num;
			//sum ���� num�� ���Ͽ� �����Ѵ�. 
			if(i % 6 == 0)
				// �� �ٿ� 6���� ������ �����Ǹ� ���� �ٲ۴�. 
				
				System.out.println();
		}
		System.out.println("\n�� = " + sum);
		
		// �� �ڵ� ����
//		Random random = new Random();
//		//����Ŭ������ �����Ѵ�. 
//		int[] arr = new int[50];
		// �ε��� 50�� ���� ������ �Լ��� ���� �� �ִ� �迭�� ����Ѵ�. 
		
//		int cnt = 0;  // �Ƹ� Ǯ�� ���� ��, cnt�� ���� ���������ڷ� ����Ͽ�,
		// �ε����� �����Ϸ� �ߴ� �� ����.
//		int sum = 0; // ������ ������ sum ���� �ʱ�ȭ;
//		for(int i =0; i<50; i++) {
//			arr[i] = random.nextInt(100);	 // random.nextInt(101)�� �Ǿ���� �ߴ�.
//			// �ش� ������ �ε��� i�� �����Ѵ�.
//			sum += arr[i];
			//�ٷ� ������ �μ��� ���� ��, sum�� �Ҵ��Ѵ�.
			
//		}
//		
//	
//		for(int j = 0; j<arr.length; j++) {
		//arr�� ���̸�ŭ �ݺ��Ѵ�, 50;
//			for(int s =0; s<6; s++) { 6���ھ� ��� �������� �Ѿ���� �����Ѵ�.
//				System.out.print(arr[j] + "\t");
				//������ ���⼭ cnt �����ڸ� �̿��Ͽ�, arr�� �ε��� ���� ����ؼ� 
				//ī���� �߾�� �ߴ�. 
				// ���⼭ J�� �ε����� Ȱ���Ͽ�, �� �ٿ� �ε��� 1���� ���� 6�� ��µǴ� ���� �Ǿ���ȵ�. 
//			}
//		System.out.println();
//		}
		
//		
//	
//	System.out.println("���� : " + sum);
//	}
	}
	
	public int return_add(int a, int b) {
	    if (b < a) {  // b�� a���� �������, 
	        int temp = a; //temp�� a���� �����Ѵ�.
	        a = b;	//���� a ���� b�� �Ҵ��Ѵ�.
	        b = temp;	//b ���� ���� a���� �����ص� temp�� �Ҵ��Ѵ�.
	    }
	    
	    int sum = 0; //a~b������ ���� �ݺ�, a�� ������ b���� ����
	    for (int i = a; i <= b; i++) {
	        sum +=i; //���������� sum �� ���� ���ؼ� �����Ѵ�. 
	    }
	    return sum;
	}

	// �� �ڵ� ����
	/*public static int return_add(int a, int b) {
		int answer = 0;   *���α׷��ӽ��� Ǯ�ٺ���, �ڿ������� answer�� ������ ���
		if(b < a) {	      *b�� a���� ���� ���
			int tep = b;  * tep�� b ���� �Ҵ��Ѵ�.	
			int tem = a;  * tem�� a ���� �Ҵ��Ѵ�.	
			a= tep;
			b = tem;	 *���� ������ �� ���� �Ųٷ� �Ҵ���, ���� ����Ī �Ѵ�. 
		}
		
		if(a == b) {     * a�� b�� ���� ��� a���� �Ҵ��Ѵ�.
						 * else if�� ����ص� ��� ����������, 
						 * ������ ��ȭ���� �������. 
						 * 
			answer = a;
		}
		else {			
			int sum =0;  *�� �� sum�� �������� �ʰ�, �׳� answer�� Ȱ���ϴ� ���� �� ���ƺ��δ�. 
			for(int i = a; i <=b; i++) {
				sum += i;
				
			}
			answer = sum;   *���� �ݺ��� �� sum�� �ѹ� �� �����Ͽ� 
							* �ڵ� �� ���� �� ����ߴ�. 
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		System.out.println(return_add(2,5));
		
	}*/
	public void gunchim(int g) { //�켱 import java.awt.List�� ����ϴ� ������ ����.
								// �׸��Ͽ� import java.util.List�� �ٲ��ش�. 
		List<String> gun = new ArrayList<String>();
		//gun�̶�� �̸��� String ����Ʈ�� �����Ѵ�. 
		// �̶� �迭�̶� �ٸ��� ���̽��� ����Ʈ�� �� �����غ��δ�. 
		gun.size();//ArrayList�� ����� ������ �����Ѵ�	
		while(gun.size()<g) { //gun ����Ʈ�� ����� ������ g�� ���ڿ� ���� ������ �ݺ��Ѵ�. 
							  //��Ȯ�� �����ڸ�, ���� ���� �ݺ��Ѵ�. 
			if(g<10000) { //���� g�� 10000�̸��� ���
				gun.add("��");	//gun�� "��"�� �߰��Ѵ�.
				if(gun.size()==g) { //���� gun�� ����� g�� �����ϴٸ� �ش� while���� Ż���Ѵ�..
					break;  //�����ؼ� ���� ħ�� �����Ͽ�, size�� g�� ���� ������ �� Ż���Ѵٰ� ���� �� �� ���� �м��� �� ����. 
				}
				if(gun.size()%2!=0 || gun.size()==1) { //gun.size�� Ȧ�� �̰ų�, 1�� ��, ħ�� �����Ѵ�. 
					gun.add("ħ");
				}
			}
			else { //���� �� ������ �ʰ��Ͽ��⿡, ����� �Է��� ���� �䱸�Ѵ�. 
				System.out.println("�������� ���̸� �Է��ϼ���");
				break;
			}
		}
		//while�� ���� 
		for(String i : gun) {  // ?? ,, 
		    System.out.print(i); //�Ƹ� ���� for���ΰ� ����. 
		    // gun�� ����Ʈ����, ���ڿ� i�� ���� ����Ѵ�. 
		}	//�迭�� ������ �ݺ��ϰ�, ����Ǵ� �����ΰ� ���� 
		
		//���� for���� ������ ������ ����Ѵ�. 
		//1.������,������ ���� �ڵ�
		//2. �迭 �ε��� ���� �ذ� (ArrayIndexOutOfBoundsException ���ܸ� ���� �� �ִ�.)
		//������ �̷��� ������ �Ȱ� �ִ�.
		//1.�ε����� ������� ���Ѵ�.(�Ϲ� for���� (int i=0;) �� �� i ���� �ε����� ���ϴ� ��) ������ ����� �ִ�.
//		�� �߿� ��
//		2.�迭�̳� ArrayList ���� ����� �� ������ ���� ������ ���� ����.
	
		
		// �� �ڵ� ����
		/*public static String gunchim(int g) {
			String answer= ""; *String answer�� �����Ѵ�. 
							   * String answer; �� �ص� ���� �ʾ����� �����غ���. 	
			
			String str = "";   "��ħ"�� 1000�� �ݺ��� ���ڸ� �����ϱ� ���� ���
			String ans = "��ħ"; *���õ� Ű������ "��ħ�� �����Ѵ�"
			
			for(int s = 1; s <=1000; s++) {
				str += (s%2 != 0 ) ? ans.charAt(0): ans.charAt(1) ; 
						*���� ������ �̿��Ͽ�, s�� 1����, 1000���� (�ִ� 1000), 
						*s�� Ȧ�� ���� ���� ��, "��ħ"�� ù ���� "��"�� str�� �ִ´�. false�� ��� ��ħ�� �ι��� ������ "ħ"�� str�� �����Ѵ�. 
			}
						*str�� "��" �� "ħ"�� �ݺ��Ͽ� �� 1000���ڰ� �Ǿ���. 
				*
			for(int i = 0; i< g; i++) {
				answer +=str.charAt(i);
						*g�� ����ŭ, answer�� str�� ��Ҹ� ���ʴ�� �����Ѵ�. 			
			}
			return answer;*/ // answer�� ��ȯ
		}
	
	public String strange_word(String s) {
        char[] chars = s.toCharArray(); //ĳ������ ������ �����Ѵ�. 
        // s�� ���� char �迭�� �����Ѵ�. 
        
        boolean isUpper = true;
        //isUpper �� ���� Ʈ��� �Ѵ�.
        
        for (int i = 0; i < chars.length; i++) {
        	// char.length;�� ���� ��ŭ �ݺ��Ѵ�. 
            if (chars[i] == ' ') {
            	//���� char�� �ε��� i ���� ������ ���
                isUpper = true;
                //isUpper�� ���� true �� �����Ѵ�. 
            } 
            else {
                if (isUpper) {
                	//isUpper�� ���� ���, 
                    chars[i] = Character.toUpperCase(chars[i]);
                    //�ε��� char[i]�� ���� �빮�ڷ� �ٲ۴�.
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                    //���� isUpper�� true�� �ƴ϶�� �ҹ��ڷ� ��ȯ�Ͽ� ����.
                }
                isUpper = !isUpper;
                // �� �ΰ��� ��츦 �����ϰ�, isUpper�� �ݴ밪�� ��ȯ�Ѵ�. 
                // true - > false;
            }
        }

        return String.valueOf(chars); //��ȯ�� chars ���� ��ȯ�Ѵ�. 
        
        // �� �ڵ� ����
    	/*public static String strange_word(String str) {
    		String[] ans = str.split(" "); * str�� " " ���� ������ �߶� ans �迭�� �����Ѵ�. 		
    		
    							
    		String answer = "";  ��ȯ�� ���ڸ� ���� ���� answer ����
    		
    		
    		for(int i = 0; i < ans.length; i++) {  *ans �迭�� ���̸�ŭ, �ݺ��Ѵ�.
    		
    			for(int s = 0; s < ans[i].length(); s++) { *ans�� �ε��� i��°�� ���� ��ŭ �ݺ�;
    			
     				if(s % 2 != 0 || s ==1) {  //���� s�� Ȧ���̰ų� 1�� ���, 	
     				
    					char odd =  ans[i].charAt(s); //�׿� �ش��ϴ� ���ڸ� odd�� �����Ѵ�.  
    					answer +=  Character.toLowerCase(odd);  // answer�� �ҹ��ڷ� ��ȯ�Ͽ� �Ҵ��Ѵ�
    				}
    				
    				else {
    					char even = ans[i].charAt(s);
    					// ¦���� ���. 
    					answer += Character.toUpperCase(even);
    					// �ش��ϴ� ���ڸ� �빮�ڷ� ��ȯ�Ͽ� �Ҵ��Ѵ�. 
    				}
    			}
    			answer += " ";
    			
    			// ans�� i���� �ε����� ���� ��ȯ�� �����ٸ�, ������ �߰��Ѵ�. 
    			 *������ �̷��� �ع�����, ������ �۾� ���� ���Ŀ��� ������ �� ������ ���� �� �ִ�. 
    		}

    			return answer; */
	}
        
        
}
	 
	
	


