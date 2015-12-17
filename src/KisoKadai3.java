import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		System.out.println("■テキストファイルの読み書きプログラム■");
			 while(true){
		System.out.println("●メインメニュー●");
		System.out.println("実行するコマンドを選択してください");
		System.out.println("1.ﾌｧｲﾙ作成　2.ﾃｷｽﾄ操作　3.終了");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sts = null;

		try {
			sts = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch(sts){

			case"1":
				while(true){
					System.out.println("●ﾌｧｲﾙ作成メニュー●");
					System.out.println("1.新規ﾌｧｲﾙ作成　2.既存ファイルの削除　3.ﾒｲﾝﾒﾆｭｰに戻る");
					try {
						sts = br.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					switch(sts){
					case"1":
						System.out.println("作成する場所とファイル名を指定してください");
						System.out.println("ﾌｫﾙﾀﾞが無い場合新たに作成します");
						System.out.println("c:/.../ファイル名　のような形で入力してください");
						try {
							sts = br.readLine();
						} catch (IOException e) {

							e.printStackTrace();
						}
						File newfile = new File(sts);
						File di=new File(newfile.getParent());
						if(!di.exists()){
							di.mkdirs();
							try {
								if(newfile.createNewFile()){
									System.out.println("ﾌｧｲﾙの作成に成功\n"+newfile.getAbsolutePath());
								}else{
									System.out.println("ﾌｧｲﾙの作成に失敗");
								}
							} catch (IOException e) {
								e.printStackTrace();
							}
						} else {
					try{
						if(newfile.createNewFile()){
						System.out.println("ﾌｧｲﾙの作成に成功\n"+newfile.getAbsolutePath());
					}else{
						System.out.println("ﾌｧｲﾙの作成に失敗");
					}
				  }catch(IOException e){
					  System.out.println(e);

				}
						continue;}
					case"2":
						System.out.println("削除するファイル名を指定してください");
						System.out.println("c:/.../ファイル名　のような形で入力してください");
						try {
							sts = br.readLine();
						} catch (IOException e) {

							e.printStackTrace();
						}
						File file = new File(sts);

						if(file.exists()){
							if(file.delete()){
								System.out.println(sts+"を削除しました");
							}else{
								System.out.println("ﾌｧｲﾙ削除できません");
							}
						}else{
							System.out.println("ﾌｧｲﾙが見つかりません");
						}
						continue;
					case"3":
						System.out.println("メインメニューに戻ります");
						break;
					default:
						System.out.println("半角の1～3で入力してください");
						continue;}
				break;}
				continue;


			case"2":
			while(true){
				System.out.println("●テキスト操作メニュー●");
				System.out.println("1.ﾃｷｽﾄ閲覧　2.新規ﾃｷｽﾄ　3.ﾃｷｽﾄの上書き　4.ﾒｲﾝﾒﾆｭｰに戻る");
				try {
					sts = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				switch(sts){

					case"1":

						System.out.println("閲覧するﾌｧｲﾙを指定してください");
						System.out.println("c:/.../ファイル名　のような形で入力してください");
						try {
							sts = br.readLine();
						} catch (IOException e) {
							e.printStackTrace();
						}
						File file = new File(sts);
					try{
						if(checkBeforeReadfile(file)){

						BufferedReader bs = new BufferedReader(new FileReader(file));
					String str;
					while((str = bs.readLine())!= null){
						System.out.print(str);
						}

					bs.close();
					}else{
						System.out.println("ﾌｧｲﾙが見つからないか開けません");
					}
					}catch(FileNotFoundException e){
						System.out.println(e);
					}catch(IOException e){
						System.out.println(e);}
					continue;
					case"2":
						BufferedReader brs = new BufferedReader(new InputStreamReader(System.in));
						BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
						String sts2=null;
						String str=null;
						System.out.println("使用するﾌｧｲﾙを指定してください");
						System.out.println("c:/.../ファイル名　のような形で入力してください");
						try {
							sts2 = brs.readLine();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("ﾃｷｽﾄを入力してください");
						try {
							str = br2.readLine();
						} catch (IOException e) {
							e.printStackTrace();
						}
						try{
							File file2 = new File(sts2);
							if(checkBeforeWritefile(file2)){
							BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

							bw.write(str);
								bw.newLine();
						bw.close();
							System.out.println("ﾌｧｲﾙに書き込みました");
							}else{
								System.out.println("ﾌｧｲﾙに書き込みできません");
							}
						}catch(IOException e){
							System.out.println(e);
						}continue;
					case"3":
						BufferedReader brs2 = new BufferedReader(new InputStreamReader(System.in));
					BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
					String sts3=null;
					String str2=null;
					System.out.println("使用するﾌｧｲﾙを指定してください");
					System.out.println("c:/.../ファイル名　のような形で入力してください");
					try {
						sts3 = brs2.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("ﾃｷｽﾄを入力してください");
					try {
						str2 = br3.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
						try{
							File file3 = new File(sts3);
							if(checkBeforeWritefile(file3)){
							BufferedWriter bw = new BufferedWriter(new FileWriter(file3,true));

							bw.write(str2);
							bw.newLine();
					bw.close();
						System.out.println("ﾌｧｲﾙに書き込みました");
						}else{
							System.out.println("ﾌｧｲﾙに書き込みできません");
						}
					}catch(IOException e){
						System.out.println(e);
					}continue;
			case"4":
				System.out.println("メインメニューに戻ります");
				break;
				default:
					System.out.println("半角の1～4で入力してください");
					continue;}break;}continue;



			case"3":
				while(true){
				System.out.println("プログラムを終了してよろしいですか？");

				System.out.println("1.はい　2.いいえ");
			try {
				sts = br.readLine();
			} catch (IOException e) {

				e.printStackTrace();
			}
				switch(sts){
				case"1":
					System.out.println("終了します");

					System.exit(0);
				case"2":
					System.out.println("メインメニューに戻ります");
					break;

					default:
						System.out.println("半角の1か2で入力してください");
						continue;}break;}continue;

					default:
				System.out.println("半角の1～3で入力してください");
				break;}

			 	}



	}

	private static boolean checkBeforeReadfile(File file) {
						if(file.exists()){
							if(file.isFile() && file.canRead()){
						return true;
						}
						}
						return false;}
	private static boolean checkBeforeWritefile(File file){
	    if (file.exists()){
	      if (file.isFile() && file.canWrite()){
	        return true;
	      }
	    }

	    return false;

	}
}

/**
		File dire =new File("c:\\");
		File[]filelist = dire.listFiles();
		for(int i = 0 ; i < filelist.length ; i++){
			if(filelist[i].isFile()){
				System.out.println("[F]" + filelist[i].getName());
			}
			else if(filelist[i].isDirectory()){
				System.out.println("[D]" + filelist[i].getName());
			}else{
				System.out.println("[?]" + filelist[i].getName());
		}
	}}}

		/**　ﾊﾟｽ取得
	    File file = new File("test.txt");
	    String path = file.getAbsolutePath();

	    System.out.println("File：" + path);
	    */

		/**ファイル作成
		  File newfile = new File("C:\\新しいフォルダー\\newfile.txt");


		try{
			if(newfile.createNewFile()){
			System.out.println("ﾌｧｲﾙの作成に成功");
		}else{
			System.out.println(ﾌｧｲﾙの作成に失敗");
		}
	  }catch(IOException e){
		  System.out.println(e);
	  }
*/

		/**　ファイル削除
		File file = new File("c:\\新しいフォルダー\\newfile.txt");

		if(file.exists()){
			if(file.delete()){
				System.out.println("ﾌｧｲﾙ削除しました");
			}else{
				System.out.println("ﾌｧｲﾙ削除できません");
			}
		}else{
			System.out.println("ﾌｧｲﾙが見つかりません");
		}
		*/

/**　テキスト出力
		try{
			File file = new File("c:\\新しいフォルダー\\test.txt");
		if(checkBeforeReadfile(file)){
			BufferedReader br = new BufferedReader(new FileReader(file));

		String str;
		while((str = br.readLine())!= null){
			System.out.print(str);
			}

		br.close();
		}else{
			System.out.println("ﾌｧｲﾙが見つからないか開けません");
		}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
	}


	private static boolean checkBeforeReadfile(File file) {
		if(file.exists()){
			if(file.isFile() && file.canRead()){
		return true;
		}
		}
		return false;

*/

		/** テキスト入力

		try{
			File file = new File("c:\\新しいフォルダー\\test.txt");
			if(checkBeforeWritefile(file)){
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));

			bw.write("あおおあ");
				bw.newLine();
		bw.close();
			}else{
				System.out.println("ﾌｧｲﾙに書き込みできません");
			}
		}catch(IOException e){
			System.out.println(e);
		}
		}



	private static boolean checkBeforeWritefile(File file){
	    if (file.exists()){
	      if (file.isFile() && file.canWrite()){
	        return true;
	      }
	    }

	    return false;

	  */

		/**テキスト追記

		try{
			File file = new File("c:\\新しいフォルダー\\test.txt");
			if(checkBeforeWritefile(file)){
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));

			bw.write("あおおあ");
				bw.newLine();
		bw.close();
			}else{
				System.out.println("ﾌｧｲﾙに書き込みできません");
			}
		}catch(IOException e){
			System.out.println(e);
		}
		}



	private static boolean checkBeforeWritefile(File file){
	    if (file.exists()){
	      if (file.isFile() && file.canWrite()){
	        return true;
	      }
	    }

	    return false;

	  */



