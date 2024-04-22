package Wokr0125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


	// 아래의 코드를 한줄 한줄 분석해보세요!
	// bufferReader 제외
	public class GameJava2_05
	{
	  public static int playGame() throws IOException  
	  {   
	    int x, y, z;
	    Random r= new Random();    //r = 랜덤 메서드의 인스턴스 
	    x= Math.abs(r.nextInt() % 9) + 1;  // x = abs 절댓값 선언 , int형 난수를 생성하고 9로 나눈 나머지와  최솟값 1부터 
	    
	    do{
	      y= Math.abs(r.nextInt() % 9) + 1;  // X 와 Y의 값이 동일할 때 까지 반복
	    }while(y==x);

	    do{
	      z= Math.abs(r.nextInt() % 9) + 1;   //Z가 x 혹은 y와 동일할 때까지 반복
	    }while((z==x)||(z==y));

	    System.out.println(x +", "+ y +", "+ z); /**/

	    return playGame(x, y, z);
	  }

	  public static int playGame(int x, int y, int z) throws IOException
	  {
	    int count;
	    int strike, ball;

	    int[] usr = new int[3];   //크기 3의 배열 선언
	    int[] com = { x, y, z };  //사용자로부터 입력 받은 int 값 배열

	    System.out.println("숫자 야구 게임");

	    count= 0;

	    do{

	      count++; //루프 횟수 누적

	      do{
	        System.out.println("\n카운트: "+count);

	        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	        String user;

	        System.out.print("1번째 숫자: ");
	        user= in.readLine();
	        usr[0]= new Integer(user).intValue(); //사용자에게 입력받은 값을 차례대로 배열에 저장

	        System.out.print("2번째 숫자: ");
	        user= in.readLine();
	        usr[1]= new Integer(user).intValue();//사용자에게 입력받은 값을 차례대로 배열에 저장


	        System.out.print("3번째 숫자: ");
	        user= in.readLine();
	        usr[2]= new Integer(user).intValue();//사용자에게 입력받은 값을 차례대로 배열에 저장


	        if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)){   //입력 값이 0인 경우 경고!
	          System.out.println("0은 입력하지 마세요. 다시 입력해주세요.");
	        }else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)){    //입력값이 10 이상일 때 초과 메세지 
	          System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요.");
	        }else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])){  //3개의 입력 값중 2개 이상이 동일하면 에러 메세지 
	          System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요.");
	        }
	      }while((usr[0]==0)||(usr[1]==0)||(usr[2]==0)||	//모든 조건이 만족될 때 마무리 
	             (usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
	             (usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2]));

	      strike = ball = 0;
	      
	      // 각 인덱스의 값이 동일할시 Strike;
	      if(usr[0]==com[0]) strike++;  
	      if(usr[1]==com[1]) strike++;
	      if(usr[2]==com[2]) strike++;

	      // 해당 값이, 다른 인덱스의 값과 동일할 시 ball
	      if(usr[0]==com[1]) ball++;
	      if(usr[0]==com[2]) ball++;
	      if(usr[1]==com[0]) ball++;
	      if(usr[1]==com[2]) ball++;
	      if(usr[2]==com[0]) ball++;
	      if(usr[2]==com[1]) ball++;
	  
	      System.out.println("Strike: "+ strike +" Ball: "+ ball);
	      //점수 공개 
	    }while((strike<3)&&(count<11));
	    //strike가 3이상이고, count가 11이상일 시 종료

	    return count;
	  }

	  public static void main(String[] args) throws IOException
	  {
	    int result;
	    // 
	    if(args.length==3){
	      int x= Integer.valueOf(args[0]).intValue();
	      int y= Integer.valueOf(args[1]).intValue();
	      int z= Integer.valueOf(args[2]).intValue();

	      result= playGame(x, y, z);
	    }else{
	      result= playGame();
	    }

	    System.out.println();
	    //점수에 따른 문구 출력ㄷ
	    if(result<=2){ 
	      System.out.println("참 잘했어요!"); 
	    }else if(result<=5){
	      System.out.println("잘했어요!");
	    }else if(result<=9){
	      System.out.println("보통이네요!");
	    }else{
	      System.out.println("분발하세요!");
	    }
	  	}
	}

