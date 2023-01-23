package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that store the Reservation objects into a list
 *
 * @author Cristian Josan && Dominika Krullov && Mihai Mihaila
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
   *
   * @param reservation the Reservation to add
   */
  public void addReservation(Reservation reservation)
  {
    reservations.add(reservation);
  }

  /**
   * Removes a Reservation from the list
   *
   * @param reservation the Reservation to remove
   * @return true if the Reservation is removed, false if the Reservation is not found
   */
  public boolean removeReservation(Reservation reservation)
  {
    return reservations.remove(reservation);
  }


  /**
   * Gets all Reservation objects from the list
   *
   * @return all the Reservation objects into a list
   */
  public ArrayList<Reservation> getReservations()
  {
    return reservations;
  }

}
