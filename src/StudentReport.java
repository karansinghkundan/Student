import java.util.Scanner;
public class StudentReport {
    private  int no;
    private int age;
    private String name;
    private double average;

    public StudentReport(int no, int age, String name, double average) {
        this.no = no;
        this.age = age;
        this.name = name;
        this.average = average;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }



    public boolean Ispass() {
        if (average >= 50)
            return true;
        return false;
    }
    public char getGrade()
    {
switch ((int)average/10) {
    case 10:
        return 'A';
    case 9:
        return 'B';
    case 8:
        return 'c';
    case 7:
        return 'D';
    case 6:
        return 'e';
    case 5:
        return 'F';
    default:
        return 'f';
}

        }

}

