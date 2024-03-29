package org.factory.classwork;

public interface WordCount {

    public int countWords(String st);

}

class CountApp{


    WordCount wc = (t)->t.split("\\s+").length;

    String text = "Some apps let you manage background activity, which determines what they can do when they’re in the background and not actively in use. Apps that can run in the background can send and receive notifications, sync information, and stay up to date. If you find that an app is using a lot of battery when running in the background, you can change the setting for apps that allow it.";

     int word = wc.countWords(text);

    public static void main(String[] args) {

        CountApp a =new CountApp();
        System.out.println(a.word);
    }





}
