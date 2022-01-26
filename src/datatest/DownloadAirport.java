package datatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import datatest.AirportDto.Response.Body.Items.Item;

public class DownloadAirport {

    // 공항목록을 조회하여 Map에 담아서 return 하는 메서드
    public static Map<String, String> getAirportList() {
        Map<String, String> airportMap = new HashMap<>();
        try {
            // 1. URL 주소 넣고 try/catch
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");

            // 2. 선 연결 (conn -> Byte Stream 선!!)
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 3. Buffer에 담기
            // 원래 default 1Byte 한글을 읽었기 때문에 한글이 깨졌다.
            // utf-8 한글을 3Byte로 끊어 읽겠다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            // 4. Buffer 비워주기
            String responseJson = br.readLine(); // while문 잊지말자!!

            // 5. 이제 GSON을 사용해서 자바언어로 바꾸기
            Gson gson = new Gson();
            AirportDto dto = gson.fromJson(responseJson, AirportDto.class);

            // 6. Item 데이터 뽑아내기
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            // 7. for문으로 원하는 데이터 찾기
            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }

        } catch (Exception e) {
            System.out.println("공항목록 조회중 오류가 발생했습니다.");
        }

        return airportMap;

    } // end of getAirportList

}
