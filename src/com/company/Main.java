package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main{


    public static  ArrayList<String> Administration = new ArrayList<>();
    public static  ArrayList<String> Faculty = new ArrayList<>();
    public static  ArrayList<String> Staff = new ArrayList<>();
    public static  ArrayList<String> Student = new ArrayList<>();

    public static Person newPerson;
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        MainMenu();

    }

    public static void MainMenu(){
        System.out.println("""
                Please Enter\s
                1 To Add New Person
                2 To Search
                3 To Exit""");


        int selected = input.nextInt();

        if(selected == 1)
            AddPeople();
        else if(selected == 2)
            SearchPeople();
        else ExitProgram();
    }


    public static void AddPeople(){
        System.out.println("How many People do you need to add?");


        int numOfPeopleToAdd = input.nextInt();
        while (numOfPeopleToAdd > 0)
        {
            newPerson = new Person();
            System.out.println("Please Enter First Name:");
            //for some reason first name kept getting skipped
            //added code in twice and it fixed it?????
            newPerson.fName = input.nextLine();
            newPerson.fName = input.nextLine();
            System.out.println("Please Enter Middle Name:");
            newPerson.mName = input.nextLine();
            System.out.println("Please Enter Last Name:");
            newPerson.lname= input.nextLine();
            System.out.println("Please Enter Date of Birth:");
            newPerson.DOB = input.nextLine();
            System.out.println("Please Enter Social Security Number:");
            newPerson.SSN = input.nextLine();
            System.out.println("Please Enter Phone Number:");
            newPerson.phone = input.nextLine();
            System.out.println("Please Enter Address:");
            newPerson.address = input.nextLine();
            System.out.println("Please Enter Any Allergies:");
            newPerson.allergies = input.nextLine();
            System.out.println("""
                    Please Select Type:
                    1 For Administration 
                    2 For Staff
                    3 For Faculty
                    4 For Student""");
            int cateogory = input.nextInt();
            if(cateogory == 1)
            {
                newPerson.type ="Administration";
                newPerson.courses ="NA";

                Administration.add(newPerson.fName);
                Administration.add(newPerson.mName);
                Administration.add(newPerson.lname);
                Administration.add(newPerson.DOB);
                Administration.add(newPerson.SSN);
                Administration.add(newPerson.phone);
                Administration.add(newPerson.address);
                Administration.add(newPerson.allergies);
                Administration.add(newPerson.type);
                Administration.add(newPerson.courses);

                System.out.println("New Administrator Successfully Added");

            }
            else if(cateogory == 2)
            {
               newPerson.type ="Staff";
               newPerson.courses ="NA";

                Staff.add(newPerson.fName);
                Staff.add(newPerson.mName);
                Staff.add(newPerson.lname);
                Staff.add(newPerson.DOB);
                Staff.add(newPerson.SSN);
                Staff.add(newPerson.phone);
                Staff.add(newPerson.address);
                Staff.add(newPerson.allergies);
                Staff.add(newPerson.type);
                Staff.add(newPerson.courses);

                System.out.println("New Staff Successfully Added");


            }
            else if(cateogory == 3)
            {
                newPerson.type ="Faculty";
                System.out.println("Please Enter Classes Taught:");
                newPerson.courses = input.nextLine();
                newPerson.courses = input.nextLine();

                Faculty.add(newPerson.fName);
                Faculty.add(newPerson.mName);
                Faculty.add(newPerson.lname);
                Faculty.add(newPerson.DOB);
                Faculty.add(newPerson.SSN);
                Faculty.add(newPerson.phone);
                Faculty.add(newPerson.address);
                Faculty.add(newPerson.allergies);
                Faculty.add(newPerson.type);
                Faculty.add(newPerson.courses);

                System.out.println("New Faculty Successfully Added");


            }
            else if(cateogory == 4)
            {
                newPerson.type = "Student";
                System.out.println("Please Enter Classes Taken");
                newPerson.courses = input.nextLine();
                newPerson.courses = input.nextLine();

                Student.add(newPerson.fName);
                Student.add(newPerson.mName);
                Student.add(newPerson.lname);
                Student.add(newPerson.DOB);
                Student.add(newPerson.SSN);
                Student.add(newPerson.phone);
                Student.add(newPerson.address);
                Student.add(newPerson.allergies);
                Student.add(newPerson.type);
                Student.add(newPerson.courses);

                System.out.println("New Student Successfully Added");


            }

            numOfPeopleToAdd --;


        }
        MainMenu();

    }

    public static void SearchPeople(){

        System.out.println("""
                Please Enter\s
                1 To Search Administration
                2 TO Search Staff
                3 To Search Faculty
                4 To Search Student""");

        int selected = input.nextInt();
        String search;
        if(selected == 1){
            System.out.println("Enter Search Keyword");
            search = input.nextLine();
            search = input.nextLine();
            if(Administration.contains(search))
            {
                SearchResult();
                MainMenu();
            }
            else
                InvalidSearch();
        }
        if(selected == 2){
            System.out.println("Enter Search Keyword");
            search = input.next();
            if(Staff.contains(search))
            {
                SearchResult();
                MainMenu();
            }
            else
                InvalidSearch();
        }
        if(selected == 3){
            System.out.println("Enter Search Keyword");
            search = input.next();
            if(Faculty.contains(search))
            {
                SearchResult();
                MainMenu();
            }
            else
                InvalidSearch();
        }
        if(selected == 4){
            System.out.println("Enter Search Keyword");
            search = input.next();
            if(Student.contains(search))
            {
                SearchResult();
                MainMenu();
            }
            else
                InvalidSearch();
        }

    }

    public static void ExitProgram(){
        System.exit(0);
    }

    public static void SearchResult(){
        System.out.println("Search Result: \n"
                + newPerson.fName +"\n"
                + newPerson.mName +"\n"
                + newPerson.lname +"\n"
                + newPerson.DOB +"\n"
                + newPerson.SSN +"\n"
                + newPerson.phone +"\n"
                + newPerson.address +"\n"
                + newPerson.allergies +"\n"
                + newPerson.type +"\n"
                + newPerson.courses +"\n");
    }


    public static void InvalidSearch()
    {
        System.out.println("Sorry We Couldn't Fnd That");
        System.out.println("Would You Like to Search Again?\n" +
                "y or n");
        String response = input.next();

        if(response.equals("Y") || response.equals("y"))
            SearchPeople();
        else
            MainMenu();
    }
    public static class Person  {

        String fName;
        String mName;
        String middlel;
        String lname;
        String DOB;
        String SSN;
        String phone;
        String address;
        String allergies;
        String type;
        String courses;
        public Person() {
        }

    }

}
