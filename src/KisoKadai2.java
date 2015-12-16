import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 try
		 {
				Thread.sleep(1000);
		 }
		 catch (InterruptedException e)
		 {
				e.printStackTrace();
		 }
		 System.out.println("HIGH&LOW!!");
		 System.out.println("");
		 try
		 {
				Thread.sleep(1500);
		 } catch (InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println("please enter the number 1to100.");
	boolean b=true;
		int an = 1+(int)(Math.random()*100);
			while (b) {

					try {
				String s = br.readLine();
				int ans =Integer.parseInt(s);
				if (ans>=101)
				{
					System.out.println("The range is 1-100");
					}
			int in = ans - an;
		if (in>0)
					{
						System.out.println("More low");
					}
					else if(in<0)
					{
						System.out.println("More high");
					}
					else
					{
						System.out.print("Congratulations!");
					}
					} catch (IOException e) {
						System.out.println(e);
					} catch (NumberFormatException e) {
						System.out.println("Please enter in single-byte number");

					}}}}



