/**
 * @(#)tableau.java
 *
 *
 * @author 
 * @version 1.00 2014/3/14
 */


public class tableau 

{

	int tab[]=new int[6] ;
		public  tableau () 
			
		{ tab[0]=3 ;
			tab[1]=5;
				tab[2]=6;
					tab[3]=98;
						tab[4]=9;
							tab[5]=100;
							
			
			
		}			
			
			void recherche()
				
			{
				boolean  test=false;
				int pos=0;
				int x=9;
				
				for(int i=0 ; i <tab.length;i++)
					
				{
					
					if(x==tab[i])
					{
						test=true;
						pos=i;
				
					}
				}
				
				if(test==true)
					System.out.println("valeur existe dans la postion "+ pos );
						else
									System.out.println("valeur n'existe pas ");
			}
	void  affiche()
	{
		for(int i=0;i<tab.length;i++)
			System.out.print("["+ tab[i]+"]" );		
				
	}
	
	void trier()
	{int aux;
		
		for (int i=0;i<tab.length-1 ;i++)
			
		{
			
		for (int j=i;j<tab.length;j++)
			
			
		{
			if(tab[i]<tab[j])
			{
				aux=tab[i];
				tab[i]=tab[j];
				tab[j]=aux;
			}
		}
	}
	}
	
	public static  void main(String args[])
	{
		tableau t1= new tableau ();
		t1.affiche();
		t1.recherche();
		t1.trier() ;
		t1.affiche();
	}		
}
    
    