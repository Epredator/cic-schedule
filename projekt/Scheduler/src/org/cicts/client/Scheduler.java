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
	
	 private DatePicker datePicker = new DatePicker();
	 private CalendarSettings settings = new CalendarSettings();
	

	private DecoratedTabPanel decoratedTabPanel = new DecoratedTabPanel();
	

	//all tabs
	private VerticalPanel verticalPanelCal = new VerticalPanel();
	private VerticalPanel verticalPanelGroup = new VerticalPanel();
	private VerticalPanel verticalPanelAgency = new VerticalPanel();
	private VerticalPanel verticalPanelReport = new VerticalPanel();
	
	
	private GoogleCalendarPanel googleCalendarPanel = new GoogleCalendarPanel();
	
	private DockPanel dockPanelGroup = new DockPanel(); 
	private Grid gridGroup = new Grid(5, 4);
	private Label labelGroupName = new Label("Group name:"); 
	
	private DoubleBox doubleBox = new DoubleBox();
	private HorizontalPanel horizontalPanel_4 = new HorizontalPanel(); 
	private InlineLabel inlineLabel_19 = new InlineLabel("ID:"); 
	private IntegerBox integerBox_5 = new IntegerBox();
	private SimplePager simplePager = new SimplePager();
	private LongBox longBox_5 = new LongBox(); 
	private InlineLabel inlineLabel_4 = new InlineLabel("Phone:"); 
	private IntegerBox integerBox_2 = new IntegerBox();
	private TextButton textButton_3 = new TextButton("add more"); 
	private TextArea textArea_2 = new TextArea(); 
	private	InlineLabel inlineLabel_11 = new InlineLabel("No. Bishops:");
	private	InlineLabel inlineLabel_12 = new InlineLabel("No. Priest:"); 
	private	InlineLabel inlineLabel_13 = new InlineLabel("No. Participants:"); 
	private	IntegerBox integerBox = new IntegerBox();
	private	IntegerBox integerBox_6 = new IntegerBox(); 
	private	IntegerBox integerBox_7 = new IntegerBox();
	private	HorizontalPanel horizontalPanel = new HorizontalPanel(); 
	private	Grid grid = new Grid(6, 2);
	private InlineLabel inlineLabel = new InlineLabel("Country:"); 
	private TextButton textButton_4 = new TextButton("add more");
	
	
	
	
	
	private HorizontalPanel horizontalPanel_2 = new HorizontalPanel();
	private Grid gridGroupNumbers  = new Grid(2, 3); 

	
	
	private InlineLabel inlineLabel_3 = new InlineLabel("Responsible:"); 
	private InlineLabel inlineLabel_5 = new InlineLabel("E-mail:"); 
	private LongBox longBox_6 = new LongBox();
	private Label label_1 = new Label("Other contact:"); 
	
	private SuggestBox suggestBox = new SuggestBox();
	private InlineLabel inlineLabel_1 = new InlineLabel("Language:");
	private SuggestBox suggestBox_1 = new SuggestBox();
	private InlineLabel inlineLabel_2 = new InlineLabel("Church:");
	private LongBox longBox_2 = new LongBox();
	private InlineLabel inlineLabel_6 = new InlineLabel("Celebrant:");
	private InlineLabel inlineLabel_7 = new InlineLabel("Isrl. staying:");
	private LongBox longBox_4 = new LongBox();
	private InlineLabel inlineLabel_8 = new InlineLabel("Notes:");
	private TextArea textArea_1 = new TextArea();
	private AbsolutePanel absolutePanel_1 = new AbsolutePanel();
	private Grid grid_2 = new Grid(2, 2);
	private DateBox dateBox = new DateBox();
	private InlineLabel inlineLabel_10 = new InlineLabel("Departure:");
	private DateBox dateBox_1 = new DateBox();
	private VerticalPanel verticalPanel_pop = new VerticalPanel();
	private Grid grid_4 = new Grid(6, 4);
	private Label label = new Label("POP name:");
	private DoubleBox doubleBox_1 = new DoubleBox();
	private HorizontalPanel horizontalPanel_5 = new HorizontalPanel();
	private InlineLabel inlineLabel_15 = new InlineLabel("ID:");
	private IntegerBox integerBox_3 = new IntegerBox();
	private SimplePager simplePager_1 = new SimplePager();
	private Label label_2 = new Label("Shrine:");
	private DoubleBox doubleBox_2 = new DoubleBox();
	private HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
	private InlineLabel inlineLabel_23 = new InlineLabel("ID:");
	private IntegerBox integerBox_9 = new IntegerBox();
	private InlineLabel inlineLabel_16 = new InlineLabel("Sanct.superior:");
	private LongBox longBox = new LongBox();
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
		decoratedTabPanel.add(verticalPanelCal, "Calendar", false);
		decoratedTabPanel.add(verticalPanelGroup, "Group", false);
		decoratedTabPanel.add(verticalPanelAgency, "Agencies", false);
		decoratedTabPanel.add(verticalPanelReport, "Reports", false);
	
		
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
		gridGroup.setWidget(0, 0, labelGroupName);
		gridGroup.setWidget(0, 1, doubleBox);
		gridGroup.setWidget(0, 3, simplePager);
		gridGroup.setWidget(1, 0, inlineLabel_3);
		gridGroup.setWidget(1, 1, longBox_5);
		gridGroup.setWidget(2, 0, inlineLabel_4);
		gridGroup.setWidget(2, 1, integerBox_2);
		gridGroup.setWidget(2, 2, textButton_3);
		gridGroup.setWidget(3, 0, inlineLabel_5);
		gridGroup.setWidget(3, 1, longBox_6);
		gridGroup.setWidget(3, 2, textButton_4); 
		gridGroup.setWidget(4, 0, label_1);
		gridGroup.setWidget(4, 1, textArea_2);

		gridGroup.setWidget(0, 2, horizontalPanel_4);
		gridGroup.setWidget(4, 2, gridGroupNumbers);
		
		

		//gridGroup.setBorderWidth(0);
		//gridGroup.setCellSpacing(5);
		//gridGroup.setCellPadding(5);
		//gridGroup.setSize("80%", "80%");
		
		labelGroupName.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		labelGroupName.setWidth("93px");
		
		doubleBox.setAlignment(TextAlignment.LEFT);
		doubleBox.setWidth("150px");

		horizontalPanel_4.add(inlineLabel_19);

		horizontalPanel_4.add(integerBox_5);
		integerBox_5.setWidth("51px");
		
		inlineLabel_3.setSize("71px", "31px");
				
		longBox_5.setAlignment(TextAlignment.LEFT);
		longBox_5.setSize("150px", "100%");

		inlineLabel_4.setHeight("100%");

		integerBox_2.setWidth("150px");

		textButton_3.setSize("70px", "45px");

		longBox_6.setSize("150px", "16px");

		textButton_4.setSize("70px", "45px");
		
		textArea_2.setAlignment(TextAlignment.LEFT);
		
		textArea_2.setSize("150px", "100%");

		
		Grid gridGroupNumbers = new Grid(2, 3);  //EntryPoint add

		gridGroupNumbers.setWidget(0, 0, inlineLabel_11);

		gridGroupNumbers.setWidget(0, 1, inlineLabel_12);

		gridGroupNumbers.setWidget(0, 2, inlineLabel_13);

		gridGroupNumbers.setWidget(1, 0, integerBox);
		integerBox.setWidth("50px");
		/**
	//	IntegerBox integerBox_6 = new IntegerBox(); //EntryPoint add 
		gridGroupNumbers.setWidget(1, 1, integerBox_6);
		integerBox_6.setWidth("50px");
		
	//	IntegerBox integerBox_7 = new IntegerBox(); //EntryPoint add 
		gridGroupNumbers.setWidget(1, 2, integerBox_7);
		integerBox_7.setWidth("50px");
		
	//	HorizontalPanel horizontalPanel = new HorizontalPanel(); //EntryPoint add 
		dockPanelGroup.add(horizontalPanel);
		
	//	Grid grid = new Grid(6, 2);//EntryPoint add  
		grid.setCellSpacing(5);
		grid.setCellPadding(5);
		horizontalPanel.add(grid);
		 
	//	InlineLabel inlineLabel = new InlineLabel("Country:");  //EntryPoint add 
		grid.setWidget(0, 0, inlineLabel);
		
		**/
		//=========================================================================================	

		SuggestBox suggestBox = new SuggestBox(); //EntryPoint add 
		grid.setWidget(0, 1, suggestBox);
		
		InlineLabel inlineLabel_1 = new InlineLabel("Language:"); //EntryPoint add 
		grid.setWidget(1, 0, inlineLabel_1);
		
		SuggestBox suggestBox_1 = new SuggestBox(); //EntryPoint add 
		grid.setWidget(1, 1, suggestBox_1); 
		
		InlineLabel inlineLabel_2 = new InlineLabel("Church:"); //EntryPoint add 
		grid.setWidget(2, 0, inlineLabel_2);
		
		LongBox longBox_2 = new LongBox(); //EntryPoint add 
		grid.setWidget(2, 1, longBox_2);
		
		InlineLabel inlineLabel_6 = new InlineLabel("Celebrant:"); //EntryPoint add 
		grid.setWidget(3, 0, inlineLabel_6);
		
		LongBox longBox_3 = new LongBox(); //EntryPoint add 
		grid.setWidget(3, 1, longBox_3);
		
		InlineLabel inlineLabel_7 = new InlineLabel("Isrl. staying:"); //EntryPoint add 
		grid.setWidget(4, 0, inlineLabel_7);
		
		LongBox longBox_4 = new LongBox(); //EntryPoint add 
		grid.setWidget(4, 1, longBox_4);
		
		InlineLabel inlineLabel_8 = new InlineLabel("Notes:"); //EntryPoint add 
		grid.setWidget(5, 0, inlineLabel_8);
		
		TextArea textArea_1 = new TextArea(); //EntryPoint add 
		grid.setWidget(5, 1, textArea_1);
		textArea_1.setSize("177px", "30px");
		
		
		
		
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel(); //EntryPoint add 
		horizontalPanel.add(absolutePanel_1);
		absolutePanel_1.setWidth("5");
		
	
		
		
		Grid grid_2 = new Grid(2, 2); //EntryPoint add 
		grid_2.setCellSpacing(5);
		grid_2.setCellPadding(5);
		horizontalPanel.add(grid_2);
		
		InlineLabel inlineLabel_9 = new InlineLabel("Arrival:"); //EntryPoint add 
		grid_2.setWidget(0, 0, inlineLabel_9);
		
		
		
		
		
		
		DateBox dateBox = new DateBox();  //EntryPoint add 
		grid_2.setWidget(0, 1, dateBox);
		
		InlineLabel inlineLabel_10 = new InlineLabel("Departure:");  //EntryPoint add 
		grid_2.setWidget(1, 0, inlineLabel_10);
		
		DateBox dateBox_1 = new DateBox();  //EntryPoint add 
		grid_2.setWidget(1, 1, dateBox_1);
		
		VerticalPanel verticalPanel_pop = new VerticalPanel();  //EntryPoint add 
		verticalPanel_pop.setSpacing(5);
		decoratedTabPanel.add(verticalPanel_pop, "POP's", false);
		verticalPanel_pop.setSize("800px", "800px");
		
		Grid grid_4 = new Grid(6, 4);  //EntryPoint add 
		grid_4.setCellSpacing(5);
		grid_4.setCellPadding(5);
		grid_4.setBorderWidth(0);
		verticalPanel_pop.add(grid_4);
		grid_4.setWidth("458px");
		
		Label label = new Label("POP name:");  //EntryPoint add 
		label.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid_4.setWidget(0, 0, label);
		label.setWidth("93px");
		
		DoubleBox doubleBox_1 = new DoubleBox();  //EntryPoint add 
		doubleBox_1.setAlignment(TextAlignment.LEFT);
		grid_4.setWidget(0, 1, doubleBox_1);
		doubleBox_1.setWidth("150px");
		
		HorizontalPanel horizontalPanel_5 = new HorizontalPanel();  //EntryPoint add 
		grid_4.setWidget(0, 2, horizontalPanel_5);
		
		InlineLabel inlineLabel_15 = new InlineLabel("ID:");  //EntryPoint add 
		horizontalPanel_5.add(inlineLabel_15);
		
		IntegerBox integerBox_3 = new IntegerBox();  //EntryPoint add 
		horizontalPanel_5.add(integerBox_3);
		integerBox_3.setWidth("51px");
		
		SimplePager simplePager_1 = new SimplePager();  //EntryPoint add 
		grid_4.setWidget(0, 3, simplePager_1);
		
		Label label_2 = new Label("Shrine:");  //EntryPoint add 
		label_2.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		grid_4.setWidget(1, 0, label_2);
		label_2.setWidth("93px");
		
		DoubleBox doubleBox_2 = new DoubleBox();  //EntryPoint add 
		doubleBox_2.setAlignment(TextAlignment.LEFT);
		grid_4.setWidget(1, 1, doubleBox_2);
		doubleBox_2.setWidth("150px");
		
		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();  //EntryPoint add 
		grid_4.setWidget(1, 2, horizontalPanel_1);
		
		InlineLabel inlineLabel_23 = new InlineLabel("ID:");  //EntryPoint add 
		horizontalPanel_1.add(inlineLabel_23);
		
		IntegerBox integerBox_9 = new IntegerBox();  //EntryPoint add 
		horizontalPanel_1.add(integerBox_9);
		integerBox_9.setWidth("51px");
		
		InlineLabel inlineLabel_16 = new InlineLabel("Sanct.superior:");  //EntryPoint add 
		grid_4.setWidget(2, 0, inlineLabel_16);
		inlineLabel_16.setSize("50px", "31px");
		
		LongBox longBox = new LongBox();  //EntryPoint add 
		longBox.setAlignment(TextAlignment.LEFT); 
		grid_4.setWidget(2, 1, longBox);
		longBox.setSize("150px", "100%");
		
		InlineLabel inlineLabel_17 = new InlineLabel("Phone:");  //EntryPoint add 
		grid_4.setWidget(3, 0, inlineLabel_17);
		inlineLabel_17.setHeight("100%");
		
		

		
		
		IntegerBox integerBox_4 = new IntegerBox();//EntryPoint add 
		grid_4.setWidget(3, 1, integerBox_4);
		integerBox_4.setWidth("150px");
		
		TextButton textButton = new TextButton("add more");//EntryPoint add 
		grid_4.setWidget(3, 2, textButton);
		textButton.setSize("70px", "45px");
		
		InlineLabel inlineLabel_18 = new InlineLabel("E-mail:");//EntryPoint add 
		grid_4.setWidget(4, 0, inlineLabel_18);
		
		LongBox longBox_1 = new LongBox();//EntryPoint add 
		grid_4.setWidget(4, 1, longBox_1);
		longBox_1.setSize("150px", "16px");
		
		TextButton textButton_1 = new TextButton("add more");//EntryPoint add 
		grid_4.setWidget(4, 2, textButton_1);
		textButton_1.setSize("70px", "45px");
		
		Label label_3 = new Label("Other contact:");//EntryPoint add 
		grid_4.setWidget(5, 0, label_3);
		
		TextArea textArea = new TextArea();//EntryPoint add 
		textArea.setAlignment(TextAlignment.LEFT);
		grid_4.setWidget(5, 1, textArea);
		textArea.setSize("150px", "100%");
		
		Grid grid_6 = new Grid(2, 2); //EntryPoint add 
		grid_4.setWidget(5, 2, grid_6);
		
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
		verticalPanel_pop.add(grid_5);
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
