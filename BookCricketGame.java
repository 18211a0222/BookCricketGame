import java.util.Scanner;
import java.util.Random;
class BookCricketGame
{
	public static void main(String[] args)
	{
		int oneorzero, openbook, point = 0, score1 = 0, score2 = 0, rounds = 0, pagenumber;
		String player1,player2;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Scanner se = new Scanner(System.in);
		System.out.println(" Welcome To BookCricketGame !! ");
		System.out.print(" Enter 1 To Start Game And For Exit : ");
		oneorzero = sc.nextInt();
		if (oneorzero == 0)
		{
			System.out.println(" EXIT ");
		}
		else
		{
		System.out.print(" Enter Player 1 Name : ");
		player1 = se.nextLine();
		System.out.print(" Enter Player 2 Name : ");
		player2 = se.nextLine();
		System.out.println(" Player: " + player1);
		openbook = 1;
		while (openbook == 1)
		{
			System.out.print(" Enter 1 To Open Book : ");
			openbook = sc.nextInt();
			pagenumber = random.nextInt(300);
			point = pagenumber % 7;
			score1 = score1 + point;
			if (point != 0)
			{
				System.out.println(" Page Number " + pagenumber + "        " + " Point : " + point + "        " + " Score : " + score1);
				rounds++;
			}
			else
			{
				openbook = 0;
				System.out.println(" !!!         OPPS           !!! ");
				System.out.println(" Page Number " + pagenumber + "        " + " Point : " + point + "        " + " Score : " + score1);
			}
		}
		System.out.println(" RAM Total Score : " + score1);
		System.out.println(" RAM Takes " + rounds + " Rounds ");
		System.out.println("");
		System.out.println(" SHYAM Needs " + score1 + " Score In " + rounds + " Rounds To WIN MATCH ");
		System.out.println(" Player: " + player2);
		openbook = 1;
		while (openbook == 1 && rounds != 0 && score2 < score1)
		{
			System.out.print(" Enter 1 To Open Book : ");
			openbook = sc.nextInt();
			pagenumber = random.nextInt(300);
			point = pagenumber % 7;
			score2 = score2 + point;
			if (point != 0)
			{
				System.out.println(" Page Number " + pagenumber + "       Point : " + point + "        Score : " + score2 + "     Rounds left : " + rounds);
				rounds--;
			}
			else
			{
				openbook = 0;
				System.out.println(" Page Number " + pagenumber + "       Point : " + point + "        Score : " + score2 + "     Rounds left : " + rounds);
			}
		}
		if (score2 > score1)
			System.out.println(" !! " + player2 + " Win Match !!");
		else
			System.out.println(" !! " + player1 + " Win Match !!");
		}
	}
}