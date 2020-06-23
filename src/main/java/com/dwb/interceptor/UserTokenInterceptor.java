
package com.dwb.interceptor;

import com.alibaba.fastjson.JSON;
import com.dwb.result.Result;
import com.dwb.result.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component("userTokenInterceptor")
public class UserTokenInterceptor implements HandlerInterceptor {
 /*   private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Value("${qdsms.redirect}")
    private String redirect;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
        try {
            if (request.getSession().getAttribute("userId")==null){

                    SystemParameter systemParameter = new SystemParameter();
                    Result<Object> result = Result.newError(ResultCode.NO_LOGGED_IN);
                    systemParameter.setUrl(redirect);
                    result.setDataMap(systemParameter);
                    returnErrorJson(response, JSON.toJSONString(result));
                    return false;
                }

           // }
            System.out.printf("通过userId验证");
            return true;




        } catch (Exception e) {
            returnErrorJson(response, JSON.toJSONString(Result.newError(ResultCode.SYS_ERROR)));
            return false;
        }

    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }


    private void returnErrorJson(HttpServletResponse response, String json) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);
        } catch (IOException e) {
            LOGGER.error("response error", e);
        } finally {
//            if (writer != null){
                writer.flush();
                writer.close();
//            }
        }
}*/
    }


