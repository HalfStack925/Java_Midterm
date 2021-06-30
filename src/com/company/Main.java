package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main{

    //Arraylist to store staff
    public static  ArrayList<String> Administration = new ArrayList<>();
    public static  ArrayList<String> Faculty = new ArrayList<>();
    public static  ArrayList<String> Staff = new ArrayList<>();
    public static  ArrayList<String> Student = new ArrayList<>();

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        MainMenu();

    }

    public static void MainMenu(){
        try
        {
            System.out.println("""
                Please Enter\s
                1 To Add New Person
                2 To Search
                3 To Exit""");

            //runs method depending on which number you select
            int selected = input.nextInt();
            if(selected == 1)
                AddPeople();
            else if(selected == 2)
                SearchPeople();
            else ExitProgram();
        }
        catch (Exception e){
            System.out.println("Something went wrong");
             }
       }


    public static void AddPeople(){
        try
        {
            System.out.println("How many People do you need to add?");

            //gathers information and stores in corresponding Arraylist
            int numOfPeopleToAdd = input.nextInt();
            input.nextLine();

            while (numOfPeopleToAdd > 0)
            {
                String fName, mName, lName, DOB, SSN, phone, address, allergies, type, courses;

                System.out.println("Please Enter First Name:");
                fName = "First Name: " + input.nextLine();

                System.out.println("Please Enter Middle Name:");
                mName = "Middle Name: " + input.nextLine();

                System.out.println("Please Enter Last Name:");
                lName = "Last Name: " + input.nextLine();

                System.out.println("Please Enter Date of Birth:");
                DOB = "Date of Birth: " + input.nextLine();

                System.out.println("Please Enter Social Security Number:");
                SSN = "Social Security Number: " + input.nextLine();

                System.out.println("Please Enter Phone Number:");
                phone = "Phone Number: " + input.nextLine();

                System.out.println("Please Enter Address:");
                address = "Address: " + input.nextLine();

                System.out.println("Please Enter Any Allergies:");
                allergies = "Allergies: " + input.nextLine();


                System.out.println("""
                    Please Select Type:
                    1 For Administration 
                    2 For Staff
                    3 For Faculty
                    4 For Student""");

                int category = input.nextInt();
                input.nextLine();
                if(category == 1)
                {
                    type = "Type: Administration";
                    courses = "Courses: NA";
                    Person newPerson = new Person(fName,mName,lName,DOB,SSN,phone,address,allergies,type,courses);

                    Administration.add(newPerson.fName);
                    Administration.add(newPerson.lName);
                    Administration.add(newPerson.mName);
                    Administration.add(newPerson.DOB);
                    Administration.add(newPerson.SSN);
                    Administration.add(newPerson.phone);
                    Administration.add(newPerson.address);
                    Administration.add(newPerson.allergies);
                    Administration.add(newPerson.type);
                    Administration.add(newPerson.courses);

                    System.out.println("New Administrator Successfully Added");
                    System.out.println("");

                }
                else if(category == 2)
                {
                    type = "Type: Staff";
                    courses = "Courses: NA";

                    Person newPerson = new Person(fName,mName,lName,DOB,SSN,phone,address,allergies,type,courses);
                    Staff.add(newPerson.fName);
                    Staff.add(newPerson.lName);
                    Staff.add(newPerson.mName);
                    Staff.add(newPerson.DOB);
                    Staff.add(newPerson.SSN);
                    Staff.add(newPerson.phone);
                    Staff.add(newPerson.address);
                    Staff.add(newPerson.allergies);
                    Staff.add(newPerson.type);
                    Staff.add(newPerson.courses);

                    System.out.println("New Staff Successfully Added");
                    System.out.println("");

                }


                else if(category == 3)
                {
                    type = "Type: Faculty";
                    System.out.println("Please Enter Classes Taught");

                    courses = "Courses: " +  input.nextLine();

                    Person newPerson = new Person(fName,mName,lName,DOB,SSN,phone,address,allergies,type,courses);

                    Faculty.add(newPerson.fName);
                    Faculty.add(newPerson.lName);
                    Faculty.add(newPerson.mName);
                    Faculty.add(newPerson.DOB);
                    Faculty.add(newPerson.SSN);
                    Faculty.add(newPerson.phone);
                    Faculty.add(newPerson.address);
                    Faculty.add(newPerson.allergies);
                    Faculty.add(newPerson.type);
                    Faculty.add(newPerson.courses);

                    System.out.println("New Faculty Successfully Added");
                    System.out.println("");
                }
                else if(category == 4)
                {
                    type = "Type: Student";
                    System.out.println("Please Enter Classes Taken");

                    courses = "Courses: "+ input.nextLine();

                    Person newPerson = new Person(fName,mName,lName,DOB,SSN,phone,address,allergies,type,courses);

                    Student.add(newPerson.fName);
                    Student.add(newPerson.lName);
                    Student.add(newPerson.mName);
                    Student.add(newPerson.DOB);
                    Student.add(newPerson.SSN);
                    Student.add(newPerson.phone);
                    Student.add(newPerson.address);
                    Student.add(newPerson.allergies);
                    Student.add(newPerson.type);
                    Student.add(newPerson.courses);

                    System.out.println("New Student Successfully Added");
                    System.out.println("");
                }

                //subtracts depending on how many people are added at once
                numOfPeopleToAdd --;
            }
            //returns to main menu
            MainMenu();
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
    }

    public static void SearchPeople(){
        //loops through selected Arraylist
        try {
            System.out.println("""
                Please Enter\s
                1 To Search Administration
                2 To Search Staff
                3 To Search Faculty
                4 To Search Student""");

            int selected = input.nextInt();
            input.nextLine();

            if(selected == 1 )
            {
                for(String person : Administration)
                    System.out.println(person);

            }
            if(selected == 2 )
            {
                for(String person : Staff)
                    System.out.println(person);

            }
            if(selected == 3 )
            {
                for(String person : Faculty)
                    System.out.println(person);

            }
            if(selected == 4 )
            {
                for(String person : Student)
                    System.out.println(person);

            }
        }catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
        System.out.println(" ");
        MainMenu();

    }

    public static void ExitProgram(){
        System.exit(0);
    }


    //Person Class
    public static class Person  {


        String fName;
        String mName;
        //String middlel;
        String lName;
        String DOB;
        String SSN;
        String phone;
        String address;
        String allergies;
        String type;
        String courses;

    //Constructor
    public Person(String fName, String mName, String lName, String DOB, String SSN, String phone, String address, String allergies, String type, String courses) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.DOB = DOB;
        this.SSN = SSN;
        this.phone = phone;
        this.address = address;
        this.allergies = allergies;
        this.type = type;
        this.courses = courses;
    }

    public Person() {
        }

    }

}
