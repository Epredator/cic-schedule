package war.ui;

import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;
import com.vaadin.ui.themes.Runo;

//import war.SchedulerApplication;
import war.data.AgencyData;
import war.data.Country;
import war.data.POPData;
//import war.domain.Agency;
//import war.domain.Agent;

import com.vaadin.data.util.IndexedContainer;
import com.vaadin.data.validator.IntegerValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.AbstractSelect.Filtering;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Table;

public class FormAgency extends CustomComponent implements
ComponentContainer {
	
    private Table contactList = new Table();
    private Form contactEditor = new Form();
    
   // private JPAContainer<Agency> agency;
   // private JPAContainer<Agent> agent;
	
	private HorizontalSplitPanel mainLayout;
	private TabSheet agencyTabPanel;
	private static final long serialVersionUID = 9139168240248675338L;
    private IndexedContainer addressBookData = createRandomizeData();

    final Form agencyForm = new FormWithComplexLayout(contactEditor);
    private HorizontalLayout topLeftCorner = new HorizontalLayout();
    private HorizontalLayout topRightCorner = new HorizontalLayout();
    private HorizontalLayout buttonLeft = new HorizontalLayout();
    private VerticalLayout left = new VerticalLayout();
    private Button contactRemovalButton;//
    private static final String COMMON_FIELD_WIDTH = "100%";
    
	public static String[] fields = { "Agency ID", "Agency Name", "Manager", 
		"Mobile Phone", "Phone/Fax", "Email",  "Email2",  "Address", "City", 
		"Country","ZIP", "WWW", "Note"};
	
	public static String[] visibleCols = new String[] { "Agency ID",
		"Agency Name", "Manager", "City", "Country" };

public FormAgency()  {
	buildLayoutAgency();
	setCompositionRoot(mainLayout);	
}

private HorizontalSplitPanel buildLayoutAgency() {
	//agent = JPAContainerFactory.make(Agent.class,
	//		SchedulerApplication.PERSISTENCE_UNIT);
	
	
	mainLayout = new HorizontalSplitPanel();
	mainLayout.setImmediate(false);
	mainLayout.setSizeFull();
	mainLayout.setMargin(true);
	setSizeFull();
	//add some components
	mainLayout.addComponent(left);

	left.addComponent(contactList);
	left.addComponent(topLeftCorner);
	left.addComponent(buttonLeft);
	contactList.setSizeFull();
	contactList.setPageLength(22);

  	 //other init components
	   initContactAddRemoveButtons();//
	   initAddressList();//
	   initFilteringControls(); //	
	   
	   agencyTabPanel = buildAgencyTabPanel();
	   mainLayout.addComponent(agencyTabPanel);
	   return mainLayout;
}
private TabSheet buildAgencyTabPanel() {
	
	agencyTabPanel = new TabSheet();
	agencyTabPanel.setImmediate(true);
	agencyTabPanel.setSizeFull();
	agencyForm.setImmediate(true);
	agencyTabPanel.setStyleName(Runo.TABSHEET_SMALL);
	agencyForm.getLayout().setMargin(false,false,false,true);//
	agencyTabPanel.addTab(agencyForm, "Agency details", null);
	agencyTabPanel.addTab(new Label("Not ready yet"),
	          "Agents", null );
	agencyTabPanel.addTab(new Label("Not ready yet too!"),
	          "Groups", null );
	agencyTabPanel.addTab(new Label("Not ready yet too!"),
	          "Schedules", null );
	agencyTabPanel.addTab(new Label("Not ready yet too!!"),
	          "Invoices", null );
return agencyTabPanel;
}

private void initContactAddRemoveButtons() {
// New item button
buttonLeft.addComponent(new Button("+ Add Agency",
    new Button.ClickListener() {
		private static final long serialVersionUID = 1L;
		public void buttonClick(ClickEvent event) {
            // Add new contact "John Doe" as the first item
            Object id = ((IndexedContainer) contactList
                  .getContainerDataSource()).addItemAt(0);
            contactList.getItem(id).getItemProperty("Agency ID")
                  .setValue("New");
            contactList.getItem(id).getItemProperty("Agency Name")
                  .setValue("New");
            // Select the newly added item and scroll to the item
            contactList.setValue(id);
            contactList.setCurrentPageFirstItemId(id);
        }
    }));
// Remove item button
contactRemovalButton = new Button("- Delete Agency", new Button.ClickListener() {

private static final long serialVersionUID = 1L;

public void buttonClick(ClickEvent event) {
    contactList.removeItem(contactList.getValue());
    contactList.select(null);
}
});
contactRemovalButton.setVisible(false);
buttonLeft.addComponent(contactRemovalButton);

HorizontalLayout buttons = new HorizontalLayout();
buttons.setSpacing(true);
buttons.setMargin(false, true, true, true);
topRightCorner.addComponent(buttons);

@SuppressWarnings("serial")
Button apply = new Button("Apply", new Button.ClickListener() {
	 public void buttonClick(ClickEvent event) {
      try {
    	  agencyForm.commit();
      } catch (Exception e) {
          // Ingnored, we'll let the Form handle the errors
      }
  }
});
apply.setStyleName(Runo.BUTTON_BIG);
buttons.addComponent(apply);

Button discardChanges = new Button("Discard changes",
      new Button.ClickListener() {

			private static final long serialVersionUID = 1L;

			public void buttonClick(ClickEvent event) {
				agencyForm.discard();
          }
      });
discardChanges.setStyleName(Runo.BUTTON_DEFAULT);
buttons.addComponent(discardChanges);
buttons.setComponentAlignment(discardChanges, Alignment.MIDDLE_RIGHT);

}   

private void initAddressList() {
	//contactList = new Table(null, agent);
contactList.setContainerDataSource(addressBookData);
contactList.setVisibleColumns(visibleCols);
contactList.setSelectable(true);
contactList.setImmediate(true);
contactList.addListener(new Property.ValueChangeListener() {

private static final long serialVersionUID = 1L;

public void valueChange(ValueChangeEvent event) {
    Object id = contactList.getValue();
    agencyForm.setItemDataSource(id == null ? null : contactList
            .getItem(id));
    contactRemovalButton.setVisible(id != null);  
    agencyForm.setFooter(new VerticalLayout());           
    agencyForm.getFooter().addComponent(topRightCorner);   
    topRightCorner.setMargin(true);
    
}
});
}
private void initFilteringControls() {
for (final String pn : visibleCols) {
final TextField sf = new TextField();
topLeftCorner.addComponent(sf);
topLeftCorner.setSizeFull();
sf.setWidth("100%");
sf.setInputPrompt(pn);
sf.setImmediate(true);

sf.addListener(new Property.ValueChangeListener() {

	private static final long serialVersionUID = -2314749847110552037L;

	public void valueChange(ValueChangeEvent event) {
        addressBookData.removeContainerFilters(pn);
        if (sf.toString().length() > 0 && !pn.equals(sf.toString())) {
            addressBookData.addContainerFilter(pn, sf.toString(),
                    true, false);
        }
        getWindow().showNotification(
                "" + addressBookData.size() + " matches found", 
                Notification.TYPE_TRAY_NOTIFICATION);
    }
});
}
}
private static IndexedContainer createRandomizeData() {// storage data here

IndexedContainer ic = new IndexedContainer();
for (String p : fields) {
ic.addContainerProperty(p, String.class, "");
}

// Create dummy data by randomize
for (int i = 0; i < 200; i++) {
Object id = ic.addItem();
ic.getContainerProperty(id, "Agency ID").setValue(
		AgencyData.idAgency[(int) (AgencyData.idAgency.length * Math.random())]);
ic.getContainerProperty(id, "Agency Name").setValue(
		AgencyData.agencyName[(int) (AgencyData.agencyName.length * Math.random())]);
ic.getContainerProperty(id, "Manager").setValue(
		AgencyData.manager[(int) (AgencyData.manager.length * Math.random())]);
ic.getContainerProperty(id, "Mobile Phone").setValue(
		POPData.mobile[(int) (POPData.mobile.length * Math.random())]);
ic.getContainerProperty(id, "Phone/Fax").setValue(
		POPData.phonefax[(int) (POPData.phonefax.length * Math.random())]);
ic.getContainerProperty(id, "Email").setValue(
		POPData.mail[(int) (POPData.mail.length * Math.random())]);
ic.getContainerProperty(id, "Address").setValue(
		POPData.address[(int) (POPData.address.length * Math.random())]);
ic.getContainerProperty(id, "City").setValue(
		POPData.city[(int) (POPData.city.length * Math.random())]);
ic.getContainerProperty(id, "ZIP").setValue(
		POPData.zip[(int) (POPData.zip.length * Math.random())]);
ic.getContainerProperty(id, "WWW").setValue(
		POPData.www[(int) (POPData.www.length * Math.random())]);


}
return ic;
}

public class FormWithComplexLayout extends Form {
private static final long serialVersionUID = 1L;
private GridLayout gridLayout;
public FormWithComplexLayout( Item id) {
setCaption("Places of prayer details");
  gridLayout = new GridLayout(5, 6);
// Use top-left margin and spacing
  gridLayout.setMargin(true, false, false, true);
  gridLayout.setSpacing(true);
  setLayout(gridLayout);
  // Set up buffering
  setWriteThrough(false); // we want explicit 'apply'
  setInvalidCommitted(false); // no invalid values in datamodel
  // FieldFactory for customizing the fields and adding validators
  setFormFieldFactory(new agencyFieldFactory());
 // setItemDataSource( id); // bind to POJO via BeanItem

}
// Override to get control over where fields are placed.
@Override
protected void attachField(Object propertyId, Field field) {
if (propertyId.equals("Agency Name")) {
	gridLayout.addComponent(field, 0, 0,2,0);
}else if (propertyId.equals("Manager")) {
	gridLayout.addComponent(field, 3, 0);
} else if (propertyId.equals("Agency ID")) {
	gridLayout.addComponent(field, 4, 0);
}else if (propertyId.equals("Manager")) {
	gridLayout.addComponent(field, 0, 1);
}  else if (propertyId.equals("Mobile Phone")) {
	gridLayout.addComponent(field, 0, 1);
} else if (propertyId.equals("Phone/Fax")) {
	gridLayout.addComponent(field, 1, 1);	
} else if (propertyId.equals("Email")) {
	gridLayout.addComponent(field, 2, 1);
} else if (propertyId.equals("Email2")) {
	gridLayout.addComponent(field, 3, 1);
} else if (propertyId.equals("WWW")) {
	gridLayout.addComponent(field, 0, 3);
}else if (propertyId.equals("Address")) {
	gridLayout.addComponent(field, 1, 3,2, 3);
} else if (propertyId.equals("City")) {
	gridLayout.addComponent(field, 3, 3);
}else if (propertyId.equals("ZIP")) {
	gridLayout.addComponent(field, 4, 3);
}else if (propertyId.equals("Note")) {
	gridLayout.addComponent(field, 0, 5,4,5);
} 
}
}//FormWithComplexLayout

private class agencyFieldFactory extends DefaultFieldFactory {
private static final long serialVersionUID = 1L;
@Override
public Field createField(Item item, Object propertyId,
   Component uiContext) {
Field f;
if ("test".equals(propertyId)) {
    f = createPasswordField(propertyId);
}else {
    // Use the super class to create a suitable field base on the
   // property type.
    f = super.createField(item, propertyId, uiContext);
}
if ("Agency Name".equals(propertyId)) {
   TextField tf = (TextField) f;
   tf.setWidth(COMMON_FIELD_WIDTH);
   tf.setRequired(false);
   tf.setRequiredError("Please enter a Agency Name");
}if ("Manager".equals(propertyId)) {
	   TextField tf = (TextField) f;
	   tf.setWidth(COMMON_FIELD_WIDTH);
	   tf.setRequired(false);
	   tf.setRequiredError("Please enter a Agency Name");
	}
if ("Agency ID".equals(propertyId)) {
	   TextField tf = (TextField) f;
	   tf.setWidth("5em");
	   tf.setRequired(true);
	   tf.setRequiredError("Please enter a Group ID");
	    tf.addValidator(new IntegerValidator(
	            "Place of prayers ID must be an number"));

	}
if ("Shrine".equals(propertyId)) {
	ComboBox cb = new ComboBox("Shrine",
	           POPData.getPOPContainer());   
	   cb.setItemCaptionPropertyId(POPData.SHRINE_NAME);
	   cb.setItemCaptionMode(AbstractSelect.ITEM_CAPTION_MODE_PROPERTY);
	   cb.setFilteringMode(Filtering.FILTERINGMODE_CONTAINS);
	   cb.setImmediate(true);
	   cb.setWidth(COMMON_FIELD_WIDTH);
		  return cb;   
}
if ("Shrine ID".equals(propertyId)) {
	   TextField tf = (TextField) f;
	   tf.setWidth("5em");
	   tf.setRequired(true);
	   tf.setRequiredError("Please enter a Group ID");
	    tf.addValidator(new IntegerValidator(
	            "Place of prayers ID must be an number"));
	}

if ("Note".equals(propertyId)) {
	RichTextArea rta = new RichTextArea("Note");
	rta.setWidth("100%");
	return rta;  
}
else if ("Responsible".equals(propertyId)) {
   TextField tf = (TextField) f;
   tf.setRequired(true);
   tf.setRequiredError("Please enter a responsible name");
   tf.setWidth(COMMON_FIELD_WIDTH);
   tf.addValidator(new StringLengthValidator(
           "Responsible must be 3-50 characters", 3, 50, false));
} 
else if ("Email".equals(propertyId)) {
   TextField tf = (TextField) f;
   tf.setRequired(false);
   tf.setRequiredError("Please enter a email");
   tf.setWidth("15em");
  // tf.addValidator(new StringLengthValidator(
  //         "Email must be 6-20 characters", 6, 20, false));
} else if ("Email2".equals(propertyId)) {
	   TextField tf = (TextField) f;
	   tf.setRequired(false);
	   tf.setRequiredError("Please enter a email");
	   tf.setWidth("15em");
	  // tf.addValidator(new StringLengthValidator(
	  //         "Email must be 6-20 characters", 6, 20, false));
	} 
else if ("Mobile Phone".equals(propertyId)) {
   TextField tf = (TextField) f;
   tf.setNullRepresentation("");
   tf.setNullSettingAllowed(true);
   tf.addValidator(new StringLengthValidator(
           "Mobile Phone must be 6-20 characters", 6, 20, false));
   tf.setWidth(COMMON_FIELD_WIDTH);
}
else if ("Phone/Fax".equals(propertyId)) {
   TextField tf = (TextField) f;
   tf.setNullRepresentation("");
   tf.setNullSettingAllowed(true);
   tf.addValidator(new StringLengthValidator(
           "Phone must be 6-20 characters", 6, 20, false));
   tf.setWidth(COMMON_FIELD_WIDTH);
}
else if ("Address".equals(propertyId)) {
	   TextField tf = (TextField) f;
	   tf.setRequired(true);
	   tf.setRequiredError("Please enter a responsible name");
	   tf.setWidth(COMMON_FIELD_WIDTH);
	   tf.addValidator(new StringLengthValidator(
	           "Address must be 3-50 characters", 3, 50, false));
	} 
if ("ZIP".equals(propertyId)) {
	   TextField tf = (TextField) f;
	   tf.setWidth("5em");
	   tf.setRequired(true);
	   tf.setRequiredError("Please enter a Group ID");
	   tf.addValidator(new StringLengthValidator(
	           "ZIP must be 3-10 characters", 3, 10, false));
	}
else if ("City".equals(propertyId)) {
	   TextField tf = (TextField) f;
	   tf.setRequired(true);
	   tf.setRequiredError("Please enter a city name");
	   tf.setWidth(COMMON_FIELD_WIDTH);
	   tf.addValidator(new StringLengthValidator(
	           "Address must be 3-50 characters", 3, 50, false));
	} 
else if ("Country".equals(propertyId)) {

   ComboBox cb = new ComboBox("Country",
           Country.getISO3166Container());  
	 
   cb.setItemCaptionPropertyId(Country.iso3166_PROPERTY_NAME);
   cb.setItemCaptionMode(AbstractSelect.ITEM_CAPTION_MODE_PROPERTY);
   cb.setFilteringMode(Filtering.FILTERINGMODE_STARTSWITH);
   cb.setImmediate(true);
   cb.setWidth(COMMON_FIELD_WIDTH);
	  return cb;   
}
else if ("Language".equals(propertyId)) {
   ComboBox cb = new ComboBox("Language",
           Country.getISO3166Container());  
   cb.setItemCaptionPropertyId(Country.iso3166_PROPERTY_NAME);
   cb.setItemCaptionMode(AbstractSelect.ITEM_CAPTION_MODE_PROPERTY);
   cb.setFilteringMode(Filtering.FILTERINGMODE_STARTSWITH);
   cb.setImmediate(true);
   cb.setWidth(COMMON_FIELD_WIDTH);
	  return cb;  
}         
return f;
}
private PasswordField createPasswordField(Object propertyId) {
PasswordField pf = new PasswordField();
pf.setCaption(DefaultFieldFactory
       .createCaptionByPropertyId(propertyId));
return pf;
}

}//groupFieldFactory


}

