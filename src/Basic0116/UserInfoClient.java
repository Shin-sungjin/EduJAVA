package Basic0116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.*;

public class UserInfoClient {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("DB 타입을 입력하세요");
		String Dbtype = br.readLine();
		
		if(Dbtype.equals("oracle")) {
			UserInfoOracleDao orc = new UserInfoOracleDao();
		}
		
		else if(Dbtype.equals("mysql")){
			UserInfoMySqlDao mys = new UserInfoMySqlDao();
		}
	}
}	
