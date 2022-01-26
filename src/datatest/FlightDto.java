package datatest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FlightDto {
    private Response response; // 변수명을 동일하게!!

    @AllArgsConstructor
    @Data
    public class Response {
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
        public class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @AllArgsConstructor
            @Data
            class Items {
                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {
                    private String airlineNm;
                    private String arrAirportNm;
                    private String arrPlandTime;
                    private String depAirportNm;
                    private String depPlandTime;
                    private int economyCharge;
                    private int prestigeCharge;
                    private String vihicleId;
                } // end of Item

            } // end of Items

        } // end of Body

    } // end of Response

}
