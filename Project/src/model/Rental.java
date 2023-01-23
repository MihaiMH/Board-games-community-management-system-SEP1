package model;

import java.io.Serializable;

/**
 * A class that stores the rent for a game
 *
 * @author Cristian Josan && Mihai Mihaila && Tomas Masiar
 * @version 1.0
 */
public class Rental implements Serializable
{
  private Member member;
  private Game game;
  private Date start_period;
  private Date end_period;
  private String location;

  /**
   * Five-argument constructor initializing the rent including location
   *
   * @param start_period start period as a Date to initialize
   * @param end_period   end period as a Date to initialize
   * @param member       the Member to initialize
   * @param game         the Game to initialize
   * @param location     location as a String to initialize
   */
  public Rental(Date start_period, Date end_period, Member member, Game game,
      String location)
  {
    this.member = member;
    this.game = game;
    this.start_period = start_period;
    this.end_period = end_period;
    this.location = location;
  }

  /**
   * Gets the Member from the Reservation
   *
   * @return the Member with all information into an Object
   */
  public Member getMember()
  {
    return member;
  }

  /**
   * Gets the Game from the Reservation
   *
   * @return the Game with all information into an Object
   */
  public Game getGame()
  {
    return game;
  }

  /**
   * Gets the start Date of the Reservation
   *
   * @return the start Date into an Object
   */
  public Date getStart_period()
  {
    return start_period;
  }

  /**
   * Gets the end Date of the Reservation
   *
   * @return the end Date into an Object
   */
  public Date getEnd_period()
  {
    return end_period;
  }

  /**
   * Gets the location of the Reservation
   *
   * @return the location as a String
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * Checks if the Rental is the same as the other Object
   *
   * @param obj the Object to check with
   * @return true if the Object obj is the same as the Rental, else false
   */
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Rental other = (Rental) obj;

    return member.equals(other.member) && game.equals(other.game)
        && start_period.equals(other.start_period) && end_period.equals(
        other.end_period) && location.equals(other.location);
  }

  /**
   * Gets the period of a rental
   *
   * @return period as a String
   */
  public String toString()
  {
    return start_period + " - "+end_period;
  }
}
