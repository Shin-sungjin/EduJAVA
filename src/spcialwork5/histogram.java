package spcialwork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class histogram{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		char[] alpha = new char[26];
		int[] cnt = new int[26];
		System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���.");
		String str = "";
		
		//���ڿ� �Է� �ޱ� 
		onefor:
		while(true) {
			str += br.readLine();
			for(int i = 0; i<str.length(); i++) {
				if(str.charAt(i) == ';') {
					break onefor;
				}
			}
		}
		
		
		//str ���� �ҹ��ڷ� ���� 
		str = str.toUpperCase();
		
		//�빮�� 
		for(int a =0; a<alpha.length; a++) {
			alpha[a] = (char) (a + 65);
		}
		
		//�� ������ �ȵǳ� 
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (alpha[i] == str.charAt(j)) {
                	cnt[i]++;  //���Ⱑ ������ ���ϳ�
                }
            }
        }
        
        for(int count = 0; count < alpha.length; count++) {
        	System.out.print(alpha[count]);
        	int idx = cnt[count];
        	for(int f = 0; f <idx; f++) {
        		System.out.print("-");
        	}
        	System.out.println();
        }

		
		
		
	}
}