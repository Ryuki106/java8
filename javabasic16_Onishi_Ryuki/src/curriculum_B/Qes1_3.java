package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
	//1
    Scanner scanner = new Scanner(System.in);
	
	//入力内容を取得
	String input_text = scanner.nextLine();

	// ０以下ornull
	if (input_text == null || input_text.trim().isEmpty()) {
	System.out.println("名前を入力してください");
	// １０文字以内
	} else if (input_text.length() > 10 ) {
	    System.out.println("名前を10文字以内にしてください");     
	//2　半角英数字のみ
	} else if (!input_text.matches("[a-zA-Z0-9]+")) {
		System.out.println("半角英数字のみで名前を入力してください");
	
	// 正常に表示
	}else {
		System.out.println("ユーザー名「" + input_text + "」を登録しました");
		   }
	
	
	//3じゃんけん
    int i = 1;
    
    boolean win = false;  
    	

    while (!win) {
    	 	
    	  
        int 自分の手= new Random().nextInt(3); 
        int 相手の手= new Random().nextInt(3); 
        
        
        System.out.println(input_text + "の手は「" + getHandName(自分の手) + "」");
        System.out.println("相手の手は「" + getHandName(相手の手) + "」");       

        int 結果 = judge(自分の手, 相手の手);

        if (結果 == 0) {
            System.out.println("DRAW あいこ もう一回しましょう！");
        } else if (結果 == 2) {
            System.out.println("やるやん。次は俺にリベンジさせて！");
            win = true;
        } else {
            System.out.println(getWinMessage(相手の手));
            i++ ;
        }
    }

	        System.out.println("じゃんけんを行った合計回数は" + i + "回です");

	        scanner.close();
	    }

	    private static String getHandName(int hand) {
	        switch (hand) {
	            case 0:
	                return "グー";
	            case 1:
	                return "チョキ";
	            case 2:
	                return "パー";
	            default:
	                return "";
	        }
	    }

	    private static int judge(int playerHand, int enemyHand) {
	        return (playerHand - enemyHand + 3) % 3;
	    }

	    private static String getWinMessage(int enemyHand) {
	        switch (enemyHand) {
	            case 0:
	                return "俺の勝ち！負けは次につながるチャンです！ネバーギブアップ！";
	            case 1:
	                return "俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ";
	            case 2:
	                return "俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです";
	            default:
	                return "";
	        }
    	    }

    
	          
	        
	  }


	
	
   
	


  
