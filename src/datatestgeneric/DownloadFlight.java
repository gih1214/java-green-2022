package datatestgeneric;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import datatestgeneric.Dto.Response.Body.Items.FlightItem;
import datatestgeneric.Dto.Response.Body.Items.ResponseDto;

public class DownloadFlight {
    // 특정 날짜에 특정 출발지에서 특정 목적지로 도착하는 항공편 정보 가져오는 메서드
    // DownloadFlight.getFlightList("20220126", "제주", "김해");
    public static List<ResponseDto<FlightItem>> getFlightList(
            String depPlandTime,
            String depAirportNm,
            String arrAirportNm) {

        // 공항목록을 조회하여 Map에 담는다.
        Map<String, String> airportMap = DownloadAirport.getAirportList();
        String depAirportId = airportMap.get(depAirportNm);
        String arrAirportId = airportMap.get(arrAirportNm);

        try {
            // 1. URL 주소 넣고 try/catch
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&numOfRows=10&pageNo=1&depAirportId="
                            + depAirportId + "&arrAirportId=" + arrAirportId + "&depPlandTime="
                            + depPlandTime + "&_type=json");

            // 2. 선 연결 (conn -> Byte Stream 선!!)
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 3. Buffer에 담기
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            // 4. Buffer 비워주기
            String responseJson = br.readLine();

            // 5. 이제 GSON을 사용해서 자바언어로 바꾸기
            Gson gson = new Gson();
            Dto dto = gson.fromJson(responseJson, Dto.class);

            // 6. Item 데이터 뽑아내기
            List<ResponseDto<FlightItem>> result = dto.getResponse().getBody().getItems().getFlightItem();

            // result 리턴해서 위에 메서드는 null인건가..?ㅠ
            return result;

        } catch (Exception e) {
            System.out.println("공항목록 조회중 오류가 발생했습니다.");
        }

        return null; // getFlightList 메서드
    }
}
