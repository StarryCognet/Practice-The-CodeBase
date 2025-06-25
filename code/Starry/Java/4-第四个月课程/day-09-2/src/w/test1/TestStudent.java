package w.test1;

import com.lening.test4.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "张三", 18, "男");
        Student stu2 = new Student(2, "李四", 22, "男");
        Student stu3 = new Student(3, "王五", 24, "女");
        Student stu4 = new Student(4, "赵六", 30, "女");
        Student stu5 = new Student(5, "田七", 40, "男");

        List<Student> stuList = new ArrayList<>();
        Collections.addAll(stuList, stu1, stu2, stu3, stu4, stu5);

        Collections.sort(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        for (Student student : stuList) {
            System.out.println(student);
        }

        Student stuMax = Collections.max(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("------------------");
        System.out.println(stuMax);

        Collections.shuffle(stuList);
        System.out.println("-----------------------");
        for (Student student : stuList) {
            System.out.println(student);
        }


        Collections.reverse(stuList);
        System.out.println("---------------------");
        for (Student student : stuList) {
            System.out.println(student);
        }
    }
}
