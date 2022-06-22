package by.academy.classwork.lesson3;

public class Task4 {
    public static void main (String [] arg){
        int s= 370000;
        int sec;
        int m;
        int min;
        int h;
        int hour;
        int day;
        int d;
        int week;
        int w;

        sec = s%60;
        m=(s-sec)/60;
        min=m%60;
        h=(m-min)/60;
        hour = h%24;
        d=(h-hour)/24;
        day= d%7;
        w=(d-day)/7;


        System.out.println(w + " weeks " +  day + " days " +  hour +" hours "+  min + " minutes "+  sec +  " seconds ");

    }
}
