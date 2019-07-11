package model;

/**
 * Created by FL8000 on 2019/7/11.
 */
public class Student {
    String name = "蔡安梅";
    int age = 22;
    String sex = "女";
    String studentNo = "20152480201";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
    public String getStudentNo() {
        return studentNo;
    }
}
