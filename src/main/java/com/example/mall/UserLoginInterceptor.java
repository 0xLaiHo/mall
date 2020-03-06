package com.example.mall;

import com.example.mall.consts.MallConst;
import com.example.mall.enums.ResponseEnum;
import com.example.mall.exception.UserLoginException;
import com.example.mall.pojo.User;
import com.example.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle");
        User user = (User) request.getSession().getAttribute(MallConst.CURRENT_USER);
        if (user == null) {
            log.info("user = null");

            throw new UserLoginException();

        }
        return true;
    }
}
