package org.cicts.client;

import com.bradrydzewski.gwt.calendar.client.CalendarSettings;
import com.bradrydzewski.gwt.calendar.client.CalendarSettings.Click;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
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
	
	//all tabs
	private VerticalPanel verticalPanelCal = new VerticalPanel();
	private VerticalPanel verticalPanelGroup = new VerticalPanel();
	private VerticalPanel verticalPanelAgency = new VerticalPanel();
	private VerticalPanel verticalPanelPOP = new VerticalPanel();
	private VerticalPanel verticalPanelReport = new VerticalPanel();
//=========================================================================================		
	 private DatePicker datePicker = new DatePicker();
	 private CalendarSettings settings = new CalendarSettings();
	 private DecoratedTabPanel decoratedTabPanel = new DecoratedTabPanel();
	 private GoogleCalendarPanel googleCalendarPanel = new GoogleCalendarPanel();
//=========================================================================================		
	private DockPanel dockPanelGroup = new DockPanel(); 
	private Grid gridGroup = new Grid(10, 5);
	
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
	
	private DockPanel dockPanelAgency = new DockPanel(); 
	private Grid gridAgency= new Grid(10, 5);
//=========================================================================================		
	private DockPanel dockPanelPOP = new DockPanel(); 
	private Grid gridPOP= new Grid(10, 5);
	
	private Label labelPOPname = new Label("POP name:");
	private DoubleBox doubleBoxPOP = new DoubleBox();
	private SimplePager simplePagerPOP = new SimplePager();
	
	private Label labelShrine= new Label("Shrine:");
	private DoubleBox doubleBoxShrine = new DoubleBox();
	
	private InlineLabel inlineLabelSanctSuperior = new InlineLabel("Sanct.superior:");
	private LongBox longBox = new LongBox();
	
	
	
	
	
	
	
	
	
	
	
	
	private	HorizontalPanel horizontalPanel = new HorizontalPanel(); 
	private	Grid grid = new Grid(6, 2);

	private HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
	private Grid gridGroupNumbers  = new Grid(2, 3); 

	


	private InlineLabel inlineLabel_8 = new InlineLabel("Notes:");
	private TextArea textArea_1 = new TextArea();
	
	
	

	

	
	private InlineLabel inlineLabel_15 = new InlineLabel("ID:");
	private IntegerBox integerBox_3 = new IntegerBox();

	
	
	private InlineLabel inlineLabel_23 = new InlineLabel("ID:");
	private IntegerBox integerBox_9 = new IntegerBox();

	private InlineLabel inlineLabel_17 = new InlineLabel("Phone:");
	private IntegerBox integerBox_4 = new IntegerBox(); 
	private TextButton textButton = new TextButton("add more"); 
	private InlineLabel inlineLabel_18 = new InlineLabel("E-mail:"); 
	private LongBox longBox_1 = new LongBox();
	private TextButton textButton_1 = new TextButton("add more"); 
	private Label label_3 = new Label("Other contact:");
	private TextArea textArea = new TextArea(); 
	private Grid grid_6 = new Grid(2, 2); 
	private InlineLabel inlineLabel_21 = new InlineLabel("Max. No. of seats:");
	private InlineLabel nlnlblMaxNoPersons = new InlineLabel("Max. No. persons:");
	private IntegerBox integerBox_11 = new IntegerBox(); 
	private IntegerBox integerBox_12 = new IntegerBox(); 
	private Grid grid_5 = new Grid(4, 4); 
	private InlineLabel nlnlblAdress = new InlineLabel("Adress:");
	private TextArea textArea_3 = new TextArea(); 
	private InlineLabel inlineLabel_20 = new InlineLabel("Notes:");
	private TextArea textArea_4 = new TextArea(); 
	private 	InlineLabel nlnlblCity = new InlineLabel("City:"); 
	private LongBox longBox_7 = new LongBox();
	private InlineLabel nlnlblZip = new InlineLabel("ZIP:");
	private IntegerBox integerBox_8 = new IntegerBox(); 
	private InlineLabel nlnlblWebsite = new InlineLabel("Website:"); 
	private 	LongBox longBox_8 = new LongBox(); 
	private DecoratedTabPanel decoratedTabPanel_4 = new DecoratedTabPanel(); 
	private VerticalPanel verticalPanel_reports = new VerticalPanel(); 
	private CaptionPanel cptnpnlGroups = new CaptionPanel("Groups:");
	private RadioButton rdbtnByCountry = new RadioButton("new name", "by country");
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// Use RootPanel.get() to get the entire body element
		RootPanel.get("nameFieldContainer").add(decoratedTabPanel);
		
		//Assemble  decoratedTabPanel (root Panel) with all tabs
		decoratedTabPanel.add(verticalPanelCal, "Calendar1", true);
		decoratedTabPanel.add(verticalPanelGroup, "Group1", true);
		decoratedTabPanel.add(verticalPanelAgency, "Agencies1", true);
		decoratedTabPanel.add(verticalPanelPOP, "POP's1:", true);
		decoratedTabPanel.add(verticalPanelReport, "Reports1", true);
		
		//Assemble  verticalPanelCal  with CalendarPanel.java
		verticalPanelCal.add(googleCalendarPanel);
		//verticalPanelCal.setSize("50%", "50%");  //bad idea to uncomment it ;)
				
		//OPTIONS for calendar -change hour offset to false to facilitate iCal style
		settings.setOffsetHourLabels(false);
		settings.setTimeBlockClickNumber(Click.Double);
//=========================================================================================	
		//Assemble  verticalPanelGroup with  dockPanelGroup 
		//verticalPanelGroup.add(dockPanelGroup);
		
		//Assemble  verticalPanelGroup with other controls
		verticalPanelGroup.add(gridGroup);
		
		gridGroup.setWidget(0, 3, simplePagerGroup);
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

		//OPTIONS for GROUP: name, responsible etc...
		gridGroup.setCellSpacing(10);
		labelGroupName.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		labelGroupName.setWidth("93px");
		longBoxGroupName.setAlignment(TextAlignment.LEFT);
		longBoxGroupName.setWidth("150px");
		labelGroupResponsible.setSize("71px", "31px");		
		longBoxGroupResponsible.setAlignment(TextAlignment.LEFT);
		longBoxGroupResponsible.setSize("150px", "100%");
		integerBoxID.setWidth("51px");
		textAreaOtherContact.setAlignment(TextAlignment.LEFT);
		textAreaOtherContact.setSize("150px", "100%");
		
		//GROUP: phone options
		integerBoxPhone.setWidth("150px");
		textButtonAddPhone.setSize("70px", "45px");
		//GROUP: email options
		longBoxEmail.setSize("150px", "16px");
		textButtonAddEmail.setSize("70px", "45px");
//=========================================================================================	
		
		//Assemble  verticalPanelGroup with other controls
			verticalPanelAgency.add(gridAgency);

//=========================================================================================			
		
		//Assemble  verticalPanelGroup with other controls
			verticalPanelPOP.add(gridPOP);
			//verticalPanelPOP.add(grid_5); //??
		
		//Assemble  gridPOP with other controls
			gridPOP.setWidget(0, 0, labelPOPname);
			gridPOP.setWidget(0, 1, doubleBoxPOP );
			gridPOP.setWidget(0, 3, simplePagerPOP);
			gridPOP.setWidget(1, 0, labelShrine);
			gridPOP.setWidget(1, 1, doubleBoxShrine);
			gridPOP.setWidget(2, 0, inlineLabelSanctSuperior);
			gridPOP.setWidget(2, 1, longBox);
			gridPOP.setWidget(3, 0, inlineLabel_17);
			gridPOP.setWidget(3, 1, integerBox_4);
			gridPOP.setWidget(3, 2, textButton);
			gridPOP.setWidget(4, 0, inlineLabel_18);
			gridPOP.setWidget(4, 1, longBox_1);
			gridPOP.setWidget(4, 2, textButton_1);
			gridPOP.setWidget(5, 0, label_3);
			gridPOP.setWidget(5, 1, textArea);
			gridPOP.setWidget(5, 2, grid_6);
		
		
		
		
		//verticalPanel_pop.setSpacing(5);
		//decoratedTabPanel.add(verticalPanel_pop, "POP's", false);
		//verticalPanel_pop.setSize("800px", "800px");
		
		//POP: grid options
		gridPOP.setCellSpacing(5);
		gridPOP.setCellPadding(5);
		gridPOP.setBorderWidth(0);
		gridPOP.setWidth("458px");
		
	
		//Other widgets options
		labelPOPname.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		labelPOPname.setWidth("93px");
		doubleBoxPOP .setAlignment(TextAlignment.LEFT);
		doubleBoxPOP .setWidth("150px");
		
		HorizontalPanel horizontalPanel_5 = new HorizontalPanel();  //EntryPoint add 
		
		
		InlineLabel inlineLabel_15 = new InlineLabel("ID:");  //EntryPoint add 
		horizontalPanel_5.add(inlineLabel_15);
		
		IntegerBox integerBox_3 = new IntegerBox();  //EntryPoint add 
		horizontalPanel_5.add(integerBox_3);
		integerBox_3.setWidth("51px");
		

		
		
		Label label_2 = new Label("Shrine:");  //EntryPoint add 
		label_2.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		
		label_2.setWidth("93px");
		
		DoubleBox doubleBox_2 = new DoubleBox();  //EntryPoint add 
		doubleBox_2.setAlignment(TextAlignment.LEFT);
		
		doubleBox_2.setWidth("150px");
		
		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();  //EntryPoint add 
		
		
		InlineLabel inlineLabel_23 = new InlineLabel("ID:");  //EntryPoint add 
		horizontalPanel_1.add(inlineLabel_23);
		
		IntegerBox integerBox_9 = new IntegerBox();  //EntryPoint add 
		horizontalPanel_1.add(integerBox_9);
		integerBox_9.setWidth("51px");
		
		InlineLabel inlineLabel_16 = new InlineLabel("Sanct.superior:");  //EntryPoint add 
		
		inlineLabel_16.setSize("50px", "31px");
		
		LongBox longBox = new LongBox();  //EntryPoint add 
		longBox.setAlignment(TextAlignment.LEFT); 
		
		longBox.setSize("150px", "100%");
		
		InlineLabel inlineLabel_17 = new InlineLabel("Phone:");  //EntryPoint add 
		
		inlineLabel_17.setHeight("100%");
		
		

		
		
		IntegerBox integerBox_4 = new IntegerBox();//EntryPoint add 
		
		integerBox_4.setWidth("150px");
		
		TextButton textButton = new TextButton("add more");//EntryPoint add 
		
		textButton.setSize("70px", "45px");
		
		InlineLabel inlineLabel_18 = new InlineLabel("E-mail:");//EntryPoint add 
		
		
		LongBox longBox_1 = new LongBox();//EntryPoint add 
		
		longBox_1.setSize("150px", "16px");
		
		TextButton textButton_1 = new TextButton("add more");//EntryPoint add 
		
		textButton_1.setSize("70px", "45px");
		
		Label label_3 = new Label("Other contact:");//EntryPoint add 
		
		
		TextArea textArea = new TextArea();//EntryPoint add 
		textArea.setAlignment(TextAlignment.LEFT);
		
		textArea.setSize("150px", "100%");
		
		Grid grid_6 = new Grid(2, 2); //EntryPoint add 
		
		
		InlineLabel inlineLabel_21 = new InlineLabel("Max. No. of seats:"); //EntryPoint add 
		grid_6.setWidget(0, 0, inlineLabel_21);
		
		InlineLabel nlnlblMaxNoPersons = new InlineLabel("Max. No. persons:"); //EntryPoint add 
		grid_6.setWidget(0, 1, nlnlblMaxNoPersons);
		
		IntegerBox integerBox_11 = new IntegerBox(); //EntryPoint add 
		grid_6.setWidget(1, 0, integerBox_11);
		integerBox_11.setWidth("50px");
		
		IntegerBox integerBox_12 = new IntegerBox(); //EntryPoint add 
		grid_6.setWidget(1, 1, integerBox_12);
		integerBox_12.setWidth("50px");
		
		Grid grid_5 = new Grid(4, 4); //EntryPoint add 
		grid_5.setCellSpacing(5);
		
		
		
		
		grid_5.setWidth("457px");
		
		InlineLabel nlnlblAdress = new InlineLabel("Adress:"); //EntryPoint add 
		grid_5.setWidget(0, 0, nlnlblAdress);
		
		TextArea textArea_3 = new TextArea(); //EntryPoint add 
		grid_5.setWidget(0, 1, textArea_3);
		
		InlineLabel inlineLabel_20 = new InlineLabel("Notes:"); //EntryPoint add 
		grid_5.setWidget(0, 2, inlineLabel_20);
		
		TextArea textArea_4 = new TextArea(); //EntryPoint add 
		grid_5.setWidget(0, 3, textArea_4);
		
		InlineLabel nlnlblCity = new InlineLabel("City:"); //EntryPoint add 
		grid_5.setWidget(1, 0, nlnlblCity);
		
		LongBox longBox_7 = new LongBox(); //EntryPoint add 
		grid_5.setWidget(1, 1, longBox_7);
		
		InlineLabel nlnlblZip = new InlineLabel("ZIP:"); //EntryPoint add 
		grid_5.setWidget(2, 0, nlnlblZip);
		
		IntegerBox integerBox_8 = new IntegerBox(); //EntryPoint add 
		grid_5.setWidget(2, 1, integerBox_8); 
		
		InlineLabel nlnlblWebsite = new InlineLabel("Website:"); //EntryPoint add 
		grid_5.setWidget(3, 0, nlnlblWebsite);
		
		LongBox longBox_8 = new LongBox(); //EntryPoint add 
		grid_5.setWidget(3, 1, longBox_8);
//=========================================================================================			

		
		DecoratedTabPanel decoratedTabPanel_4 = new DecoratedTabPanel(); //EntryPoint add 
		decoratedTabPanel.add(decoratedTabPanel_4, "Agencies", false);
		decoratedTabPanel_4.setSize("5cm", "3cm");
		
		VerticalPanel verticalPanel_reports = new VerticalPanel(); //EntryPoint add 
		verticalPanel_reports.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel_reports.setSpacing(5);
		decoratedTabPanel.add(verticalPanel_reports, "Reports", false);
		verticalPanel_reports.setSize("800px", "100%");
		
		CaptionPanel cptnpnlGroups = new CaptionPanel("Groups:"); //EntryPoint add 
		verticalPanel_reports.add(cptnpnlGroups);
		
		Grid grid_7 = new Grid(3, 3);
		cptnpnlGroups.setContentWidget(grid_7);
		grid_7.setSize("500px", "33px");
		
		RadioButton rdbtnByCountry = new RadioButton("new name", "by country"); //EntryPoint add 
		grid_7.setWidget(0, 0, rdbtnByCountry);
		
		RadioButton rdbtnByLanguage = new RadioButton("new name", "by language");
		grid_7.setWidget(0, 1, rdbtnByLanguage);
		
		RadioButton rdbtnByChurch = new RadioButton("new name", "by church");
		grid_7.setWidget(0, 2, rdbtnByChurch);
		
		RadioButton rdbtnByArrivalDate = new RadioButton("new name", "by arrival date");
		grid_7.setWidget(1, 0, rdbtnByArrivalDate);
		
		RadioButton rdbtnByInvoiceStatus = new RadioButton("new name", "by invoice status");
		grid_7.setWidget(1, 1, rdbtnByInvoiceStatus);
		
		RadioButton rdbtnByYears = new RadioButton("new name", "by years");
		grid_7.setWidget(1, 2, rdbtnByYears);
		
		RadioButton radioButton = new RadioButton("new name", "by country");
		radioButton.setHTML("by agencies");
		grid_7.setWidget(2, 0, radioButton);
		
		CaptionPanel cptnpnlAgencies = new CaptionPanel("Agencies:");
		verticalPanel_reports.add(cptnpnlAgencies);
		
		Grid grid_8 = new Grid(1, 1);
		cptnpnlAgencies.setContentWidget(grid_8);
		grid_8.setSize("500px", "33px");
		
		RadioButton radioButton_1 = new RadioButton("new name", "by language");
		radioButton_1.setHTML("agency list");
		grid_8.setWidget(0, 0, radioButton_1);
		
		CaptionPanel cptnpnlPopsshrines = new CaptionPanel("POP's -Shrines");
		verticalPanel_reports.add(cptnpnlPopsshrines);
		
		Grid grid_9 = new Grid(1, 2);
		cptnpnlPopsshrines.setContentWidget(grid_9);
		grid_9.setSize("500px", "33px");
		
		RadioButton radioButton_2 = new RadioButton("new name", "by language");
		radioButton_2.setHTML("Shrines list");
		grid_9.setWidget(0, 0, radioButton_2);
		
		RadioButton rdbtnPeriodScheuldes = new RadioButton("new name", "period scheuldes");
		grid_9.setWidget(0, 1, rdbtnPeriodScheuldes);
		
		CaptionPanel cptnpnlAccounting = new CaptionPanel("Accounting:");
		verticalPanel_reports.add(cptnpnlAccounting);
		
		Grid grid_10 = new Grid(2, 3);
		cptnpnlAccounting.setContentWidget(grid_10);
		grid_10.setSize("500px", "33px");
		
		RadioButton rdbtnInvoices = new RadioButton("new name", "invoices");
		grid_10.setWidget(0, 0, rdbtnInvoices);
		
		RadioButton rdbtnReceipts = new RadioButton("new name", "receipts");
		rdbtnReceipts.setHTML("receipts");
		grid_10.setWidget(0, 1, rdbtnReceipts);
		
		RadioButton radioButton_3 = new RadioButton("new name", "all invoices status");
		grid_10.setWidget(0, 2, radioButton_3);
		
		RadioButton radioButton_4 = new RadioButton("new name", "by agencies");
		grid_10.setWidget(1, 0, radioButton_4);
		
		
		
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
