package methodRef;

import java.util.Scanner;

interface Game
{
	void run();
}


class Ps5Console
{
	public void loadGame(Game game) 
	{
		game.run();
	}
}

class spuerMario implements Game
{
	public void run() 
	{
		System.out.println("Now Super mario Game is Run...");
	}	
}

class WwSmackDown implements Game
{
	public void run() 
	{
		System.out.println("Now Ww Smack Down is run...");
	}
}

class GodOfwar implements Game
{
	public void run() 
	{
		System.out.println("Now God of war is run...");
	}
}

class Gta implements Game
{
	public void run() 
	{
		System.out.println("Now GTA 5 is run...");
	}	
}
public class Program2 
{	
	public static void display() 
	{
		System.out.println("1.spuer Mario");
		System.out.println("2.WwSmackDown");
		System.out.println("3.God Of war");
		System.out.println("4. GTA 5");
		System.out.println("Enter Option to run the game:");
	}
	
	
	public static void StartGame(int ch) 
	{
		Ps5Console console = new Ps5Console();
		switch(ch) 
		{
		case 1:
			console.loadGame(new spuerMario());
			break;
		case 2:
			console.loadGame(new WwSmackDown());
			break;
		case 3:
			console.loadGame(new GodOfwar());
			break;
		case 4:
			console.loadGame(new Gta());
			break;
		default:
				System.out.println("Invalid choise!");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		int ch;
		int close=0;
		
		do{	
			System.out.println("Welcome to PS5...");
			Program2.display();
			ch=scanner.nextInt();
			Program2.StartGame(ch);
			
			System.out.println("Continue press 1 or close game 0");
			close=scanner.nextInt();
		}while(close!=0);
		
	}
}
