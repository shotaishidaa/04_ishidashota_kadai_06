package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class colLesson04 {

    public static void main(String[] args ) {
        //        Wordのクラスをインスタンス化
        ArrayList<Word> words = new ArrayList<>();


//        コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力してください。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;
        while (!input.equals("e")) {
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0], tmp[1]);
            words.add(wd);

            index++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            input = sc.nextLine();


            try {
                words.add (wd);

            } catch (IndexOutOfBoundsException e) {
                System.out.println("登録制限を越えました。登録済みデータは以下になります。");
                break;

            }

        }


        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }





        System.out.println(words.size() + "件、登録しました。");


    }


}
