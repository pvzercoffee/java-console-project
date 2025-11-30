package org.example;

public class LessonPacket {
     private String name;
     String theClass;

     private boolean[] hasWeek;

     private int time;
     private int startPosition;

     private int day;



     public LessonPacket(String name, String theClass,boolean[] hasWeek, int day, int time, int startPosition)
     {
         this.name = name;
         this.theClass = theClass;
         this.hasWeek = hasWeek;
         this.time = time;
         this.startPosition = startPosition;
         this.day = day;
     }

     public String getName()
     {
         return name;
     }
     public void setName(String name)
     {
         this.name = name;
     }
     public String getTheClass()
     {
         return theClass;
     }
     public void setTheClass(String theClass)
     {
         this.theClass = theClass;
     }
     public boolean[] getHasWeek()
     {
         return hasWeek;
     }
     public void setHasWeek(boolean[] hasWeek)
     {
         this.hasWeek = hasWeek;
     }

     public int getTime()
     {
         return time;
     }
     public void setTime(int time) {
         this.time = time;
     }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
         String bit = "第";
         for (int i = 0; i < hasWeek.length; i++)
         {
             if(hasWeek[i])
             {
                 bit += (i+1)+"、";
             }
         }
         bit+="周";
        return "课程名称："+name+"；课时安排："+bit+"；星期"+day+"的第"+startPosition+"节开始上"+time+"节课，教室是"+theClass;
    }
}
