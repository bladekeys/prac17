package com.company;

import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m1 = p1.matcher(in.nextLine());

        if (m1.matches())

            System.out.println(" Строка соответствует шаблону");

        else

            System.out.println(" Строка не соответствует шаблону");



        Pattern p2 = Pattern.compile("^([a-zA-Z]{2}[:]){3}([0-9]{2}[:]){2}[0-9]{2}$");
        Matcher m2 = p2.matcher(in.nextLine());


        if (m2.matches())

            System.out.println(" Строка соответствует шаблону");

        else

            System.out.println(" Строка не соответствует шаблону");


        Randomer r = new Randomer();
        r.generate(1000);

        Pattern p = Pattern.compile("^((\\w)|( )|(.)*((EU)|(USD)|(RUR)))$");

        r.getList().stream().filter(t->p.matcher(t).matches()).forEach(t->System.out.println(t));

    }
}