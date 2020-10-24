package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    int currentDayofWeek = date.getDayOfWeek().getValue();
    int nextDayofWork = currentDayofWeek;
    for (int i=0;i<3;i++) {
      nextDayofWork += 1;
      if(nextDayofWork != 6 && nextDayofWork != 7) break;
    }
    return date.plusDays(nextDayofWork - currentDayofWeek);
  }
}
