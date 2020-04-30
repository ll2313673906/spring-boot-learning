package com.soft1851.springboot.jwt.interceptor;

import com.soft1851.springboot.jwt.common.ResultCode;
import com.soft1851.springboot.jwt.exception.JwtException;
import com.soft1851.springboot.jwt.service.AdminService;
import com.soft1851.springboot.jwt.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InvalidClassException;
import java.util.List;

@Slf4j
@Component
public class JwtInterceptor implements HandlerInterceptor {
    @Resource
    private AdminService adminService;

    /**
     * 前置处理，拦截请求
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        // 认证
        if (token == null) {
            log.info("### 用户未登录，请先登录 ###");
            // 通过自定义异常抛出未登录的信息，由全局统一处理
            throw new JwtException("用户未登录，请先登录", ResultCode.USER_NOT_SIGN_IN);
        } else {
            // 已登录
            log.info("## token={}", token);
            // 鉴权
            if (!adminService.checkRole(JwtTokenUtil.getUserRole(token))) {
                log.info("### 用户权限不足 ###");
                // 通过自定义异常抛出token失效的信息，由全局统一处理
                throw new JwtException("用户权限不足", ResultCode.USER_NOT_SIGN_IN);

            } else {
                if (JwtTokenUtil.isExpiration(token)) {
                    log.info("### token已失效 ###");
                    // 通过自定异常抛出token失效的信息，由全局统一处理

                    throw new InvalidClassException("Token已失效");

                } else {
                    // 之前的拦截全部通过，放行到controller层调用接口
                    return true;
                }
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
