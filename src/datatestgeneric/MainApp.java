package datatestgeneric;

import java.util.List;
import java.util.Scanner;

import datatestgeneric.Dto.Response.Body.Items.FlightItem;
import datatestgeneric.Dto.Response.Body.Items.ResponseDto;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 출발일을 입력하세요 =====");
        System.out.println("ex) 20220125");
        // depPlandTime의 값이 길이가 8자가 아니면 프로그램을 종료한다.
        String depPlandTime = sc.nextLine();

        System.out.println("===== 출발지를 입력하세요 =====");
        System.out.println("ex) 무안, 광주, 군산, 여수, 원주, 양양, 제주, 김해");
        System.out.println("ex) 사천, 울산, 울산, 인천, 김포, 포항, 대구, 청주");
        // depAirportNm 값이 길이가 2자가 아니면 프로그램을 종료한다.
        String depAirportNm = sc.nextLine();

        System.out.println("===== 도착지를 입력하세요 =====");
        System.out.println("ex) 무안, 광주, 군산, 여수, 원주, 양양, 제주, 김해");
        System.out.println("ex) 사천, 울산, 울산, 인천, 김포, 포항, 대구, 청주");
        // arrAirportNm 값이 길이가 2자가 아니면 프로그램을 종료한다.
        String arrAirportNm = sc.nextLine();

        List<ResponseDto<FlightItem>> flightList = DownloadFlight.getFlightList(depPlandTime, depAirportNm,
                arrAirportNm);
        // System.out.println(flightList);
        // 여기서 막혔다....
        for (int i = 0; i < flightList.size(); i++) {
            System.out.println("===========================");
            System.out.println("출발시간 : " + flightList.get(i).getData().getDepPlandTime());
            System.out.println("도착시간 : " + flightList.get(i).getData().getArrPlandTime());
            System.out.println("요금 : " + flightList.get(i).getData().getEconomyCharge());
            System.out.println("항공사 : " + flightList.get(i).getData().getAirlineNm());
            System.out.println("===========================");
        }
    }
}
