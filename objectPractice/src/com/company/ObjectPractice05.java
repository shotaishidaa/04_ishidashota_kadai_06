package com.company;

public class ObjectPractice05 {
    public static void main(String[] args)
    {
        Person person1 = new Person(
                "森田",
                "奈良");
        Person person2 = new Person(
                "木村",
                "埼玉");
        Person person3 = new Person(
                "高山",
                "東京");
        Person person4 = new Person(
                "茂木",
                "沖縄");


//        Persom[] presonArr = {new Person("森田", "奈良"),
//                              new Person("木村", "埼玉"),
//                              new Person("高山", "東京"),
//                              new Person("茂木", "沖縄"),
//
//        }

//        for (int i=0;i < personArr.length; i++){
//            personArr[i].selfIntroduction();
//        }


        person1.attack();
        person2.attack();
        person3.attack();
        person4.attack();

//        person1.selfIntroduction();
//        person2.selfIntroduction();
//        person3.selfIntroduction();
//        person4.selfIntroduction();

    }



}
