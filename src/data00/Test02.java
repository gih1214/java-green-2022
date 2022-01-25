package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import data00.AirportDto.Response.Body.Items.Item;

public class Test02 {
    public static void main(String[] args) {
        try {
            // 1. URL 주소 넣고 try/catch
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");

            // 2. 선 연결 (Byte Stream)
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 3. Buffer에 담기
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            // 4. Buffer 비워주기
            String responseJson = br.readLine(); // while문 잊지말자!

            // 5. 이제 GSON을 사용해서 자바언어로 바꾸기
            Gson gson = new Gson();
            AirportDto dto = gson.fromJson(responseJson, AirportDto.class);

            // 6. Item 데이터 뽑아내기
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            // System.out.println(result);

            // 7. 최종적으로 할 것!!
            Map<String, String> airportMap = new HashMap<>();
            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }

            System.out.println(airportMap.get("제주"));

        } catch (Exception e) {
            System.out.println("주소 입력이 잘못되었습니다.");
        }

    }
}
