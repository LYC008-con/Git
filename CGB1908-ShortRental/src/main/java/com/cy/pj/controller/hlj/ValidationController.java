package com.cy.pj.controller.hlj;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.sf.json.JSONObject;
@RequestMapping("/")
@Controller
public class ValidationController {
	 public static final String DEF_CHATSET = "UTF-8";
	    public static final int DEF_CONN_TIMEOUT = 30000;
	    public static final int DEF_READ_TIMEOUT = 30000;
	    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
	 
	    //配置您申请的KEY
	    public static final String APPKEY ="3db8a56c1ac24cacbedec676ebbd1ebe";
	@RequestMapping("/validcode")
	public void val(HttpServletRequest request, HttpServletResponse response) {
		String codeChars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // 获得验证码集合的长度
        int charsLength = codeChars.length();
        // 下面3条记录是关闭客户端浏览器的缓冲区
        // 这3条语句都可以关闭浏览器的缓冲区，但是由于浏览器的版本不同，对这3条语句的支持也不同
        // 因此，为了保险起见，同时使用这3条语句来关闭浏览器的缓冲区
        response.setHeader("ragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        // 设置图形验证码的长和宽
        int width = 80, height = 20;
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        Random random = new Random();
        g.setColor(getRandomColor(180, 250));
        g.fillRect(0, 0, width, height);
        g.setFont(new Font("Times New Roman", Font.ITALIC, height));
        g.setColor(getRandomColor(120, 180));
        // 用户保存最后随机生成的验证码
        StringBuffer validationCode = new StringBuffer();
        // 验证码的随机字体
        String[] fontNames = { "Times New Roman", "Book antiqua", "Arial" };
 
        // 随机生成4个验证码
        for (int i = 0; i < 4; i++) {
            // 随机设置当前验证码的字符的字体
            g.setFont(new Font(fontNames[random.nextInt(3)], Font.ITALIC,
                    height));
            // 随机获得当前验证码的字符
            char codeChar = codeChars.charAt(random.nextInt(charsLength));
            validationCode.append(codeChar);
            // 随机设置当前验证码字符的颜色
            g.setColor(getRandomColor(10, 100));
            // 在图形上输出验证码字符，x和y都是随机生成的
            g.drawString(String.valueOf(codeChar), 16 * i + random.nextInt(7),
                    height - random.nextInt(6));
        }
        // 获得HttpSession对象
        HttpSession session = request.getSession();
        // 设置session对象5分钟失效
        session.setMaxInactiveInterval(5 * 60);
        // 将验证码保存在session对象中,key为validation_code\
        System.out.println("validation_code:"+validationCode);
        session.setAttribute("validation_code", validationCode.toString());
        //关闭Graphics对象
        g.dispose();
        OutputStream outS = null;
        try {
            outS = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        try {
            ImageIO.write(image, "JPEG", outS);
        } catch (IOException e) {
            e.printStackTrace();

        }
		
	}
        public Color getRandomColor(int minColor, int maxColor) {
            Random random = new Random();
            if(minColor > 255){
                minColor = 255;
            }
            if(maxColor > 255){
                maxColor = 255;
            }
            //获得r的随机颜色值
            int red = minColor+random.nextInt(maxColor-minColor);
            int green = minColor + random.nextInt(maxColor-minColor);
            int blue = minColor + random.nextInt(maxColor-minColor);
            return new Color(red,green,blue);
        }
        
        
        public void getRequest1() {
	 String result =null;
     String url ="http://v.juhe.cn/sms/send";//请求接口地址
     Map params = new HashMap();//请求参数
         params.put("mobile","18574393978");//接收短信的手机号码
         params.put("tpl_id","200217");//短信模板ID，请参考个人中心短信模板设置
         params.put("tpl_value","#code#=1234");//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
         params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
         params.put("dtype","json");//返回数据的格式,xml或json，默认json

     try {
         result =net(url, params, "GET");
         JSONObject object = JSONObject.fromObject(result);
         if(object.getInt("error_code")==0){
             System.out.println(object.get("result"));
         }else{
             System.out.println(object.get("error_code")+":"+object.get("reason"));
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
}
public static String net(String strUrl, Map params,String method) throws Exception {
    HttpURLConnection conn = null;
    BufferedReader reader = null;
    String rs = null;
    try {
        StringBuffer sb = new StringBuffer();
        if(method==null || method.equals("GET")){
            strUrl = strUrl+"?"+urlencode(params);
        }
        URL url = new URL(strUrl);
        conn = (HttpURLConnection) url.openConnection();
        if(method==null || method.equals("GET")){
            conn.setRequestMethod("GET");
        }else{
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
        }
        conn.setRequestProperty("User-agent", userAgent);
        conn.setUseCaches(false);
        conn.setConnectTimeout(DEF_CONN_TIMEOUT);
        conn.setReadTimeout(DEF_READ_TIMEOUT);
        conn.setInstanceFollowRedirects(false);
        conn.connect();
        if (params!= null && method.equals("POST")) {
            try {
                DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    out.writeBytes(urlencode(params));
            } catch (Exception e) {
            }
        }
        InputStream is = conn.getInputStream();
        reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
        String strRead = null;
        while ((strRead = reader.readLine()) != null) {
            sb.append(strRead);
        }
        rs = sb.toString();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (reader != null) {
            reader.close();
        }
        if (conn != null) {
            conn.disconnect();
        }
    }
    return rs;
}
public static String urlencode(Map<String,Object>data) {
    StringBuilder sb = new StringBuilder();
    for (Map.Entry i : data.entrySet()) {
        try {
            sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    return sb.toString();
}

	
}
