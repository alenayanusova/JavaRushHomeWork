package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Calendar;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Calendar c = Calendar.getInstance();

        int year = c.get(c.YEAR);
        int month = c.get(c.MONTH);
        int date = c.get(c.DATE);

        month++;
        System.out.println("0" + date + " " + month + " " + year);
    }
}
