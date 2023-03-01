package com.example.zerobase_wififree.dao;

import com.example.zerobase_wififree.util.DBUtil;
import com.example.zerobase_wififree.dto.WifiInfoDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * https://velog.io/@owozz/JSPServlet-DB%EC%99%80-%EC%97%B0%EB%8F%99%ED%95%B4-%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85%ED%9A%8C%EC%9B%90-%EB%A6%AC%EC%8A%A4%ED%8A%B8-%EB%B3%B4%EA%B8%B0-%ED%8E%98%EC%9D%B4%EC%A7%80-%EB%A7%8C%EB%93%A4%EA%B8%B0#servletcontroller
 */
public interface WifiInfoDao {
    List<WifiInfoDto> getAllList();

    int getCount();

    int WifiInfoInsert(WifiInfoDto dto);
}
