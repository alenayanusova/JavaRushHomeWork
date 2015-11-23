package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man("kol", 25, "address");
        Man man2 = new Man("pol", 27, "address");
        Woman woman1 = new Woman("sara", 21, "address");
        Woman woman2 = new Woman("molly", 23, "address");

        //выведи их на экран тут
        Man.getMan(man1);
        Man.getMan(man2);
        Woman.getWoman(woman1);
        Woman.getWoman(woman2);
    }

    //добавьте тут ваши классы
    public static class Man{
        String name, address;
        int age;



        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public static void getMan(Man man){
            System.out.println("name " + man.name + " age " + man.age + " address " + man.address);
        }
    }

    public static class Woman{
        String name, address;
        int age;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public static void getWoman(Woman woman){
            System.out.println("name " + woman.name + " age " + woman.age + " address " + woman.address);
        }
    }
}
