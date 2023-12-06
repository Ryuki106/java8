package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class  Qes6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力内容を取得
        String inputText = scanner.nextLine();

        String[] 商品リスト = inputText.split("、");

        for (String 商品 : 商品リスト) {
            switch (商品) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                case "テレビ":
                case "ディスプレイ":
                    int ランダム数 = new Random().nextInt(11);
                    int 残り台数 = 11 - ランダム数;
                    System.out.println(商品 + "の残り台数は" + 残り台数 + "台です");
                    break;
                default:
                    System.out.println("『" + 商品 + "』は指定の商品ではありません");
            }
        }

        scanner.close();
    }
}

		        	
		        
		        
		        
		            
		            
		            
		        
		        
		        
		    
		
		
    
    	
    
		
		
	
	
	


