package com.company;

public class MyConverters {
    public String convertMinutesToYearsAndDays(long minutes){
        if (minutes<60) return "Invalid Value";else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;
            long hours = ((minutes % 525600) % 1440) / 60;
            long rMinutes = ((minutes % 525600) % 1440) % 60;
            return (minutes + " Minutes --> " + years + ":YY  " + days + ":D " + hours + ":H " + rMinutes + ":M");
        }
    }



}
