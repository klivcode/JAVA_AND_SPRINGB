package Class_Excercise;


public class StudentStu {

    public static void assignValues(String name,int rollNo, long phoneNumber, String address)
    {
        System.out.println("Student Details");
        System.out.println("----------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }


    public static void main(String[] args) {
        StudentStu student=new StudentStu();
        student.assignValues("Sam",45,9852456810L,"Kathmandu");
        student.assignValues("John",40,9852458810L,"Abroad");


    }



}
