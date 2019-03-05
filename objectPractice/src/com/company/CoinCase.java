
//硬貨􏰀入れ物クラス、CoinCase を作成しましょう。
//1. 500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
//2. AddCoins メソッド􏰃硬貨を追加する。引数􏰁硬貨􏰀種類( int )􏰂枚数( int )
//3. GetCount メソッド􏰃、指定した硬貨が、何枚あるかを取得する。引数􏰁硬貨􏰀種類( int )、戻り値􏰁枚数( int )
//4. GetAmount メソッド􏰃硬貨􏰀総額を取得する。戻り値􏰁硬貨􏰀総額( int )
//
package com.company;

public class CoinCase {

    private int count_500;
    private int count_100;
    private int count_50;
    private int count_10;
    private int count_5;
    private int count_1;


    public void AddCoins(int type, int count) {

        if (type == 500) {
            this.count_500 = this.count_500 + count;
        } else if (type == 100) {
            this.count_100 = this.count_100 + count;
        } else if (type == 50) {
            this.count_50 = this.count_50 + count;
        } else if (type == 10) {
            this.count_10 = this.count_10 + count;
        } else if (type == 5) {
            this.count_5 = this.count_5 + count;
        } else {
            this.count_1 = this.count_1 + count;
        }

    }

    public int GetCount(int type) {
        if (type == 500) {
            return this.count_500;
        } else if (type == 100) {
            return this.count_100;
        } else if (type == 50) {
            return this.count_50;
        } else if (type == 10) {
            return this.count_10;
        } else if (type == 5) {
            return this.count_5;
        }
        return this.count_1;
        }


    public int GetAmount(){
        return 500 * count_500 + 100 * count_100 + 50 * count_50 + 10 * count_10 + 5 * count_5 + 1 * count_1;
    }
}


//    public int[] numbers = { 500, 100, 50, 10, 5, 1 };
//    public int count ;
//
//
//    public void AddCoins() {
//        System.out.println("硬貨を入力してください");
//        int numbers = new java.util.Scanner(System.in).nextInt();
//        System.out.println("枚数を入力してください");
//        int count = new java.util.Scanner(System.in).nextInt();
//
//    }
//    public void GetCount() {
//
//
//
//
//    }
//    void GetAmount(){
//
//    }




