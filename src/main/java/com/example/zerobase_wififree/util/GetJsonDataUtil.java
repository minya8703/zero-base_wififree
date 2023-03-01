package com.example.zerobase_wififree.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * https://medium.com/@kimddub/java-open-api-%EC%82%AC%EC%9A%A9-559fe23fb608
 *
 * https://fvor001.tistory.com/93
 */
public class GetJsonDataUtil {
    public static void getWifiData() throws IOException, ParseException {
        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088/784e7a4f4e6469663634484445484a/json/TbPublicWifiInfo/1/5/"); /*URL*/
        urlBuilder.append("/" + URLEncoder.encode("인증키", "UTF-8")); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
        urlBuilder.append("/" + URLEncoder.encode("json", "UTF-8")); /*요청파일타입 (xml,xmlf,xls,json) */
        urlBuilder.append("/" + URLEncoder.encode("CardSubwayStatsNew", "UTF-8")); /*서비스명 (대소문자 구분 필수입니다.)*/
        urlBuilder.append("/" + URLEncoder.encode("1", "UTF-8")); /*요청시작위치 (sample인증키 사용시 5이내 숫자)*/
        urlBuilder.append("/" + URLEncoder.encode("5", "UTF-8")); /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/
        // 상위 5개는 필수적으로 순서바꾸지 않고 호출해야 합니다.

        // 서비스별 추가 요청 인자이며 자세한 내용은 각 서비스별 '요청인자'부분에 자세히 나와 있습니다.
        urlBuilder.append("/" + URLEncoder.encode("20220301", "UTF-8")); /* 서비스별 추가 요청인자들*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode()); /* 연결 자체에 대한 확인이 필요하므로 추가합니다.*/
        BufferedReader rd;

        // 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
        if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb);

        /**
         * REST API return 데이터 추출
         */
        JSONParser jsonParser = new JSONParser();
        //JSON데이터를 넣어 JSON Object 로 만들어 준다.
        JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
        //배열 추출
        JSONObject into = (JSONObject)jsonObject.get("TbPublicWifiInfo");
        JSONArray row = (JSONArray)into.get("row");

        for (int i = 0; i < row.size(); i++) {

            System.out.println("hsmp_" + i + " ===========================================");

            //배열 안에 있는것도 JSON형식 이기 때문에 JSON Object 로 추출
            JSONObject object = (JSONObject) row.get(i);

            //JSON name으로 추출
            System.out.println("mgrNo ==> " + object.get("X_SWIFI_MGR_NO"));
            System.out.println("wrdofc ==> " + object.get("X_SWIFI_WRDOFC"));
            System.out.println("mainNm ==> " + object.get("X_SWIFI_MAIN_NM"));
            System.out.println("adres1 ==> " + object.get("X_SWIFI_ADRES1"));
            System.out.println("adres2 ==> " + object.get("X_SWIFI_ADRES2"));
            System.out.println("");

        }
    }
}
