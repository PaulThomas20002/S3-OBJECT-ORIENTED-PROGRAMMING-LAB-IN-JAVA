/*   Write a java program which creates a class named employee and have following member name, date, phone number, address, salary .
It also has a method to print salary which prints the salary which prints the salary of employee.
2 classes offices and manager have data members specialization and department.
Now assign name , age, Phone number, address and salary to an officer and a manager .
by making an object of both of this classes and print the same.*/

class employee{
    String name;
    int age;
    double phonnum;
    String address;
    double salary;
    
    void printall(){
        System.out.println("Name : "+ name+"\nAge : "+ age+"\nPhone Number : "+phonnum+"\nAddress : "+address+"\nSalary : "+salary);
    }
    void printsalary(){
        System.out.println(name+" "+salary);
    }
}
class officer extends employee{
    String department;
    String specialization;
    
}
class manager extends employee{
    String department;
    String specialization;   
}

class employee{
    public static void main(String []args){
        officer o = new officer();
        o.name="Paul Thomas";
        o.age = 19;
        o.phonnum = 200;
        o.salary = 4334;
        o.address = "India";
        o.printsalary();
        System.out.println("More Details");
        o.printall();
    }
}
