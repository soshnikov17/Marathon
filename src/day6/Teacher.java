package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }

    void evaluate(Student student){
        Random random=new Random();
        String gradeString = null;
        int grade= 2+random.nextInt(5-2+1);// для генерации чисел в диапахоне от a до b включительно int  x  =  a + rand.nextInt(b - a + 1)
        switch (grade){
            case 2:
                gradeString="Неудовлетворительно";
                break;
            case 3:
                gradeString="Удовлетворительно";
                break;
            case 4:
                gradeString="Хорошо";
                break;
            case 5:
                gradeString="Отлично";
                break;
        }
        System.out.println("Преподаватель "+this.name+" оценил студента с именем "+student.getName()+" по предмету "+this.subject.toLowerCase()+" на оценку "+gradeString.toLowerCase());
    }
}
