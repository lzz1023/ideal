package com.ideal.test.json2java;

import java.util.List;

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
