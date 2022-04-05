package help;

import com.codeborne.selenide.SelenideElement;

import java.util.List;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Dropdown {

    private void openOptions() {
    }
    public void setOption(String option) {
        openOptions();
        List<SelenideElement> actions = $$(".Dropdown-menu");
        for (SelenideElement action : actions) {
           if (action.text().contains(option)) {
                action.click();
                $(".Dropdown-option").click();

            }
        }

    }


}
