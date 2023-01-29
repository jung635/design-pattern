package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after.sunju;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.DetailPlan;
import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements  TourPlanBuilder {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    private TourPlan tourPlan;

    //아래와 같이 바로 값을 셋팅 할 시, TourPlan의 properties들을 중복적으로 가지고 있을 필요가 없다.
    //하지만 Builder를 생성 시 항상 newInstance로 한번 초기화 해주어야한다.
//    public TourPlanBuilder newInstance() {
//        tourPlan = new TourPlan();
//        return this;
//    }
//
//    @Override
//    public TourPlanBuilder nightsAndDays(int nights, int days) {
//        this.tourPlan.setNights(nights);
//        this.tourPlan.setDays(days);
//        return this;
//    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }

        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }
}
