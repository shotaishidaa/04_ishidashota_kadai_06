package com.company;

import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args ){

//

        Word w = new Word();
        Scanner scanner = new Scanner(System.in);

        String[][] group = new String[10][10];


        boolean wordImport = true;
        while (wordImport == true) {



            System.out.println("次の単語と意味を入力してください。eで終了します。");
            String word = scanner.next();
            String meaning = scanner.next();

            if( word == "e"){
                break;}

            continue;




        }
        System.out.println("");


        for(int i=0 ; i<group.length; i++) {
            System.out.println("単語:" + group[i] + "意味:" + group[i] );

        }


    }
}
