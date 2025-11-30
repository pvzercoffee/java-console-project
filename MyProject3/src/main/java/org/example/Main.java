package org.example;


import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();

        boolean[] hasWeek = {true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        LessonPacket packet = new LessonPacket("前端开发技术（HTML5）","明辨楼401",hasWeek,1,2,1);

        JSONArray array = new JSONArray();
        array.put("前端开发技术（HTML5）");
        array.put("明辨楼401");
        array.put(hasWeek);
        array.put(1);
        array.put(2);
        array.put(1);

        jsonObject.put("lesson",array);

        System.out.println(jsonObject.toString(4));

    }
}