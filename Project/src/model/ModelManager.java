package model;

import model.*;
import utils.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A model manager providing a single access point to the model
 *
 * @author Cristian Josan && Dominika Krullova && Tomas Masiar && Mihai Mihaila
 * @version 1.0
 */
public class ModelManager
{
  private String membersFile;
  private String rentalsFile;
  private String reservationsFile;
  private String eventsFile;
  private String gamesFile;

  /**
   * Five-argument constructor setting the file names.
   *
   * @param membersFile      the name and path of the file where members will be saved and retrieved
   * @param rentalsFile      the name and path of the file where rentals will be saved and retrieved
   * @param reservationsFile the name and path of the file where reservations will be saved and retrieved
   * @param eventsFile       the name and path of the file where events will be saved and retrieved
   * @param gamesFile        the name and path of the file where games will be saved and retrieved
   */
  public ModelManager(String membersFile, String rentalsFile,
      String reservationsFile, String eventsFile, String gamesFile)
  {
    this.membersFile = membersFile;
    this.rentalsFile = rentalsFile;
    this.reservationsFile = reservationsFile;
    this.eventsFile = eventsFile;
    this.gamesFile = gamesFile;
  }

  /**
   * Uses the MyFileHandler class to retrieve a MemberList object with all Members.
   *
   * @return a MemberList object with all stored members
   */
  public MemberList getMembers()
  {
    MemberList allMembers = new MemberList();

    try
    {
      allMembers = (MemberList) MyFileHandler.readFromBinaryFile(membersFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allMembers;
  }

  /**
   * Uses the MyFileHandler class to save a list of members.
   *
   * @param members the list of members that will be saved
   */
  public void saveMembers(MemberList members)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(membersFile, members);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  /**
   * Adds a Member object to all members that exists in the list
   *
   * @param member the Member object to add
   */
  public void addMember(Member member)
  {
    MemberList allMembers = getMembers();

    allMembers.addMember(member);
    saveMembers(allMembers);
  }

  /**
   * Removes a Member object from all the members that exists in the list
   *
   * @param member the Member to remove
   */
  public void deleteMember(Member member)
  {
    MemberList allMembers = getMembers();

    allMembers.removeMember(member);
    saveMembers(allMembers);
  }

  /**
   * Uses the MyFileHandler class to retrieve a RentalList object with all Rentals.
   *
   * @return a RentalList object with all stored rentals
   */
  public RentalList getRentals()
  {
    RentalList allRentals = new RentalList();

    try
    {
      allRentals = (RentalList) MyFileHandler.readFromBinaryFile(rentalsFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allRentals;
  }

  /**
   * Uses the MyFileHandler class to save a list of rentals.
   *
   * @param rentals the list of rentals that will be saved
   */
  public void saveRentals(RentalList rentals)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(rentalsFile, rentals);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  /**
   * Adds a Rental object to the all rentals that exists in the list
   *
   * @param rent the Rent to add
   */
  public void addRent(Rental rent)
  {
    RentalList allRentals = getRentals();

    allRentals.addRent(rent);
    saveRentals(allRentals);
  }

  /**
   * Removes a Rental object from the list
   *
   * @param rental the Rental to remove
   */
  public void removeRental(Rental rental)
  {
    RentalList allRentals = getRentals();

    allRentals.removeRental(rental);
    saveRentals(allRentals);
  }

  /**
   * Uses the MyFileHandler class to retrieve a ReservationList object with all Reservations.
   *
   * @return a ReservationList object with all stored reservations
   */
  public ReservationList getReservations()
  {
    ReservationList allReservations = new ReservationList();

    try
    {
      allReservations = (ReservationList) MyFileHandler.readFromBinaryFile(
          reservationsFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allReservations;
  }

  /**
   * Uses the MyFileHandler class to save a list of reservations.
   *
   * @param reservations the list of reservations that will be saved
   */
  public void saveReservations(ReservationList reservations)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(reservationsFile, reservations);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  /**
   * Adds a Reservation object to the all reservations that exists in the list
   *
   * @param reservation the Reservation to add
   */
  public void addReservation(Reservation reservation)
  {
    ReservationList allReservations = getReservations();

    allReservations.addReservation(reservation);
    saveReservations(allReservations);
  }

  /**
   * Removes a Reservation object from the list
   *
   * @param reservation the Reservation to remove
   */
  public void removeReservation(Reservation reservation)
  {
    ReservationList allReservations = getReservations();

    allReservations.removeReservation(reservation);
    saveReservations(allReservations);
  }

  /**
   * Uses the MyFileHandler class to retrieve a GameList object with all Games.
   *
   * @return a GameList object with all stored games
   */
  public GameList getAllGames()
  {
    GameList allGames = new GameList();

    try
    {
      allGames = (GameList) MyFileHandler.readFromBinaryFile(gamesFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allGames;
  }

  /**
   * Uses the MyFileHandler class to save a list of games.
   *
   * @param games the list of games that will be saved
   */
  public void saveGames(GameList games)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(gamesFile, games);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  /**
   * Adds a Game object to the all games that exists
   *
   * @param game the Game to add
   */
  public void addGame(Game game)
  {
    GameList allGames = getAllGames();

    allGames.addGame(game);
    saveGames(allGames);
  }

  /**
   * Removes a Game object from all the games
   *
   * @param game the Game to remove
   */
  public void removeGame(Game game)
  {
    GameList allGames = getAllGames();

    allGames.removeGame(game);
    saveGames(allGames);
  }

  /**
   * Uses the MyFileHandler class to retrieve an EventList object with all Events.
   *
   * @return an EventList object with all stored events
   */
  public EventList getEvents()
  {
    EventList allEvents = new EventList();

    try
    {
      allEvents = (EventList) MyFileHandler.readFromBinaryFile(eventsFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }

    return allEvents;
  }

  /**
   * Uses the MyFileHandler class to save a list of events.
   *
   * @param events the list of events that will be saved
   */
  public void saveEvents(EventList events)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(eventsFile, events);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  /**
   * Adds an Event object to the all events that exists
   *
   * @param event the Event to add
   */
  public void addEvent(Event event)
  {
    EventList allEvents = getEvents();

    allEvents.addEvent(event);
    saveEvents(allEvents);
  }

  /**
   * Removes an Event object from the all events
   *
   * @param event the Event to remove
   */
  public void removeEvent(Event event)
  {
    EventList allEvents = getEvents();

    allEvents.removeEvent(event);
    saveEvents(allEvents);
  }

  /**
   * Saves data in a XML file
   *
   * @param fileName the name of the File
   * @param data     the Data that needs to be saved
   */
  public void saveXML(String fileName, String data)
  {
    try
    {
      MyFileHandler.writeToTextFile(fileName, data);
    }
    catch (FileNotFoundException error)
    {
      System.out.println("Can't save XML File, " + error.getMessage());
    }
  }
}