package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after.sunju;

public class App {

    public static void main(String[] args) {
//        TourPlanBuilder tourPlanBuilder = new DefaultTourBuilder();

        //계속 반복되어 불편함 -> 미리 만들어 놓은 SET을 디렉터에 만들어놓고 사용해보자.
//        TourPlan plan = tourPlanBuilder.title("칸쿤 여행")
//                .nightsAndDays(2, 3)
//                .startDate(LocalDate.of(2020, 12, 9))
//                .whereToStay("리조트")
//                .addPlan(0, "체크인하고 짐 풀기")
//                .addPlan(0, "저녁 식사")R
//                .getPlan();
//
//        TourPlan plan2 = tourPlanBuilder.title("롱비치")
//                .startDate(LocalDate.of(2021, 7, 15))
//                .getPlan();®ER

        TourDirector director = new TourDirector(new TourPlanBuilder());
        director.CancunTrip();
        director.longBeachTrip();
    }
}
