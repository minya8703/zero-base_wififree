package com.example.zerobase_wififree.dto;

public class WifiInfoDto {
    private String mgrNo;
    private String wrdofc;
    private String mainNm;
    private String adres1;
    private String adres2;
    private String instlFloor;
    private String instlTy;
    private String instlMby;
    private String svcSe;
    private String cmcwr;
    private int cnstcYear;
    private String inoutDoor;
    private String remars3;
    private double lat;
    private double lnt;
    private String workDttm;

    public WifiInfoDto(){

    }

    public WifiInfoDto(String mgrNo, String wrdofc, String mainNm, String adres1, String adres2, String instlFloor, String instlTy, String instlMby, String svcSe, String cmcwr, int cnstcYear, String inoutDoor, String remars3, double lat, double lnt, String workDttm) {
        this.mgrNo = mgrNo;
        this.wrdofc = wrdofc;
        this.mainNm = mainNm;
        this.adres1 = adres1;
        this.adres2 = adres2;
        this.instlFloor = instlFloor;
        this.instlTy = instlTy;
        this.instlMby = instlMby;
        this.svcSe = svcSe;
        this.cmcwr = cmcwr;
        this.cnstcYear = cnstcYear;
        this.inoutDoor = inoutDoor;
        this.remars3 = remars3;
        this.lat = lat;
        this.lnt = lnt;
        this.workDttm = workDttm;
    }

    public String getMgrNo() {
        return mgrNo;
    }

    public void setMgrNo(String mgrNo) {
        this.mgrNo = mgrNo;
    }

    public String getWrdofc() {
        return wrdofc;
    }

    public void setWrdofc(String wrdofc) {
        this.wrdofc = wrdofc;
    }

    public String getMainNm() {
        return mainNm;
    }

    public void setMainNm(String mainNm) {
        this.mainNm = mainNm;
    }

    public String getAdres1() {
        return adres1;
    }

    public void setAdres1(String adres1) {
        this.adres1 = adres1;
    }

    public String getAdres2() {
        return adres2;
    }

    public void setAdres2(String adres2) {
        this.adres2 = adres2;
    }

    public String getInstlFloor() {
        return instlFloor;
    }

    public void setInstlFloor(String instlFloor) {
        this.instlFloor = instlFloor;
    }

    public String getInstlTy() {
        return instlTy;
    }

    public void setInstlTy(String instlTy) {
        this.instlTy = instlTy;
    }

    public String getInstlMby() {
        return instlMby;
    }

    public void setInstlMby(String instlMby) {
        this.instlMby = instlMby;
    }

    public String getSvcSe() {
        return svcSe;
    }

    public void setSvcSe(String svcSe) {
        this.svcSe = svcSe;
    }

    public String getCmcwr() {
        return cmcwr;
    }

    public void setCmcwr(String cmcwr) {
        this.cmcwr = cmcwr;
    }

    public int getCnstcYear() {
        return cnstcYear;
    }

    public void setCnstcYear(int cnstcYear) {
        this.cnstcYear = cnstcYear;
    }

    public String getInoutDoor() {
        return inoutDoor;
    }

    public void setInoutDoor(String inoutDoor) {
        this.inoutDoor = inoutDoor;
    }

    public String getRemars3() { return remars3;}

    public void setRemars3(String remars3) {
        this.remars3 = remars3;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLnt() {
        return lnt;
    }

    public void setLnt(double lnt) {
        this.lnt = lnt;
    }

    public String getWorkDttm() {
        return workDttm;
    }

    public void setWorkDttm(String workDttm) {
        this.workDttm = workDttm;
    }
}
