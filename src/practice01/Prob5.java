package practice01;
import java.util.*;
public class Prob5 {

	public static void main(String[] args) {
		System.out.println("1~99 369 game");
		//정수로 받은 값을 문자열로 바꿔서 사용
		for(int i = 1 ; i <100 ; ++i){
			String str = String.valueOf(i);
			int length = str.length(); 
			if(length==1 && (str.charAt(0)=='3'||str.charAt(0)=='9'||str.charAt(0)=='6')){
				System.out.print(str);
				System.out.println("짝");	
				
			}else if(length==2 && (str.charAt(0)=='3'||str.charAt(0)=='9'||str.charAt(0)=='6') ){
					System.out.print(str);
					System.out.print("짝");
					if(str.charAt(1)=='3'||str.charAt(1)=='9'||str.charAt(1)=='6'){
						System.out.print("짝");
					}System.out.println();
				
			}
		}
		
		
		
	}	
}
