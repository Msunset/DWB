package com.dwb.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName InterceptorConfig
 * @Description TODO
 * @Author Qingbin Ding
 * @Date 2019/9/24 9:28
 * @Version 1.0
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private UserTokenInterceptor userTokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.userTokenInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/swagger-resources/**",
                        "/user/getUserInfo","/user/sendSms","/webjars/**", "/v2/**",
                        "/swagger-ui.html/**","/notificationUrl/updateSmsSignStatus");
//      registry.addInterceptor(this.userInfoInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");
    }


}
