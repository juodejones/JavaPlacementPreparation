package com.practice_package;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nothing {

    public static void main(String[] args) {

    }

    private static int deleteMails(Map<Long, String> mailsReceived) {
        Map<Long, String> newMap = new HashMap<>();
        for (Map.Entry<Long, String> entry: mailsReceived.entrySet()) {
            if (newMap.containsKey(entry.getKey())) {
                // do nothing
            } else {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return mailsReceived.size()-newMap.size();
    }

    private static boolean survive(int bullet, int dragons) {
        return (dragons*2)<=bullet;
    }
}

class Mail {
    private long rollno;
    private String mail;

    public Mail(long rollno, String mail) {
        this.rollno = rollno;
        this.mail = mail;
    }

    public long getRollno() {
        return rollno;
    }

    public void setRollno(long rollno) {
        this.rollno = rollno;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
//
//[10:56] Deepaksurya Mohana Murali
//
//        The principal has a problem with repetitions.
//        Everytime someone sends the same email twice he becomes angry and starts yelling.
//        His personal assistant filters the mails so that all the unique mails are sent only once,
//        and if there is someone sending the same mail again and again, he deletes them.
//        Write a program which will see the list of roll numbers of the student and find how many emails
//        are to be deleted

//
//[10:52] Deepaksurya Mohana Murali
//
//        A hero is on his way to the castle to complete his mission.
//        However, he's been told that the castle is surrounded with a couple of powerful dragons!
//        each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.
//        Assuming he's gonna grab a specific given number of bullets and move forward to fight
//        another specific given number of dragons, will he survive?
//        Return true if yes, false otherwise :)