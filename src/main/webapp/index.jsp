<%@page import="com.example.zerobase_wififree.dto.WifiInfoDto"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%	List<WifiInfoDto> wifiInfoList = (List) request.getAttribute("wifiInfoList"); %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>와이파이 정보 구하기</title>
</head>
<body>
<h1><%= "와이파이 정보 구하기" %>
</h1>
<br/>
<a href="/">홈</a>|
<a href="/history">위치 히스토리 목록</a>|
<form name="loadWifi" action="/loadwifi" method="POST">
</form>
<a href="/loadwifi" onclick="javascript:document.loadWifi.submit();">Open API 와이파이 정보 가져오기</a>
<%--    <a href="/loadwifi">Open API 와이파이 정보 가져오기</a>--%>
<div>
    <form action="" method="post">
        LAT:
        <input type="text" placeholder="0.0" name="lat">
        LNT:
        <input type="text" class="form-control" placeholder="0.0" name="lnt">
        <button type="submit">내 위치 가져오기</button>
        <button type="button" onclick="location.href='list'">근처 WIFI 정보 보기</button>
    </form>
</div>
<div>
    <table border="1" width="100%">
        <tr style="text-align: center;color: aliceblue;background-color: #68ccab">
            <td>거리<br>(Km)</td>
            <td>관리번호</td>
            <td>자치구</td>
            <td>와이파이명</td>
            <td>도로명주소</td>
            <td>상세주소</td>
            <td>설치위치(층)</td>
            <td>설치유형</td>
            <td>설치기관</td>
            <td>서비스구분</td>
            <td>망종류</td>
            <td>설치년도</td>
            <td>실내외구분</td>
            <td>WIFI접속환경</td>
            <td>X좌표</td>
            <td>Y좌표</td>
            <td>작업일자</td>
        </tr>
        <%	if(wifiInfoList == null) { %>
        <tr>
            <td colspan="17" rowspan="2"><div style="text-align: center">위치 정보를 입력한 후에 조회해 주세요.</div></td>
        </tr>
        <%	} else { %>
        <% for(int i=0; i<wifiInfoList.size(); i++) { %>
        <tr>
            <td>거리</td>
            <td><%=wifiInfoList.get(i).getMgrNo()%></td>
            <td><%=wifiInfoList.get(i).getWrdofc()%></td>
            <td><%=wifiInfoList.get(i).getMainNm()%></td>
            <td><%=wifiInfoList.get(i).getAdres1()%></td>
            <td><%=wifiInfoList.get(i).getAdres2()%></td>
            <td><%=wifiInfoList.get(i).getInstlFloor()%></td>
            <td><%=wifiInfoList.get(i).getInstlTy()%></td>
            <td><%=wifiInfoList.get(i).getInstlMby()%></td>
            <td><%=wifiInfoList.get(i).getSvcSe()%></td>
            <td><%=wifiInfoList.get(i).getCmcwr()%></td>
            <td><%=wifiInfoList.get(i).getCnstcYear()%></td>
            <td><%=wifiInfoList.get(i).getInoutDoor()%></td>
            <td><%=wifiInfoList.get(i).getRemars3()%></td>
            <td><%=wifiInfoList.get(i).getLat()%></td>
            <td><%=wifiInfoList.get(i).getLnt()%></td>
            <td><%=wifiInfoList.get(i).getWorkDttm()%></td>
        </tr>
        <%	} %>
        <%	} %>
    </table>
</div>
</body>
</html>