package Basic0116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeDollor extends Change {	
	String standard ;
	String ChangeStd;
	double rat ;
	
	ChangeDollor(){
		standard = "원";
		ChangeStd = "달러";
		rat = 0.00131;
	}
	
	@Override
	protected double changeMethod(double src) {
		double result = rat * src;
		return result;
	}


	protected String getSrc() {
		return this.standard;
		
	}
	@Override
	protected String getDest() {
		ChangeStd = "달러";
		return this.ChangeStd;
	}
	

	
	public static void main(String[] args) throws IOException {
		ChangeDollor std = new ChangeDollor() ;

		std.run();
		
	}

	
}
