package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            // 1. URL
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);

            // 2. conn은 ByteStream 아직 방향을 인정함.
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 3. Buffer
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            // 4. flush (Buffer 비우기)
            String responseJson = br.readLine();
            // System.out.println(responseJson);

            // 5. GSON으로 자바 오브젝트로 변경
            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 6. 통신 검증
            if (dto.getCode() != 1) {
                System.out.println("통신 실패" + dto.getMsg());
                return; // 스택 종료
            }

            // 7. 프로그램 만들기
            // System.out.println(dto.getData().size());
            // size = 64
            // for문 거꾸로 돌리기
            try {
                dto.getData().get(dto.getData().size()).setId(5000);
            } catch (Exception e) {
                System.out.println("괜찮아 그냥 넘어가");
            }

            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호 : " + dto.getData().get(i).getId());
                System.out.println("Title : " + dto.getData().get(i).getTitle());
                System.out.println("Content : " + dto.getData().get(i).getContent());
                System.out.println("-------------회원정보---------------");
                System.out.println("회원ID : " + dto.getData().get(i).getUser().getId());
                System.out.println("닉네임 : " + dto.getData().get(i).getUser().getUsername());
                System.out.println("PW : " + dto.getData().get(i).getUser().getPassword());
                System.out.println("email : " + dto.getData().get(i).getUser().getEmail());
                System.out.println("가입일 : " + dto.getData().get(i).getUser().getCreated());
                System.out.println("로그인일 : " + dto.getData().get(i).getUser().getUpdated());
                System.out.println("------------------------------------");
                System.out.println("가입일 : " + dto.getData().get(i).getCreated());
                System.out.println("로그인일 : " + dto.getData().get(i).getUpdated());
                System.out.println("============================================");
            }

        } catch (Exception e) {
            e.printStackTrace(); // 오류 추적
        }
    }
}
