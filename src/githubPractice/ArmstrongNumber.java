package githubPractice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=407,rem,arm=0;
		int cp=num;
		while(num>0)
		{
		  rem=num%10;
		  num=num/10;
		  arm=arm+rem*rem*rem;
		}
		if(arm==cp)
		{
			System.out.println(cp+" Is Armstrong Number");
		}
		else
		{
			System.out.println(cp+" Not Armstrong Number");
		}
	}

}
