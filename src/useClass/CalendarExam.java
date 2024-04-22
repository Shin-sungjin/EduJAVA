package useClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	public static void main(String[] args) {
	      Calendar today = Calendar.getInstance();
//	      System.out.println(today);
	      System.out.println("올해의 년도 : " + today.get(Calendar.YEAR));
	      System.out.println("월(0~11) : " + (today.get(Calendar.MONTH)+1));
	      System.out.println("올해의 몇째주 : " + today.get(Calendar.WEEK_OF_YEAR));
	      System.out.println("이달의 몇째주 : " + today.get(Calendar.WEEK_OF_MONTH));
	      System.out.println("이달의 몇일 : " + today.get(Calendar.DAY_OF_MONTH));
	      System.out.println("올해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
	      
	      System.out.println("요일(1~7), 1:s일요일) : " + today.get(Calendar.DAY_OF_WEEK));
	      System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
	      
	      System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
	      
	      // calendear는 현업에서 잘 안쓰이는 편 
	      Date date = new Date();
	      SimpleDateFormat sFormat 
	      = new SimpleDateFormat("yyyy-MM-dd E요일 a hh:mm:ss");
	      System.out.printf(sFormat.format(date));
	    		  
	}
}
