package Stream;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class StreamExam2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// �̤Ӥ��� ��Ʈ���� ��� ��Ʈ��
		// ����Ʈ ����� ��Ʈ��
		// -��� ������ �����͸� �ְ� ���� �� ����
		//  (�׸�, �̵��, ���� ��� ����)
		// - 
		// ���� ��� ��Ʈ��
		// - ���ڸ�...
		// ���ڵ��� ���ڵ�
		// ���ڵ� - > ��谡 �˾Ƶ�� ���� ���� ��ȯ(����Ʈ �ڵ�)
		// ���ڵ� - > ����� ���Ѿ�շ� ��ȯ
		
		String gunchim = "��ħ�� �ϵ���";
		String[] encodings = 
				new String[] {"x-windows-949",
							  "EUC-KR", "UTF-8",
							  "ISO8859-1"};
		String[] encoded = new String[4];
		String decoded =" ";
	
		for(int i =0; i<encodings.length; i++) {
			encoded[i] = URLEncoder.encode(gunchim, encodings[i]);
			System.out.println(encodings[i]+"�� ���ڵ� �� ��" + encoded[i]);
		}
		for(int i =0; i<encodings.length; i++) {
			decoded = URLDecoder.decode(encoded[i], encodings[i]);
			System.out.println("\n"+encodings[i]+"�� ���ڵ��� �� " + decoded);		
			
		}
	}
	
}

