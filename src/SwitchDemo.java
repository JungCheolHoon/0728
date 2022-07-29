
public class SwitchDemo {
	public static void main(String[] args) {
		int su = 234;
		if(su %2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		switch (su % 2) {
		case 0:
			System.out.println("짝수");
			break;
					
			case 1:
			System.out.println("홀수");
		}
		
	}
}
