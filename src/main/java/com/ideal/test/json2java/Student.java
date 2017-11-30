package com.ideal.test.json2java;

import java.util.Map;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String grades;
    private float weight;
    private Map<String,Integer> score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Map<String, Integer> getScore() {
        return score;
    }

    public void setScore(Map<String, Integer> score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", grades='" + grades + '\'' +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}
