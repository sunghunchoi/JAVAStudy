package part2.Date;

import java.util.Calendar;

public class CalendarSample5 {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(Calendar.DAY_OF_MONTH,1); // 1일로 설정
        cal2.set(Calendar.DAY_OF_MONTH,2); // 2일로 설정
        System.out.println(cal1.getTime());
        System.out.println(cal2.getTime());
        // cal1 과 cal2를 비교한다
        int result = cal1.compareTo(cal2);
        System.out.println(result);
    }
}
