package useClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	public static void main(String[] args) {
	      Calendar today = Calendar.getInstance();
//	      System.out.println(today);
	      System.out.println("������ �⵵ : " + today.get(Calendar.YEAR));
	      System.out.println("��(0~11) : " + (today.get(Calendar.MONTH)+1));
	      System.out.println("������ ��°�� : " + today.get(Calendar.WEEK_OF_YEAR));
	      System.out.println("�̴��� ��°�� : " + today.get(Calendar.WEEK_OF_MONTH));
	      System.out.println("�̴��� ���� : " + today.get(Calendar.DAY_OF_MONTH));
	      System.out.println("������ ���� : " + today.get(Calendar.DAY_OF_YEAR));
	      
	      System.out.println("����(1~7), 1:s�Ͽ���) : " + today.get(Calendar.DAY_OF_WEEK));
	      System.out.println("�ð�(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
	      
	      System.out.println("�� ���� ������ �� : " + today.getActualMaximum(Calendar.DATE));
	      
	      // calendear�� �������� �� �Ⱦ��̴� �� 
	      Date date = new Date();
	      SimpleDateFormat sFormat 
	      = new SimpleDateFormat("yyyy-MM-dd E���� a hh:mm:ss");
	      System.out.printf(sFormat.format(date));
	    		  
	}
}
