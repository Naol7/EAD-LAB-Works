package bookstore;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Books {
    private int id;
    private String title;
    private String author;
    private String price;
}