package com.dwb.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @ClassName TrustAsiaRequestUtil
 * @Description TODO
 * @Author Qingbin Ding
 * @Date 2020/3/25 15:16
 * @Version 1.0
 **/
public class TrustAsiaRequestUtil {

    /**
     * 发送API请求
     *
     * @param url          请求的URL
     * @param method       请求方式GET或POST请求
     * @param signToString 拼接的签名字符串
     * @param params       请求参数
     * @return
     */
    public static String requestApi(String url, String method, StringBuilder signToString, Map<String, String> params) {
        //签名生成
        if (params != null) {
            for (Map.Entry<String, String> e : params.entrySet()) {
                signToString.append("&").append(e.getKey()).append("=").append(e.getValue());
            }
        }
        String signatureString = null;
        try {
            System.out.println("发送参数---:" + signToString);
            //加密签名参数
            signatureString = hmac256(signToString.toString(), "aglcxkpeepxmhmozocpfbwee");
            System.out.println("签名---:" + signatureString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //将签名放入参数中
        params.put("signature", signatureString);
        /**
         * 发送请求
         */
        String res = "";
        if ("POST".equals(method)) {
            res = postRequest(url, params);
        } else {
            res = getRequest(url, params);
        }
        System.out.println("返回值:" + res);
        return res;
    }


    public static String hmac256(String str, String stal) {
        Mac hmac;
        try {
            hmac = Mac.getInstance("HmacSHA256");
            SecretKeySpec macKey = new SecretKeySpec(stal.getBytes(), "RAW");
            hmac.init(macKey);
            byte[] key = hmac.doFinal(str.getBytes());
            System.out.println(new String(key,"utf-8"));
            return byteToHexString(key);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * get请求
     *
     * @param requestUrl
     * @param params
     * @return
     */
    public static String getRequest(String requestUrl, Map<String, String> params) {

        URL url = null;
        try {
            StringBuffer paramsBuffer = new StringBuffer();
            if (params != null) {
                for (Map.Entry<String, String> e : params.entrySet()) {
                    paramsBuffer.append(e.getKey());
                    paramsBuffer.append("=");
                    paramsBuffer.append(e.getValue() == null ? "" : URLEncoder.encode(e.getValue(), "UTF-8"));
                    //paramsBuffer.append(e.getValue());
                    paramsBuffer.append("&");
                }
                if (paramsBuffer.length() > 1) {
                    paramsBuffer.setLength(paramsBuffer.length() - 1);
                }
            }

            String urlString = null;
            if (paramsBuffer.length() > 1) {
                if (requestUrl.contains("?")) {
                    urlString = requestUrl + "&" + paramsBuffer.toString();
                } else {
                    urlString = requestUrl + "?" + paramsBuffer.toString();
                }
            } else {
                urlString = requestUrl;
            }

            url = new URL(urlString);

            System.out.println(url);
            HttpURLConnection con;
            if (requestUrl.startsWith("https://")) {
                con = (HttpsURLConnection) url.openConnection();
            }
            else {
                con = (HttpURLConnection) url.openConnection();
            }


            con.setRequestMethod("GET");


            int returnCode = con.getResponseCode();
            InputStream connectionIn = null;
            if (returnCode == 200) {
                connectionIn = con.getInputStream();
            }
            else {
                connectionIn = con.getErrorStream();
            }
            BufferedReader buffer = new BufferedReader(new InputStreamReader(connectionIn));
            String inputLine;
            StringBuffer resBuffer = new StringBuffer();
            while ((inputLine = buffer.readLine()) != null) {
                resBuffer.append(inputLine).append("\r\n");
            }
            buffer.close();

            return resBuffer.toString();

        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    /**
     * post请求
     *
     * @param requestUrl
     * @param params
     * @return
     */
    public static String postRequest(String requestUrl, Map<String, String> params) {

        URL url = null;

        try {
            StringBuffer paramsBuffer = new StringBuffer();
            if (params != null) {
                for (Map.Entry<String, String> e : params.entrySet()) {
                    paramsBuffer.append(e.getKey());
                    paramsBuffer.append("=");
                    paramsBuffer.append(e.getValue() == null ? "" : URLEncoder.encode(e.getValue(), "UTF-8"));
                    paramsBuffer.append("&");
                }
                if (paramsBuffer.length() > 1) {
                    paramsBuffer.setLength(paramsBuffer.length() - 1);
                }
            }


            url = new URL(requestUrl);

            HttpURLConnection con;


            if (requestUrl.startsWith("https://")) {
                con = (HttpsURLConnection) url.openConnection();
            }
            else {
                con = (HttpURLConnection) url.openConnection();
            }


            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("POST");
            con.setUseCaches(false);
            con.setInstanceFollowRedirects(true);
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.connect();
            DataOutputStream out = new DataOutputStream(con
                    .getOutputStream());

            out.writeBytes(paramsBuffer.toString());

            out.flush();
            out.close();


            int returnCode = con.getResponseCode();
            InputStream connectionIn = null;
            if (returnCode == 200) {
                connectionIn = con.getInputStream();
            }
            else {
                connectionIn = con.getErrorStream();
            }
            BufferedReader buffer = new BufferedReader(new InputStreamReader(connectionIn));
            String inputLine;
            StringBuffer resBuffer = new StringBuffer();
            while ((inputLine = buffer.readLine()) != null) {
                resBuffer.append(inputLine).append("\r\n");
            }
            buffer.close();

            con.disconnect();

            return resBuffer.toString();

        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    public static String byteToHexString(byte[] bt) {
        StringBuilder stringBuilder = new StringBuilder("");
        byte[] src = bt;
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

}
