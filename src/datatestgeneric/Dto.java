package datatestgeneric;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Dto {
    private Response response; // 변수명을 동일하게!!

    @AllArgsConstructor
    @Data
    class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @Data
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @Data
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                @AllArgsConstructor
                @Data
                // 나는 Item을 제네릭박스로 만들거야
                class ResponseDto<T> {
                    T data; // 컴포지션
                }

                private List<ResponseDto<AirportItem>> airportItem;
                private List<ResponseDto<FlightItem>> flightItem;

                @AllArgsConstructor
                @Data
                // AirportItem
                class AirportItem {
                    private String airportId;
                    private String airportNm;
                }

                @AllArgsConstructor
                @Data
                // FlightItem
                class FlightItem {
                    private String airlineNm;
                    private String arrAirportNm;
                    private String arrPlandTime;
                    private String depAirportNm;
                    private String depPlandTime;
                    private int economyCharge;
                    private int prestigeCharge;
                    private String vihicleId;
                }

            } // end of Items

        } // end of Body

    } // end of Response
}
