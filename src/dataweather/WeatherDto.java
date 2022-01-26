package dataweather;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WeatherDto {
    private Response response;

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

            private String dataType;
            private Items items;
            private Integer pageNo;
            private Integer numOfRows;
            private Integer totalCount;

            @AllArgsConstructor
            @Data
            class Items {

                private List<Item> item;

                @AllArgsConstructor
                @Data
                class Item {

                    private String baseDate;
                    private String baseTime;
                    private String category;
                    private Integer nx;
                    private Integer ny;
                    private String obsrValue;

                } // end of Item

            } // end of Items

        } // end of Body

    } // end of Response

}
