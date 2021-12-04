package day4;

public class University {

    public static void main(String[] args) {
        Student student = new Student();
        Student student1=new Student();

        //student
        student.setName("Pooja");
        student.setAge(26);
        student.setSex("Female");
        student.setAddress("3226 Hurst ave");
        student.setFaculty("Graduate");
        student.setStudentClass(4);
        student.setRollNumber(14);

        //output
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSex());
        System.out.println(student.getAddress());
        System.out.println(student.getFaculty());
        System.out.println(student.getStudentClass());
        System.out.println(student.getRollNumber());


        //student1

        student1.setName("Ram");
        student1.setAge(35);
        student1.setSex("Male");
        student1.setAddress("444 Walnut Hill Ln");
        student1.setFaculty("Undergraduate");
        student1.setStudentClass(5);
        student1.setRollNumber(19);


        //output
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getSex());
        System.out.println(student1.getAddress());
        System.out.println(student1.getFaculty());
        System.out.println(student1.getStudentClass());
        System.out.println(student1.getRollNumber());



        Teacher teacher = new Teacher();

        teacher.setName("Santosh");
        teacher.setAge(25);
        teacher.setSex("Male");
        teacher.setAddress("3943 Pleasant Run Rd");
        teacher.setSalary(15000);
        teacher.setSubject("Social");
        teacher.setYearsOfExperience(3);


        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSex());
        System.out.println(teacher.getAddress());
        System.out.println(teacher.getSalary());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.getYearsOfExperience());


    }


}
