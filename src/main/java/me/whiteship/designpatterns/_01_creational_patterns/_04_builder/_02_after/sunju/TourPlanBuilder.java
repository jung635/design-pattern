package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after.sunju;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    //TourPlanBuilder를 리턴하는 이유는, title을 만들고 연달아서 다른 메서드를 사용할 수 있게 하기위함 -> TourPlan을 리턴하기 까지 계속 사용 사능하게함.
    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    //여기서는 마지막으로 validate가 가능하다.
    //예를 들면, 긴 여행은 몇박인지 입력을 했는지... 등
    TourPlan getPlan();

}
