import java.util.Iterator;

public class ForDemo {
	public static void main(String[] args) {
		
//		for(int i=1;i<=20;i++) {
//			if(i%3 ==0) {
//				System.out.println(i);
//			}
//		}
//		int i =1;
//		while(i<10) {
//			
//			System.out.print(i + "\t");
//			
//			i=i+2;
//		}
		//20부터 180까지 숫자를 출력하되, 7의 배수를 출력하되 한 줄에 5개씩만 출력하시오.
		int num = 0;
		for(int i = 20;i<=180 ; i++) {
			if(i%7 == 0) {
				System.out.print(i +"\t" );
				num++;
				if(num %5==0) {
					System.out.println();
				}
			}
		}
	}
}
