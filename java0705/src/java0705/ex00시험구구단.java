package java0705;

import java.util.Random;
import java.util.Scanner;
 

public class ex00시험구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int live = 3;
        int high = 0;
        int score =0;
        
        while (live>0){
            int num1 = r.nextInt(8)+2;
            int num2 = r.nextInt(9)+1;
            
            System.out.println("구구단을 외자! 구구단을 외자!");
            System.out.print(num1+" * "+num2+" = ");
            int ans = sc.nextInt();

                if(ans==num1*num2){
                System.out.println("정답!!!");
                score+=1;
                }else{
                    while(ans != num1*num2){
                        System.out.println("땡! 틀렸습니다.");
                        live-=1;
                        System.out.println("남은 목숨 : "+live);
                        if(live==0){
                            break;
                        }
                        System.out.print(num1+" * "+num2+" = ");
                        ans = sc.nextInt();
                    }
                    if(ans == num1*num2){
                    System.out.println("정답!!!");
                    score+=1;
                    }
                }
                       

            if(live==0){
            
                if(high<score){
                    high = score;
                    System.out.println("최고기록 경신!! "+high+"점!");
                }
            
                int yn;
                System.out.println("목숨을 모두 소진하였습니다. 다시 하시겠습니까? (1/2) >> ");
                yn = sc.nextInt();
                if(yn ==1){
                    live = 3;
                    score = 0;
                }
                
            }
            
        }

	}

}
