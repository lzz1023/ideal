package com.ideal.test.json2java;

import java.util.List;
/**
 * 将json中Grade转化为entity
 * @author  lzz
 * @date    2017/12/26
 * @version 1.0
 */
public class Grade {
    private String name;

    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
