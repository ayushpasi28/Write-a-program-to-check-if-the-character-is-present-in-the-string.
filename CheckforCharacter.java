package Practice;

public class CheckforCharacter {
static	int check(String s ,char ch)
	{
	
	char a[]=s.toCharArray();
	for(char c:a)
	{
		if(c==ch)
		{
			return 1;
		}
	}
     return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ayush";
		char ch='b';
	int n=	CheckforCharacter.check(s,ch);
	if(n==1)
	{
		System.out.println("Character Found "+n);
	}
	else
	{
		System.out.println("Character not found "+n);
	}

	}

}
