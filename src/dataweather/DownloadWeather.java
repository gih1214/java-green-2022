package dataweather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import dataweather.WeatherDto.Response.Body.Items.Item;

public class DownloadWeather {
    // 특정 날짜에 특정 시간의 온도 정보를 가져오는 메서드
    public static Map<String, String> getWetherTemp() {
        Map<String, String> weatherMap = new HashMap<>();
        try {
            // 1. URL 주소 넣고 try/catch
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=0sNm6wu8LtWsmwYOwcbFAAaEM4DGiVJq9P5TxgDHuevY4IQG%2FxPTYzCzgULmdymmWB9A5iEubhq3zjn8BRXAOw%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON");

            // 2. 선 연결 (conn -> Byte Stream 선!!)
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 3. Buffer에 담기
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            // 4. Buffer 비워주기
            String responseJson = br.readLine();

            // 5. 이제 GSON을 사용해서 자바언어로 바꾸기
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);

            // 6. Item 데이터 뽑아내기
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            // 7. for문으로 원하는 데이터 찾기
            for (int i = 0; i < result.size(); i++) {
                weatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }

        } catch (Exception e) {
            System.out.println("온도정보 조회중 오류가 발생했습니다.");
        }

        return weatherMap;
    }

}