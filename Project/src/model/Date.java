package model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A class that stores the date
 *
 * @author Cristian Josan && Mihai Mihaila
 * @version 1.0
 */
public class Date implements Serializable
{
  private int year;
  private int month;
  private int day;
  private int hour;
  private int minute;

  /**
   * Three-argument constructor initializing Date object and setting hour and minute to 0
   *
   * @param year  year to initialize
   * @param month month to initialize
   * @param day   day to initialize
   */
  public Date(int year, int month, int day)
  {
    this.year = year;
    this.month = month;
    this.day = day;
    hour = 0;
    minute = 0;
  }

  /**
   * Five-argument constructor initializing Date object
   *
   * @param year   year to initialize
   * @param month  month to initialize
   * @param day    day to initialize
   * @param hour   hour to initialize
   * @param minute minute to initialize
   */
  public Date(int year, int month, int day, int hour, int minute)
  {
    this.year = year;
    this.month = month;
    this.day = day;
    this.hour = hour;
    this.minute = minute;
  }

  /**
   * Gets the year of the Date object
   *
   * @return year as an integer
   */
  public int getYear()
  {
    return year;
  }

  /**
   * Gets the month of the Date object
   *
   * @return month as an integer
   */
  public int getMonth()
  {
    return month;
  }

  /**
   * Gets the minute of the Date object
   *
   * @return minute as an integer
   */
  public int getMinute()
  {
    return minute;
  }

  /**
   * Gets the day of the Date object
   *
   * @return day as an integer
   */
  public int getDay()
  {
    return day;
  }

  /**
   * Gets the hour of the Date object
   *
   * @return hour month as an integer
   */
  public int getHour()
  {
    return hour;
  }

  /**
   * Checks if the Date is the same as the other Object
   *
   * @param obj the Object to check with
   * @return true if the Object obj is the same as the Date, else false
   */
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Date other = (Date) obj;

    return year == other.year && month == other.month && day == other.day
        && hour == other.hour && minute == other.minute;
  }

  /**
   * Compares two Date objects
   *
   * @param date the Date object to compare with
   * @return true if the parameter date is earlier than the Date object, else false
   */
  public boolean compare(Date date)
  {
    if (this.year > date.year)
    {
      return true;
    }
    if (this.year < date.year)
    {
      return false;
    }

    if (this.year == date.year)
    {
      if (this.month > date.month)
      {
        return true;
      }
      if (this.month < date.month)
      {
        return false;
      }
      if (this.month == date.month)
      {
        if (this.day > date.day)
        {
          return true;
        }
        if (this.day < date.day)
        {
          return false;
        }
        if (this.day == date.day)
        {
          if (this.hour > date.hour)
          {
            return true;
          }
          if (this.hour < date.hour)
          {
            return false;
          }
          if (this.hour == date.hour)
          {
            if (this.minute > date.minute)
            {
              return true;
            }
            if (this.minute < date.minute)
            {
              return false;
            }
            if (this.minute == date.minute)
            {
              return false;
            }
          }
        }
      }
    }
    return false;
  }

  /**
   * Gets the date in a string of the Date object
   *
   * @return date in this format as a String dd/mm/yyyy hh:mm (Example: 02/04/2003 05:20)
   */
  public String toString()
  {
    String str = "";

    if (day < 10)
      str += "0" + day + "/";
    else
      str += day + "/";

    if (month < 10)
      str += "0" + month + "/";
    else
      str += month + "/";

    str += year + " ";

    if (hour < 10)
      str += "0" + hour + ":";
    else
      str += hour + ":";

    if (minute < 10)
      str += "0" + minute;
    else
      str += minute;

    return str;
  }
}
