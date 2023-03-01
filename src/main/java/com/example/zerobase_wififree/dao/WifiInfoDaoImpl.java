package com.example.zerobase_wififree.dao;

import com.example.zerobase_wififree.dto.WifiInfoDto;
import com.example.zerobase_wififree.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WifiInfoDaoImpl implements WifiInfoDao {
    PreparedStatement pstmt;
    Connection con;
    ResultSet rs;

    @Override
    public int WifiInfoInsert(WifiInfoDto dto) {
        try {  //sql문
            con = DBUtil.getConnection();
            String sql = "insert into MEMBER_PRAC values(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getMainNm());
            pstmt.setString(2, dto.getMainNm());
            pstmt.setString(3, dto.getMainNm());
            pstmt.setString(4, dto.getMainNm());
            pstmt.setString(5, dto.getMainNm());
            pstmt.setString(6, dto.getMainNm());
            pstmt.setString(7, dto.getMainNm());
            pstmt.setString(8, dto.getMainNm());
            pstmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResource(rs, pstmt, con);
        }
        return 1;
    }//WifiInfoInsert end

    @Override
    public ArrayList<WifiInfoDto> getAllList() {
        ArrayList<WifiInfoDto> list = new ArrayList<>();
        try { //sql문
            con = DBUtil.getConnection();
            String sql = "select * from wifi";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                WifiInfoDto dto = new WifiInfoDto();
                dto.setMgrNo(rs.getString(1));
                dto.setWrdofc(rs.getString(2));
                dto.setMainNm(rs.getString(3));
                dto.setAdres1(rs.getString(4));
                dto.setAdres2(rs.getString(5));
                dto.setInstlFloor(rs.getString(6));
                dto.setInstlTy(rs.getString(7));
                dto.setInstlMby(rs.getString(8));
                dto.setSvcSe(rs.getString(9));
                dto.setCmcwr(rs.getString(10));
                dto.setCnstcYear(rs.getInt(11));
                dto.setInoutDoor(rs.getString(12));
                dto.setRemars3(rs.getString(13));
                dto.setLat(rs.getDouble(14));
                dto.setLnt(rs.getDouble(15));
                dto.setWorkDttm(rs.getString(16));
                list.add(dto);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResource(rs, pstmt, con);
        }
        return list;
    }

    @Override
    public int getCount() {
        int count = 0;
        try { //sql문
            con = DBUtil.getConnection();
            String sql = "select count(*) from wifi";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            count = rs.getInt(1);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResource(rs, pstmt, con);
        }
        return count;
    }
}
