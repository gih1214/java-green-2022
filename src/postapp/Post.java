package postapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Post {
    private int id;
    private String title;
    private String content;
    private User user;
    private String created;
    private String updated;
}
