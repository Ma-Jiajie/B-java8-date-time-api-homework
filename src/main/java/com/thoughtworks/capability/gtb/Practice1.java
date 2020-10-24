package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    Month currentMonth = date.getMonth();
    int currentYear = date.getYear();

    int nextLabourYear = (currentMonth.getValue() >= 5) ? currentYear + 1 : currentYear;
    LocalDate nextlabourDate = LocalDate.of(nextLabourYear, 5, 1);

    return nextlabourDate.toEpochDay() - date.toEpochDay();
  }
}
