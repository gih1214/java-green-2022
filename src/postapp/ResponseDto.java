package postapp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto {
    private int code; // 1은 성공
    private String msg;
    private List<Post> data;
}
