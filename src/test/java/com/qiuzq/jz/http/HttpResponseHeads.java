package com.qiuzq.jz.http;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.Map.Entry;

/**
 * program: jz
 * Date: 2018/11/25/025 22:36
 *
 * @author: Mr.Qiu
 * Description: 获取URL响应头信息
 */
public class HttpResponseHeads {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost/jz/http/execute?userName=%E5%BC%A0%E4%B8%89&userPwd=admin");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        long date = urlConnection.getDate();
        Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
        Set<Entry<String, List<String>>> entries = headerFields.entrySet();
        Iterator<Entry<String, List<String>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<String, List<String>> next = iterator.next();
            List<String> value = next.getValue();
            String key = next.getKey();
            for (String v : value) {
                if (key != null) {
                    System.out.println(key + ":" + v);
                }
            }
        }
//        if (date == 0)
//            System.out.println("无法获取信息");
//        else
//            System.out.println("Date:" + new Date(date));
    }
}
