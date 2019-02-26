package part2.Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarSample3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        // 출력용으로 Calendar 클래스에서 Date클래스를 얻는다.
        Date nextMonth = cal.getTime();
        System.out.println(nextMonth);
        // 월 부분만 꺼낸다.
        int month = cal.get(Calendar.MONTH);
        System.out.println(month);
    }
}
