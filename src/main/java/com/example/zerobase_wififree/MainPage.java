package com.example.zerobase_wififree;

import com.example.zerobase_wififree.dto.WifiInfoDto;
import com.example.zerobase_wififree.service.MainPageService;
import com.example.zerobase_wififree.service.MainPageServiceImpl;
import com.example.zerobase_wififree.util.GetJsonDataUtil;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * https://deveric.tistory.com/6
 */
public class MainPage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    MainPageService mainPageService = new MainPageServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet service method 호출!");
        List<WifiInfoDto> wifiInfoList = mainPageService.getList();

        //HttpServletRequest req에 속성값을 지정해준다.
        request.setAttribute("wifiInfoList", wifiInfoList);
        //JSP로 forward해주면 끝
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("doPost service method 호출!");
//        List<WifiInfoDto> wifiInfoList = mainPageService.getList();
//
//        //HttpServletRequest req에 속성값을 지정해준다.
//        request.setAttribute("wifiInfoList", wifiInfoList);
    }

    public void destroy() {
        System.out.println("destroy method 호출!");
    }
}