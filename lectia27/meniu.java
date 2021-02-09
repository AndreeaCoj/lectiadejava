package lectia27;

import java.util.Scanner;
import java.util.ArrayList;

public class meniu 

{
	public static void drawMenu()
	{
		System.out.println("1. Add an item ");
		System.out.println("2. Delete an item ");
		System.out.println("3. Display the list content");
		System.out.println("4. Check if empty");
		System.out.println("5. Check if full");
		System.out.println("6. Exit the program");
		System.out.println();
		
		System.out.println(" Please enter the number of the action and press enter");
	}
	
	
	public static void main(String[] args) 
	{
		int op=0;
			
		Scanner sc = new Scanner(System.in);		
		ArrayList<Integer> al= new ArrayList(); 
		
		while (op!=6)
		{
			drawMenu();
			op = sc.nextInt();
			if(op==1)
			{
				int nr;
				System.out.println("Please enter the element to be added to the list");
				nr = sc.nextInt();
				al.add(nr);
			}
			if(op==2)
			{
				int elem,pos;
				int i,n;
				System.out.println("Please enter the element to be deleted from the list");
				elem = sc.nextInt();
				n = al.size();
		
				pos = -1;
				for (i=0;i<n; i++)
				{
					if (al.get(i) == elem)
					{
						pos = i;
					}
				}
				
				if (pos != -1)
				{
					al.remove(pos);
				}
				
				
			}
			if(op==3)
			{
				int i,n;
				n = al.size();
				for (i=0; i<n; i++)
				{
					System.out.print(al.get(i) + " ");
				}
			}
			System.out.println();
			
			if(op==4)
			{
				int i,n;
			
			}
			if(op==5)
			{
				
			}
		
			
	}
	}
}
