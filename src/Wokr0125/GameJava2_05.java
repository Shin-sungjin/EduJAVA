package Wokr0125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


	// �Ʒ��� �ڵ带 ���� ���� �м��غ�����!
	// bufferReader ����
	public class GameJava2_05
	{
	  public static int playGame() throws IOException  
	  {   
	    int x, y, z;
	    Random r= new Random();    //r = ���� �޼����� �ν��Ͻ� 
	    x= Math.abs(r.nextInt() % 9) + 1;  // x = abs ���� ���� , int�� ������ �����ϰ� 9�� ���� ��������  �ּڰ� 1���� 
	    
	    do{
	      y= Math.abs(r.nextInt() % 9) + 1;  // X �� Y�� ���� ������ �� ���� �ݺ�
	    }while(y==x);

	    do{
	      z= Math.abs(r.nextInt() % 9) + 1;   //Z�� x Ȥ�� y�� ������ ������ �ݺ�
	    }while((z==x)||(z==y));

	    System.out.println(x +", "+ y +", "+ z); /**/

	    return playGame(x, y, z);
	  }

	  public static int playGame(int x, int y, int z) throws IOException
	  {
	    int count;
	    int strike, ball;

	    int[] usr = new int[3];   //ũ�� 3�� �迭 ����
	    int[] com = { x, y, z };  //����ڷκ��� �Է� ���� int �� �迭

	    System.out.println("���� �߱� ����");

	    count= 0;

	    do{

	      count++; //���� Ƚ�� ����

	      do{
	        System.out.println("\nī��Ʈ: "+count);

	        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	        String user;

	        System.out.print("1��° ����: ");
	        user= in.readLine();
	        usr[0]= new Integer(user).intValue(); //����ڿ��� �Է¹��� ���� ���ʴ�� �迭�� ����

	        System.out.print("2��° ����: ");
	        user= in.readLine();
	        usr[1]= new Integer(user).intValue();//����ڿ��� �Է¹��� ���� ���ʴ�� �迭�� ����


	        System.out.print("3��° ����: ");
	        user= in.readLine();
	        usr[2]= new Integer(user).intValue();//����ڿ��� �Է¹��� ���� ���ʴ�� �迭�� ����


	        if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)){   //�Է� ���� 0�� ��� ���!
	          System.out.println("0�� �Է����� ������. �ٽ� �Է����ּ���.");
	        }else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)){    //�Է°��� 10 �̻��� �� �ʰ� �޼��� 
	          System.out.println("1���� 9������ ���� �� �ϳ��� �Է����ּ���. �ٽ� �Է����ּ���.");
	        }else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])){  //3���� �Է� ���� 2�� �̻��� �����ϸ� ���� �޼��� 
	          System.out.println("��� �ٸ� ���ڸ� �Է����ּ���. �ٽ� �Է����ּ���.");
	        }
	      }while((usr[0]==0)||(usr[1]==0)||(usr[2]==0)||	//��� ������ ������ �� ������ 
	             (usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
	             (usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2]));

	      strike = ball = 0;
	      
	      // �� �ε����� ���� �����ҽ� Strike;
	      if(usr[0]==com[0]) strike++;  
	      if(usr[1]==com[1]) strike++;
	      if(usr[2]==com[2]) strike++;

	      // �ش� ����, �ٸ� �ε����� ���� ������ �� ball
	      if(usr[0]==com[1]) ball++;
	      if(usr[0]==com[2]) ball++;
	      if(usr[1]==com[0]) ball++;
	      if(usr[1]==com[2]) ball++;
	      if(usr[2]==com[0]) ball++;
	      if(usr[2]==com[1]) ball++;
	  
	      System.out.println("Strike: "+ strike +" Ball: "+ ball);
	      //���� ���� 
	    }while((strike<3)&&(count<11));
	    //strike�� 3�̻��̰�, count�� 11�̻��� �� ����

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
	    //������ ���� ���� ��¤�
	    if(result<=2){ 
	      System.out.println("�� ���߾��!"); 
	    }else if(result<=5){
	      System.out.println("���߾��!");
	    }else if(result<=9){
	      System.out.println("�����̳׿�!");
	    }else{
	      System.out.println("�й��ϼ���!");
	    }
	  	}
	}
