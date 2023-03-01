package com.example.zerobase_wififree.controller;

import com.example.zerobase_wififree.dto.WifiInfoDto;
import com.example.zerobase_wififree.service.LoadWifiService;
import com.example.zerobase_wififree.service.LoadWifiServiceImpl;
import com.example.zerobase_wififree.service.MainPageService;
import com.example.zerobase_wififree.service.MainPageServiceImpl;
import com.example.zerobase_wififree.util.GetJsonDataUtil;
import org.json.simple.parser.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LoadWifiController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    LoadWifiService loadWifiService = new LoadWifiServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            GetJsonDataUtil.getWifiData();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int count = loadWifiService.getCount();

        //HttpServletRequest req에 속성값을 지정해준다.
        request.setAttribute("wificount", count);
        RequestDispatcher dispatcher = request.getRequestDispatcher("load-wifi.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LoadWifiController doPost service method 호출!");

        //JSP로 forward해주면 끝
        RequestDispatcher dispatcher = request.getRequestDispatcher("load-wifi.jsp");
        dispatcher.forward(request, response);
    }
}
