package model;

import java.io.Serializable;

/**
 * A class that stores the reservation of a game
 *
 * @author Cristian Josan && Tomas Masiar && Mihai Mihaila
 * @version 1.0
 */
public class Reservation implements Serializable
{
  private Member member;
  private Game game;
  private Date start_period;
  private Date end_period;

  /**
   * Four-argument constructor initializing the Reservation
   *
   * @param start_period start period as a Date to initialize
   * @param end_period   end period as a Date to initialize
   * @param member       the Member to initialize
   * @param game         the Game to initialize
   */
  public Reservation(Date start_period, Date end_period, Member member,
      Game game)
  {
    this.start_period = start_period;
    this.end_period = end_period;
    this.member = member;
    this.game = game;
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
   * Checks if the Reservation is the same as the other Object
   *
   * @param obj the Object to check with
   * @return true if the Object obj is the same as the Reservation, else false
   */
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Reservation other = (Reservation) obj;

    return member.equals(other.member) && game.equals(other.game)
        && start_period.equals(other.start_period) && end_period.equals(
        other.end_period);
  }

  /**
   * Gets the period of a reservation
   *
   * @return period as a String
   */
  public String toString()
  {
    return start_period + " - "+end_period;
  }
}
