package array_roop;

public class kadai_1 {

	public kadai_1() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//課題1
		int[][] x = {{3,6,9},{12,15,18},{21,24,27}};
		
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[0][2]);
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		System.out.println(x[1][2]);
		System.out.println(x[2][0]);
		System.out.println(x[2][1]);
		System.out.println(x[2][2]);
		
		System.out.println("x. length" + x. length);
		System.out.println("x[0]. length" + x[0]. length);
		
		//課題2
		int sum;
		int[] num={20,1,2,23,5,11,5,67};
		double avg;
		int median;
		double variance;
		
		// 平均値
		sum = 0 ;
		for(int i=0; i < num.length; i++) {
			sum = sum + num[i];
		}
		avg = (double)sum/num.length;
		System.out.println("平均" + avg);
		//中央値
        int middle = num.length / 2;
        if (num.length % 2 == 0) {
            median = (num[middle - 1] + num[middle]) / 2;
        } else {
            median = num[middle];
        }
        System.out.println("中央値: " + median);
        
        //分散
        double sumOfSquares = 0;
        for (int i = 0; i < num.length; i++) {
            sumOfSquares += Math.pow(num[i] - avg, 2);
        }
        variance = sumOfSquares / num.length;
        System.out.println("分散: " + variance);
        
        //課題3
        int[][] array = {
	        { 1, 8, 12, 17, 20 },
	        { 2, 5, 11, 13, 18 },
	        { 4, 6, 9, 19, 21 }
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
             System.out.print(array[i][j] + " ");
            }
            System.out.println();  // 改行
        }
        //課題4
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            // Print stars
            for (int k = 1; k <= i; k++) {
             System.out.print("$");
            }
             System.out.println();
        	}
        for (int i = 1; i <= rows; i++) {
        for (int j = rows; j > i; j--) {
             System.out.print(" ");
           }
         for (int k = 1; k <= i; k++) {
             System.out.print("$");
          }
         	 System.out.println();
        }
      }
	}
