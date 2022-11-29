package model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A model manager providing a single access point to the model
 * @author Cristian Josan
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
   * @param membersFile the name and path of the file where members will be saved and retrieved
   * @param rentalsFile the name and path of the file where rentals will be saved and retrieved
   * @param reservationsFile the name and path of the file where reservations will be saved and retrieved
   * @param eventsFile the name and path of the file where events will be saved and retrieved
   * @param gamesFile the name and path of the file where games will be saved and retrieved
   */
  public ModelManager(String membersFile, String rentalsFile, String reservationsFile, String eventsFile, String gamesFile)
  {
    this.membersFile = membersFile;
    this.rentalsFile = rentalsFile;
    this.reservationsFile = reservationsFile;
    this.eventsFile = eventsFile;
    this.gamesFile = gamesFile;
  }

  /**
   * Uses the MyFileHandler class to retrieve a MemberList object with all Members.
   * @return a MemberList object with all stored members
   */
  public MemberList getMembers()
  {
    MemberList allMembers = new MemberList();

    try
    {
      allMembers = (MemberList)MyFileHandler.readFromBinaryFile(membersFile);
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
   * Retrieves a Member object with all information
   * @param ID ID of the Member to retrieve
   * @return the Member with the specified ID
   */
  public Member getMember(String ID)
  {
    MemberList allMembers = getMembers();

    return allMembers.getMemberByID(ID);
  }

  /**
   * Retrieves a Member object from position index from the MemberList object
   * @param index the position of the Member object in the list
   * @return the Member at the specified position in the list
   */
  public Member getMember(int index)
  {
    MemberList allMembers = getMembers();

    return allMembers.getMemberByIndex(index);
  }

  /**
   * Retrieves a MemberList object
   * @param indicator
   * @param value
   * @return
   */
  public MemberList getMembers(String indicator, String value)
  {
    MemberList allMembers = getMembers();

    return null;
  }

  /**
   * Retrieves a MemberList object by same status
   * @param status status to check with
   * @return the MemberList object with all Member objects by the same status
   */
  public MemberList getMembers(boolean status)
  {
    MemberList allMembers = getMembers();
    MemberList allMembersByStatus = new MemberList();
    ArrayList<Member> membersByStatus = new ArrayList<>();

    membersByStatus.addAll(allMembers.getMembersByStatus(status));

    for (int i = 0; i < membersByStatus.size(); i++)
    {
      allMembersByStatus.addMember(membersByStatus.get(i));
    }

    return allMembersByStatus;
  }

  /**
   * Adds a Member object to all members that exists in the list
   * @param member the Member object to add
   */
  public void addMember(Member member)
  {
    MemberList allMembers = getMembers();

    allMembers.addMember(member);
    saveMembers(allMembers);
  }

  /**
   * Adds a MemberList object to all members that exists in the list
   * @param members the MemberList object to add
   */
  public void addMembers(MemberList members)
  {
    MemberList allMembers = getMembers();

    for (int i = 0; i < members.getMembers().size(); i++)
    {
      allMembers.addMember(members.getMemberByIndex(i));
    }
    saveMembers(allMembers);
  }

  /**
   * Removes a Member object from all the members that exists in the list
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
   * @return a RentalList object with all stored rentals
   */
  public RentalList getRentals()
  {
    RentalList allRentals = new RentalList();

    try
    {
      allRentals = (RentalList)MyFileHandler.readFromBinaryFile(rentalsFile);
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
   * Retrieves a Rental object with all information
   * @param rental the Rental to retrieve
   * @return the Rental with all information
   */
  public Rental getRental(Rental rental)
  {
    RentalList allRentals = getRentals();

    return allRentals.getRental(rental);
  }

  /**
   * Retrieves a Rental object by the Game object
   * @param game the Game to check with
   * @return the Rental with the specified game
   */
  public Rental getRental(Game game)
  {
    RentalList allRentals = getRentals();

    return allRentals.getRentalByGame(game);
  }

  /**
   * Retrieves a RentalList object by the same start period and end period from the list
   * @param start_period the start period as a Date object to check with
   * @param end_period the end period as a Date object to check with
   * @return the RentalList object with the specified period
   */
  public RentalList getRentals(Date start_period, Date end_period)
  {
    RentalList allRentals = getRentals();
    RentalList allRentalsByDate = new RentalList();
    ArrayList<Rental> rentalsByDate = new ArrayList<>();

    rentalsByDate.addAll(allRentals.getRentalsByDate(start_period,end_period));

    for (int i = 0; i < allRentals.getRentals().size(); i++)
    {
      allRentalsByDate.addRent(rentalsByDate.get(i));
    }

    return allRentalsByDate;
  }

  /**
   * Retrieves a RentalList object by the Member object
   * @param member the Member to check with
   * @return the RentalList object with the specified member
   */
  public RentalList getRentals(Member member)
  {
    RentalList allRentals = getRentals();
    RentalList allRentalsByMember = new RentalList();
    ArrayList<Rental> rentalsByMember = new ArrayList<>();

    rentalsByMember.addAll(allRentals.getRentalsByMember(member));

    for (int i = 0; i < allRentals.getRentals().size(); i++)
    {
      allRentalsByMember.addRent(rentalsByMember.get(i));
    }

    return allRentalsByMember;
  }

  /**
   * Adds a Rental object to the all rentals that exists in the list
   * @param rent the Rent to add
   */
  public void addRent(Rental rent)
  {
    RentalList allRentals = getRentals();

    allRentals.addRent(rent);
    saveRentals(allRentals);
  }

  /**
   * Adds a RentalList object to the all rentals that exists in the list
   * @param rents the Rents to add
   */
  public void addRents(RentalList rents)
  {
    RentalList allRentals = getRentals();

    for (int i = 0; i < rents.getRentals().size(); i++)
    {
      allRentals.addRent(rents.getRentals().get(i));
    }
    saveRentals(allRentals);
  }

  /**
   * Removes a Rental object from the list
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
   * @return a ReservationList object with all stored reservations
   */
  public ReservationList getReservations()
  {
    ReservationList allReservations = new ReservationList();

    try
    {
      allReservations = (ReservationList)MyFileHandler.readFromBinaryFile(reservationsFile);
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
   * Retrieves a ReservationList object with the same Member object
   * @param member the Member to check with
   * @return a ReservationList object with the specified member
   */
  public ReservationList getReservations(Member member)
  {
    ReservationList allReservations = getReservations();
    ReservationList allReservationsByMember = new ReservationList();
    ArrayList<Reservation> reservationsByMember = new ArrayList<>();

    reservationsByMember.addAll(allReservations.getReservationsByMember(member));

    for (int i = 0; i < reservationsByMember.size(); i++)
    {
      allReservationsByMember.addReservation(reservationsByMember.get(i));
    }

    return allReservationsByMember;
  }

  /**
   * Retrieves a ReservationList object with the same start period and end period
   * @param start_period the start period as a Date to check with
   * @param end_period the end period as a Date to check with
   * @return a ReservationList object with the specified period
   */
  public ReservationList getReservations(Date start_period, Date end_period)
  {
    ReservationList allReservations = getReservations();
    ReservationList allReservationsByDate = new ReservationList();
    ArrayList<Reservation> reservationsByDate = new ArrayList<>();

    reservationsByDate.addAll(allReservations.getReservationsByDate(start_period,end_period));

    for (int i = 0; i < reservationsByDate.size(); i++)
    {
      allReservationsByDate.addReservation(reservationsByDate.get(i));
    }

    return allReservationsByDate;
  }

  /**
   * Retrieves a Reservation object with the same Game
   * @param game the Game to check with
   * @return the Reservation with the specified game
   */
  public Reservation getReservation(Game game)
  {
    ReservationList allReservations = getReservations();

    return allReservations.getReservationByGame(game);
  }

  /**
   * Adds a Reservation object to the all reservations that exists in the list
   * @param reservation the Reservation to add
   */
  public void addReservation(Reservation reservation)
  {
    ReservationList allReservations = getReservations();

    allReservations.addReservation(reservation);
    saveReservations(allReservations);
  }

  /**
   * Adds a ReservationList object to the all reservations that exists in the list
   * @param reservations the ReservationList to add
   */
  public void addReservations(ReservationList reservations)
  {
    ReservationList allReservations = getReservations();

    for (int i = 0; i < reservations.getReservations().size(); i++)
    {
      allReservations.addReservation(reservations.getReservations().get(i));
    }
    saveReservations(allReservations);
  }

  /**
   * Removes a Reservation object from the list
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
   * @return a GameList object with all stored games
   */
  public GameList getAllGames()
  {
    GameList allGames = new GameList();

    try
    {
      allGames = (GameList)MyFileHandler.readFromBinaryFile(gamesFile);
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
   * Retrieves a GameList object with the same status
   * @param status the status to check with
   * @return the GameList object with the specified status
   */
  public GameList getGames(int status)
  {
    GameList allGames = getAllGames();
    GameList allGamesByStatus = new GameList();
    ArrayList<Game> gamesByStatus = new ArrayList<>();

    gamesByStatus.addAll(allGames.getGamesByStatus(status));

    for (int i = 0; i < gamesByStatus.size(); i++)
    {
      allGamesByStatus.addGame(gamesByStatus.get(i));
    }

    return allGamesByStatus;
  }

  /**
   * Retrieves a GameList object with all the games with the same name
   * @param name the name of the game to check with
   * @return the GameList object with the specified game's name
   */
  public GameList getGames(String name)
  {
    GameList allGames = getAllGames();
    GameList allGamesByName = new GameList();
    ArrayList<Game> gamesByName = new ArrayList<>();

    gamesByName.addAll(allGames.getGamesByName(name));

    for (int i = 0; i < gamesByName.size(); i++)
    {
      allGamesByName.addGame(gamesByName.get(i));
    }

    return allGamesByName;
  }

  /**
   * Retrieves a Game object from position index in the list
   * @param index the position of the Game object in the list
   * @return the Game at the specified position in the list
   */
  public Game getGame(int index)
  {
    GameList allGames = getAllGames();

    return allGames.getGameByIndex(index);
  }

  /**
   * Adds a Game object to the all games that exists
   * @param game the Game to add
   */
  public void addGame(Game game)
  {
    GameList allGames = getAllGames();

    allGames.addGame(game);
    saveGames(allGames);
  }

  /**
   * Adds a GameList object to the all games that exists
   * @param games the GameList object to add
   */
  public void addGames(GameList games)
  {
    GameList allGames = getAllGames();

    for (int i = 0; i < games.getAllGames().size(); i++)
    {
      allGames.addGame(games.getAllGames().get(i));
    }
    saveGames(allGames);
  }

  /**
   * Removes a Game object from all the games
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
   * @return an EventList object with all stored events
   */
  public EventList getEvents()
  {
    EventList allEvents = new EventList();

    try
    {
      allEvents = (EventList)MyFileHandler.readFromBinaryFile(eventsFile);
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
   * Retrieves an EventList object with all events by the same date
   * @param date the date as a Date object to check with
   * @return the EventList with all events with the specified date
   */
  public EventList getEvents(Date date)
  {
    EventList allEvents = getEvents();
    EventList allEventsByDate = new EventList();
    ArrayList<Event> eventsByDate = new ArrayList<>();

    eventsByDate.addAll(allEvents.getEventsByDate(date));

    for (int i = 0; i < eventsByDate.size(); i++)
    {
      allEventsByDate.addEvent(eventsByDate.get(i));
    }

    return allEventsByDate;
  }

  /**
   * Retrieves an EventList object with all events by the same name
   * @param name the name as a String to check with
   * @return the EventList with all events with the specified name
   */
  public EventList getEvents(String name)
  {
    EventList allEvents = getEvents();
    EventList allEventsByName = new EventList();
    ArrayList<Event> eventsByName = new ArrayList<>();

    eventsByName.addAll(allEvents.getEventsByName(name));

    for (int i = 0; i < eventsByName.size(); i++)
    {
      allEventsByName.addEvent(eventsByName.get(i));
    }

    return allEventsByName;
  }

  /**
   * Retrieves an Event object from position index in the list
   * @param index the position of the Event object in the list
   * @return the Event at the specified position in the list
   */
  public Event getEvent(int index)
  {
    EventList allEvents = getEvents();

    return allEvents.getEventByIndex(index);
  }

  /**
   * Adds an Event object to the all events that exists
   * @param event the Event to add
   */
  public void addEvent(Event event)
  {
    EventList allEvents = getEvents();

    allEvents.addEvent(event);
    saveEvents(allEvents);
  }

  /**
   * Adds an EventList object to the all events that exists
   * @param events the EventList object to add
   */
  public void addEvents(EventList events)
  {
    EventList allEvents = getEvents();

    for (int i = 0; i < events.getAllEvents().size(); i++)
    {
      allEvents.addEvent(events.getEventByIndex(i));
    }
    saveEvents(allEvents);
  }

  /**
   * Removes an Event object from the all events
   * @param event the Event to remove
   */
  public void removeEvent(Event event)
  {
    EventList allEvents = getEvents();

    allEvents.removeEvent(event);
    saveEvents(allEvents);
  }
}