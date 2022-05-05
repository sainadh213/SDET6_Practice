package githubPractice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=989,rev=0,rem;
		int cp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		
   if(cp==rev)
   {
	System.out.println("is Palindorm number");
   }
   else
  {
	System.out.println("is not Palindorm number");}
	 }

  }
