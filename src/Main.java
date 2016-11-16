import Classes.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

/*
        Employee employee = new Employee();

        employee.setName("Christian");
        employee.setGender(true);
        employee.setAge(17);
        employee.setWeight(33f);
        employee.setHeight(153f);
        employee.setEmail("123@abc.com");
        employee.setDepartment("IT");
        employee.setSssID(123f);
        employee.setPagibigID(445f);
        employee.setEmployeeID(1993f);


        System.out.println(" ----Employee----");
       // System.out.println("Hi, I am " + employee.introduceYourself());
        System.out.println("Hi, I am " + employee.introduceYourself("Christian"," from Talamban "+ employee.getDepartment()) + " Department");
        System.out.println("Name: " + employee.getName());
        System.out.println("Gender: " + employee.isGender());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Weight: " + employee.getWeight()+ "kg");
        System.out.println("Height: " + employee.getHeight()+ "cm");
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("SSS ID: " + employee.getSssID());
        System.out.println("Pagibig ID: " + employee.getPagibigID());
        System.out.println("Employee ID: " + employee.getEmployeeID());

        Customer customer = new Customer();

        customer.setName("Christian");
        customer.setGender(true);
        customer.setAge(17);
        customer.setWeight(33f);
        customer.setHeight(153f);
        customer.setEmail("123@abc.com");
        customer.setCustomerID(123f);
        customer.setMembershipLevel("Premium");
        customer.setCreditcardNumber(554f);

        System.out.println("\n ----Customer----");
        System.out.print("Hi, I am "+ customer.introduceYourself() );
        System.out.println("\nHi, I am " + customer.introduceYourself("Christian","Nino"));
        System.out.println("Name: " + customer.getName());
        System.out.println("Gender: " + customer.isGender());
        System.out.println("Age: " + customer.getAge());
        System.out.println("Weight: " + customer.getWeight()+ "kg");
        System.out.println("Height: " + customer.getHeight()+ "cm");
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Department: " + customer.getCustomerID());
        System.out.println("SSS ID: " + customer.getMembershipLevel());
        System.out.println("Pagibig ID: " + customer.getCreditcardNumber());




    Person PersonObject = new Person();

        PersonObject.setName("Christian");
        PersonObject.setGender(true);
        PersonObject.setAge(17);
        PersonObject.setWeight(33f);
        PersonObject.setHeight(153f);
        PersonObject.setEmail("123@abc.com");



        System.out.println("Name:" + PersonObject.getName());
        System.out.println("Gender:" + PersonObject.isGender());
        System.out.println("Age:" + PersonObject.getAge());
        System.out.println("Weight:" + PersonObject.getWeight()+ "kg");
        System.out.println("Height:" + PersonObject.getHeight()+ "cm");
        System.out.println("Email:" + PersonObject.getEmail());



            int num=3;
            if(num>3){
                System.out.println(num + " is less than 3");
                }else {
                System.out.println(num + " is greater than or equal to 3");
            }
*/

/*
            int totalStudent=20;
            String sched="Monday";
            String teacher[] = new String[5];
                teacher[0] = "Math";
                teacher[1] = "English";
                teacher[2] = "Science";
                teacher[3] = "OOP";
                teacher[4] = "ServMain";

        if (sched=="Monday" && totalStudent<=15){
            System.out.println( "Monday" + " Current Subject is " + teacher[0] + " and has less than 15 students" );
        }
        else if (sched=="Tuesday" && totalStudent==20){
            System.out.println("Tuesday" + " Current Subject is " + teacher[2] + " and has 20 students");
        }
        else if (sched=="Tuesday" && totalStudent>20 ){
            System.out.println(" Current Subject is " + teacher[1] + " and has more than 20 students");
            System.out.println(" Current Subject is " + teacher[3] + " and has more than 20 students");
            System.out.println(" Current Subject is " + teacher[4] + " and has more than 20 students");
        }
*/

/*
        boolean weekday=true;
        boolean weekend=true;
        boolean holiday=true;

        if (weekday==true && weekend==false && holiday==false){
            System.out.println("Not Vacation");
        }else if (weekday==true && weekend==false && holiday==true){
            System.out.println("Vacation");
        }else if (weekday==false && weekend==true && holiday==false){
            System.out.println("Vacation");
        }else if (weekday==false && weekend==true && holiday==true){
            System.out.println("Vacation");
        }
*/


        boolean student = false; //true regular
        boolean working = false; //true working

        /*
        if ((!student && working) || (student && working)) {
            System.out.println("6 Subjects");
        } else if (!student && !working) {
            System.out.println("5 Subjects");
        } else {
            System.out.println("7 Subjects");
        }
        */

        if ((Student.isStudent(false) && Student.isStudent(true)) || (Student.isStudent(true) && Student.isStudent(true))) {
            System.out.println("6 Subjects");
        } else if (Student.isStudent(false) && Student.isStudent(false)) {
            System.out.println("5 Subjects");
        } else {
            System.out.println("7 Subjects");
        }


       int num = 1;
        char lang='b';

        switch(num){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("zzz");
        }
        switch (lang){
            case 'a':
                System.out.println("this is letter " + lang);
                break;
            case 'b':
                System.out.println("This is letter " + lang);
                break;
            default:
                System.out.println("zzz");
        }


        int sum = MyMethod.setN(1,6);
        System.out.println(" = " +sum);

        int disp = MyMethod.setI(9);
       // System.out.println(disp);
        System.out.println("\n__________________________________");
        int i;
        String myDragons[]={"Nadare","Saiha","Ozawa",};
        for(i=0;i<3;i++ ) {
            System.out.println(myDragons[i]);




        }
        System.out.println("\n__________________________________");


/*
        List<String> myFriends= new ArrayList<String>();
        myFriends.add(0,"Bato");
        myFriends.add(1,"Gart");
        myFriends.add(2,"Duterte");

        List<String> relationsips= new ArrayList<String>();
        relationsips.add(0,"Loves");
        relationsips.add(1,"Hates");
        relationsips.add(2,"Admires");

        List<String> myGirls= new ArrayList<String>();
        myGirls.add(0,"De Lima");
        myGirls.add(1,"Kris Aquino");
        myGirls.add(2,"Mocha Uson");

*/


        switch (randomizer2){
            case 1:
                System.out.print(MyMethod.getMyFriends()+" ");
                System.out.print(MyMethod.getRelationship()+" ");
                System.out.print(MyMethod.getMyGirls()+" ");
                break;
            case 0:
                System.out.print(MyMethod.getMyGirls()+" ");
                System.out.print(MyMethod.getRelationship()+" ");
                System.out.print(MyMethod.getMyFriends()+" ");
                break;
        }

    }

        /*
        byte byteVariable = 127; // range from 128 to 127;
        short mediumRangeDecimalVariable = 32767;
        int decimalVariableUpTo = 2147483647;
        long largeDecimalVariableFrom = -923372036854775808L;
        long largeDecimalVariablUpTo = 923372036854775808L;
        float numberWithDecimalPlaces = 8.2f;
        double veryLargeNumberWithDecimalPlaces = 12312312.1232;
        boolean isTrueOrFalse = true;
        char singleCharacter = '\u0041';
        String name="TEST";

        String errorMessage[] = new String[3];


        errorMessage[0] = "Error 1";
        errorMessage[1] = "Error 2";
        errorMessage[2] = "Error 3";

        System.out.println("Warning:" + errorMessage[0]);
        System.out.println("Warning:" + errorMessage[1]);
        System.out.println("Warning:" + errorMessage[2]);
        */

        /*
        String someText = "this is a string variable";
        System.out.println(byteVariable);
        System.out.println(mediumRangeDecimalVariable);
        System.out.println(decimalVariableUpTo);
        System.out.println(largeDecimalVariableFrom);
        System.out.println(largeDecimalVariablUpTo);
        System.out.println(numberWithDecimalPlaces);
        System.out.println(veryLargeNumberWithDecimalPlaces);
        System.out.println(isTrueOrFalse);
        System.out.println(singleCharacter);
        System.out.println("test" + name);


    //Objects
    Person person = new Person();
    person.setName("MyName");
    */
    }


