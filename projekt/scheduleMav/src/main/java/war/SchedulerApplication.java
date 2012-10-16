package war;
//import com.vaadin.addon.jpacontainer.JPAContainer;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import war.data.DemoDataGenerator;
import war.domain.CalendarEventCIC;
import war.ui.AddressBookMainView;
import war.ui.AutoCrudViews;
import war.ui.FormAgency;
import war.ui.FormGroup;
import war.ui.FormPOP;
import war.ui.FormSetting;

import com.vaadin.Application;
import com.vaadin.addon.calendar.event.BasicEvent;
import com.vaadin.addon.calendar.event.BasicEventProvider;
import com.vaadin.addon.calendar.event.CalendarEvent;
import com.vaadin.addon.calendar.ui.Calendar;
import com.vaadin.addon.calendar.ui.Calendar.TimeFormat;
import com.vaadin.addon.calendar.ui.CalendarComponentEvents.DateClickEvent;
import com.vaadin.addon.calendar.ui.CalendarComponentEvents.EventClick;
import com.vaadin.addon.calendar.ui.CalendarComponentEvents.EventClickHandler;
import com.vaadin.addon.calendar.ui.CalendarComponentEvents.RangeSelectEvent;
import com.vaadin.addon.calendar.ui.CalendarComponentEvents.RangeSelectHandler;
import com.vaadin.addon.calendar.ui.CalendarComponentEvents.WeekClick;
import com.vaadin.addon.calendar.ui.CalendarComponentEvents.WeekClickHandler;
import com.vaadin.addon.calendar.ui.handler.BasicDateClickHandler;
import com.vaadin.addon.calendar.ui.handler.BasicWeekClickHandler;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.BeanItem;
import com.vaadin.terminal.Sizeable;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.FormFieldFactory;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Select;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.CloseEvent;
import com.vaadin.ui.Window.CloseListener;
//import java.util.Map;
//import com.vaadin.terminal.ParameterHandler;
public class SchedulerApplication extends Application {

private static final long serialVersionUID = 1L;
private static final String DEFAULT_ITEMID = "DEFAULT";
private enum Mode {
    MONTH, WEEK, DAY;
}
private GregorianCalendar calendar;
private Calendar calendarComponent;
private Date currentMonthsFirstDate;
private final Label captionLabel = new Label("");
private Button monthButton;
private Button weekButton;
private Button nextButton;
private Button prevButton;
private Button DataButton;
private Select timeZoneSelect; //optional
private Select formatSelect; 
private Select localeSelect;//optional
private Button hideWeekendsButton;
private CheckBox readOnlyButton;
private Window scheduleEventPopup;
private final Form scheduleEventForm = new Form();
private Button deleteEventButton;
private Button applyEventButton;
private Mode viewMode = Mode.MONTH;
public BasicEventProvider dataSource;
private Button addNewEvent;
private boolean testBench = false;
private String calendarHeight = null;
private String calendarWidth = null;
private CheckBox disabledButton;
private Integer firstHour;
private Integer lastHour;
private Integer firstDay;
private Integer lastDay;
private Locale defaultLocale = Locale.US;
private boolean showWeeklyView;
private boolean useSecondResolution;
public static final String PERSISTENCE_UNIT = "war";


private AbsoluteLayout mainLayout;
public TabSheet MainTabSheet;
private HorizontalSplitPanel ReportSplitPanel;
//public HorizontalSplitPanel POPSplitPanel;
private HorizontalSplitPanel AgenciesSplitPanel;
private HorizontalSplitPanel GroupSplitPanel;
private HorizontalSplitPanel CalendarSplitPanel;

@Override
public void init() {
	setTheme("contacts");
    initContent();

}
private void initLayoutContent() {
	
	buildMainLayout();
	setMainWindow(new Window("Scheduler CICTS", buildMainLayout()));

    //TabSheet layout = new TabSheet();
    //layout.setSizeFull();
    
    
    //layout.addTab(h2, "Calendar", null);
   // layout.addTab(new FormGroup(), "Group", null);
   // layout.addTab(new FormAgency(), "Agencies", null);
	MainTabSheet.addTab(new FormPOP(), "POPs", null);
    //layout.addTab(new FormSetting(), "Setup", null);
 
	//MainTabSheet.addTab(new AddressBookMainView(), "TEST", null);
   // layout.addTab(new Label("Here  we will   generate some reports" +
   // 		" (List of Groups, Agencies, Agents, Masses etc.."),
	//          "Reports", null );
	//MainTabSheet.addTab(new AddressBookMainView(), "TEST", null);
  
}

private AbsoluteLayout buildMainLayout() {
	// common part: create layout
	mainLayout = new AbsoluteLayout();
	mainLayout.setImmediate(false);
	mainLayout.setWidth("100%");
	mainLayout.setHeight("100%");
	mainLayout.setMargin(false);
	
	

	
	// MainTabSheet
	MainTabSheet = buildMainTabSheet();
	mainLayout.addComponent(MainTabSheet, "top:0.0px;left:0.0px;");
	
	return mainLayout;
}

private TabSheet buildMainTabSheet() {
	// common part: create layout
	MainTabSheet = new TabSheet();
	MainTabSheet.setImmediate(true);
	MainTabSheet.setWidth("100.0%");
	MainTabSheet.setHeight("100.0%");
	
	// CalendarSplitPanel
	CalendarSplitPanel = buildCalendarSplitPanel();
	MainTabSheet.addTab(CalendarSplitPanel, "Calendar", null);
	//CalendarSplitPanel.addComponent(prevButton);
	//CalendarSplitPanel.addComponent(nextButton);  
	 //controlPanel.addComponent(calendarComponent, 0, 0, 3, 3);
	
	// GroupSplitPanel
	GroupSplitPanel = new HorizontalSplitPanel();
	GroupSplitPanel.setImmediate(false);
	GroupSplitPanel.setWidth("100.0%");
	GroupSplitPanel.setHeight("100.0%");
	GroupSplitPanel.setMargin(false);
	MainTabSheet.addTab(GroupSplitPanel, "Group", null);
	//MainTabSheet.addTab(new Caltest(), "TEST", null);
	
	// AgenciesSplitPanel
	AgenciesSplitPanel = new HorizontalSplitPanel();
	AgenciesSplitPanel.setImmediate(false);
	AgenciesSplitPanel.setWidth("100.0%");
	AgenciesSplitPanel.setHeight("100.0%");
	AgenciesSplitPanel.setMargin(false);
	MainTabSheet.addTab(AgenciesSplitPanel, "Agencies", null);
	
	
	
	// ReportSplitPanel
	ReportSplitPanel = new HorizontalSplitPanel();
	ReportSplitPanel.setImmediate(false);
	ReportSplitPanel.setWidth("100.0%");
	ReportSplitPanel.setHeight("100.0%");
	ReportSplitPanel.setMargin(false);
	MainTabSheet.addTab(ReportSplitPanel, "Reports", null);
	
	
	
	
	return MainTabSheet;
}

private HorizontalSplitPanel buildCalendarSplitPanel() {
	
		initNavigationButtons();
	    initHideWeekEndButton();
	    initReadOnlyButton();
	    initDisabledButton();
	    initAddNewEventButton();
	    
	    VerticalLayout  CalPanel = new VerticalLayout();
	    
	    
	    
	    HorizontalLayout CalPanel1 = new HorizontalLayout();
	    HorizontalLayout CalPanel2 = new HorizontalLayout();
	    HorizontalLayout CalPanel3 = new HorizontalLayout();
	    HorizontalLayout CalPanel4 = new HorizontalLayout();  
	    
	    CalPanel.addComponent(CalPanel1);
	    CalPanel1.addComponent(addNewEvent);
	    CalPanel1.addComponent(monthButton);
	    CalPanel1.addComponent(weekButton);
	    CalPanel1.setMargin(true,false ,false ,false);
	    
	    CalPanel.addComponent(CalPanel2);
	    CalPanel2.addComponent(prevButton);
	    CalPanel2.addComponent(captionLabel);
	    captionLabel.setWidth("100px");
	    CalPanel2.addComponent(nextButton);
	    CalPanel2.setMargin(true);
	    CalPanel2.setSpacing(true);

	    CalPanel.addComponent(CalPanel3);

	    CalPanel3.setMargin(true);
	    CalPanel.addComponent(CalPanel4);

	    monthButton.setVisible(viewMode == Mode.WEEK);
	    weekButton.setVisible(viewMode == Mode.DAY);

	    GridLayout controlPanel = new GridLayout(4, 5);
	    HorizontalLayout controlPanel1 = new HorizontalLayout();
	    //controlPanel.addComponent(calendarComponent, 0, 0, 3, 3);
	  
	    CalPanel.addComponent(localeSelect);
	    CalPanel.addComponent(timeZoneSelect);
	    CalPanel.addComponent(formatSelect);
	    CalPanel.addComponent(hideWeekendsButton);
	    CalPanel.addComponent(readOnlyButton);
	    CalPanel.addComponent(disabledButton);
	    CalPanel.addComponent(DataButton);
	    controlPanel1.setMargin(true);
	    controlPanel1.setSpacing(true);
	    controlPanel.setComponentAlignment(controlPanel1,Alignment.BOTTOM_CENTER);
	    //controlPanel.setSizeFull();
	   // controlPanel.addComponent(controlPanel1, 0, 4, 3, 4);
	 
	    //TabSheet layout = (TabSheet) getMainWindow().getContent();
	   
	    //layout.setSizeFull();
	    HorizontalSplitPanel h2 = new HorizontalSplitPanel(); 
	    //h2.setSizeFull();
	   // h2.setSplitPosition(310, Sizeable.UNITS_PIXELS);
	   
	    
	    
	// common part: create layout
	CalendarSplitPanel = new HorizontalSplitPanel();
	CalendarSplitPanel.setImmediate(false);
	CalendarSplitPanel.setSizeFull();
	CalendarSplitPanel.setMargin(false);
	CalendarSplitPanel.setSplitPosition(310, Sizeable.UNITS_PIXELS);
	
	// calendarComponent
	
	calendarComponent.setImmediate(false);
	calendarComponent.setSizeFull();
	   CalendarSplitPanel.addComponent(CalPanel);
	   calendarComponent.setSizeFull();
	    CalendarSplitPanel.addComponent(calendarComponent); 
	
	
	
	return CalendarSplitPanel;
}

public Field createDateField(String caption) {
	 DateField f = new DateField(caption);
     if (useSecondResolution) {
         f.setResolution(DateField.RESOLUTION_SEC);
     } else {
         f.setResolution(DateField.RESOLUTION_MIN);
     }
     return f;
}

/*private TextField createTextField(String caption) {
    TextField f = new TextField(caption);
    f.setNullRepresentation("");
    return f;
}*/



public void initContent() {
    // Set default Locale for this application
    if (testBench) {
        setLocale(defaultLocale);

    } else {
        setLocale(Locale.getDefault());
    }

    // Initialize locale, timezone and timeformat selects.
    localeSelect = createLocaleSelect();
    timeZoneSelect = createTimeZoneSelect();
    formatSelect = createCalendarFormatSelect();

    initCalendar();
    initLayoutContent();


}


private void initNavigationButtons() {
    monthButton = new Button("Month view", new ClickListener() {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void buttonClick(ClickEvent event) {
            switchToMonthView();
        }
    });
    
    weekButton = new Button("Week view", new ClickListener() {
/**
		 * 
		 */
		private static final long serialVersionUID = -4751045113309484743L;


		public void buttonClick(ClickEvent event) {
            // simulate week click
            WeekClickHandler handler = (WeekClickHandler) calendarComponent
                    .getHandler(WeekClick.EVENT_ID);
            handler.weekClick(new WeekClick(calendarComponent, calendar
                    .get(GregorianCalendar.WEEK_OF_YEAR), calendar
                    .get(GregorianCalendar.YEAR)));
        }
    });
    
    nextButton = new Button("Next", new Button.ClickListener() {
        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
            handleNextButtonClick();
           
        }
    });

    prevButton = new Button("Prev", new Button.ClickListener() {
        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
            handlePreviousButtonClick();
        }
    });
    
    DataButton = new Button("Load sample data", new Button.ClickListener() {
        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
        	DemoDataGenerator.create();
           
        }
    });
}
private void initHideWeekEndButton() {
    hideWeekendsButton = new CheckBox("Hide weekends");
    hideWeekendsButton.setImmediate(true);
    hideWeekendsButton.addListener(new ClickListener() {

        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
            setWeekendsHidden(event.getButton().booleanValue());
        }
    });
}

@SuppressWarnings("deprecation")
private void setWeekendsHidden(boolean weekendsHidden) {
    if (weekendsHidden) {
        int firstToShow = (GregorianCalendar.MONDAY - calendar
                .getFirstDayOfWeek()) % 7;
        calendarComponent.setVisibleDaysOfWeek(firstToShow + 1,
                firstToShow + 5);
    } else {
        calendarComponent.setVisibleDaysOfWeek(1, 7);
    }

}

private void initReadOnlyButton() {
    readOnlyButton = new CheckBox("Read-only mode");
    readOnlyButton.setImmediate(true);
    readOnlyButton.addListener(new ClickListener() {

        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
            calendarComponent.setReadOnly((Boolean) event.getButton()
                    .getValue());
        }
    });
}


private void initDisabledButton() {
    disabledButton = new CheckBox("Disabled");
    disabledButton.setImmediate(true);
    disabledButton.addListener(new ClickListener() {

        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
            calendarComponent.setEnabled(!(Boolean) event.getButton()
                    .getValue());
        }
    });
}
public void initAddNewEventButton() {
	
    addNewEvent = new Button("Add new event");
 
    addNewEvent.addListener(new Button.ClickListener() {

        private static final long serialVersionUID = -8307244759142541067L;

        @SuppressWarnings("deprecation")
		public void buttonClick(ClickEvent event) {
            Date start = getToday();
            start.setHours(0);
            start.setMinutes(0);
            start.setSeconds(0);

            Date end = Calendar.getEndOfDay(calendar, start);
            showEventPopup(createNewEvent(start, end), true);
        }
    });
}  

@SuppressWarnings("deprecation")
private void initCalendar() {
    dataSource = new BasicEventProvider();

    calendarComponent = new Calendar(dataSource);
    calendarComponent.setLocale(getLocale());
    calendarComponent.setImmediate(true);

    if (calendarWidth != null || calendarHeight != null) {
        if (calendarHeight != null) {
            calendarComponent.setHeight(calendarHeight);
        }
        if (calendarWidth != null) {
            calendarComponent.setWidth(calendarWidth);
        }
    } else {
        calendarComponent.setSizeFull();
    }

    if (firstHour != null && lastHour != null) {
        calendarComponent.setVisibleHoursOfDay(firstHour, lastHour);
    }

    if (firstDay != null && lastDay != null) {
        calendarComponent.setVisibleDaysOfWeek(firstDay, lastDay);
    }

    Date today = getToday();
    calendar = new GregorianCalendar(getLocale());
    calendar.setTime(today);

    updateCaptionLabel();

    if (!showWeeklyView) {
        int rollAmount = calendar.get(GregorianCalendar.DAY_OF_MONTH) - 1;
        calendar.add(GregorianCalendar.DAY_OF_MONTH, -rollAmount);
        resetTime(false);
        currentMonthsFirstDate = calendar.getTime();
        calendarComponent.setStartDate(currentMonthsFirstDate);
        calendar.add(GregorianCalendar.MONTH, 1);
        calendar.add(GregorianCalendar.DATE, -1);
        calendarComponent.setEndDate(calendar.getTime());
    }

    addCalendarEventListeners();
}

private Date getToday() {
    if (testBench) {
        GregorianCalendar testDate = new GregorianCalendar();
        testDate.set(GregorianCalendar.YEAR, 2000);
        testDate.set(GregorianCalendar.MONTH, 0);
        testDate.set(GregorianCalendar.DATE, 10);
        testDate.set(GregorianCalendar.HOUR_OF_DAY, 0);
        testDate.set(GregorianCalendar.MINUTE, 0);
        testDate.set(GregorianCalendar.SECOND, 0);
        testDate.set(GregorianCalendar.MILLISECOND, 0);
        return testDate.getTime();
    }
    return new Date();
}

@SuppressWarnings("serial")
private void addCalendarEventListeners() {
    // Register week clicks by changing the schedules start and end dates.
    calendarComponent.setHandler(new BasicWeekClickHandler() {

        @Override
        public void weekClick(WeekClick event) {
            // let BasicWeekClickHandler handle calendar dates, and update
            // only the other parts of UI here
            super.weekClick(event);
            updateCaptionLabel();
            switchToWeekView();
        }
    });
    
    calendarComponent.setHandler(new EventClickHandler() {

        public void eventClick(EventClick event) {
            showEventPopup(event.getCalendarEvent(), false);
        }
    });

    calendarComponent.setHandler(new BasicDateClickHandler() {

        @Override
        public void dateClick(DateClickEvent event) {
            // let BasicDateClickHandler handle calendar dates, and update
            // only the other parts of UI here
            super.dateClick(event);
            switchToDayView();
        }
    });

    calendarComponent.setHandler(new RangeSelectHandler() {

        public void rangeSelect(RangeSelectEvent event) {
            handleRangeSelect(event);
        }
    });
}

private Select createTimeZoneSelect() {
    Select s = new Select("Timezone");
    s.addContainerProperty("caption", String.class, "");
    s.setItemCaptionPropertyId("caption");
    s.setFilteringMode(Select.FILTERINGMODE_CONTAINS);

    Item i = s.addItem(DEFAULT_ITEMID);
    i.getItemProperty("caption").setValue(
            "Default (" + TimeZone.getDefault().getID() + ")");
    for (String id : TimeZone.getAvailableIDs()) {
        if (!s.containsId(id)) {
            i = s.addItem(id);
            i.getItemProperty("caption").setValue(id);
        }
    }

    if (testBench) {
        s.select("America/New_York");
    } else {
        s.select(DEFAULT_ITEMID);
    }
    s.setImmediate(true);
    s.addListener(new ValueChangeListener() {

        private static final long serialVersionUID = 1L;

        public void valueChange(ValueChangeEvent event) {

            updateCalendarTimeZone(event.getProperty().getValue());
        }
    });

    return s;
}

private Select createCalendarFormatSelect() {
    Select s = new Select("Calendar format");
    s.addContainerProperty("caption", String.class, "");
    s.setItemCaptionPropertyId("caption");

    Item i = s.addItem(DEFAULT_ITEMID);
    i.getItemProperty("caption").setValue("Default by locale");
    i = s.addItem(TimeFormat.Format12H);
    i.getItemProperty("caption").setValue("12H");
    i = s.addItem(TimeFormat.Format24H);
    i.getItemProperty("caption").setValue("24H");

    s.select(DEFAULT_ITEMID);
    s.setImmediate(true);
    s.addListener(new ValueChangeListener() {

        private static final long serialVersionUID = 1L;

        public void valueChange(ValueChangeEvent event) {
            updateCalendarFormat(event.getProperty().getValue());
        }
    });

    return s;
}

private Select createLocaleSelect() {
    Select s = new Select("Locale");
    s.addContainerProperty("caption", String.class, "");
    s.setItemCaptionPropertyId("caption");
    s.setFilteringMode(Select.FILTERINGMODE_CONTAINS);

    for (Locale l : Locale.getAvailableLocales()) {
        if (!s.containsId(l)) {
            Item i = s.addItem(l);
            i.getItemProperty("caption").setValue(getLocaleItemCaption(l));
        }
    }

    s.select(getLocale());
    s.setImmediate(true);
    s.addListener(new ValueChangeListener() {

        private static final long serialVersionUID = 1L;

        public void valueChange(ValueChangeEvent event) {
            updateCalendarLocale((Locale) event.getProperty().getValue());
        }
    });

    return s;
}

private void updateCalendarTimeZone(Object timezoneId) {
    TimeZone tz = null;
    if (!DEFAULT_ITEMID.equals(timezoneId)) {
        tz = TimeZone.getTimeZone((String) timezoneId);
    }

    // remember the week that was showing, so we can re-set it later
    Date startDate = calendarComponent.getStartDate();
    calendar.setTime(startDate);
    int weekNumber = calendar.get(java.util.Calendar.WEEK_OF_YEAR);
    calendarComponent.setTimeZone(tz);
    calendar.setTimeZone(calendarComponent.getTimeZone());

    if (viewMode == Mode.WEEK) {
        calendar.set(java.util.Calendar.WEEK_OF_YEAR, weekNumber);
        calendar.set(java.util.Calendar.DAY_OF_WEEK,
                calendar.getFirstDayOfWeek());

        calendarComponent.setStartDate(calendar.getTime());
        calendar.add(java.util.Calendar.DATE, 6);
        calendarComponent.setEndDate(calendar.getTime());
    }
}

private void updateCalendarFormat(Object format) {
    TimeFormat calFormat = null;
    if (format instanceof TimeFormat) {
        calFormat = (TimeFormat) format;
    }

    calendarComponent.setTimeFormat(calFormat);
}


private String getLocaleItemCaption(Locale l) {
    String country = l.getDisplayCountry(getLocale());
    String language = l.getDisplayLanguage(getLocale());
    StringBuilder caption = new StringBuilder(country); 
    if (caption.length() != 0) {
        caption.append(", ");
    }
    caption.append(language);
    return caption.toString();
}

private void updateCalendarLocale(Locale l) {
    int oldFirstDayOfWeek = calendar.getFirstDayOfWeek();
    setLocale(l);
    calendarComponent.setLocale(l);
    calendar = new GregorianCalendar(l);
    int newFirstDayOfWeek = calendar.getFirstDayOfWeek();

    // we are showing 1 week, and the first day of the week has changed
    // update start and end dates so that the same week is showing
    if (viewMode == Mode.WEEK && oldFirstDayOfWeek != newFirstDayOfWeek) {
        calendar.setTime(calendarComponent.getStartDate());
        calendar.add(java.util.Calendar.DAY_OF_WEEK, 2);
        // starting at the beginning of the week
        calendar.set(GregorianCalendar.DAY_OF_WEEK, newFirstDayOfWeek);
        Date start = calendar.getTime();

        // ending at the end of the week
        calendar.add(GregorianCalendar.DATE, 6);
        Date end = calendar.getTime();

        calendarComponent.setStartDate(start);
        calendarComponent.setEndDate(end);

        // Week days depend on locale so this must be refreshed
        setWeekendsHidden(hideWeekendsButton.booleanValue());
    }

}

private void handleNextButtonClick() {
    switch (viewMode) {
    case MONTH:
        nextMonth();
        break;
    case WEEK:
        nextWeek();
        break;
    case DAY:
        nextDay();
        break;
    }
}

private void handlePreviousButtonClick() {
    switch (viewMode) {
    case MONTH:
        previousMonth();
        break;
    case WEEK:
        previousWeek();
        break;
    case DAY:
        previousDay();
        break;
    }
}
private void handleRangeSelect(RangeSelectEvent event) {
    Date start = event.getStart();
    Date end = event.getEnd();

    /*
     * If a range of dates is selected in monthly mode, we want it to end at
     * the end of the last day.
     */
    if (event.isMonthlyMode()) {
        end = Calendar.getEndOfDay(calendar, end);
    }

    showEventPopup(createNewEvent(start, end), true);
}

private void showEventPopup(CalendarEvent event, boolean newEvent) {
    if (event == null) {
        return;
    }

    updateCalendarEventPopup(newEvent);
    updateCalendarEventForm(event);

    if (!getMainWindow().getChildWindows().contains(scheduleEventPopup)) {
        getMainWindow().addWindow(scheduleEventPopup);
    }
}

/* Initializes a modal window to edit schedule event. */
private void createCalendarEventPopup() {
    VerticalLayout layout = new VerticalLayout();
    layout.setMargin(true);
    layout.setSpacing(true);

    scheduleEventPopup = new Window(null, layout);
    scheduleEventPopup.setWidth("400px");
    scheduleEventPopup.setModal(true);
    scheduleEventPopup.center();

    layout.addComponent(scheduleEventForm);


    applyEventButton = new Button("Apply", new ClickListener() {
    	

        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
            commitCalendarEvent();
        }
    });
    Button cancel = new Button("Cancel", new ClickListener() {

        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
            discardCalendarEvent();
        }
    });
    deleteEventButton = new Button("Delete", new ClickListener() {

        private static final long serialVersionUID = 1L;

        public void buttonClick(ClickEvent event) {
            deleteCalendarEvent();
        }
    });
    scheduleEventPopup.addListener(new CloseListener() {

        private static final long serialVersionUID = 1L;

        public void windowClose(CloseEvent e) {
            discardCalendarEvent();
        }
    });

    HorizontalLayout buttons = new HorizontalLayout();
    buttons.setSpacing(true);
    buttons.addComponent(deleteEventButton);
    buttons.addComponent(applyEventButton);
    buttons.addComponent(cancel);
    layout.addComponent(buttons);
    layout.setComponentAlignment(buttons, Alignment.BOTTOM_RIGHT);
}

private void updateCalendarEventPopup(boolean newEvent) {
    if (scheduleEventPopup == null) {
        createCalendarEventPopup();
    }

    if (newEvent) {
        scheduleEventPopup.setCaption("New event");
    } else {
        scheduleEventPopup.setCaption("Edit event");
    }

    deleteEventButton.setVisible(!newEvent);
    deleteEventButton.setEnabled(!calendarComponent.isReadOnly());
    applyEventButton.setEnabled(!calendarComponent.isReadOnly());
}

private void updateCalendarEventForm(CalendarEvent event) {
    // Lets create a CalendarEvent BeanItem and pass it to the form's data
    // source.
    BeanItem<CalendarEvent> item = new BeanItem<CalendarEvent>(event);
    scheduleEventForm.setWriteThrough(false);
    scheduleEventForm.setItemDataSource(item);
    scheduleEventForm.setFormFieldFactory(new FormFieldFactory() {

        private static final long serialVersionUID = 1L;

        @SuppressWarnings("deprecation")
		public Field createField(Item item, Object propertyId,
                Component uiContext) {
            if (propertyId.equals("caption")) {
                TextField f = createTextField("Caption");
                f.focus();
                return f;

            } else if (propertyId.equals("pop")) {
                return createTextField("POP name");

            } else if (propertyId.equals("description")) {
                TextField f = createTextField("Description");
                f.setRows(3);
                return f;

            } else if (propertyId.equals("styleName")) {
                return createStyleNameSelect();

            } else if (propertyId.equals("start")) {
                return createDateField("Start date");

            } else if (propertyId.equals("end")) {
                return createDateField("End date");
            } else if (propertyId.equals("allDay")) {
                CheckBox cb = createCheckBox("All-day");

                cb.addListener(new Property.ValueChangeListener() {

                    private static final long serialVersionUID = -7104996493482558021L;

                    public void valueChange(ValueChangeEvent event) {
                        Object value = event.getProperty().getValue();
                        if (value instanceof Boolean
                                && Boolean.TRUE.equals(value)) {
                            setFormDateResolution(DateField.RESOLUTION_DAY);

                        } else {
                            setFormDateResolution(DateField.RESOLUTION_MIN);
                        }
                    }

                });

                return cb;
            }
            return null;
        }
        
        private CheckBox createCheckBox(String caption) {
            CheckBox cb = new CheckBox(caption);
            cb.setImmediate(true);
            return cb;
        }

        private TextField createTextField(String caption) {
            TextField f = new TextField(caption);
            f.setNullRepresentation("");
            return f;
        }

        private DateField createDateField(String caption) {
            DateField f = new DateField(caption);
            if (useSecondResolution) {
                f.setResolution(DateField.RESOLUTION_SEC);
            } else {
                f.setResolution(DateField.RESOLUTION_MIN);
            }
            return f;
        }

        private Select createStyleNameSelect() {
            Select s = new Select("Type");
            s.addContainerProperty("c", String.class, "");
            s.setItemCaptionPropertyId("c");
            Item i = s.addItem("color1");
            i.getItemProperty("c").setValue("Mass");
            i = s.addItem("color2");
            i.getItemProperty("c").setValue("Block");
            i = s.addItem("color3");
            i.getItemProperty("c").setValue("Event");
            i = s.addItem("color4");
            i.getItemProperty("c").setValue("Other");
            return s;
        }
    });
    
    scheduleEventForm
    .setVisibleItemProperties(new Object[] { "start", "end",
            "allDay", "caption", "pop", "description",
    "styleName" });
}

private void setFormDateResolution(int resolution) {
    if (scheduleEventForm.getField("start") != null
            && scheduleEventForm.getField("end") != null) {
        ((DateField) scheduleEventForm.getField("start"))
        .setResolution(resolution);
        ((DateField) scheduleEventForm.getField("start")).requestRepaint();
        ((DateField) scheduleEventForm.getField("end"))
        .setResolution(resolution);
        ((DateField) scheduleEventForm.getField("end")).requestRepaint();
    }
}

private CalendarEventCIC createNewEvent(Date startDate, Date endDate) {

    CalendarEventCIC event = new CalendarEventCIC();
    event.setCaption("");
    event.setStart(startDate);
    event.setEnd(endDate);
    event.setStyleName("color1");
    return event;
}

/* Removes the event from the data source and fires change event. */
private void deleteCalendarEvent() {
    BasicEvent event = getFormCalendarEvent();
    if (dataSource.containsEvent(event)) {
        dataSource.removeEvent(event);
    }
    getMainWindow().removeWindow(scheduleEventPopup);
}

/* Adds/updates the event in the data source and fires change event. */
private void commitCalendarEvent() {
    scheduleEventForm.commit();
    BasicEvent event = getFormCalendarEvent();
    if (!dataSource.containsEvent(event)) {
        dataSource.addEvent(event);
    }

    getMainWindow().removeWindow(scheduleEventPopup);
}

private void discardCalendarEvent() {
    scheduleEventForm.discard();
    getMainWindow().removeWindow(scheduleEventPopup);
}

@SuppressWarnings("unchecked")
private BasicEvent getFormCalendarEvent() {
    BeanItem<CalendarEventCIC> item = (BeanItem<CalendarEventCIC>) scheduleEventForm
            .getItemDataSource();
    CalendarEvent event = item.getBean();
    return (BasicEvent) event;
}

private void nextMonth() {
    rollMonth(1);
}

private void previousMonth() {
    rollMonth(-1);
}

private void nextWeek() {
    rollWeek(1);
}

private void previousWeek() {
    rollWeek(-1);
}

private void nextDay() {
    rollDate(1);
}

private void previousDay() {
    rollDate(-1);
}

private void rollMonth(int direction) {
    calendar.setTime(currentMonthsFirstDate);
    calendar.add(GregorianCalendar.MONTH, direction);
    resetTime(false);
    currentMonthsFirstDate = calendar.getTime();
    calendarComponent.setStartDate(currentMonthsFirstDate);

    updateCaptionLabel();

    calendar.add(GregorianCalendar.MONTH, 1);
    calendar.add(GregorianCalendar.DATE, -1);
    resetCalendarTime(true);
}

private void rollWeek(int direction) {
    calendar.add(GregorianCalendar.WEEK_OF_YEAR, direction);
    calendar.set(GregorianCalendar.DAY_OF_WEEK,
            calendar.getFirstDayOfWeek());
    resetCalendarTime(false);
    resetTime(true);
    calendar.add(GregorianCalendar.DATE, 6);
    calendarComponent.setEndDate(calendar.getTime());
}

private void rollDate(int direction) {
    calendar.add(GregorianCalendar.DATE, direction);
    resetCalendarTime(false);
    resetCalendarTime(true);
}

private void updateCaptionLabel() {
    DateFormatSymbols s = new DateFormatSymbols(getLocale());
    String month = s.getMonths()[calendar.get(GregorianCalendar.MONTH)];
    captionLabel.setValue(month + " "
            + calendar.get(GregorianCalendar.YEAR));
}

private CalendarEventCIC getNewEvent(String caption, Date start, Date end) {
    CalendarEventCIC event = new CalendarEventCIC();
    event.setCaption(caption);
    event.setStart(start);
    event.setEnd(end);

    return event;
}

/*
 * Switch the view to week view.
 */
public void switchToWeekView() {
    viewMode = Mode.WEEK;
    weekButton.setVisible(false);
    monthButton.setVisible(true);
}

/*
 * Switch the Calendar component's start and end date range to the target
 * month only. (sample range: 01.01.2010 00:00.000 - 31.01.2010 23:59.999)
 */
public void switchToMonthView() {
    viewMode = Mode.MONTH;
    monthButton.setVisible(false);
    weekButton.setVisible(false);

    calendar.setTime(currentMonthsFirstDate);
    calendarComponent.setStartDate(currentMonthsFirstDate);

    updateCaptionLabel();

    calendar.add(GregorianCalendar.MONTH, 1);
    calendar.add(GregorianCalendar.DATE, -1);
    resetCalendarTime(true);
}

/*
 * Switch to day view (week view with a single day visible).
 */
public void switchToDayView() {
    viewMode = Mode.DAY;
    monthButton.setVisible(true);
    weekButton.setVisible(true);
}

private void resetCalendarTime(boolean resetEndTime) {
    resetTime(resetEndTime);
    if (resetEndTime) {
        calendarComponent.setEndDate(calendar.getTime());
    } else {
        calendarComponent.setStartDate(calendar.getTime());
        updateCaptionLabel();
    }
}

/*
 * Resets the calendar time (hour, minute second and millisecond) either to
 * zero or maximum value.
 */
private void resetTime(boolean max) {
    if (max) {
        calendar.set(GregorianCalendar.HOUR_OF_DAY,
                calendar.getMaximum(GregorianCalendar.HOUR_OF_DAY));
        calendar.set(GregorianCalendar.MINUTE,
                calendar.getMaximum(GregorianCalendar.MINUTE));
        calendar.set(GregorianCalendar.SECOND,
                calendar.getMaximum(GregorianCalendar.SECOND));
        calendar.set(GregorianCalendar.MILLISECOND,
                calendar.getMaximum(GregorianCalendar.MILLISECOND));
    } else {
        calendar.set(GregorianCalendar.HOUR_OF_DAY, 0);
        calendar.set(GregorianCalendar.MINUTE, 0);
        calendar.set(GregorianCalendar.SECOND, 0);
        calendar.set(GregorianCalendar.MILLISECOND, 0);
    }
}


 




}
