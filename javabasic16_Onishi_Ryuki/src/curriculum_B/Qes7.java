package curriculum_B;
import java.util.Scanner;

public class Qes7 {


	

public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

	 System.out.print("生徒の人数を入力してください（2以上）：");
	    int 人数 = scanner.nextInt();

	        
	    double[] 英語合計 = new double[人数];
	    double[] 数学合計 = new double[人数];
	    double[] 理科合計 = new double[人数];
	    double[] 社会合計 = new double[人数];

	        
	    for (int i = 0; i < 人数; i++) {
	      System.out.print((i + 1) + "人目の「英語」の点数を入力してください：");
	      double 英語 = scanner.nextDouble();
	      英語合計[i] = 英語;

	      System.out.print((i + 1) + "人目の「数学」の点数を入力してください：");
	      double 数学 = scanner.nextDouble();
	      数学合計[i] = 数学;

	      System.out.print((i + 1) + "人目の「理科」の点数を入力してください：");
	      double 理科 = scanner.nextDouble();
	      理科合計[i] = 理科;

	      System.out.print((i + 1) + "人目の「社会」の点数を入力してください：");
	      double 社会 = scanner.nextDouble();
	      社会合計[i] = 社会;
	      }

	        // 平均点計算
	        double 英語平均 = calculateAverage(英語合計);
	        double 数学平均 = calculateAverage(数学合計);
	        double 理科平均 = calculateAverage(理科合計);
	        double 社会平均 = calculateAverage(社会合計);

	        // 全体の平均点計算
	        double 全体平均 = (英語平均 + 数学平均 + 理科平均 + 社会平均) / 4;

	        // 結果の出力
	        for (int i = 0; i < 人数; i++) {
	            System.out.println((i + 1) + "人目の平均点は" + calculateStudentAverage(英語合計[i], 数学合計[i], 理科合計[i], 社会合計[i]) + "点です。");
	        }

	        System.out.println("全体の平均点は" + 全体平均 + "点です。");
	        System.out.println("英語の平均点は" + 英語平均 + "点です。");
	        System.out.println("数学の平均点は" + 数学平均 + "点です。");
	        System.out.println("理科の平均点は" + 理科平均 + "点です。");
	        System.out.println("社会の平均点は" + 社会平均 + "点です.");

	        scanner.close();
	    }

	   
	    private static double calculateStudentAverage(double 英語, double 数学, double 理科, double 社会) {
	        return (英語 + 数学 + 理科 + 社会) / 4;
	    }

	 
	    private static double calculateAverage(double[] subjectScores) {
	        double 合計 = 0;
	        for (double score : subjectScores) {
	            合計 += score;
	        }
	        return 合計 / subjectScores.length;
	    }
	}	    
	    	
	    
			
			
		
		
		


