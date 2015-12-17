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
public class KisoKadai1 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num =0, num2=0;

		System.out.println("●九九表●");
		while(true){
			System.out.println("縦軸の数値を整数の1-100で指定してください");
			try {
				str = br.readLine();

			num =Integer.parseInt(str);
			if(num == 0 || num >=101)
				{System.out.println("整数の1-100で入力してください");continue;
			}else{
			System.out.println("横軸の数値を整数の1-100で指定してください");}
				str = br.readLine();
			num2 =Integer.parseInt(str);
			if(num2 == 0 || num2 >=101)
			{System.out.println("整数の1-100で入力してください");continue;
			}else{}
				break;}
			catch (IOException e) {
					System.out.println(e);}
			catch (NumberFormatException e) {
				System.out.println("エラーです。はじめからやり直してください。");
				}}
				int x=num;
				int y=num2;
			for( int i=1; i<=x; i++){
				for( int j=1; j<=y; j++){

				System.out.printf(" %5d",i*j);

				}System.out.println();}

			}

		}

