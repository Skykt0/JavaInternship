package practice.practice1;

import java.util.Date;

public class Processing 
{
    //remark methods
    public static boolean checkAge(int age)
    {    
        if(age<18){
            System.out.println();
            System.out.println("Remarks: ");
            System.out.println("Minimum age is 18");
            return false;
        }
        else if(age>20){
            System.out.println();
            System.out.println("Remarks: ");
            System.out.println("Maximum age is 20");
            return false;
        }
        return true;
    }

    public static boolean checkMarks(float[] marks)
    {
        for(float e : marks){
            if(e<0){
                System.out.println();
                System.out.println("Remarks: ");
                System.out.println("Marks cannot be less than 0");
                return false;
            }
            else if(e>100){
                System.out.println();
                System.out.println("Remarks: ");
                System.out.println("Marks cannot be greater than 100");
                return false;
            }
        }
        return true;
    }

    public static float marksSum(float[] marks)
    {
        float ans = 0;
        for(float e: marks)
        {
            ans = ans + e;
        }
        return ans;
    }

    public static float percentage(float[] marks)
    {
        float sum = marksSum(marks);
        float percentage = sum/marks.length;
        return percentage;
    }

    public static int getAge(String dob)
    {
        int age;

        String dateOfBirth = "";
        String[] tempString = dob.split("-");
        for(int i=tempString.length-1; i>=0; i--){
            dateOfBirth = dateOfBirth + tempString[i];
        }

        Date d = new Date();
        int currentDate = d.getDate();
        int currentMonth = d.getMonth();
        int currentYear = d.getYear()-100;

        String currentDateMonthYear;

        if(currentMonth<10){
            currentDateMonthYear = "20"+currentYear+"0"+currentMonth+currentDate;
        }
        else{
            currentDateMonthYear = ""+currentDate+currentMonth+"20"+currentYear;
        }

        int tempAge = (Integer.parseInt(currentDateMonthYear) - Integer.parseInt(dateOfBirth));

        String tempStringAge = String.valueOf(tempAge);
        age = Integer.parseInt(tempStringAge.substring(0,2));

        return age;
    }    
}
