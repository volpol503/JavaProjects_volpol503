package OneFolder.ClassStudent.Pr_2;

public class Student_Ex2 {
    Student_Ex2(int studentID, String name, String surname, int course){
        this(studentID, name,surname,course,0,0,0);
    }
    Student_Ex2(int studentID2, String name2, String surname2, int course2, double mathAverageGrade2,
                double econoic2sAv2erageGrade2, double foreginLanguageAverageGrade2){
        studentID = studentID2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        econoicsAverageGrade = econoic2sAv2erageGrade2;
        foreginLanguageAverageGrade =foreginLanguageAverageGrade2;
    }
    Student_Ex2(){}
    int studentID;
    String name;
    String surname;
    int course;
    // оценки по 10 - и бальной шкале
    double mathAverageGrade;
    double econoicsAverageGrade;
    double foreginLanguageAverageGrade;

}
class StudentTest{
    double sredArifmOcenka(Student_Ex2 st){
        double sredOcenka = (st.mathAverageGrade
                + st.econoicsAverageGrade
                + st.foreginLanguageAverageGrade) / 3;
        System.out.println("Srednya Aryfmeticheskaya Ocenka Studenta"
                + st.name + st.surname + ": " + sredOcenka);


        return sredOcenka;
    }

    public static void main(String[] args){
        Student_Ex2 st1 = new Student_Ex2();
        st1.studentID = 1;
        st1.name = "Nikolay";
        st1.surname = "Ivanov";
        st1.mathAverageGrade = 7.8;
        st1.econoicsAverageGrade = 9.2;
        st1.foreginLanguageAverageGrade = 8.8;
        Student_Ex2 st2 = new Student_Ex2(2,"Aleksey","Petrov",1);
        st2.mathAverageGrade = 6.3;
        st2.econoicsAverageGrade = 7;
        st2.foreginLanguageAverageGrade = 8.5;
        Student_Ex2 st3 = new Student_Ex2(3,"Anton","Sidorov", 4, 9.1,9,10);




        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);

    }
}


