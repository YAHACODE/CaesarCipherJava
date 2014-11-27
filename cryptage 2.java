/**
 * @(#)cryptage.java
 *
 *
 * @author 
 * @version 1.00 2014/3/14
 */


public class cryptage {

String mot;
int cle;
public cryptage(String m,int c)
{
	mot=m;
	cle=c;
}


void chiffrement()
{
	for(int i=0;i<mot.length();i++)
	{
		int lettre=((int)mot.charAt(i))-97;
		int chif=((lettre+cle)%26)+97;
		char fin=(char)chif;
		
		System.out.print(fin);
	}
}

public static void main (String[] args)
{
	cryptage cry=new cryptage("saluttouslesmondedansnotreprogramme",3);
	cry.chiffrement();
}
    
}