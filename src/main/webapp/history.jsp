<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
<a href="/loadwifi">Open API 와이파이 정보 가져오기</a>
<div>
    <table border="1" width="100%">
        <tr style="text-align: center;color: aliceblue;background-color: #68ccab">
            <td>ID</td>
            <td>X좌표</td>
            <td>Y좌표</td>
            <td>조회일자</td>
            <td>비고</td>
        </tr>
        <tr>
            <td>111</td>
            <td>222</td>
            <td>333</td>
            <td>444</td>
            <td><button type="button" onclick="location.href='list'">근처 WIFI 정보 보기</button></td>
        </tr>
    </table>
</div>
</body>
</html>