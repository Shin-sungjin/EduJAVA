package QuizAnswer;

public class Soultion {
   public static void main(String[] args) {
	   int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
	   int n =3;
	   
       int[] answer;
       int a= 0;
       answer = new int[a+2];
       for(int i = 0; i<numlist.length; i++){
           if(numlist[i] % n == 0){
               a++;
               answer[a] = numlist[i];
           }
       }
       System.out.println(answer.toString());
   
   }
}
