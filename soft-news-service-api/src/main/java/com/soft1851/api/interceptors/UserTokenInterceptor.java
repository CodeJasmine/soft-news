package com.soft1851.api.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wususu
 * @date 2020/11/18 5:40
 */
public class UserTokenInterceptor extends BaseInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userId = request.getHeader("headerUserId");
        String userToken = request.getHeader("headerUserToken");
        System.out.println("************请求头的数据***************");
        System.out.println(userId);
        System.out.println(userToken);
        System.out.println("************请求头的数据***************");
        return verifyUserIdToken(userId, userToken, REDIS_USER_TOKEN);
    }
}
