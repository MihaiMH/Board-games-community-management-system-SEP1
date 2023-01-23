package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that stores all the Event objects into a list
 *
 * @author Cristian Josan && Tomas Masiar
 * @version 1.0
 */
public class EventList implements Serializable
{
  private ArrayList<Event> events;

  /**
   * No-argument constructor initializing the list
   */
  public EventList()
  {
    events = new ArrayList<Event>();
  }

  /**
   * Adds an Event object to the list
   *
   * @param event the Event to add
   */
  public void addEvent(Event event)
  {
    events.add(event);
  }

  /**
   * Removes an Event object from the list
   *
   * @param event the Event to remove
   */
  public void removeEvent(Event event)
  {

    events.remove(event);
  }

  /**
   * Gets an Event object from position index from the list
   *
   * @param index the position of the Event object in the list
   * @return the Event at index if one exists, else null
   */
  public Event getEventByIndex(int index)
  {
    if (index >= 0 && index < events.size())
      return events.get(index);
    else
      return null;
  }

  /**
   * Gets all Event objects from the list
   *
   * @return all the Event objects into a list
   */
  public ArrayList<Event> getAllEvents()
  {
    return events;
  }
}
