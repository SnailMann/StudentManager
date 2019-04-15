package com.snailmann.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.snailmann.service.UserLoginService;

public class RightOfStudentInterceptor implements HandlerInterceptor{
	
	@Autowired
	UserLoginService userLoginService;
	//执行Handler完成执行此方法  
    //应用场景：统一异常处理，统一日志处理  
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,Object handler, Exception ex)
			throws Exception {
		System.out.println("Student-afterCompletion");
		
	}

	
    //进入Handler方法之后，返回modelAndView之前执行  
    //应用场景从modelAndView出发：将公用的模型数据(比如菜单导航)在这里  
    //传到视图，也可以在这里统一指定视图  
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("Student-postHandle");
		
	}

	

    //执行Handler方法之前执行  
    //用于身份认证、身份授权  
    //比如身份认证，如果认证通过表示当前用户没有登陆，需要此方法拦截不再向下执行 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("Student-preHandle");
		
        HttpSession session=request.getSession();  
        Integer userid=(Integer)session.getAttribute("userid");
      //用户的权限是否为学生权限，是则通过，不是则跳转到错误页面
        String userType="1";
        String username=userid.toString();
        if(userLoginService.findUser(username, userType)){
        	return true;
        }
         
        request.getRequestDispatcher("/RightError.jsp").forward(request, response);  
        return false;  
	}

}
