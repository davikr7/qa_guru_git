import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class GitConflict {
    @Test
    void makeConflict() {
        open("https://www.youtube.com/");
    }
}
