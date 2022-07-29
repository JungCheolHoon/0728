
public class Test2 {
	public static void main(String[] args) {
//		int a = 'a'; 		// 65부터 89까지 5의배수
//		System.out.println(a);
//		int b = 'z';    // 102부터 122까지 5개씩
//		System.out.println(b);
		
		int cnt1 = 0;   // 5개마다 줄 변경 넣어주는 변수
		int cnt2 = 0;	// 5개마다 대문자 소문자로 바뀌는 변수
		int cnt3 = 0;	// 대문자 5개나 소문자 5개가 바뀌면 종료되는 변수
		for(int i = 65 ; i<=90;i++) {	
		
			if(cnt1==5) {  	// 대문자 또는 소문자가 5개가 출력 되었을때 실행
				System.out.println();
				cnt1=0;	//줄바꿈 변수 
			}
			
			if(cnt2==5) {	//대문자 5개씩 출력할때마다 카운트 되는 변수
				System.out.print((char)(i+32) + "\t");
				cnt3++;	// 소문자 5개 출력 후 탈출 변수
				cnt1++;	// 소문자 줄바꿈 변수
				if(cnt3==5) {
					cnt3=0;	//소문자 5개 출력 후 탈출 변수
					cnt2=0;	//소문자 5개 출력 후 대문자 5개를 출력하기 위한 탈출 변수
				}
			}
			else {
				System.out.print((char)i + "\t");
				cnt2++;	//대문자 5개씩 출력할때마다 카운트 되는 변수
				cnt1++;	//대문자 줄 바꿈 변수
			}	
		
		}
		
		
		
	}
}
