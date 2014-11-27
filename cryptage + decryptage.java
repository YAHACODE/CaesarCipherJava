/**
 * @(#)cryptage.java
 *
 *
 * @author 
 * @version 1.00 2014/3/14
 */

import java.io.*;
public class cryptage {

String mot;
int cle;
int ch;
public cryptage()
{

}
   
  
  int choix()
  {
  	
  	try
  	{
	  	System.out.print("donner votre choix: 1=Cryptage et 2=Decryptage: ");
	  	BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
	  	ch=Integer.parseInt(bf1.readLine());
	  	
	  	
  	}
  	catch(Exception e ){}
  	return ch;
  }
  
   
  void Saisir()
  {
  	
  	try
  	{
	  	System.out.print("donner les mots en claire ");
	  	BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
	  	mot=bf1.readLine();
	  	
	  	System.out.print("donner un cle=");
	  	BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
	  		
	  	cle=Integer.parseInt(bf2.readLine()+"");
  	}
  	catch(Exception e ){}
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


void dechiffrement()
{
	for(int i=0;i<mot.length();i++)
	{
		int lettre=((int)mot.charAt(i))-97;
		int chif=((lettre-cle)%26)+97;
		char fin=(char)chif;
		
		System.out.print(fin);
	}
}

public static void main (String[] args)
{
	cryptage cry=new cryptage();
	cry.Saisir();
	
	if(cry.choix()==1)
		cry.chiffrement();
	else
		cry.dechiffrement();

}
    
}