package view;

import javafx.scene.layout.VBox;

import model.*;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
  @FXML private TextField addGameRating;
  @FXML private TextField addGameLink;
  @FXML private TextArea addGameDesc;
  @FXML private Button addGameConfirm;

  // addGames SECTION END

  // manageGames SECTION START
  @FXML private Tab manageGamesTab;
  @FXML private VBox gamesListTab;
  @FXML private TextField manageGamesName;
  @FXML private TextField manageGamesNr;
  @FXML private TextField manageGamesRating;
  @FXML private TextField manageGamesLink;
  @FXML private TextArea manageGamesDesc;
  @FXML private Button manageGamesEdit;
  @FXML private Button manageGamesCancel;
  @FXML private Button manageGamesSave;
  @FXML private Button deleteGame;

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
  @FXML private TextField addEventDay;
  @FXML private TextField addEventMonth;
  @FXML private TextField addEventYear;
  @FXML private TextField addEventHour;
  @FXML private TextField addEventMinute;
  @FXML private Button addEventConfirm;

  // addEvent SECTION END

  // manageEvents SECTION START
  @FXML private Tab manageEventsTab;
  @FXML private VBox eventsTabList;
  @FXML private TextField manageEventsName;
  @FXML private TextArea manageEventsDesc;
  @FXML private ComboBox<Game> manageEventsGame;
  @FXML private TextField manageEventsDay;
  @FXML private TextField manageEventsMonth;
  @FXML private TextField manageEventsYear;
  @FXML private TextField manageEventsHour;
  @FXML private TextField manageEventsMinute;
  @FXML private TextArea manageEventsMembers;
  @FXML private ComboBox<Member> manageEventsAddMember;
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
  @FXML private TextField addReservationSDay;
  @FXML private TextField addReservationSMonth;
  @FXML private TextField addReservationSYear;
  @FXML private TextField addReservationSHour;
  @FXML private TextField addReservationSMinute;
  @FXML private TextField addReservationEDay;
  @FXML private TextField addReservationEMonth;
  @FXML private TextField addReservationEYear;
  @FXML private TextField addReservationEHour;
  @FXML private TextField addReservationEMinute;
  @FXML private Button addReservationConfirm;

  // addReservations SECTION END

  // manageReservations SECTION START
  @FXML private Tab manageReservationsTab;
  @FXML private Label manageReservationsMember;
  @FXML private Label manageReservationsGame;
  @FXML private Label manageReservationsSDate;
  @FXML private Label manageReservationsEDate;
  @FXML private Button manageReservationsEnd;
  // manageReservations SECTION END

  // RESERVATIONS TAB END

  // BORROWINGS TAB START
  @FXML private Tab borrowingsTab;
  @FXML private TabPane borrowingsTabPane;

  // addBorrowing SECTION START
  @FXML private Tab addBorrowingTab;
  @FXML private ComboBox<Member> addBorrowingMember;
  @FXML private ComboBox<Game> addBorrowingGame;
  @FXML private TextField addBorrowingSDay;
  @FXML private TextField addBorrowingSMonth;
  @FXML private TextField addBorrowingSYear;
  @FXML private TextField addBorrowingSHour;
  @FXML private TextField addBorrowingSMinute;
  @FXML private TextField addBorrowingEDay;
  @FXML private TextField addBorrowingEMonth;
  @FXML private TextField addBorrowingEYear;
  @FXML private TextField addBorrowingEHour;
  @FXML private TextField addBorrowingEMinute;
  @FXML private TextField addBorrowingLocation;
  @FXML private Button addBorrowingConfirm;

  // addBorrowing SECTION END

  // manageBorrowing SECTION START
  @FXML private Tab manageBorrowingsTab;
  @FXML private Label manageBorrowingMember;
  @FXML private Label manageBorrowingGame;
  @FXML private Label manageBorrowingSDate;
  @FXML private Label manageBorrowingEDate;
  @FXML private Button manageBorrowingEnd;

  // manageBorrowing SECTION START

  // BORROWINGS TAB END

  // EXTRAS TAB START

  @FXML private Tab extrasTab;

  @FXML private Button exportWebsite;

  // EXTRAS TAB END

  private ModelManager modelManager;

  public void initialize()
  {
    modelManager = new ModelManager("members.bin", "borrowings.bin",
        "reservations.bin", "events.bin", "games.bin");
    updateMembersBox();
  }

  private static void alert_error(String msg)
  {
    Alert alert = new Alert(Alert.AlertType.ERROR, msg, ButtonType.OK);
    alert.setTitle("Error");
    alert.setHeaderText(null);
    alert.show();
  }

  private static void alert_message(String msg)
  {
    Alert alert = new Alert(Alert.AlertType.INFORMATION, msg, ButtonType.OK);
    alert.setTitle("INFO");
    alert.setHeaderText(null);
    alert.show();
  }

  private void updateMembersBox()
  {
    int currentIndex = membersListTab.getSelectionModel().getSelectedIndex();
    membersListTab.getItems().clear();

    MemberList members = modelManager.getMembers();
    for (int i = 0; i < members.getMembers().size(); i++)
    {
      membersListTab.getItems().add(members.getMemberByIndex(i));
      System.out.println(members.getMemberByIndex(i));
    }

    if (currentIndex > -1)
    {
      membersListTab.getSelectionModel().select(currentIndex);

    }
  }

  public void handleActions(ActionEvent e)
  {

    if (e.getSource() == addMemberConfirm)
    {
      if (addMemberFN.getText() != "" && addMemberLN.getText() != "")
      {
        Member aux = new Member(addMemberFN.getText(), addMemberLN.getText());
        if (addMemberStatus.isSelected())
        {
          aux.setStatus(true);
        }
        if (addMemberID.getText() != "")
        {
          aux.setID(addMemberID.getText());
        }
        modelManager.addMember(aux);
        alert_message("A new member has been added");
        addMemberFN.setText("");
        addMemberLN.setText("");
        addMemberID.setText("");
        addMemberStatus.setSelected(false);
        updateMembersBox();
      }
      else
      {
        alert_error("Complete all the required fields");
      }
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
      int i = membersListTab.getSelectionModel().getSelectedIndex();
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

      MemberList aux = modelManager.getMembers();
      aux.getMemberByIndex(i).setFirstName(manageMemberFN.getText());
      aux.getMemberByIndex(i).setLastName(manageMemberLN.getText());
      aux.getMemberByIndex(i).setID(manageMemberID.getText());
      aux.getMemberByIndex(i).setStatus(manageMemberStatus.isSelected());
      modelManager.saveMembers(aux);
      updateMembersBox();
    }
    else if (e.getSource() == deleteMember)
    {
      if (membersListTab.getSelectionModel().getSelectedIndex() > -1)
      {
        MemberList aux = modelManager.getMembers();
        aux.removeMember(membersListTab.getSelectionModel().getSelectedItem());
        modelManager.saveMembers(aux);
        updateMembersBox();
        if(aux.getMembers().size()==0){
          membersTabPane.getSelectionModel().select(addMemberTab);
        }
      }
    }
  }

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
        reservationsTabPane.getSelectionModel().select(addReservationTab);
      }
    }
  }
}
