package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class that stores all the Event objects into a list
 * @author Cristian Josan
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
   * @param event the Event to add
   */
  public void addEvent(Event event)
  {
    events.add(event);
  }

  /**
   * Removes an Event object from the list
   * @param event the Event to remove
   * @return true if the Event is removed, false if the Event is not found
   */
  public boolean removeEvent(Event event)
  {
    return events.remove(event);
  }

  /**
   * Gets an Event object from position index from the list
   * @param index the position of the Event object in the list
   * @return the Event at index if one exists, else null
   */
  public Event getEventByIndex(int index)
  {
    if( index >= 0 && index < events.size() )
      return events.get(index);
    else
      return null;
  }

  /**
   * Gets all Event objects by name from the list
   * @param name name of the Event
   * @return all the Event objects with the specified name into a list
   */
  public ArrayList<Event> getEventsByName(String name)
  {
    ArrayList<Event> eventsByName = new ArrayList<Event>();

    for (int i = 0; i < events.size(); i++)
    {
      if( events.get(i).getName().equals(name) )
      {
        eventsByName.add(events.get(i));
      }
    }

    return eventsByName;
  }

  /**
   * Gets all Event objects by Date from the list
   * @param date date as a Date object of the Event
   * @return all the Event object with the specified Date into a list
   */
  public ArrayList<Event> getEventsByDate(Date date)
  {
    ArrayList<Event> eventsByDate = new ArrayList<Event>();

    for (int i = 0; i < events.size(); i++)
    {
      if( events.get(i).getDate().equals(date) )
      {
        eventsByDate.add(events.get(i));
      }
    }

    return eventsByDate;
  }

  /**
   * Gets all Event objects from the list
   * @return all the Event objects into a list
   */
  public ArrayList<Event> getAllEvents()
  {
    return events;
  }
}
