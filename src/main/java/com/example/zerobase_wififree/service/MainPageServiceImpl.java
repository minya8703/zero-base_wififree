package com.example.zerobase_wififree.service;

import com.example.zerobase_wififree.dao.WifiInfoDao;
import com.example.zerobase_wififree.dao.WifiInfoDaoImpl;
import com.example.zerobase_wififree.dto.WifiInfoDto;

import java.util.List;

public class MainPageServiceImpl implements MainPageService{
    WifiInfoDao wifiInfoDao = new WifiInfoDaoImpl();
    @Override
    public List<WifiInfoDto> getList() {
        List<WifiInfoDto> wifiInfoList =  wifiInfoDao.getAllList();
        return wifiInfoList;
    }

}
