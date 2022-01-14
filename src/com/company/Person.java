package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age=age>0?age:0;
    }
    public boolean isTeen(){
        return (age>12&&age<19) ? true:false;
    }
    public String getFullName(){
        return (firstName.isEmpty() && lastName.isEmpty()) ? "" :
                (firstName.isEmpty()) ? lastName :
                        (lastName.isEmpty()) ? firstName : firstName + " " + lastName;
        }

}
