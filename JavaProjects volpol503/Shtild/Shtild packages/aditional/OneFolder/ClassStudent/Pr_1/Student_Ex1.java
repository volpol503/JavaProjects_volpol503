package OneFolder.ClassStudent.Pr_1;

public class Student_Ex1 {
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
    double sredArifmOcenka(Student_Ex1 st){
        double sredOcenka = (st.mathAverageGrade
                + st.econoicsAverageGrade
                + st.foreginLanguageAverageGrade) / 3;
        System.out.println("Srednya Aryfmeticheskaya Ocenka Studenta"
                + st.name + st.surname + ": " + sredOcenka);


        return sredOcenka;
    }

    public static void main(String[] args){
        Student_Ex1 st1 = new Student_Ex1();
        st1.studentID = 1;
        st1.name = "Nikolay";
        st1.name = "Ivanov";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.econoicsAverageGrade = 9.2;
        st1.foreginLanguageAverageGrade = 8.8;

        Student_Ex1 st2 = new Student_Ex1();
        st2.studentID = 2;
        st2.name = "Aleksey";
        st2.surname = "Petrov";
        st2.course = 1;
        st2.mathAverageGrade = 6.3;
        st2.econoicsAverageGrade = 7;
        st2.foreginLanguageAverageGrade = 8.5;

        Student_Ex1 st3 = new Student_Ex1();
        st3.studentID = 3;
        st3.name = "Anton";
        st3.surname = "Sidoorov";
        st3.course = 4;
        st3.mathAverageGrade = 9.1;
        st3.econoicsAverageGrade = 9;
        st3.foreginLanguageAverageGrade = 10;

        StudentTest sTest = new StudentTest();
        sTest.sredArifmOcenka(st1);
        sTest.sredArifmOcenka(st2);
        sTest.sredArifmOcenka(st3);

    }
}


