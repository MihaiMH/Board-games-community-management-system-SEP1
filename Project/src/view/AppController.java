package view;

import model.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

/**
 * A class that controls all the events
 *
 * @author Mihai Mihaila && Cristian Josan && Dominika Krulova && Tomas Masiar
 * @version 1.0
 */
public class AppController
{

  @FXML private TabPane allTabPane;
  // MEMBERS TAB START
  @FXML private Tab membersTab;
  @FXML private TabPane membersTabPane;

  // addMember SECTION START
  @FXML private Tab addMemberTab;
  @FXML private TextField addMemberFN; // FN - First Name
  @FXML private TextField addMemberLN; // LN - Last Name
  @FXML private TextField addMemberID;
  @FXML private CheckBox addMemberStatus;
  @FXML private Button addMemberConfirm;

  // addMember SECTION END

  // manageMembers SECTION START
  @FXML private Tab manageMembersTab;
  @FXML private ComboBox<Member> membersListTab;
  @FXML private TextField manageMemberFN;
  @FXML private TextField manageMemberLN;
  @FXML private TextField manageMemberID;
  @FXML private CheckBox manageMemberStatus;
  @FXML private Button manageMemberStart;
  @FXML private Button manageMemberCancel;
  @FXML private Button manageMemberSave;
  @FXML private Button deleteMember;
  // manageMembers SECTION END

  // MEMBERS TAB END

  // GAMES TAB START

  @FXML private Tab gamesTab;
  @FXML private TabPane gamesTabPane;

  // addGames SECTION START
  @FXML private Tab addGameTab;
  @FXML private TextField addGameName;
  @FXML private TextField addGameNr;
  @FXML private CheckBox addGameStatus;
  @FXML private TextField addGameLink;
  @FXML private TextArea addGameDesc;
  @FXML private Button addGameConfirm;

  // addGames SECTION END

  // manageGames SECTION START
  @FXML private Tab manageGamesTab;
  @FXML private ComboBox<Game> gamesListTab;
  @FXML private TextField manageGamesName;
  @FXML private TextField manageGamesNr;
  @FXML private CheckBox manageGamesStatus;
  @FXML private TextField manageGamesLink;
  @FXML private TextArea manageGamesDesc;
  @FXML private Button manageGamesEdit;
  @FXML private Button manageGamesCancel;
  @FXML private Button manageGamesSave;
  @FXML private Button deleteGame;
  @FXML private Label gameRating;

  // manageGames SECTION END

  // GAMES TAB END

  // EVENTS TAB START

  @FXML private Tab eventsTab;
  @FXML private TabPane eventsTabPane;

  // addEvent SECTION START
  @FXML private Tab addEventTab;
  @FXML private TextField addEventName;
  @FXML private TextArea addEventDesc;
  @FXML private ComboBox<Game> addEventGame;
  @FXML private DatePicker addEventDate;
  @FXML private TextField addEventHour;
  @FXML private TextField addEventMinute;
  @FXML private Button addEventConfirm;

  // addEvent SECTION END

  // manageEvents SECTION START
  @FXML private Tab manageEventsTab;

  @FXML private ComboBox<model.Event> eventsListTab;
  @FXML private TextField manageEventsName;
  @FXML private TextArea manageEventsDesc;
  @FXML private ComboBox<Game> manageEventsGame;
  @FXML private DatePicker manageEventsDate;
  @FXML private TextField manageEventsHour;
  @FXML private TextField manageEventsMinute;
  @FXML private TextArea manageEventsMembers;
  @FXML private ComboBox<Member> manageEventsAddMember;
  @FXML private ComboBox<Member> manageEventsRemoveMember;
  @FXML private Button manageEventsStart;
  @FXML private Button manageEventsCancel;
  @FXML private Button manageEventsSave;
  @FXML private Button deleteEvent;

  // manageEvents SECTION END

  // EVENTS TAB END

  // RESERVATIONS TAB START

  @FXML private Tab reservationsTab;
  @FXML private TabPane reservationsTabPane;

  // addReservation SECTION START
  @FXML private Tab addReservationTab;
  @FXML private ComboBox<Member> addReservationMember;
  @FXML private ComboBox<Game> addReservationGame;
  @FXML private DatePicker addReservationSDate;
  @FXML private TextField addReservationSHour;
  @FXML private TextField addReservationSMinute;
  @FXML private DatePicker addReservationEDate;
  @FXML private TextField addReservationEHour;
  @FXML private TextField addReservationEMinute;
  @FXML private Button addReservationConfirm;

  // addReservations SECTION END

  // manageReservations SECTION START
  @FXML private Tab manageReservationsTab;

  @FXML private ComboBox<Reservation> reservationsListTab;
  @FXML private Label manageReservationsMember;
  @FXML private Label manageReservationsGame;
  @FXML private Label manageReservationsSDate;
  @FXML private Label manageReservationsEDate;
  @FXML private Button manageReservationsEnd;
  @FXML private Button manageReservationsToBorrowing;
  @FXML private TextField manageReservationsLocation;
  // manageReservations SECTION END

  // RESERVATIONS TAB END

  // BORROWINGS TAB START
  @FXML private Tab borrowingsTab;
  @FXML private TabPane borrowingsTabPane;

  // addBorrowing SECTION START
  @FXML private Tab addBorrowingTab;
  @FXML private ComboBox<Member> addBorrowingMember;
  @FXML private ComboBox<Game> addBorrowingGame;
  @FXML private DatePicker addBorrowingSDate;
  @FXML private TextField addBorrowingSHour;
  @FXML private TextField addBorrowingSMinute;
  @FXML private DatePicker addBorrowingEDate;
  @FXML private TextField addBorrowingEHour;
  @FXML private TextField addBorrowingEMinute;
  @FXML private TextField addBorrowingLocation;
  @FXML private Button addBorrowingConfirm;

  // addBorrowing SECTION END

  // manageBorrowing SECTION START
  @FXML private Tab manageBorrowingsTab;
  @FXML private ComboBox<Rental> borrowingsListTab;
  @FXML private Label manageBorrowingMember;
  @FXML private Label manageBorrowingGame;
  @FXML private Label manageBorrowingSDate;
  @FXML private Label manageBorrowingEDate;
  @FXML private Label manageBorrowingLocation;
  @FXML private Button manageBorrowingEnd;
  @FXML private TextField addGameRating;

  // manageBorrowing SECTION END

  // BORROWINGS TAB END

  // EXTRAS TAB START

  @FXML private Tab extrasTab;

  @FXML private Button exportWebsite;

  // EXTRAS TAB END

  private ModelManager modelManager;

  /**
   * Initializes binary files with the information if there is to be loaded in the application, if not just creates empty binary files
   */
  public void initialize()
  {
    modelManager = new ModelManager("members.bin", "borrowings.bin",
        "reservations.bin", "events.bin", "games.bin");
    updateMembersBox();
    updateMembersForReservationBox();
    updateMembersForBorrowingBox();
    updateGamesBox();
    updateGamesForEventsBox();
    updateGamesForReservationBox();
    updateGamesForBorrowingBox();
    updateEventsBox();
    updateReservationBox();
    updateBorrowingBox();
  }

  /**
   * Pops an alert error on the screen
   *
   * @param msg the message to show
   */
  private static void alert_error(String msg)
  {
    Alert alert = new Alert(Alert.AlertType.ERROR, msg, ButtonType.OK);
    alert.setTitle("Error");
    alert.setHeaderText(null);
    alert.show();
  }

  /**
   * Pops an alert message on the screen
   *
   * @param msg the message to show
   */
  private static void alert_message(String msg)
  {
    Alert alert = new Alert(Alert.AlertType.INFORMATION, msg, ButtonType.OK);
    alert.setTitle("INFO");
    alert.setHeaderText(null);
    alert.show();
  }

  /**
   * Updates the members combo box with the information from the binary files
   */
  private void updateMembersBox()
  {
    int currentIndex = membersListTab.getSelectionModel().getSelectedIndex();
    membersListTab.getItems().clear();

    MemberList members = modelManager.getMembers();
    for (int i = 0; i < members.getMembers().size(); i++)
    {
      membersListTab.getItems().add(members.getMemberByIndex(i));
    }

    if (currentIndex > -1)
    {
      membersListTab.getSelectionModel().select(currentIndex);

    }
  }

  /**
   * Updates the members combo box in the reservation tab with the information from the binary files
   */
  private void updateMembersForReservationBox()
  {
    addReservationMember.getItems().clear();
    MemberList aux = modelManager.getMembers();
    for (int i = 0; i < aux.getMembers().size(); i++)
    {
      addReservationMember.getItems().add(aux.getMemberByIndex(i));
    }
    addReservationMember.getSelectionModel().select(-1);
  }

  /**
   * Updates the members combo box in the borrowing tab with the information from the binary files
   */
  private void updateMembersForBorrowingBox()
  {
    addBorrowingMember.getItems().clear();
    MemberList aux = modelManager.getMembers();
    for (int i = 0; i < aux.getMembers().size(); i++)
    {
      addBorrowingMember.getItems().add(aux.getMemberByIndex(i));
    }
    addBorrowingMember.getSelectionModel().select(-1);
  }

  /**
   * Updates the events combo box with the information from the binary files
   */
  private void updateEventsBox()
  {
    int currentIndex = eventsListTab.getSelectionModel().getSelectedIndex();
    eventsListTab.getItems().clear();

    EventList events = modelManager.getEvents();
    for (int i = 0; i < events.getAllEvents().size(); i++)
    {
      eventsListTab.getItems().add(events.getEventByIndex(i));
    }

    if (currentIndex > -1)
    {
      eventsListTab.getSelectionModel().select(currentIndex);

    }
  }

  /**
   * Updates the games combo box with the information from the binary files
   */
  private void updateGamesBox()
  {
    int currentIndex = gamesListTab.getSelectionModel().getSelectedIndex();
    gamesListTab.getItems().clear();

    GameList games = modelManager.getAllGames();
    for (int i = 0; i < games.getAllGames().size(); i++)
    {
      gamesListTab.getItems().add(games.getGameByIndex(i));
    }

    if (currentIndex > -1)
    {
      gamesListTab.getSelectionModel().select(currentIndex);
    }
  }

  /**
   * Updates the games combo box in the events add tab with the information from the binary files
   */
  private void updateGamesForEventsBox()
  {
    addEventGame.getItems().clear();
    GameList temp = new GameList();
    temp = modelManager.getAllGames();
    addEventGame.getItems().add(null);
    for (int i = 0; i < temp.getAllGames().size(); i++)
    {
      addEventGame.getItems().add(temp.getGameByIndex(i));
    }
    addEventGame.getSelectionModel().select(-1);
  }

  /**
   * Updates the games combo box in the events manage tab with the information from the binary files
   */
  private void updateGamesForEventsBox2()
  {
    manageEventsGame.getItems().clear();
    GameList temp = new GameList();
    temp = modelManager.getAllGames();
    manageEventsGame.getItems().add(null);
    for (int i = 0; i < temp.getAllGames().size(); i++)
    {
      manageEventsGame.getItems().add(temp.getGameByIndex(i));
    }
    manageEventsGame.getSelectionModel().select(-1);
  }

  /**
   * Updates the games combo box in the reservation tab with the information from the binary files
   */
  private void updateGamesForReservationBox()
  {
    addReservationGame.getItems().clear();
    GameList aux = modelManager.getAllGames();
    for (int i = 0; i < aux.getAllGames().size(); i++)
    {
      addReservationGame.getItems().add(aux.getGameByIndex(i));
    }
    addReservationGame.getSelectionModel().select(-1);
  }

  /**
   * Updates the games combo box in the borrowing tab with the information from the binary files
   */
  private void updateGamesForBorrowingBox()
  {
    addBorrowingGame.getItems().clear();
    GameList aux = modelManager.getAllGames();
    for (int i = 0; i < aux.getAllGames().size(); i++)
    {
      addBorrowingGame.getItems().add(aux.getGameByIndex(i));
    }
    addBorrowingGame.getSelectionModel().select(-1);
  }

  /**
   * Updates the reservation combo box with the information from the binary files
   */
  private void updateReservationBox()
  {
    int currentIndex = reservationsListTab.getSelectionModel()
        .getSelectedIndex();
    reservationsListTab.getItems().clear();

    ReservationList reservations = modelManager.getReservations();
    for (int i = 0; i < reservations.getReservations().size(); i++)
    {
      reservationsListTab.getItems().add(reservations.getReservations().get(i));
    }

    if (currentIndex > -1)
    {
      reservationsListTab.getSelectionModel().select(currentIndex);
    }
  }

  /**
   * Updates the borrowing combo box with the information from the binary files
   */
  private void updateBorrowingBox()
  {
    int currentIndex = borrowingsListTab.getSelectionModel().getSelectedIndex();
    borrowingsListTab.getItems().clear();

    RentalList borrowings = modelManager.getRentals();
    for (int i = 0; i < borrowings.getRentals().size(); i++)
    {
      borrowingsListTab.getItems().add(borrowings.getRentals().get(i));
    }

    if (currentIndex > -1)
    {
      borrowingsListTab.getSelectionModel().select(currentIndex);
    }
  }

  /**
   * Checks if the input text is a number
   *
   * @param txt the text to check with
   * @return true if the input text is a number, else false
   */
  private boolean checkField(String txt)
  {
    for (int i = 0; i < txt.length(); i++)
    {
      if ((int) txt.charAt(i) >= 48 && (int) txt.charAt(i) <= 57)
      {
        continue;
      }
      else
      {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks if the input for hours is between 0 and 23 and if the input for minutes is between 0 and 59
   *
   * @param h the hours text to check with
   * @param m the minutes text to check with
   * @return true if the hours and minutes are valid, else false
   */
  private boolean checkTime(String h, String m)
  {
    int hour = Integer.parseInt(h);
    int minute = Integer.parseInt(m);
    if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59)
    {
      return true;
    }
    else
      return false;
  }

  /**
   * Compares if first hour and minute are greater than second hour and minute
   *
   * @param h1 the first hour to check with
   * @param m1 the first minute to check with
   * @param h2 the second hour to check with
   * @param m2 the second minute to check with
   * @return true if the first hour and minute are greater than the second ones.
   */
  private boolean compareTime(int h1, int m1, int h2, int m2)
  {
    if (h1 > h2)
      return true;
    if (h1 < h2)
      return false;
    if (h1 == h2 && m1 > m2)
      return true;
    return false;
  }

  /**
   * Checks if the game is not used for an event/a reservation/a borrowing on a certain period
   *
   * @param game  the game to check with
   * @param sDate the start Date to check with
   * @param eDate the end Date to check with
   * @param ok    the parameter that checks if the function returns automatically true or not
   * @return true if the game is available at that period, else false
   */
  private boolean gameAvailableByDate(Game game, Date sDate, Date eDate,
      boolean ok)
  {
    if (ok == true)
      return true;
    ReservationList reservationList = modelManager.getReservations();
    EventList eventList = modelManager.getEvents();
    RentalList rentalList = modelManager.getRentals();

    for (int i = 0; i < reservationList.getReservations().size(); i++)
    {
      if (reservationList.getReservations().get(i).getGame().equals(game))
      {
        if (!reservationList.getReservations().get(i).getStart_period()
            .compare(sDate) && (
            reservationList.getReservations().get(i).getEnd_period()
                .compare(sDate) || reservationList.getReservations().get(i)
                .getEnd_period().equals(sDate)))
        {
          return false;
        }
        if (!reservationList.getReservations().get(i).getStart_period()
            .compare(eDate) && (
            reservationList.getReservations().get(i).getEnd_period()
                .compare(eDate) || reservationList.getReservations().get(i)
                .getEnd_period().equals(eDate)))
        {
          return false;
        }

        if (reservationList.getReservations().get(i).getStart_period()
            .compare(sDate) && !reservationList.getReservations().get(i)
            .getEnd_period().compare(eDate))
        {
          return false;
        }
      }
    }

    for (int i = 0; i < eventList.getAllEvents().size(); i++)
    {
      if (eventList.getAllEvents().get(i).getGame().equals(game))
      {
        if (!sDate.compare(eventList.getAllEvents().get(i).getDate()) && (
            eDate.compare(eventList.getAllEvents().get(i).getDate())
                || eDate.equals(eventList.getAllEvents().get(i).getDate())))
        {
          return false;
        }
      }
    }

    for (int i = 0; i < rentalList.getRentals().size(); i++)
    {
      if (rentalList.getRentals().get(i).getGame().equals(game))
      {
        if (!rentalList.getRentals().get(i).getStart_period().compare(sDate)
            && (rentalList.getRentals().get(i).getEnd_period().compare(sDate)
            || rentalList.getRentals().get(i).getEnd_period().equals(sDate)))
        {
          return false;
        }
        if (!rentalList.getRentals().get(i).getStart_period().compare(eDate)
            && (rentalList.getRentals().get(i).getEnd_period().compare(eDate)
            || rentalList.getRentals().get(i).getEnd_period().equals(eDate)))
        {
          return false;
        }
        if (rentalList.getRentals().get(i).getStart_period().compare(sDate)
            && !rentalList.getRentals().get(i).getEnd_period().compare(eDate))
        {
          return false;
        }
      }
    }

    return true;
  }

  /**
   * Checks if the game is not used for an event/a reservation/a borrowing on a certain period
   *
   * @param game  the game to check with
   * @param sDate the start Date to check with
   * @param eDate the end Date to check with
   * @return true if the game is available at that period, else false
   */
  private boolean gameAvailableByDate(Game game, Date sDate, Date eDate)
  {
    ReservationList reservationList = modelManager.getReservations();
    EventList eventList = modelManager.getEvents();
    RentalList rentalList = modelManager.getRentals();

    for (int i = 0; i < reservationList.getReservations().size(); i++)
    {
      if (reservationList.getReservations().get(i).getGame().equals(game))
      {
        if (!reservationList.getReservations().get(i).getStart_period()
            .compare(sDate) && (
            reservationList.getReservations().get(i).getEnd_period()
                .compare(sDate) || reservationList.getReservations().get(i)
                .getEnd_period().equals(sDate)))
        {
          return false;
        }
        if (!reservationList.getReservations().get(i).getStart_period()
            .compare(eDate) && (
            reservationList.getReservations().get(i).getEnd_period()
                .compare(eDate) || reservationList.getReservations().get(i)
                .getEnd_period().equals(eDate)))
        {
          return false;
        }

        if (reservationList.getReservations().get(i).getStart_period()
            .compare(sDate) && !reservationList.getReservations().get(i)
            .getEnd_period().compare(eDate))
        {
          return false;
        }
      }
    }

    for (int i = 0; i < eventList.getAllEvents().size(); i++)
    {
      if (eventList.getAllEvents().get(i).getGame().equals(game))
      {
        if (!sDate.compare(eventList.getAllEvents().get(i).getDate()) && (
            eDate.compare(eventList.getAllEvents().get(i).getDate())
                || eDate.equals(eventList.getAllEvents().get(i).getDate())))
        {
          return false;
        }
      }
    }

    for (int i = 0; i < rentalList.getRentals().size(); i++)
    {
      if (rentalList.getRentals().get(i).getGame().equals(game))
      {
        if (!rentalList.getRentals().get(i).getStart_period().compare(sDate)
            && (rentalList.getRentals().get(i).getEnd_period().compare(sDate)
            || rentalList.getRentals().get(i).getEnd_period().equals(sDate)))
        {
          return false;
        }
        if (!rentalList.getRentals().get(i).getStart_period().compare(eDate)
            && (rentalList.getRentals().get(i).getEnd_period().compare(eDate)
            || rentalList.getRentals().get(i).getEnd_period().equals(eDate)))
        {
          return false;
        }
        if (rentalList.getRentals().get(i).getStart_period().compare(sDate)
            && !rentalList.getRentals().get(i).getEnd_period().compare(eDate))
        {
          return false;
        }
      }
    }

    return true;
  }

  /**
   * Checks if the game can be deleted from the list (if it is not used for an event/reservation/borrowing)
   *
   * @param game the game to check with
   * @return true if the game can be deleted, else false
   */
  private boolean gameAvailableForDelete(Game game)
  {
    ReservationList reservationList = modelManager.getReservations();
    EventList eventList = modelManager.getEvents();
    RentalList rentalList = modelManager.getRentals();

    for (int i = 0; i < reservationList.getReservations().size(); i++)
    {
      if (reservationList.getReservations().get(i).getGame().equals(game))
      {
        return false;
      }
    }

    for (int i = 0; i < eventList.getAllEvents().size(); i++)
    {
      if (eventList.getAllEvents().get(i).getGame().equals(game))
      {
        return false;
      }
    }

    for (int i = 0; i < rentalList.getRentals().size(); i++)
    {
      if (rentalList.getRentals().get(i).getGame().equals(game))
      {
        return false;
      }
    }

    return true;
  }

  /**
   * Checks if the member can be deleted from the list (if it is not used for an event/reservation/borrowing)
   *
   * @param member the member to check with
   * @return true if the member can be deleted, else false
   */
  private boolean memberAvailableForDelete(Member member)
  {
    ReservationList reservationList = modelManager.getReservations();
    EventList eventList = modelManager.getEvents();
    RentalList rentalList = modelManager.getRentals();

    for (int i = 0; i < reservationList.getReservations().size(); i++)
    {
      if (reservationList.getReservations().get(i).getMember().equals(member))
      {
        return false;
      }
    }

    for (int i = 0; i < eventList.getAllEvents().size(); i++)
    {
      if (eventList.getAllEvents().get(i).getMembersArray().contains(member))
      {
        return false;
      }
    }

    for (int i = 0; i < rentalList.getRentals().size(); i++)
    {
      if (rentalList.getRentals().get(i).getMember().equals(member))
      {
        return false;
      }
    }

    return true;
  }

  /**
   * Checks if the ID of the member is unique
   *
   * @param member the member that is going to be checked
   * @return true if the ID is unique, false if the ID is not unique
   */
  private boolean checkMember(Member member)
  {
    MemberList memberList = modelManager.getMembers();
    for (int i = 0; i < memberList.getMembers().size(); i++)
    {
      if (memberList.getMembers().get(i).getID().equals(member.getID())
          && !memberList.getMembers().get(i).equals(member))
      {
        return false;
      }
    }
    return true;
  }

  /**
   * Action listener method
   *
   * @param e the event
   */
  public void handleActions(ActionEvent e)
  {

    // if e is the addMemberConfirm button:
    if (e.getSource() == addMemberConfirm) // 1 for getSource() + 1 for "==" = 2
    {
      // if addMemberFN and addMemberLN textfields are not empty:
      if (!addMemberFN.getText().isEmpty() && !addMemberLN.getText()
          .isEmpty()) // 2 for "!" + 2 for isEmpty() method + 1 for "&&" = 5
      {
        // initialize an Object member
        Member aux = new Member(addMemberFN.getText(),
            addMemberLN.getText()); // This takes 1 + 2 for getText methods = 3
        if (addMemberStatus.isSelected()) // if addMemberStatus checkbox is selected, this takes 1
        {
          aux.setStatus(true); // This takes 1
        }
        if (!addMemberID.getText()
            .isEmpty()) // if addMemberID textfield is not empty, this takes 1 for "!" + 1 for isEmpty() method = 2
        {
          aux.setID(
              addMemberID.getText()); // This takes 1 + 1 for getText method = 2
        }
        if ((!addMemberID.getText().isEmpty() && checkMember(aux))
            // This takes 1 for "!" + 1 for isEmpty() method + 1 for "&&" + n times for checkMember() method
            || addMemberID.getText()
            .isEmpty()) // + 1 for "||" + 1 for isEmpty() method = n + 5
        {
          modelManager.addMember(aux); // This takes n times
          alert_message("A new member has been added"); // This takes 1
          addMemberFN.setText(""); // This takes 1
          addMemberLN.setText(""); // This takes 1
          addMemberID.setText(""); // This takes 1
          addMemberStatus.setSelected(false); // This takes 1
          updateMembersBox(); // This takes n times
          updateMembersForReservationBox(); // This takes n times
          updateMembersForBorrowingBox(); // This takes n times
        }
        else
        {
          alert_error("The ID of the member has to be unique"); // This takes 1
        }

      }
      else
      {
        alert_error("Complete all the required fields"); // This takes 1
      }

      // We have T(n) = 2 + 5 + 3 + 2 + 2 + 2 + n + 5 + 3n + n + 6 = 5n + 27
      // T(n) = O(n)
      // We chose this algorithm because this is the fastest and easiest way to add a member to a list.
    }
    else if (e.getSource() == membersListTab)
    {
      Member temp = membersListTab.getSelectionModel().getSelectedItem();
      if (temp != null)
      {
        manageMemberFN.setText(temp.getFirstName());
        manageMemberLN.setText(temp.getLastName());
        manageMemberID.setText(temp.getID());
        if (temp.getStatus())
        {
          manageMemberStatus.setSelected(true);
        }
        else
        {
          manageMemberStatus.setSelected(false);
        }
      }
    }
    else if (e.getSource() == manageMemberStart)
    {
      if (membersListTab.getSelectionModel().getSelectedIndex() > -1)
      {
        Member temp = membersListTab.getSelectionModel().getSelectedItem();
        manageMemberStart.setDisable(true);
        manageMemberFN.setEditable(true);
        manageMemberLN.setEditable(true);
        manageMemberID.setEditable(true);
        manageMemberStatus.setDisable(false);
        manageMemberCancel.setDisable(false);
        manageMemberSave.setDisable(false);
        deleteMember.setDisable(true);
        membersListTab.setDisable(true);
      }
    }
    else if (e.getSource() == manageMemberCancel)
    {
      Member temp = membersListTab.getSelectionModel().getSelectedItem();
      manageMemberStart.setDisable(false);
      manageMemberFN.setEditable(false);
      manageMemberLN.setEditable(false);
      manageMemberID.setEditable(false);
      manageMemberStatus.setDisable(true);
      manageMemberCancel.setDisable(true);
      manageMemberSave.setDisable(true);
      deleteMember.setDisable(false);
      membersListTab.setDisable(false);

      manageMemberFN.setText(temp.getFirstName());
      manageMemberLN.setText(temp.getLastName());
      manageMemberID.setText(temp.getID());
      if (temp.getStatus())
      {
        manageMemberStatus.setSelected(true);
      }
      else
      {
        manageMemberStatus.setSelected(false);
      }
    }
    else if (e.getSource() == manageMemberSave)
    {
      if (!manageMemberFN.getText().isEmpty() && !manageMemberLN.getText()
          .isEmpty())
      {
        int i = membersListTab.getSelectionModel().getSelectedIndex();
        MemberList aux = modelManager.getMembers();
        aux.getMemberByIndex(i).setFirstName(manageMemberFN.getText());
        aux.getMemberByIndex(i).setLastName(manageMemberLN.getText());
        aux.getMemberByIndex(i).setID(manageMemberID.getText());
        aux.getMemberByIndex(i).setStatus(manageMemberStatus.isSelected());
        if ((!manageMemberID.getText().isEmpty() && checkMember(
            membersListTab.getSelectionModel().getSelectedItem())) || manageMemberID.getText().isEmpty())
        {
          manageMemberStart.setDisable(false);
          manageMemberFN.setEditable(false);
          manageMemberLN.setEditable(false);
          manageMemberID.setEditable(false);
          manageMemberStatus.setDisable(true);
          manageMemberCancel.setDisable(true);
          manageMemberSave.setDisable(true);
          deleteMember.setDisable(false);
          membersListTab.setDisable(false);
          modelManager.saveMembers(aux);
          updateMembersBox();
          initialize();
        }
        else
        {
          alert_error("The ID of the member has to be unique");
        }
      }
      else
      {
        alert_error("Complete all the required fields");
      }
    }
    // if e is the deleteMember button:
    else if (e.getSource()
        == deleteMember) // 1 for getSource() method + 1 for "==" = 2
    {
      if (membersListTab.getSelectionModel().getSelectedIndex()
          > -1) // 1 for getSelectedIndex() method + 1 for ">" = 2
      {
        if (memberAvailableForDelete(membersListTab.getSelectionModel()
            .getSelectedItem())) // 1 for getSelectedItem() method and n times for memberAvailableForDelete() method = n + 1
        {
          modelManager.deleteMember(membersListTab.getSelectionModel()
              .getSelectedItem()); // This takes n times + 1 for getSelectedItem() method = n + 1
          MemberList aux = modelManager.getMembers(); // This takes n times
          updateMembersBox(); // This takes n times
          updateMembersForReservationBox(); // This takes n times
          updateMembersForBorrowingBox(); // This takes n times
          membersListTab.getSelectionModel().select(-1); // This takes 1
          manageMemberFN.setText(""); // This takes 1
          manageMemberLN.setText(""); // This takes 1
          manageMemberID.setText(""); // This takes 1
          manageMemberStatus.setSelected(false); // This takes 1
          if (aux.getMembers().size()
              == 0) // 1 for size() method + 1 for "==" = 2
          {
            membersTabPane.getSelectionModel()
                .select(addMemberTab); // This takes 1
          }
        }
        else
        {
          alert_error(
              "The member attends an event, has a borrowing/reservation"); // This takes 1
        }
      }

      // We have T(n) =  2 + 2 + n + 1 + n + 1 + 4n + 5 + 2 + 2 = 6n + 15
      // T(n) = O(n)
      // We chose this algorithm because this is the fastest and easiest way to delete a member from the list.
    }
    else if (e.getSource() == addGameConfirm)
    {
      if (!addGameName.getText().isEmpty() && !addGameNr.getText().isEmpty())
      {
        if (checkField(addGameNr.getText())
            && addGameNr.getText().length() <= 3)
        {
          Game aux = new Game(addGameName.getText(), addGameDesc.getText(),
              Integer.parseInt(addGameNr.getText()));
          if (addGameStatus.isSelected())
          {
            aux.setStatus(0);
          }
          else
          {
            aux.setStatus(-1);
          }
          if (!addGameLink.getText().isEmpty())
          {
            aux.setUrlImage(addGameLink.getText());
          }
          modelManager.addGame(aux);
          alert_message("A new game has been added");
          addGameName.setText("");
          addGameNr.setText("");
          addGameLink.setText("");
          addGameDesc.setText("");
          addGameStatus.setSelected(false);
          updateGamesBox();
          updateGamesForEventsBox();
          updateGamesForReservationBox();
          updateGamesForBorrowingBox();
        }
        else
        {
          alert_error(
              "'Number of players' fields can contain only numbers of maximum 3 digits");
        }
      }
      else
      {
        alert_error("Complete all the required fields");
      }
    }
    else if (e.getSource() == gamesListTab)
    {
      Game aux = gamesListTab.getSelectionModel().getSelectedItem();
      manageGamesLink.clear();
      if (aux != null)
      {
        manageGamesName.setText(aux.getName());
        manageGamesNr.setText(String.valueOf(aux.getMaxPlayers()));
        manageGamesDesc.setText(aux.getDescription());
        gameRating.setText(aux.getRating());
        if (aux.getStatus() == 0)
        {
          manageGamesStatus.setSelected(true);
        }
        else
        {
          manageGamesStatus.setSelected(false);
        }
        if (!aux.getUrlImage().isEmpty())
        {
          manageGamesLink.setText(aux.getUrlImage());
        }
      }
    }
    else if (e.getSource() == manageGamesEdit)
    {
      if (gamesListTab.getSelectionModel().getSelectedIndex() > -1)
      {
        Game aux = gamesListTab.getSelectionModel().getSelectedItem();
        manageGamesEdit.setDisable(true);
        manageGamesName.setEditable(true);
        manageGamesNr.setEditable(true);
        manageGamesStatus.setDisable(false);
        manageGamesLink.setEditable(true);
        manageGamesDesc.setEditable(true);
        manageGamesCancel.setDisable(false);
        manageGamesSave.setDisable(false);
        deleteGame.setDisable(true);
        gamesListTab.setDisable(true);
      }
    }
    else if (e.getSource() == manageGamesCancel)
    {
      Game aux = gamesListTab.getSelectionModel().getSelectedItem();
      manageGamesEdit.setDisable(false);
      manageGamesName.setEditable(false);
      manageGamesNr.setEditable(false);
      manageGamesStatus.setDisable(true);
      manageGamesLink.setEditable(false);
      manageGamesDesc.setEditable(false);
      manageGamesCancel.setDisable(true);
      manageGamesSave.setDisable(true);
      deleteGame.setDisable(false);
      gamesListTab.setDisable(false);

      manageGamesName.setText(aux.getName());
      manageGamesNr.setText(String.valueOf(aux.getMaxPlayers()));
      manageGamesDesc.setText(aux.getDescription());
      if (aux.getStatus() == 0)
      {
        manageGamesStatus.setSelected(true);
      }
      else
      {
        manageGamesStatus.setSelected(false);
      }
      if (!aux.getUrlImage().isEmpty())
      {
        manageGamesLink.setText(aux.getUrlImage());
      }
    }
    else if (e.getSource() == manageGamesSave)
    {
      if (checkField(manageGamesNr.getText())
          && manageGamesNr.getText().length() <= 3)
      {
        if (!manageGamesStatus.isSelected() && !gameAvailableForDelete(
            gamesListTab.getSelectionModel().getSelectedItem()))
        {
          alert_error(
              "This game can't be set as unavailable because it is borrowed/reserved or used for an event");

        }
        else
        {
          int i = gamesListTab.getSelectionModel().getSelectedIndex();
          manageGamesEdit.setDisable(false);
          manageGamesName.setEditable(false);
          manageGamesNr.setEditable(false);
          manageGamesStatus.setDisable(true);
          manageGamesLink.setEditable(false);
          manageGamesDesc.setEditable(false);
          manageGamesCancel.setDisable(true);
          manageGamesSave.setDisable(true);
          deleteGame.setDisable(false);
          gamesListTab.setDisable(false);
          GameList aux = modelManager.getAllGames();
          aux.getGameByIndex(i).setName(manageGamesName.getText());
          aux.getGameByIndex(i).setDescription(manageGamesDesc.getText());
          aux.getGameByIndex(i)
              .setMaxPlayers(Integer.parseInt(manageGamesNr.getText()));
          aux.getGameByIndex(i).setUrlImage(manageGamesLink.getText());
          if (manageGamesStatus.isSelected())
          {
            aux.getGameByIndex(i).setStatus(0);
          }
          else
          {
            aux.getGameByIndex(i).setStatus(-1);
          }
          modelManager.saveGames(aux);
          updateGamesBox();
          updateGamesForEventsBox();
        }
      }
      else
      {
        alert_error(
            "'Number of players' fields can contain only numbers of maximum 3 digits");
      }
    }
    else if (e.getSource() == deleteGame)
    {
      if (gamesListTab.getSelectionModel().getSelectedIndex() > -1)
      {
        if (gameAvailableForDelete(
            gamesListTab.getSelectionModel().getSelectedItem()))
        {
          modelManager.removeGame(
              gamesListTab.getSelectionModel().getSelectedItem());
          updateGamesBox();
          gamesListTab.getSelectionModel().select(-1);
          manageGamesName.setText("");
          manageGamesNr.setText("");
          manageGamesDesc.setText("");
          manageGamesStatus.setSelected(false);
          manageGamesLink.setText("");
          updateGamesBox();
          updateGamesForEventsBox();
          updateGamesForReservationBox();
          updateGamesForBorrowingBox();
          if (modelManager.getAllGames().getAllGames().size() == 0)
          {
            gamesTabPane.getSelectionModel().select(addGameTab);
          }
        }
        else
        {
          alert_error("This game is borrowed/reserved/listed for an event");
        }
      }
    }
    else if (e.getSource() == addEventConfirm)
    {
      if (!addEventName.getText().isEmpty() && !addEventDesc.getText().isEmpty()
          && addEventDate.getValue() != null && !addEventHour.getText()
          .isEmpty() && !addEventMinute.getText().isEmpty()
          && !addEventDate.getValue().isBefore(LocalDate.now()))
      {
        if (addEventHour.getText().length() <= 2
            && addEventMinute.getText().length() <= 2 && checkTime(
            addEventHour.getText(), addEventMinute.getText()))
        {
          Date date = new Date(addEventDate.getValue().getYear(),
              addEventDate.getValue().getMonthValue(),
              addEventDate.getValue().getDayOfMonth(),
              Integer.parseInt(addEventHour.getText()),
              Integer.parseInt(addEventMinute.getText()));

          if ((addEventGame.getSelectionModel().getSelectedIndex() > -1
              && gameAvailableByDate(
              addEventGame.getSelectionModel().getSelectedItem(), date, date))
              || addEventGame.getSelectionModel().getSelectedIndex() == -1)
          {
            if (addEventGame.getSelectionModel().getSelectedItem().getStatus()
                == 0)
            {

              model.Event event = new model.Event(addEventName.getText(),
                  addEventDesc.getText(), date);

              if (addEventGame.getSelectionModel().getSelectedIndex() > -1)
              {
                event.setGame(
                    addEventGame.getSelectionModel().getSelectedItem());
              }

              modelManager.addEvent(event);
              alert_message("A new event has been added");
              updateEventsBox();
              addEventName.setText("");
              addEventDesc.setText("");
              addEventMinute.setText("");
              addEventHour.setText("");
              addEventDate.getEditor().clear();
              addEventGame.getSelectionModel().select(-1);
            }
            else
            {
              alert_error(
                  "The selected game is not available and opened for voting");
            }
          }
          else
          {
            alert_error(
                "The selected game is not available during the selected time");
          }
        }
        else
        {
          alert_error(
              "The Minute and Hour fields can contain maximum 2 digits. Minutes: 0->59, Hour: 0->23");
        }
      }
      else
      {
        alert_error("Complete all the required fields or date is in the past");
      }
    }
    else if (e.getSource() == eventsListTab)
    {
      int i = eventsListTab.getSelectionModel().getSelectedIndex();
      if (i > -1)
      {
        model.Event temp = eventsListTab.getSelectionModel().getSelectedItem();
        manageEventsName.setText(temp.getName());
        manageEventsDesc.setText(temp.getDescription());
        manageEventsDate.setValue(
            LocalDate.of(temp.getDate().getYear(), temp.getDate().getMonth(),
                temp.getDate().getDay()));
        manageEventsHour.setText(Integer.toString(temp.getDate().getHour()));
        manageEventsMinute.setText(
            Integer.toString(temp.getDate().getMinute()));
        manageEventsAddMember.setDisable(false);
        manageEventsRemoveMember.setDisable(false);
        updateGamesForEventsBox2();
        if (temp.getGame() != null)
        {

          manageEventsGame.getSelectionModel().select(temp.getGame());
        }
        else
        {
          manageEventsGame.getSelectionModel().select(-1);
        }

        manageEventsMembers.setText(temp.getMembers());

        MemberList aux = modelManager.getMembers();
        if (aux != null)
        {
          manageEventsAddMember.getItems().clear();
          manageEventsRemoveMember.getItems().clear();
          if (temp.getMembersArray() != null)
          {
            for (int j = 0; j < aux.getMembers().size(); j++)
            {
              if (!temp.getMembersArray().contains(aux.getMemberByIndex(j)))
              {
                manageEventsAddMember.getItems().add(aux.getMemberByIndex(j));
              }
            }
            for (int j = 0; j < temp.getMembersArray().size(); j++)
            {
              manageEventsRemoveMember.getItems()
                  .add(temp.getMembersArray().get(j));
            }
          }
          else
          {
            for (int j = 0; j < aux.getMembers().size(); j++)
            {
              manageEventsAddMember.getItems().add(aux.getMemberByIndex(j));

            }
          }
        }
      }
    }
    else if (e.getSource() == manageEventsStart)
    {
      if (eventsListTab.getSelectionModel().getSelectedIndex() > -1)
      {
        eventsListTab.setDisable(true);
        manageEventsName.setEditable(true);
        manageEventsDesc.setEditable(true);
        manageEventsDate.setDisable(false);
        manageEventsHour.setEditable(true);
        manageEventsMinute.setEditable(true);
        manageEventsGame.setDisable(false);
        manageEventsStart.setDisable(true);
        manageEventsCancel.setDisable(false);
        manageEventsSave.setDisable(false);
        deleteEvent.setDisable(true);
      }
    }
    else if (e.getSource() == manageEventsCancel)
    {
      model.Event temp = eventsListTab.getSelectionModel().getSelectedItem();
      manageEventsName.setText(temp.getName());
      manageEventsDesc.setText(temp.getDescription());
      manageEventsDate.setValue(
          LocalDate.of(temp.getDate().getYear(), temp.getDate().getMonth(),
              temp.getDate().getDay()));
      manageEventsHour.setText(Integer.toString(temp.getDate().getHour()));
      manageEventsMinute.setText(Integer.toString(temp.getDate().getMinute()));
      updateGamesForEventsBox2();
      if (temp.getGame() != null)
      {

        manageEventsGame.getSelectionModel().select(temp.getGame());
      }
      else
      {
        manageEventsGame.getSelectionModel().select(-1);
      }

      eventsListTab.setDisable(false);
      manageEventsName.setEditable(false);
      manageEventsDesc.setEditable(false);
      manageEventsDate.setDisable(true);
      manageEventsHour.setEditable(false);
      manageEventsMinute.setEditable(false);
      manageEventsGame.setDisable(true);
      manageEventsStart.setDisable(false);
      manageEventsCancel.setDisable(true);
      manageEventsSave.setDisable(true);
      deleteEvent.setDisable(false);
    }
    else if (e.getSource() == manageEventsAddMember)
    {
      if (manageEventsAddMember.getSelectionModel().getSelectedIndex() > -1)
      {
        int i = eventsListTab.getSelectionModel().getSelectedIndex();
        Member temp2 = manageEventsAddMember.getSelectionModel()
            .getSelectedItem();
        EventList eventList = modelManager.getEvents();

        eventList.getAllEvents().get(i).addParticipant(temp2);
        modelManager.saveEvents(eventList);
        updateEventsBox();
        manageEventsRemoveMember.getItems()
            .add(manageEventsAddMember.getSelectionModel().getSelectedItem());
        manageEventsRemoveMember.getSelectionModel().select(-1);
        manageEventsAddMember.getItems().remove(
            manageEventsAddMember.getSelectionModel().getSelectedItem());
        manageEventsAddMember.getSelectionModel().select(-1);
        model.Event temp = eventList.getAllEvents().get(i);

        manageEventsMembers.setText(temp.getMembers());

      }

    }
    else if (e.getSource() == manageEventsRemoveMember)
    {
      if (manageEventsRemoveMember.getSelectionModel().getSelectedIndex() > -1)
      {
        int i = eventsListTab.getSelectionModel().getSelectedIndex();
        Member temp2 = manageEventsRemoveMember.getSelectionModel()
            .getSelectedItem();
        EventList eventList = modelManager.getEvents();

        eventList.getAllEvents().get(i).removeParticipant(temp2);
        modelManager.saveEvents(eventList);
        updateEventsBox();

        model.Event temp = eventList.getAllEvents().get(i);

        manageEventsAddMember.getItems().add(
            manageEventsRemoveMember.getSelectionModel().getSelectedItem());
        manageEventsAddMember.getSelectionModel().select(-1);
        manageEventsRemoveMember.getItems().remove(
            manageEventsRemoveMember.getSelectionModel().getSelectedItem());
        manageEventsRemoveMember.getSelectionModel().select(-1);
        manageEventsMembers.setText(temp.getMembers());

      }
    }
    else if (e.getSource() == manageEventsSave)
    {
      Date tempDate = eventsListTab.getSelectionModel().getSelectedItem()
          .getDate();
      if (!manageEventsName.getText().isEmpty() && !manageEventsDesc.getText()
          .isEmpty() && manageEventsDate.getValue() != null
          && !manageEventsHour.getText().isEmpty()
          && !manageEventsMinute.getText().isEmpty() && (
          !manageEventsDate.getValue().isBefore(LocalDate.now()) || (
              manageEventsDate.getValue().equals(
                  LocalDate.of(tempDate.getYear(), tempDate.getMonth(),
                      tempDate.getDay()))
                  && tempDate.getMinute() == Integer.parseInt(
                  manageEventsMinute.getText())
                  && Integer.parseInt(manageEventsHour.getText())
                  == tempDate.getHour()))

      )
      {

        if (manageEventsHour.getText().length() <= 2
            && manageEventsMinute.getText().length() <= 2
            && !manageEventsDate.getValue().isBefore(LocalDate.now())
            && checkTime(manageEventsHour.getText(),
            manageEventsMinute.getText()))
        {
          Date date = new Date(manageEventsDate.getValue().getYear(),
              manageEventsDate.getValue().getMonthValue(),
              manageEventsDate.getValue().getDayOfMonth(),
              Integer.parseInt(manageEventsHour.getText()),
              Integer.parseInt(manageEventsMinute.getText()));

          if ((manageEventsGame.getSelectionModel().getSelectedIndex() > -1
              && gameAvailableByDate(
              manageEventsGame.getSelectionModel().getSelectedItem(), date,
              date, true))
              || manageEventsGame.getSelectionModel().getSelectedIndex() == -1)
          {
            if (manageEventsGame.getSelectionModel().getSelectedItem()
                .getStatus() == 0)
            {
              int i = eventsListTab.getSelectionModel().getSelectedIndex();

              EventList eventList = modelManager.getEvents();
              eventList.getEventByIndex(i).setGame(
                  manageEventsGame.getSelectionModel().getSelectedItem());
              eventList.getEventByIndex(i).setName(manageEventsName.getText());
              eventList.getEventByIndex(i)
                  .setDescription(manageEventsDesc.getText());

              eventList.getEventByIndex(i).setDate(date);
              modelManager.saveEvents(eventList);
              updateEventsBox();

              model.Event temp = eventList.getEventByIndex(i);
              manageEventsName.setText(temp.getName());
              manageEventsDesc.setText(temp.getDescription());
              manageEventsDate.setValue(LocalDate.of(temp.getDate().getYear(),
                  temp.getDate().getMonth(), temp.getDate().getDay()));
              manageEventsHour.setText(
                  Integer.toString(temp.getDate().getHour()));
              manageEventsMinute.setText(
                  Integer.toString(temp.getDate().getMinute()));
              updateGamesForEventsBox2();
              if (temp.getGame() != null)
              {

                manageEventsGame.getSelectionModel().select(temp.getGame());
              }
              else
              {
                manageEventsGame.getSelectionModel().select(-1);
              }

              eventsListTab.setDisable(false);
              manageEventsName.setEditable(false);
              manageEventsDesc.setEditable(false);
              manageEventsDate.setDisable(true);
              manageEventsHour.setEditable(false);
              manageEventsMinute.setEditable(false);
              manageEventsGame.setDisable(true);
              manageEventsStart.setDisable(false);
              manageEventsCancel.setDisable(true);
              manageEventsSave.setDisable(true);
              deleteEvent.setDisable(false);
            }
            else
            {
              alert_error(
                  "The selected game is not available and opened for voting");
            }
          }
          else
          {
            alert_error(
                "The selected game is not available during the selected time");
          }
        }
        else
        {
          alert_error(
              "The Minute and Hour fields can contain maximum 2 digits. Minutes: 0->59, Hour: 0->23");
        }
      }
      else
      {
        alert_error("Complete all the required fields or date is in the past");
      }
    }
    else if (e.getSource() == deleteEvent)
    {
      if (eventsListTab.getSelectionModel().getSelectedIndex() > -1)
      {

        modelManager.removeEvent(
            eventsListTab.getSelectionModel().getSelectedItem());
        manageEventsName.setText("");
        manageEventsDesc.setText("");
        manageEventsGame.getItems().clear();
        manageEventsDate.getEditor().clear();
        manageEventsHour.setText("");
        manageEventsMinute.setText("");
        manageEventsMembers.setText("");
        manageEventsAddMember.getItems().clear();
        manageEventsRemoveMember.getItems().clear();
        eventsListTab.getSelectionModel().select(-1);
        updateEventsBox();
        if (modelManager.getEvents().getAllEvents().size() == 0)
        {
          eventsTabPane.getSelectionModel().select(addEventTab);
        }
      }
    }
    else if (e.getSource() == addReservationConfirm)
    {
      if (addReservationMember.getSelectionModel().getSelectedIndex() > -1
          && addReservationGame.getSelectionModel().getSelectedIndex() > -1
          && addReservationSDate.getValue() != null
          && !addReservationSHour.getText().isEmpty()
          && !addReservationSMinute.getText().isEmpty()
          && addReservationEDate.getValue() != null
          && !addReservationEHour.getText().isEmpty()
          && !addReservationEMinute.getText().isEmpty()
          && !addReservationSDate.getValue().isBefore(LocalDate.now())
          && !addReservationEDate.getValue().isBefore(LocalDate.now())
          && !addReservationEDate.getValue()
          .isBefore(addReservationSDate.getValue()) && checkField(
          addReservationSHour.getText()) && checkField(
          addReservationSMinute.getText()) && checkField(
          addReservationEHour.getText()) && checkField(
          addReservationEMinute.getText()))
      {
        if (checkTime(addReservationSHour.getText(),
            addReservationSMinute.getText()) && checkTime(
            addReservationEHour.getText(), addReservationEMinute.getText()))
        {
          if ((addReservationEDate.getValue()
              .equals(addReservationSDate.getValue()) && !compareTime(
              Integer.parseInt(addReservationSHour.getText()),
              Integer.parseInt(addReservationSMinute.getText()),
              Integer.parseInt(addReservationEHour.getText()),
              Integer.parseInt(addReservationEMinute.getText())))
              || addReservationSDate.getValue()
              .isBefore(addReservationEDate.getValue()))
          {
            Date sDate = new Date(addReservationSDate.getValue().getYear(),
                addReservationSDate.getValue().getMonthValue(),
                addReservationSDate.getValue().getDayOfMonth(),
                Integer.parseInt(addReservationSHour.getText()),
                Integer.parseInt(addReservationSMinute.getText()));
            Date eDate = new Date(addReservationEDate.getValue().getYear(),
                addReservationEDate.getValue().getMonthValue(),
                addReservationEDate.getValue().getDayOfMonth(),
                Integer.parseInt(addReservationEHour.getText()),
                Integer.parseInt(addReservationEMinute.getText()));

            if (gameAvailableByDate(
                addReservationGame.getSelectionModel().getSelectedItem(), sDate,
                eDate))
            {
              if (addReservationGame.getSelectionModel().getSelectedItem()
                  .getStatus() == 0)
              {
                Reservation aux = new Reservation(sDate, eDate,
                    addReservationMember.getSelectionModel().getSelectedItem(),
                    addReservationGame.getSelectionModel().getSelectedItem());

                modelManager.addReservation(aux);
                alert_message("A new reservation has been added");
                addReservationMember.getSelectionModel().select(-1);
                addReservationGame.getSelectionModel().select(-1);
                addReservationSDate.getEditor().clear();
                addReservationSHour.setText("");
                addReservationSMinute.setText("");
                addReservationEDate.getEditor().clear();
                addReservationEHour.setText("");
                addReservationEMinute.setText("");
                updateReservationBox();
              }
              else
              {
                alert_error(
                    "The selected game is not available and opened for voting");
              }
            }
            else
            {
              alert_error(
                  "The selected game is not available during the selected time");
            }
          }
          else
          {
            alert_error("Start time can't be later than end time");
          }
        }
        else
        {
          alert_error(
              "The Minute and Hour fields can contain maximum 2 digits. Minutes: 0->59, Hour: 0->23");
        }
      }
      else
      {
        alert_error(
            "Complete all the required fields, the date is in the past or the Hour/Minute contain characters and not digits");
      }
    }
    else if (e.getSource() == reservationsListTab)
    {
      Reservation aux = reservationsListTab.getSelectionModel()
          .getSelectedItem();
      if (aux != null)
      {
        manageReservationsMember.setText(aux.getMember().toString());
        manageReservationsGame.setText(aux.getGame().toString());
        manageReservationsSDate.setText(aux.getStart_period().toString());
        manageReservationsEDate.setText(aux.getEnd_period().toString());
        if (aux.getMember().getStatus() == false)
        {
          manageReservationsLocation.setText("VIA College University");
          manageReservationsLocation.setDisable(true);
        }
        else
        {
          manageReservationsLocation.setText("");
          manageReservationsLocation.setDisable(false);
        }
      }
    }
    else if (e.getSource() == manageReservationsEnd)
    {
      if (reservationsListTab.getSelectionModel().getSelectedIndex() > -1)
      {
        modelManager.removeReservation(
            reservationsListTab.getSelectionModel().getSelectedItem());
        reservationsListTab.getSelectionModel().select(-1);
        manageReservationsMember.setText("");
        manageReservationsGame.setText("");
        manageReservationsSDate.setText("");
        manageReservationsEDate.setText("");
        manageReservationsLocation.setText("");
        manageReservationsLocation.setDisable(false);
        updateReservationBox();
        if (modelManager.getReservations().getReservations().size() == 0)
        {
          reservationsTabPane.getSelectionModel().select(addReservationTab);
        }
      }
    }
    else if (e.getSource() == manageReservationsToBorrowing)
    {
      if (reservationsListTab.getSelectionModel().getSelectedIndex() > -1)
      {
        Reservation temp = reservationsListTab.getSelectionModel()
            .getSelectedItem();
        Rental rental;
        if (!manageReservationsLocation.getText().isEmpty())
        {
          rental = new Rental(temp.getStart_period(), temp.getEnd_period(),
              temp.getMember(), temp.getGame(),
              manageReservationsLocation.getText());
        }
        else
        {
          rental = new Rental(temp.getStart_period(), temp.getEnd_period(),
              temp.getMember(), temp.getGame(), "");
        }

        RentalList rentalList = modelManager.getRentals();

        rentalList.addRent(rental);
        modelManager.saveRentals(rentalList);

        modelManager.removeReservation(
            reservationsListTab.getSelectionModel().getSelectedItem());
        reservationsListTab.getSelectionModel().select(-1);
        manageReservationsMember.setText("");
        manageReservationsGame.setText("");
        manageReservationsSDate.setText("");
        manageReservationsEDate.setText("");
        manageReservationsLocation.setText("");
        manageReservationsLocation.setDisable(false);
        updateReservationBox();
        updateBorrowingBox();
        if (modelManager.getReservations().getReservations().size() == 0)
        {
          reservationsTabPane.getSelectionModel().select(addReservationTab);
        }

      }
    }
    else if (e.getSource() == addBorrowingConfirm)
    {
      if (addBorrowingMember.getSelectionModel().getSelectedIndex() > -1
          && addBorrowingGame.getSelectionModel().getSelectedIndex() > -1
          && addBorrowingSDate.getValue() != null
          && !addBorrowingSHour.getText().isEmpty()
          && !addBorrowingSMinute.getText().isEmpty()
          && addBorrowingEDate.getValue() != null
          && !addBorrowingEHour.getText().isEmpty()
          && !addBorrowingEMinute.getText().isEmpty()
          && !addBorrowingSDate.getValue().isBefore(LocalDate.now())
          && !addBorrowingEDate.getValue().isBefore(LocalDate.now())
          && !addBorrowingEDate.getValue()
          .isBefore(addBorrowingSDate.getValue()) && checkField(
          addBorrowingSHour.getText()) && checkField(
          addBorrowingSMinute.getText()) && checkField(
          addBorrowingEHour.getText()) && checkField(
          addBorrowingEMinute.getText()))
      {
        if (checkTime(addBorrowingSHour.getText(),
            addBorrowingSMinute.getText()) && checkTime(
            addBorrowingEHour.getText(), addBorrowingEMinute.getText()))
        {
          if ((addBorrowingEDate.getValue().equals(addBorrowingSDate.getValue())
              && !compareTime(Integer.parseInt(addBorrowingSHour.getText()),
              Integer.parseInt(addBorrowingSMinute.getText()),
              Integer.parseInt(addBorrowingEHour.getText()),
              Integer.parseInt(addBorrowingEMinute.getText())))
              || addBorrowingSDate.getValue()
              .isBefore(addBorrowingEDate.getValue()))
          {
            Date sDate = new Date(addBorrowingSDate.getValue().getYear(),
                addBorrowingSDate.getValue().getMonthValue(),
                addBorrowingSDate.getValue().getDayOfMonth(),
                Integer.parseInt(addBorrowingSHour.getText()),
                Integer.parseInt(addBorrowingSMinute.getText()));
            Date eDate = new Date(addBorrowingEDate.getValue().getYear(),
                addBorrowingEDate.getValue().getMonthValue(),
                addBorrowingEDate.getValue().getDayOfMonth(),
                Integer.parseInt(addBorrowingEHour.getText()),
                Integer.parseInt(addBorrowingEMinute.getText()));
            if (gameAvailableByDate(
                addBorrowingGame.getSelectionModel().getSelectedItem(), sDate,
                eDate))
            {
              if (addBorrowingGame.getSelectionModel().getSelectedItem()
                  .getStatus() == 0)
              {
                Rental aux = new Rental(sDate, eDate,
                    addBorrowingMember.getSelectionModel().getSelectedItem(),
                    addBorrowingGame.getSelectionModel().getSelectedItem(),
                    addBorrowingLocation.getText());

                modelManager.addRent(aux);
                alert_message("A new borrowing has been added");
                addBorrowingMember.getSelectionModel().select(-1);
                addBorrowingGame.getSelectionModel().select(-1);
                addBorrowingSDate.getEditor().clear();
                addBorrowingSHour.setText("");
                addBorrowingSMinute.setText("");
                addBorrowingEDate.getEditor().clear();
                addBorrowingEHour.setText("");
                addBorrowingEMinute.setText("");
                addBorrowingLocation.setText("");
                addBorrowingLocation.setDisable(false);
                updateBorrowingBox();
              }
              else
              {
                alert_error(
                    "The selected game is not available and opened for voting");
              }
            }
            else
            {
              alert_error(
                  "The selected game is not available during the selected time");
            }
          }
          else
          {
            alert_error("Start time can't be later than end time");
          }
        }
        else
        {
          alert_error(
              "The Minute and Hour fields can contain maximum 2 digits. Minutes: 0->59, Hour: 0->23");
        }
      }
      else
      {
        alert_error(
            "Complete all the required fields or the date is in the past");
      }
    }
    else if (e.getSource() == borrowingsListTab)
    {
      Rental aux = borrowingsListTab.getSelectionModel().getSelectedItem();
      addGameRating.clear();
      if (aux != null)
      {
        manageBorrowingMember.setText(aux.getMember().toString());
        manageBorrowingGame.setText(aux.getGame().toString());
        manageBorrowingSDate.setText(aux.getStart_period().toString());
        manageBorrowingEDate.setText(aux.getEnd_period().toString());
        manageBorrowingLocation.setText(aux.getLocation());
      }
    }
    else if (e.getSource() == manageBorrowingEnd)
    {
      if (borrowingsListTab.getSelectionModel().getSelectedIndex() > -1)
      {
        boolean error = false;
        if (!addGameRating.getText().isEmpty())
        {
          if (checkField(addGameRating.getText()) && Integer.parseInt(
              addGameRating.getText()) >= 0 && Integer.parseInt(
              addGameRating.getText()) <= 5)
          {
            int r = Integer.parseInt(addGameRating.getText());
            GameList temp = modelManager.getAllGames();
            temp.getAllGames().get(modelManager.getAllGames().getAllGames()
                .indexOf(borrowingsListTab.getSelectionModel().getSelectedItem()
                    .getGame())).addRating(r);
            modelManager.saveGames(temp);
            updateGamesBox();
          }
          else
          {
            error = true;
            alert_error(
                "The rating field accepts only integer values from 0 to 5");
          }
        }
        if (!error)
        {
          modelManager.removeRental(
              borrowingsListTab.getSelectionModel().getSelectedItem());

          manageBorrowingMember.setText("");
          manageBorrowingGame.setText("");
          manageBorrowingSDate.setText("");
          manageBorrowingEDate.setText("");
          manageBorrowingLocation.setText("");
          addGameRating.clear();
          updateBorrowingBox();
          borrowingsListTab.getSelectionModel().select(-1);
          if (modelManager.getRentals().getRentals().size() == 0)
          {
            borrowingsTabPane.getSelectionModel().select(addBorrowingTab);
          }
        }
      }
    }
    else if (e.getSource() == exportWebsite)
    {
      String gamesXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <root>\n \t<gameList>\n";
      GameList gameList = modelManager.getAllGames();
      for (int i = 0; i < gameList.getAllGames().size(); i++)
      {
        gamesXML += "\t\t<game>\n";
        gamesXML += "\t\t\t<name>" + gameList.getAllGames().get(i).getName()
            + "</name>\n";
        gamesXML += "\t\t\t<description>" + gameList.getAllGames().get(i)
            .getDescription() + "</description>\n";
        gamesXML +=
            "\t\t\t<maxPlayers>" + gameList.getAllGames().get(i).getMaxPlayers()
                + "</maxPlayers>\n";
        if (gameList.getAllGames().get(i).getStatus() == -1)
        {
          gamesXML += "\t\t\t<status>Open for voting</status>\n";
        }
        else
        {
          gamesXML += "\t\t\t<status></status>\n";
        }
        if (!gameList.getAllGames().get(i).getUrlImage().isEmpty()
            && !gameList.getAllGames().get(i).getUrlImage().equals(""))
        {
          gamesXML +=
              "\t\t\t<urlImage>" + gameList.getAllGames().get(i).getUrlImage()
                  + "</urlImage>\n";
        }
        else
        {
          gamesXML += "\t\t\t<urlImage>#</urlImage>\n";
        }
        gamesXML += "\t\t\t<rating>" + gameList.getAllGames().get(i).getRating()
            + "</rating>\n";
        gamesXML += "\t\t</game>\n";
      }
      gamesXML += "\t</gameList>\n";
      gamesXML += "</root>";
      modelManager.saveXML("./website/xml/gameList.xml", gamesXML);

      String eventsXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <root>\n \t<eventList>\n";
      EventList eventList = modelManager.getEvents();

      for (int i = 0; i < eventList.getAllEvents().size(); i++)
      {
        eventsXML += "\t\t<event>\n";
        eventsXML += "\t\t\t<name>" + eventList.getAllEvents().get(i).getName()
            + "</name>\n";
        eventsXML += "\t\t\t<description>" + eventList.getAllEvents().get(i)
            .getDescription() + "</description>\n";
        eventsXML += "\t\t\t<date>" + eventList.getAllEvents().get(i).getDate()
            .toString() + "</date>\n";
        if (eventList.getAllEvents().get(i).getGame() != null)
        {
          eventsXML +=
              "\t\t\t<game>" + eventList.getAllEvents().get(i).getGame()
                  .getName() + "</game>\n";
        }
        else
        {
          eventsXML += "\t\t\t<game></game>";
        }
        if (eventList.getAllEvents().get(i).getMembersArray() != null)
        {
          if (eventList.getAllEvents().get(i).getMembersArray().size() > 0)
          {
            eventsXML += "\t\t\t<participants>\n";
            for (int j = 0;
                 j < eventList.getAllEvents().get(i).getMembersArray()
                     .size(); j++)
            {
              eventsXML +=
                  "\t\t\t\t<participant>" + eventList.getAllEvents().get(i)
                      .getMembersArray().get(j).toString()
                      + "#5%G7S1%3</participant>\n";
            }
            eventsXML += "\t\t\t</participants>\n";
          }
          else
          {
            eventsXML += "\t\t\t<participants></participants>\n";
          }
        }
        else
        {
          eventsXML += "\t\t\t<participants></participants>\n";
        }
        eventsXML += "\t\t</event>\n";
      }
      eventsXML += "\t</eventList>\n";
      eventsXML += "</root>";
      modelManager.saveXML("./website/xml/eventList.xml", eventsXML);

      String borrowingsXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <root>\n \t<borrowingsList>\n";
      RentalList borrowingsList = modelManager.getRentals();
      for (int i = 0; i < borrowingsList.getRentals().size(); i++)
      {
        borrowingsXML += "\t\t<borrowing>\n";
        borrowingsXML +=
            "\t\t\t<start_date>" + borrowingsList.getRentals().get(i)
                .getStart_period().toString() + "</start_date>\n";
        borrowingsXML += "\t\t\t<end_date>" + borrowingsList.getRentals().get(i)
            .getEnd_period().toString() + "</end_date>\n";
        borrowingsXML +=
            "\t\t\t<member>" + borrowingsList.getRentals().get(i).getMember()
                .toString() + "</member>\n";
        borrowingsXML +=
            "\t\t\t<game>" + borrowingsList.getRentals().get(i).getGame()
                .toString() + "</game>\n";
        if (!borrowingsList.getRentals().get(i).getLocation().isEmpty())
        {
          borrowingsXML +=
              "\t\t\t<location>" + borrowingsList.getRentals().get(i)
                  .getLocation() + "</location>\n";
        }
        else
        {
          borrowingsXML += "\t\t\t<location>VIA College University</location>\n";
        }
        borrowingsXML += "\t\t</borrowing>\n";
      }
      borrowingsXML += "\t</borrowingsList>\n";
      borrowingsXML += "</root>";
      modelManager.saveXML("./website/xml/borrowingsList.xml", borrowingsXML);

      String reservationsXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <root>\n \t<reservationsList>\n";
      ReservationList reservationList = modelManager.getReservations();
      for (int i = 0; i < reservationList.getReservations().size(); i++)
      {
        reservationsXML += "\t\t<reservation>\n";
        reservationsXML +=
            "\t\t\t<start_date>" + reservationList.getReservations().get(i)
                .getStart_period().toString() + "</start_date>\n";
        reservationsXML +=
            "\t\t\t<end_date>" + reservationList.getReservations().get(i)
                .getEnd_period().toString() + "</end_date>\n";
        reservationsXML +=
            "\t\t\t<member>" + reservationList.getReservations().get(i)
                .getMember().toString() + "</member>\n";
        reservationsXML +=
            "\t\t\t<game>" + reservationList.getReservations().get(i).getGame()
                .toString() + "</game>\n";

        reservationsXML += "\t\t</reservation>\n";
      }
      reservationsXML += "\t</reservationsList>\n";
      reservationsXML += "</root>";
      modelManager.saveXML("./website/xml/reservationsList.xml",
          reservationsXML);

      alert_message("All the information has been exported in XML Files");
    }
    else if (e.getSource() == addBorrowingMember)
    {
      if (addBorrowingMember.getSelectionModel().getSelectedIndex() > -1)
      {
        Member member = addBorrowingMember.getSelectionModel()
            .getSelectedItem();
        if (member.getStatus() == false)
        {
          addBorrowingLocation.setDisable(true);
          addBorrowingLocation.setText("VIA College University");
        }
        else
        {
          addBorrowingLocation.setDisable(false);
          addBorrowingLocation.setText("");
        }
      }
    }

  }

  /**
   * Method for changing tabs and not permitting to manage anything if you do not have information
   */
  public void tabChanged()
  {
    if (manageMembersTab.isSelected())
    {

      if (modelManager.getMembers().getMembers().size() == 0
          || modelManager.getMembers() == null)
      {
        alert_message(
            "You need to have at least one saved member in order to access this page");
        membersTabPane.getSelectionModel().select(addMemberTab);
      }
    }
    else if (manageGamesTab.isSelected())
    {
      if (modelManager.getAllGames().getAllGames().size() == 0
          || modelManager.getAllGames() == null)
      {
        alert_message(
            "You need to have at least one saved game in order to access this page");
        gamesTabPane.getSelectionModel().select(addGameTab);
      }
    }
    else if (manageEventsTab.isSelected())
    {
      if (modelManager.getEvents().getAllEvents().size() == 0
          || modelManager.getEvents() == null)
      {
        alert_message(
            "You need to have at least one saved event in order to access this page");
        eventsTabPane.getSelectionModel().select(addEventTab);
      }
    }
    else if (manageReservationsTab.isSelected())
    {
      if (modelManager.getReservations().getReservations().size() == 0
          || modelManager.getReservations() == null)
      {
        alert_message(
            "You need to have at least one saved reservation in order to access this page");
        reservationsTabPane.getSelectionModel().select(addReservationTab);
      }
    }
    else if (manageBorrowingsTab.isSelected())
    {
      if (modelManager.getRentals().getRentals().size() == 0
          || modelManager.getRentals() == null)
      {
        alert_message(
            "You need to have at least one saved borrowing in order to access this page");
        borrowingsTabPane.getSelectionModel().select(addBorrowingTab);
      }
    }
  }
}
