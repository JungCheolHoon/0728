import java.util.Scanner;
public class Practice3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Client jimin = new Client();
		System.out.println("Name : ");
		jimin.name = sc.nextLine();
		System.out.println("Age : ");
		jimin.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Gender(남성 : m / 여성 : f) : ");
		String gender = sc.nextLine();
		jimin.gender = gender.charAt(0);
		System.out.println("Weight : ");
		jimin.weight = sc.nextDouble();
		System.out.println("Height : ");
		jimin.height = sc.nextDouble();
		
		double bmi = jimin.weight / ((jimin.height*0.01)*(jimin.height*0.01));
//		bmi = bmi *10000;
		jimin.bmi = bmi;
		
		if(jimin.bmi>=35) {
			jimin.result = "고도 비만";
		}
		else if(jimin.bmi>=30) {
			jimin.result = "중도 비만(2단계 비만)";
		}
		else if(jimin.bmi>=25) {
			jimin.result = "경도 비만(1단계 비만)";
		}
		else if(jimin.bmi>=23) {
			jimin.result = "과체중";
		}
		else if(jimin.bmi>=18.5) {
			jimin.result = "정상";
		}
		else {
			jimin.result = "저체중";
		}
		
		System.out.println("<<고객 검진 결과>>");
		System.out.println("이름 : " + jimin.name);
		System.out.println("나이 : " + jimin.age);
		System.out.print("성별 : ");
		System.out.println((jimin.gender == 'm')? "남성" : "여성");
		System.out.println("키 : " + jimin.height);
		System.out.println("체중 : " + jimin.weight);
		System.out.println("BMI지수 : " + jimin.bmi);
		System.out.println("결과 : " + jimin.result);
		System.out.println("Thanks for using");
		
	}
}
