package com.company;

public class Person {
    public String name;
    public String from;

    public Person(String input_name, String input_from) {

        name = input_name;
        from = input_from;
    }
//
//public Person(String name, String from) {
//
//    name = name;
//    from = from;
//}

        public void attack() {
            System.out.println("私の名前は" + name + "です。" + from + "出身");

        }
//    public void selfIntroduction() {
//        System.out.println("私の名前は" + this.name + "です。" + this.from + "出身");
//
//    }



    }

