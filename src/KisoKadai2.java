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
				Thread.sleep(200);
		 }
		 catch (InterruptedException e)
		 {
				e.printStackTrace();
		 }
		 System.out.println("HIGH&LOW!!");
		 System.out.println("");
		 try
		 {
				Thread.sleep(200);
		 } catch (InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println("1-100の整数を入力してください.");;
		long an = 1+(int)(Math.random()*100);
			while (true) {

					try {
				String s = br.readLine();

				long ans =Long.parseLong(s);
				if(ans > 100 || ans <=0){
					System.out.println("整数の1-100で入力してください");
					continue;}else{
			long in = ans - an;
		if (in>0)
					{
						System.out.println("もっと低いです");
					}
					else if(in<0)
					{
						System.out.println("もっと高いです");
					}
					else
					{
						System.out.print("Congratulations!");
					}
					}
				} catch (IOException e) {
						System.out.println(e);
					} catch (NumberFormatException e) {
						System.out.println("整数の1-100で入力してください");
					}
					}
			}
	}



