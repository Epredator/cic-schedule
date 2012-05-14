package org.cicts.client;

import com.bradrydzewski.gwt.calendar.client.CalendarSettings;
import com.bradrydzewski.gwt.calendar.client.CalendarSettings.Click;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.google.gwt.widget.client.TextButton;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Scheduler implements EntryPoint {
	
	private StackLayoutPanel StackLayoutPanelGroup = new StackLayoutPanel(Unit.EM);
	private SplitLayoutPanel splitLayoutPanelGroup = new SplitLayoutPanel();
	private VerticalPanel  VerticalPanelGroupBottom  = new VerticalPanel();
	private  Label labelGroupSearch = new Label("SEARCH:"); 
	private SuggestBox SuggestBoxGroupSearch= new SuggestBox(); 
	private  Label labelGroupHello = new Label("Hello User!"); 

	//all tabs
	private VerticalPanel verticalPanelCal = new VerticalPanel();
	private VerticalPanel verticalPanelAgency = new VerticalPanel();
	private VerticalPanel verticalPanelPOP = new VerticalPanel();
	private VerticalPanel verticalPanelReport = new VerticalPanel();
//=========================================================================================		
	 private DatePicker datePicker = new DatePicker();
	 private CalendarSettings settings = new CalendarSettings();
	 private DecoratedTabPanel decoratedTabPanel = new DecoratedTabPanel();
	 private GoogleCalendarPanel googleCalendarPanel = new GoogleCalendarPanel();
	 
		private StackLayoutPanel StackLayoutPanelCal = new StackLayoutPanel(Unit.EM);
		private SplitLayoutPanel splitLayoutPanelCal= new SplitLayoutPanel();
//=========================================================================================		
	
	
	//all  GROUP grids
	private Grid gridGroup = new Grid(10, 5);
	private Grid gridGroupNumbers  = new Grid(2, 3); 
	
	//labels GROUP: name, responsible, country, language, arrival, departure
	private Label labelGroupName = new Label("Group name:"); 
	private DoubleBox longBoxGroupName = new DoubleBox();
	
	private Label labelGroupArrival = new Label("Arrival:"); 
	private Label labelGroupDeparture = new Label("Departure:"); 
	private DateBox  dateBoxArrival = new DateBox();
	private DateBox  dateBoxDeparture = new DateBox();
	
	private Label labelGroupResponsible= new InlineLabel("Responsible:"); 
	private LongBox longBoxGroupResponsible = new LongBox(); 
	
	private Label labelGroupStaying= new InlineLabel("Israel Staying:"); 
	private LongBox longBoxGroupStaying = new LongBox(); 

	private Label labelGroupCountry = new InlineLabel("Country:"); 
	private SuggestBox SuggestBoxGroupCountry= new SuggestBox(); 

	private Label labelGroupLanguage = new InlineLabel("Language:"); 
	private SuggestBox SuggestBoxGroupLanguage= new SuggestBox(); 
	
	private HorizontalPanel horizontalPanelID= new HorizontalPanel(); 
	private InlineLabel inlineLabelID = new InlineLabel("ID:"); 
	private IntegerBox integerBoxID = new IntegerBox();
	
	private SimplePager simplePagerGroup = new SimplePager();

	//GROUP: phone 
	private InlineLabel inlineLabelPhone = new InlineLabel("Phone:"); 
	private IntegerBox integerBoxPhone = new IntegerBox();
	private TextButton textButtonAddPhone = new TextButton("add more phones"); 

	//GROUP: email
	private InlineLabel inlineLabelEmail = new InlineLabel("E-mail:"); 
	private LongBox longBoxEmail = new LongBox();
	private TextButton textButtonAddEmail = new TextButton("add more e-mails");
	
	private InlineLabel inlineLabelGroupChurch = new InlineLabel("Church:"); 
	private LongBox longBoxGroupChurch = new LongBox();
	
	private InlineLabel inlineLabelGroupCelebrant= new InlineLabel("Celebrant:");
	private LongBox longBoxGroupCelebrant = new LongBox();

	//GROUP: other contact
	private Label labelOtherContact = new Label("Other contact:"); 
	private TextArea textAreaOtherContact = new TextArea(); 
	
	private Label labelNotes= new Label("Notes:"); 
	private TextArea textAreaNotes = new TextArea(); 

	private	InlineLabel inlineLabelBishop = new InlineLabel("Bishops:");
	private	InlineLabel inlineLabelPriest = new InlineLabel("Priest:"); 
	private	InlineLabel inlineLabelParticipants = new InlineLabel("Participants:"); 
	private	IntegerBox integerBoxBishop  = new IntegerBox();
	private	IntegerBox integerBoxPriest = new IntegerBox(); 
	private	IntegerBox integerBoxParticipants  = new IntegerBox();
//=========================================================================================		

	
	//all  AGENCY grids
	private Grid gridAgency = new Grid(10, 5);
	private Grid gridAgencyNumbers  = new Grid(2, 3); 

	//labels AGENCY: name, responsible, country, language, arrival, departure
	private Label labelAgencyName = new Label("Group name:"); 
	private DoubleBox longBoxAgencyName = new DoubleBox();
	
	private Label labelAgencyResponsible= new InlineLabel("Responsible:"); 
	private LongBox longBoxAgencyResponsible = new LongBox(); 
	
	private Label labelAgencyStaying= new InlineLabel("Israel Staying:"); 
	private LongBox longBoxAgencyStaying = new LongBox(); 

	private Label labelAgencyCountry = new InlineLabel("Country:"); 
	private SuggestBox SuggestBoxAgencyCountry= new SuggestBox(); 

	private Label labelAgencyLanguage = new InlineLabel("Language:"); 
	private SuggestBox SuggestBoxAgencyLanguage= new SuggestBox(); 
	
	private HorizontalPanel horizontalPanelAgencyID= new HorizontalPanel(); 
	private InlineLabel inlineLabelAgencyID = new InlineLabel("ID:"); 
	private IntegerBox integerBoxAgencyID = new IntegerBox();
	
	private SimplePager simplePagerAgency= new SimplePager();

	//AGENCY : phone 
	private InlineLabel inlineLabelAgencyPhone = new InlineLabel("Phone:"); 
	private IntegerBox integerBoxAgencyPhone = new IntegerBox();
	private TextButton textButtonAddAgencyPhone = new TextButton("add more phones"); 

	//AGENCY : email
	private InlineLabel inlineLabelAgencyEmail = new InlineLabel("E-mail:"); 
	private LongBox longBoxAgencyEmail = new LongBox();
	private TextButton textButtonAddAgencyEmail= new TextButton("add more e-mails");
	
	private InlineLabel inlineLabelAgencyChurch = new InlineLabel("Church:"); 
	private LongBox longBoxAgencyChurch = new LongBox();
	
	private InlineLabel inlineLabelAgencyCelebrant= new InlineLabel("Celebrant:");
	private LongBox longBoxAgencyCelebrant = new LongBox();

	//AGENCY : other contact
	private Label labelOtherAgencyContact = new Label("Other contact:"); 
	private TextArea textAreaOtherAgencyContact= new TextArea(); 
	
	private Label labelAgencyNotes= new Label("Notes:"); 
	private TextArea textAreaAgencyNotes = new TextArea(); 

	private	InlineLabel inlineLabelAgencyBishop= new InlineLabel("Bishops:");
	private	InlineLabel inlineLabelAgencyPriest= new InlineLabel("Priest:"); 
	private	InlineLabel inlineLabelAgencyParticipants= new InlineLabel("Participants:"); 
	private	IntegerBox integerBoxAgencyBishop  = new IntegerBox();
	private	IntegerBox integerBoxAgencyPriest= new IntegerBox(); 
	private	IntegerBox integerBoxAgencyParticipants = new IntegerBox();
//=========================================================================================		

	
	//all  POP grids
	private Grid gridPOP = new Grid(10, 5);
	private Grid gridPOPNumbers  = new Grid(2, 3); 
	
	//labels POP: name, responsible, country, language, arrival, departure
	private Label labelPOPShrine = new Label("Shrine:"); 
	private DoubleBox longBoxPOPShrine= new DoubleBox();
	
	private Label labelPOPSanctSuperior= new InlineLabel("Sanctuary Superior:"); 
	private LongBox longBoxPOPSanctSuperior = new LongBox(); 
	
	private Label labelPOPResponsible= new InlineLabel("Responsible:"); 
	private LongBox longBoxPOPResponsible = new LongBox(); 

	private Label labelPOPAddress= new InlineLabel("Address:"); 
	private TextArea textAreaPOPAddress= new TextArea(); 
	
	private HorizontalPanel horizontalPanelPOPID= new HorizontalPanel(); 
	private InlineLabel inlineLabelPOPID = new InlineLabel("ID:"); 
	private IntegerBox integerBoxPOPID = new IntegerBox();
	
	private SimplePager simplePagerPOP= new SimplePager();

	//POP : phone 
	private InlineLabel inlineLabelPOPPhone = new InlineLabel("Phone:"); 
	private IntegerBox integerBoxPOPPhone = new IntegerBox();
	private TextButton textButtonAddPOPPhone = new TextButton("add more phones"); 

	//AGENCY : email
	private InlineLabel inlineLabelPOPEmail = new InlineLabel("E-mail:"); 
	private LongBox longBoxPOPEmail = new LongBox();
	private TextButton textButtonAddPOPEmail= new TextButton("add more e-mails");
	
	private Label  labelPOPCity= new Label("City:"); 
	private SuggestBox suggestBoxPOPCity= new SuggestBox();
	
	private Label  labelPOPZip= new Label("ZIP:"); 
	private IntegerBox integerBoxPOPZip= new IntegerBox();

	//AGENCY : other contact
	private Label labelPOPWebsite= new Label("Website:"); 
	private LongBox textAreaPOPWebsite= new LongBox(); 
	
	private Label labelPOPNotes= new Label("Notes:"); 
	private TextArea textAreaPOPNotes = new TextArea(); 

	private	InlineLabel inlineLabelPOPBishop= new InlineLabel("Bishops:");
	private	InlineLabel inlineLabelPOPPriest= new InlineLabel("Priest:"); 
	private	InlineLabel inlineLabelPOPParticipants= new InlineLabel("Participants:"); 
	private	IntegerBox integerBoxPOPBishop  = new IntegerBox();
	private	IntegerBox integerBoxPOPPriest= new IntegerBox(); 
	private	IntegerBox integerBoxPOPParticipants = new IntegerBox();
//=========================================================================================		
	private CaptionPanel cptnpnlReportGroups = new CaptionPanel("Groups:");
	private CaptionPanel cptnpnlReportAgency = new CaptionPanel("Agencies:");
	private CaptionPanel cptnpnlReportPOPShrine = new CaptionPanel("POP's -Shrines:");
	private CaptionPanel cptnpnlReportAccounting = new CaptionPanel("Accounting :");

	private	Grid gridReportGroups = new Grid(6, 3);
	private 	Grid gridReportAgency = new Grid(1, 1);
	private	Grid gridReportPOPShrine = new Grid(1, 2);
	private	Grid gridReportAccounting= new Grid(2, 3);
	
	//all radio buttons
	private	RadioButton rdbtnByLanguage = new RadioButton("new name", "by language");;
	private 	RadioButton rdbtnByCountry = new RadioButton("new name", "by country");
	private 	RadioButton rdbtnByChurch = new RadioButton("new name", "by church");
	private	RadioButton rdbtnByArrivalDate = new RadioButton("new name", "by arrival date");
	private	RadioButton rdbtnByInvoiceStatus = new RadioButton("new name", "by invoice status");
	private	RadioButton rdbtnByYears = new RadioButton("new name", "by years");
	private	RadioButton rdbtnByAgencies = new RadioButton("new name", "by Agencies ");
	
	private RadioButton rdbtnByLanguages = new RadioButton("new name", "by language");
	
	private RadioButton rdbtnByShrineList = new RadioButton("new name", "period scheuldes");
	private RadioButton rdbtnByPeriodScheuldes = new RadioButton("new name", "period scheuldes");

	private RadioButton rdbtnByInvoices = new RadioButton("new name", "invoices");
	private RadioButton rdbtnByReceipts = new RadioButton("new name", "receipts");
	private RadioButton rdbtnByAllInvoicesStatus = new RadioButton("new name", "all invoices status");
	private RadioButton rdbtnAccountingByAgencies = new RadioButton("new name", "by agencies");
	/**
	 * This is the entry point method.
	 * 
	 * 
	 * 
	 */

	public void onModuleLoad() {
		// Use RootPanel.get() to get the entire body element
		RootPanel.get("nameFieldContainer").add(decoratedTabPanel);
		

		
 //=========================================================================================		
		//Assemble  decoratedTabPanel (root Panel) with all tabs
		decoratedTabPanel.add(splitLayoutPanelCal, "Calendar1", true);
		decoratedTabPanel.add(splitLayoutPanelGroup, "Group1", true);
		decoratedTabPanel.add(verticalPanelAgency, "Agencies1", true);
		decoratedTabPanel.add(verticalPanelPOP, "POP's1:", true);
		decoratedTabPanel.add(verticalPanelReport, "Reports1", true);
//=========================================================================================		
		
		//splitLayoutPanelCal
	  splitLayoutPanelCal.setSize("80em", "50em");

	    // Create a three-item stack, with headers sized in EMs. 
	   
	    StackLayoutPanelCal.add(new HTML("this"), new HTML("[Options]"), 4);
	    StackLayoutPanelCal.add(new HTML("that"), new HTML("[View]"), 4);
	    StackLayoutPanelCal.add(new HTML("the other"), new HTML("[Report]"), 4);
	    splitLayoutPanelCal.addWest(StackLayoutPanelCal, 100.0);
		
		//Assemble  verticalPanelCal  with CalendarPanel.java
	    splitLayoutPanelCal.add(googleCalendarPanel);


		
		
		//datePicker
				
		//OPTIONS for calendar -change hour offset to false to facilitate iCal style
		settings.setOffsetHourLabels(false);
		settings.setTimeBlockClickNumber(Click.Double);

		
		
		

//=========================================================================================		!NEW SPLIT PANEL! not ready yet ;)
		

		

		
		
		    // Create a three-item stack, with headers sized in EMs. 
		   
		    StackLayoutPanelGroup.add(new HTML("this"), new HTML("[Options]"), 4);
		    StackLayoutPanelGroup.add(new HTML("that"), new HTML("[View]"), 4);
		    StackLayoutPanelGroup.add(new HTML("the other"), new HTML("[Report]"), 4);
		    splitLayoutPanelGroup.addWest(StackLayoutPanelGroup, 100.0);
		   splitLayoutPanelGroup.addSouth(VerticalPanelGroupBottom, 100.0);
		   
		   
		   VerticalPanelGroupBottom.add(simplePagerGroup);
		   VerticalPanelGroupBottom.add(labelGroupSearch);
		   VerticalPanelGroupBottom.add ( SuggestBoxGroupSearch);

		
		    splitLayoutPanelGroup.setSize("80em", "50em");
//=========================================================================================	    
		    
		//Assemble  verticalPanelGroup with other controls
		//verticalPanelGroup.add(gridGroup);
		 splitLayoutPanelGroup.add(gridGroup);
		 
		
		 
		 gridGroup.setWidget(0, 2, horizontalPanelID);
		gridGroup.setWidget(0, 2, horizontalPanelID);
		
		horizontalPanelID.add(inlineLabelID);
		horizontalPanelID.add(integerBoxID);
		
		//labels GroupName, arrival, departure Responsible, Phone+ , email+, country, language church, celebrant, israel staying, notes etc...
		gridGroup.setWidget(0, 0, labelGroupName);
		gridGroup.setWidget(0, 1, longBoxGroupName); 
		
		gridGroup.setWidget(1, 1, labelGroupArrival );
		gridGroup.setWidget(1, 3, labelGroupDeparture ); 
		gridGroup.setWidget(2, 1, dateBoxArrival);
		gridGroup.setWidget(2, 3, dateBoxDeparture);
	
		gridGroup.setWidget(3, 0, labelGroupResponsible);
		gridGroup.setWidget(3, 1, longBoxGroupResponsible); 
		
		gridGroup.setWidget(3, 2, labelGroupStaying);
		gridGroup.setWidget(3, 3, longBoxGroupStaying); 
		
		gridGroup.setWidget(4, 0, inlineLabelGroupChurch );
		gridGroup.setWidget(4, 1, longBoxGroupChurch); 
		
		gridGroup.setWidget(4, 2, inlineLabelGroupCelebrant );
		gridGroup.setWidget(4, 3, longBoxGroupCelebrant); 

		gridGroup.setWidget(5, 0, labelGroupCountry);
		gridGroup.setWidget(5, 1, SuggestBoxGroupCountry); 
		
		gridGroup.setWidget(5, 2, labelGroupLanguage);
		gridGroup.setWidget(5, 3, SuggestBoxGroupLanguage); 
		
		gridGroup.setWidget(6, 3, gridGroupNumbers); //no.bishops, priest and participants

		//GROUP: phone
		gridGroup.setWidget(7, 0, inlineLabelPhone);
		gridGroup.setWidget(7, 1, integerBoxPhone);
		gridGroup.setWidget(7, 2, textButtonAddPhone);
		
		//GROUP: email
		gridGroup.setWidget(8, 0, inlineLabelEmail );
		gridGroup.setWidget(8, 1, longBoxEmail);
		gridGroup.setWidget(8, 2, textButtonAddEmail); 
		
		gridGroup.setWidget(9, 0, labelOtherContact);
		gridGroup.setWidget(9, 1, textAreaOtherContact);
		
		gridGroup.setWidget(9, 2, labelNotes);
		gridGroup.setWidget(9, 3, textAreaNotes);
		
		//Assemble  gridGroupNumbers with other controls
		gridGroupNumbers.setWidget(0, 0, inlineLabelBishop);
		gridGroupNumbers.setWidget(0, 1, inlineLabelPriest);
		gridGroupNumbers.setWidget(0, 2, inlineLabelParticipants);
		gridGroupNumbers.setWidget(1, 0, integerBoxBishop );
		gridGroupNumbers.setWidget(1, 1,integerBoxPriest);
		gridGroupNumbers.setWidget(1, 2, integerBoxParticipants);
		
		//OPTIONS for GROUP: gridGroupNumbers
		integerBoxBishop.setWidth("30px");
		integerBoxPriest.setWidth("30px");
		integerBoxParticipants.setWidth("30px");
		
		//GROUP: phone options
		integerBoxPhone.setWidth("150px");
		textButtonAddPhone.setSize("70px", "45px");
		//GROUP: email options
		longBoxEmail.setSize("150px", "16px");
		textButtonAddEmail.setSize("70px", "45px");
//=========================================================================================	
		//Assemble  verticalPanelAgency with other controls
			verticalPanelAgency.add(gridAgency);
			
			//Assemble  verticalPanelAgency with  dockPanelAgency
			//verticalPanelGroup.add(dockPanelGroup);
			
			//Assemble  verticalPanelAgency with other controls
			verticalPanelAgency.add(gridAgency);
			
			gridAgency.setWidget(0, 3, simplePagerAgency);
			gridAgency.setWidget(0, 2, horizontalPanelAgencyID);
			
			horizontalPanelAgencyID.add(inlineLabelAgencyID);
			horizontalPanelAgencyID.add(integerBoxAgencyID);
			
			//labels GroupName, arrival, departure Responsible, Phone+ , email+, country, language church, celebrant, israel staying, notes etc...
			gridAgency.setWidget(0, 0, labelAgencyName);
			gridAgency.setWidget(0, 1, longBoxAgencyName); 
			
			gridAgency.setWidget(3, 0, labelAgencyResponsible);
			gridAgency.setWidget(3, 1, longBoxAgencyResponsible); 
			
			gridAgency.setWidget(3, 2, labelAgencyStaying);
			gridAgency.setWidget(3, 3, longBoxAgencyStaying); 
			
			gridAgency.setWidget(4, 0, inlineLabelAgencyChurch );
			gridAgency.setWidget(4, 1, longBoxAgencyChurch); 
			
			gridAgency.setWidget(4, 2, inlineLabelAgencyCelebrant );
			gridAgency.setWidget(4, 3, longBoxAgencyCelebrant); 

			gridAgency.setWidget(5, 0, labelAgencyCountry);
			gridAgency.setWidget(5, 1, SuggestBoxAgencyCountry); 
			
			gridAgency.setWidget(5, 2, labelAgencyLanguage);
			gridAgency.setWidget(5, 3, SuggestBoxAgencyLanguage); 
			
			gridAgency.setWidget(6, 3, gridAgencyNumbers); //no.bishops, priest and participants

			//AGENCY: phone
			gridAgency.setWidget(7, 0, inlineLabelAgencyPhone);
			gridAgency.setWidget(7, 1, integerBoxAgencyPhone);
			gridAgency.setWidget(7, 2, textButtonAddAgencyPhone);
			
			//AGENCY: email
			gridAgency.setWidget(8, 0, inlineLabelAgencyEmail );
			gridAgency.setWidget(8, 1, longBoxAgencyEmail);
			gridAgency.setWidget(8, 2, textButtonAddAgencyEmail); 
			
			gridAgency.setWidget(9, 0, labelOtherAgencyContact);
			gridAgency.setWidget(9, 1, textAreaOtherAgencyContact);
			
			gridAgency.setWidget(9, 2, labelAgencyNotes);
			gridAgency.setWidget(9, 3, textAreaAgencyNotes);
			
			//Assemble  gridGroupNumbers with other controls
			gridAgencyNumbers.setWidget(0, 0, inlineLabelAgencyBishop);
			gridAgencyNumbers.setWidget(0, 1, inlineLabelAgencyPriest);
			gridAgencyNumbers.setWidget(0, 2, inlineLabelAgencyParticipants);
			gridAgencyNumbers.setWidget(1, 0, integerBoxAgencyBishop );
			gridAgencyNumbers.setWidget(1, 1,integerBoxAgencyPriest);
			gridAgencyNumbers.setWidget(1, 2, integerBoxAgencyParticipants);
			
			//OPTIONS for AGENCY: gridAgencyNumbers
			integerBoxAgencyBishop.setWidth("30px");
			integerBoxAgencyPriest.setWidth("30px");
			integerBoxAgencyParticipants.setWidth("30px");
			
			//AGENCY: phone options
			integerBoxAgencyPhone.setWidth("150px");
			textButtonAddAgencyPhone.setSize("70px", "45px");
			//AGENCY: email options
			longBoxAgencyEmail.setSize("150px", "16px");
			textButtonAddAgencyEmail.setSize("70px", "45px");
//=========================================================================================			
			//Assemble  verticalPanelPOP with other controls
			verticalPanelPOP.add(gridPOP);
			

			
			
			
			
			gridPOP.setWidget(0, 3, simplePagerPOP);
			gridPOP.setWidget(0, 2, horizontalPanelPOPID);
			
			horizontalPanelPOPID.add(inlineLabelPOPID);
			horizontalPanelPOPID.add(integerBoxPOPID);
			
			//labels GroupName, arrival, departure Responsible, Phone+ , email+, country, language church, celebrant, israel staying, notes etc...
			gridPOP.setWidget(0, 0, labelPOPShrine);
			gridPOP.setWidget(0, 1, longBoxPOPShrine); 
			
			gridPOP.setWidget(1, 0, labelPOPSanctSuperior);
			gridPOP.setWidget(1, 1, longBoxPOPSanctSuperior); 
			
			gridPOP.setWidget(2, 0, labelPOPResponsible);
			gridPOP.setWidget(2, 1, longBoxPOPResponsible); 

			gridPOP.setWidget(3, 0, labelPOPAddress);
			gridPOP.setWidget(3, 1, textAreaPOPAddress); 
			
			gridPOP.setWidget(3, 2, labelPOPCity);
			gridPOP.setWidget(3, 3, suggestBoxPOPCity); 
			
			gridPOP.setWidget(4, 2, labelPOPZip);
			gridPOP.setWidget(4, 3, integerBoxPOPZip); 
			
			gridPOP.setWidget(4, 1, gridPOPNumbers); //no.bishops, priest and participants

			//POP: phone
			gridPOP.setWidget(5, 0, inlineLabelPOPPhone);
			gridPOP.setWidget(5, 1, integerBoxPOPPhone);
			gridPOP.setWidget(5, 2, textButtonAddPOPPhone);
			
			//POP: email
			gridPOP.setWidget(6, 0, inlineLabelPOPEmail );
			gridPOP.setWidget(6, 1, longBoxPOPEmail);
			gridPOP.setWidget(6, 2, textButtonAddPOPEmail); 
			
			gridPOP.setWidget(7, 0,labelPOPWebsite);
			gridPOP.setWidget(7, 1, textAreaPOPWebsite);
			
			gridPOP.setWidget(7, 2, labelPOPNotes);
			gridPOP.setWidget(7, 3, textAreaPOPNotes);
			
			//Assemble  gridPOPNumbers with other controls
			gridPOPNumbers.setWidget(0, 0, inlineLabelPOPBishop);
			gridPOPNumbers.setWidget(0, 1, inlineLabelPOPPriest);
			gridPOPNumbers.setWidget(0, 2, inlineLabelPOPParticipants);
			gridPOPNumbers.setWidget(1, 0, integerBoxPOPBishop );
			gridPOPNumbers.setWidget(1, 1,integerBoxPOPPriest);
			gridPOPNumbers.setWidget(1, 2, integerBoxPOPParticipants);

			//OPTIONS for POP: gridPOPNumbers
			integerBoxPOPBishop.setWidth("30px");
			integerBoxPOPPriest.setWidth("30px");
			integerBoxPOPParticipants.setWidth("30px");

			//POP: phone options
			integerBoxPOPPhone.setWidth("150px");
			textButtonAddPOPPhone.setSize("70px", "45px");
			//POP: email options
			longBoxPOPEmail.setSize("150px", "16px");
			textButtonAddPOPEmail.setSize("70px", "45px");

//=========================================================================================			
			//Assemble verticalPanelReport with gridReport and so on
			verticalPanelReport.add(cptnpnlReportGroups );
			verticalPanelReport.add(cptnpnlReportAgency);
			verticalPanelReport.add(cptnpnlReportPOPShrine);
			verticalPanelReport.add(cptnpnlReportAccounting);
			
			//Assemble  cptnpnlReportGroups with other controls
			cptnpnlReportGroups.setContentWidget(gridReportGroups);
			gridReportGroups.setWidget(0, 0, rdbtnByCountry);
			gridReportGroups.setWidget(0, 1, rdbtnByLanguage);
			gridReportGroups.setWidget(0, 2, rdbtnByChurch);
			gridReportGroups.setWidget(1, 0, rdbtnByArrivalDate);
			gridReportGroups.setWidget(1, 1, rdbtnByInvoiceStatus);
			gridReportGroups.setWidget(1, 2, rdbtnByYears);
			gridReportGroups.setWidget(2, 0, rdbtnByAgencies);
			
			//Assemble  cptnpnlReportAgency with other controls
			cptnpnlReportAgency.setContentWidget(gridReportAgency);
			gridReportAgency .setWidget(0, 0, rdbtnByLanguages);
			
			//Assemble  cptnpnlReportPOPShrine with other controls
			cptnpnlReportPOPShrine.setContentWidget(gridReportPOPShrine);
			gridReportPOPShrine .setWidget(0, 0, rdbtnByShrineList);
			gridReportPOPShrine .setWidget(0, 1, rdbtnByPeriodScheuldes );
			
			//Assemble cptnpnlReportAccounting with other controls
			cptnpnlReportAccounting.setContentWidget(gridReportAccounting);
			gridReportAccounting.setWidget(0, 0, rdbtnByInvoices);
			gridReportAccounting.setWidget(0, 1, rdbtnByReceipts);
			gridReportAccounting.setWidget(0, 2, rdbtnByAllInvoicesStatus);
			gridReportAccounting.setWidget(1, 0, rdbtnAccountingByAgencies);
			
			//OPTIONS
			gridReportGroups.setSize("500px", "33px");
			gridReportAgency .setSize("500px", "33px");
			gridReportPOPShrine .setSize("500px", "33px");
			gridReportAccounting.setSize("500px", "33px");
			
			
			
			
		/*** Create the popup dialog box domyslna aplikacja
		final DialogBox dialogBox = new DialogBox();
		dialogBox.setText("Remote Procedure Call");
		dialogBox.setAnimationEnabled(true);
		final Button closeButton = new Button("Close");
		// We can set the id of a widget by accessing its Element
		closeButton.getElement().setId("closeButton");
		final Label textToServerLabel = new Label();
		final HTML serverResponseLabel = new HTML();
		VerticalPanel dialogVPanel = new VerticalPanel();
		dialogVPanel.addStyleName("dialogVPanel");
		dialogVPanel.add(new HTML("<b>Sending name to the server:</b>"));
		dialogVPanel.add(textToServerLabel);
		dialogVPanel.add(new HTML("<br><b>Server replies:</b>"));
		dialogVPanel.add(serverResponseLabel);
		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		dialogVPanel.add(closeButton);
		dialogBox.setWidget(dialogVPanel);
		**/	
	}	
}
