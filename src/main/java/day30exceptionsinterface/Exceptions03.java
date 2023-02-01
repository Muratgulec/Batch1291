package day30exceptionsinterface;

public class Exceptions03 {

    public static void main(String[] args) {

        getStudentGrade(98);

    }

    public static void getStudentGrade(int grade){

        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student's grade cannot be less than zero greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println(grade);
        }

    }

}