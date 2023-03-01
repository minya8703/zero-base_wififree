package com.example.zerobase_wififree.service;

import com.example.zerobase_wififree.dao.WifiInfoDao;
import com.example.zerobase_wififree.dao.WifiInfoDaoImpl;

public class LoadWifiServiceImpl implements LoadWifiService{
    WifiInfoDao wifiInfoDao = new WifiInfoDaoImpl();
    @Override
    public int getCount() {
        return wifiInfoDao.getCount();
    }
}
