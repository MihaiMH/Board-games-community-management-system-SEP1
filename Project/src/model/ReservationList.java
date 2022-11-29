package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that store the Reservation objects into a list
 * @author Cristian Josan
 * @version 1.0
 */
public class ReservationList implements Serializable
{
  private ArrayList<Reservation> reservations;

  /**
   * No-argument constructor initializing the list
   */
  public ReservationList()
  {
    reservations = new ArrayList<Reservation>();
  }

  /**
   * Adds a Reservation to the list
   * @param reservation the Reservation to add
   */
  public void addReservation(Reservation reservation)
  {
    reservations.add(reservation);
    reservations.remove(reservation);
  }

  /**
   * Removes a Reservation from the list
   * @param reservation the Reservation to remove
   * @return true if the Reservation is removed, false if the Reservation is not found
   */
  public boolean removeReservation(Reservation reservation)
  {
    return reservations.remove(reservation);
  }

  /**
   * Gets a Reservation by Game from the list
   * @param game the Game to check with
   * @return the Reservation if the Game is found in the list of Reservations, else null
   */
  public Reservation getReservationByGame(Game game)
  {
    for (int i = 0; i < reservations.size(); i++)
    {
      if( reservations.get(i).getGame().equals(game) )
        return reservations.get(i);
    }

    return null;
  }

  /**
   * Gets all Reservation objects by start period and end period from the list
   * @param start_period start period as a Date to check with
   * @param end_period end period as a Date to check with
   * @return all the Reservation objects with the specified Date into a list
   */
  public ArrayList<Reservation> getReservationsByDate(Date start_period, Date end_period)
  {
    ArrayList<Reservation> reservationsByDate = new ArrayList<Reservation>();

    for (int i = 0; i < reservations.size(); i++)
    {
      if( reservations.get(i).getStart_period().equals(start_period) && reservations.get(i).getEnd_period().equals(end_period) )
        reservationsByDate.add(reservations.get(i));
    }

    return reservationsByDate;
  }

  /**
   * Gets all Reservation objects by Member from the list
   * @param member the Member to check with
   * @return all the Reservation objects with the specified Member into a list
   */
  public ArrayList<Reservation> getReservationsByMember(Member member)
  {
    ArrayList<Reservation> reservationsByMember = new ArrayList<Reservation>();

    for (int i = 0; i < reservations.size(); i++)
    {
      if( reservations.get(i).getMember().equals(member) )
        reservationsByMember.add(reservations.get(i));
    }

    return reservationsByMember;
  }

  /**
   * Gets all Reservation objects from the list
   * @return all the Reservation objects into a list
   */
  public ArrayList<Reservation> getReservations()
  {
    return reservations;
  }
}
