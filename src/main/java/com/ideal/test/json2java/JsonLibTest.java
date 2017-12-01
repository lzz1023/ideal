package com.ideal.test.json2java;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.List;

public class JsonLibTest {
    public static void main(String[] args) {
        String jsonStr = "{\"name\":\"三班\",\"students\":[{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"露西\",\"score\":{\"网络协议\":98,\"JavaEE\":92,\"计算机基础\":93},\"weight\":51.3},{\"age\":26,\"gender\":\"male\",\"grades\":\"三班\",\"name\":\"杰克\",\"score\":{\"网络安全\":75,\"Linux操作系统\":81,\"计算机基础\":92},\"weight\":66.5},{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"莉莉\",\"score\":{\"网络安全\":95,\"Linux操作系统\":98,\"SQL数据库\":88,\"数据结构\":89},\"weight\":55}]}";
        JSONObject obj = JSONObject.fromObject(jsonStr);
        Grade grade = (Grade) JSONObject.toBean(obj,Grade.class);
        JSONArray array = JSONArray.fromObject(grade.getStudents());
//        List<Student> students = JSONArray.toList(array,Student.class);
        grade.setStudents((List<Student>) JSONArray.toCollection(array,Student.class));
        System.out.println(grade);
    }
}
