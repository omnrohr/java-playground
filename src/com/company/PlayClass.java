package com.company;

public class PlayClass {
    public boolean isEqualThreeDecimal(double n1, double n2){
        System.out.println((n1-n2)*1000);
        return (int)((n1-n2)*1000)==0;
    }

    public boolean isLeapYear(int year){
        return (year%4==0&&(year%400==0||year%100!=0));
    }

    public void displayHighScorePosition (String name, int score){
        System.out.println(name + " Manage to get into position.....");
        System.out.println("Your position is " + calculateHighScorePosition(score));
    }
    public byte calculateHighScorePosition(int score){
        byte position = 0;
        if (score > 1000) position = 1;
        else if (score >500) position=2;
        else if (score > 100) position = 3;
        else position = 4;
        return position;
    }

    byte a = 1;
    short b = 10;
    int c = 1000;
    long d = 50000;
    public long sumAll(){
        return d + c *10 + b + a;
    }

    public double convertPoundToKG(double pound){
        return Math.round((pound/0.45359237));
    }

    public void remainderOfFour(){
        double a = 21.00;
        double b = 80.00;
        double c = (a+b)*100;
        double r = c%40;
        boolean result = r == 0? true:false;
        System.out.println(result);
        System.out.println(r);
        if (!result) System.out.println("got remainder......");
    }
    public boolean isCatPlaying(boolean summer, int temperature){
        return ((summer&&temperature<=45&&temperature>=25)|| temperature<=35&&temperature>=25);
    }

    public boolean isPalindrome(int number){
        if (number <100) return false;
        int temp = number;
        int rNumber =0;
        while (temp !=0){
            rNumber = (rNumber*10) + (temp%10);
            temp=temp/10;
        }return rNumber==number;
    }
    public boolean haseSharedDigit(int num1, int num2){
        return (num1>9 && num1<100&&num2>9&&num2<100&&(num1/10==num2/10||num1%10==num2%10||num1%10==num2/10||num1/10==num2%10));
    }
    public boolean haseSameLastDigit(int n1, int n2,int n3){
        int MIN = 10; int MAX=1000;
        boolean valid = (isValid(n1,MIN,MAX)&&isValid(n2,MIN,MAX)&&isValid(n3,MIN,MAX));
        if (valid)
        return (n1%10==n2%10||n1%10==n3%10||n2%10==n3%10);
        else return false;
    }
    public boolean isValid(int number,int min, int max){
        return (number>=min&&number<=max);
    }
    public boolean isValid(int number,int min){
        return (number>=min);
    }
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1) System.out.print("*");
                    else if(column==0) System.out.print("*");
                    else if(column==number-1) System.out.print("*");
                    else if(column==row) System.out.print("*");
                    else if(column==number-1-row) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println(""); //
            }
        }
    }

}
