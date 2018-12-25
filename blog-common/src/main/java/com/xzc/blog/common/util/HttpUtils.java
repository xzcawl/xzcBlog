package com.xzc.blog.common.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.util.regex.Pattern;

/**
 * @Classname HttpUtils
 * @Description TODO
 * @Date 2018/12/22 15:17
 * @Created by xzcawl
 */
public class HttpUtils {
    /**
     * ajax 请求
     * @param response
     * @param msg
     * @throws Exception
     */
    public static void writeJson(HttpServletResponse response, String msg)throws Exception{
        response.setCharacterEncoding("utf-8");
        response.setHeader("accept","text/html");
        response.setContentType("text/html;charset=utf-8");

        Writer writer = response.getWriter();
        writer.write(msg);
        writer.flush();
        writer.close();
    }
    public static Cookie getCookie(HttpServletRequest request, String name){
        Cookie[] cookies=request.getCookies();
        if (cookies!=null && cookies.length>0){
            for(int i=0;i<cookies.length;i++){
                if (name.equalsIgnoreCase(cookies[i].getName())){
                    return cookies[i];
                }
            }
        }
        return null;
    }

    public static String getCookieValue(HttpServletRequest request,String name){
        Cookie cookie=getCookie(request,name);
        if (cookie!=null){
            return cookie.getValue();
        }
        return null;
    }
    /**
     * 过滤 html
     * @param inputString
     * @return
     */
    public static String html2Text(String inputString) {
        if(StringUtils.isBlank(inputString)){
            return "";
        }
        String htmlStr = inputString; // 含html标签的字符串
        String textStr = "";
        Pattern p_script;
        java.util.regex.Matcher m_script;
        Pattern p_style;
        java.util.regex.Matcher m_style;
        Pattern p_html;
        java.util.regex.Matcher m_html;
        try {
            // 定义script的正则表达式{或<script>]*?>[\s\S]*?<\/script>
            // }
            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";
            String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"; // 定义style的正则表达式{或<style>]*?>[\s\S]*?<\/style>
            // }
            String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式

            p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
            m_script = p_script.matcher(htmlStr);
            htmlStr = m_script.replaceAll(""); // 过滤script标签

            p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
            m_style = p_style.matcher(htmlStr);
            htmlStr = m_style.replaceAll(""); // 过滤style标签

            p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
            m_html = p_html.matcher(htmlStr);
            htmlStr = m_html.replaceAll(""); // 过滤html标签

            textStr = htmlStr;

        } catch (Exception e) {
            textStr = "";
        }
        return textStr;
    }
}
