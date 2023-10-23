package Java.DesignPattern.Builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TourPlan {

    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans = new ArrayList<>();

    public void addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
    }
    @Override
    public String toString() {
        return "TourPlan{" +
                "title='" + title +
                ", nights=" + nights +
                ", days=" + days +
                ", startDate=" + startDate +
                ", whereToStay='" + whereToStay +
                ", plans=" + plans +
                '}';
    }

}
