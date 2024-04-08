package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        int index = url.indexOf("//");
        String first = url.substring(0, index - 1);
        if (first.equals("https") || first.equals("http")) {
        return first; }
        //else  {

        return "неизвестный";
    }

    public static String checkDomain(String url) {
        int index = url.indexOf(".");
        String last = url.substring(index + 1);
        if (last.equals("com") || last.equals("net") || last.equals("org")
        || last.equals("ru")) {
            return last;
        } else {

        return "неизвестный";
            }
    }
}
