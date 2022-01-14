package com.company;

public class MyMath {
    public double area(double x){
        return Math.pow(x,2)*Math.PI;
    }
    public double area(double x, double y){
        return x*y;
    }

    public void printEqual(int n1, int n2, int n3){
        if (n1 <=0 || n2<=0 || n3 <= 0) System.out.println("invalid values"); else {
            if (n1 == n2 && n2== n3) System.out.println("All numbers are equal");
            else if (n1 != n2 && n2 != n3 && n1 != n3) System.out.println("All numbers are different");
            else System.out.println("Neither all are equal or different");
        }
    }
    public boolean isPrime(int number){
        if (number==1)return false;
        for (int i = 2 ; i<=(number/2); i++){
            if (number%i==0) return false;
        }return true;
    }
    public static boolean isLeapYear(int year){
        return (year<1||year>=9999) ? false: ((year%4==0)&&(year%100!=0))||(year%400==0);
    }

    public static int getDaysInMonth(int month, int year){
        return ((month<1)||(month>12)||(year<1)||(year>9999))? -1: (isLeapYear(year)&&month==2)? 29: (month==11 || month==4 || month==6 || month==9)? 30: (month==2)? 28: 31;
    }

    public void printFirstThreePrims(int start, int limit){
        if (start<2 || limit == start || limit <2) System.out.println("invalid value or range");
        int counter = 0;
        for (int i =start; i<=limit; i++){
            if(counter==3) {
                System.out.println("The first 3 numbers found and printed. Exiting ....");
                break;
            }
            if (isPrime(i)){
                System.out.println("Found a prime number: "+i);
                counter++;
            }
        }if (counter < 3) System.out.println(counter + " Prime numbers found.");
    }
    public boolean isOdd(int number){
        return (number>0 && number%2!=0);
    }
    public int sumOdd(int start, int limit){
        int sum=0;
        for (int i = start; i<=limit;i++){
            if (isOdd(i)) sum+=i;
        }return sum;

    }
    public boolean isEven(int number){
        return (number%2==0&&number!=0);
    }
    public int sumFirstAndLastDigit(int number){
        if (number<0) return -1;
        int firstDigit=number%10;
        while (number >9){
            number /=10;
        }return ( firstDigit+= number);
    }
    public int getEvenDigitSum(int number){
        if (number <0)return -1;
        int sum =0;
        while (number>0){
            int temp = number%10;
            if (temp%2!=0)sum+=temp;
            number /=10;
        }return sum;
    }
    public int  GreatestCommonDivisor(int n1, int n2){
        if (n1<10 || n2 < 10)return -1;
        int smallest = n1>n2 ? (n2/2+1):(n1/2+1);
        while (smallest >1){
            if (n1 % smallest == 0 && n2 % smallest == 0) break;
                smallest--;
            }
        return smallest;
    }
    public void printFactors(int number){
        if (number<1) System.out.println(-1);
        for (int i = 1; i<= number; i++){
            if (number%i==0) System.out.print(i+", ");
        }
    }
    public boolean perfectNumber(int number){
        if (number<1) return false;
        int sum = 0; int divisor = number/2+1;
        while (divisor>0){
            if (number%divisor==0)sum+=divisor;
            divisor--;
        }return sum==number;
    }
    public boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount<0||smallCount<0||goal<0)return false;
        return ((bigCount*5 + smallCount) >= goal)&& (smallCount >= goal%5);
    }
    public int getLargestPrime(int number) {
        if (number<2)return -1;
        int temp = number/2+1;
        while (temp>2){
            if (number%temp==0)break;
            temp--;
        }return temp;

    }
}
