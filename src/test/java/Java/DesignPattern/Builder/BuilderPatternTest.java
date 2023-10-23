package Java.DesignPattern.Builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BuilderPatternTest {

    @Test
    void BuilderTest() {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("제주 여행");
        tourPlan.setNights(2); // 2박
        tourPlan.setDays(3); // 3일
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");

        System.out.println(tourPlan.toString());
    }

    @Test
    void BuilderTest2() {
        TourPlan dayTrip = new TourPlan();
        dayTrip.setTitle("[당일치기] 부산 여행");
        dayTrip.setStartDate(LocalDate.of(2022, 5, 15));
        dayTrip.addPlan(0, "광안대교");
        dayTrip.addPlan(0, "감천 문화마을");
        dayTrip.addPlan(0, "부산 아쿠아리움");
        dayTrip.addPlan(0, "귀가");

        System.out.println(dayTrip.toString());
    }

    @Test
    void BuilderTest3() {
        TourPlanBuilder builder1 = new DefaultTourBuilder();
        TourPlanBuilder builder2 = new DefaultTourBuilder();

        TourPlan plan = builder1.title("화성여행")
                .nightsAndDays(2,3)
                .whereToStay("Ground")
                .addPlan(0,"점심식사")
                .addPlan(1, "수영")
                .addPlan(1, "체크아웃")
                .getPlan();

        TourPlan plan2 = builder2.title("제주도")
                .startDate(LocalDate.now())
                .getPlan();

        System.out.println(plan);
        System.out.println(plan2);
    }

}
