import java.util.*;
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("체중을 입력해주세요");
		int weight = sc.nextInt();
		System.out.print("키를 입력해주세요");
		int height = sc.nextInt();
		double height1 = (double)height/100;
		
		double  BMI = weight/((height1*height1));
		
		System.out.print("BMI지수 = "+BMI);
		
		if(BMI>=35) {
			System.out.println("고도비만");
		}
		else if(BMI>=30) {
			System.out.println("중도비만(2단계 비만)");
		}
		else if(BMI>=25) {
			System.out.println("경도비만(1단계 비만)");
		}
		else if(BMI>=23) {
			System.out.println("과체중");
		}
		else if(BMI>=18.5) {
			System.out.println("정상");
		}
		else {
			System.out.println("저체중");
		}
		
	}
}
