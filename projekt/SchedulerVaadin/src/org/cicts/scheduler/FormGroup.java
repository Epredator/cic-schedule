package org.cicts.scheduler;
//import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.DefaultFieldFactory;
import com.vaadin.ui.Field;
import com.vaadin.ui.Form;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;
import com.vaadin.ui.themes.Runo;
import org.cicts.scheduler.data.Country;
import org.cicts.scheduler.data.GroupData;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.data.validator.IntegerValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.AbstractSelect.Filtering;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Table;

public class FormGroup extends CustomComponent {
	private HorizontalSplitPanel mainLayout;
	private TabSheet groupTabPanel;
	private static final long serialVersionUID = 9139168240248675338L;
    private IndexedContainer addressBookData = createRandomizeData();
    private Table contactList = new Table();
    private Form contactEditor = new Form();
    final Form groupForm = new FormWithComplexLayout(contactEditor);
    private HorizontalLayout topLeftCorner = new HorizontalLayout();//
    private HorizontalLayout topRightCorner = new HorizontalLayout();//
    private HorizontalLayout buttonLeft = new HorizontalLayout();
    private VerticalLayout left = new VerticalLayout();
    private Button contactRemovalButton;//
    private static final String COMMON_FIELD_WIDTH = "100%";
    private boolean useSecondResolution;
    private static String[] fields = { "ID", "Group Name", "Responsible",//
        "Mobile Phone", "Phone/Fax", "Email",//
     "Home Email", "Street", "Zip", "City", "State", "Country"  , "Language"  , 
     "Arrival",  "Departure", "Invoice Status" , "Group Status", 
     "Reservation Way" ,"Chruch","Celebrant", "Israel Staying" ,
     "Bishop", "Priest" , "Participatn" , "Note"};//
private static String[] visibleCols = new String[] { "ID",//
        "Group Name", "Responsible", "Arrival", "Departure" , "Country",  };//

    public FormGroup()  {
    	buildLayoutGroup();
    	setCompositionRoot(mainLayout);	
    }
    	
    	
    	private HorizontalSplitPanel buildLayoutGroup() {
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
   		   
   		groupTabPanel = buildGroupTabPanel();
   		mainLayout.addComponent(groupTabPanel);
   		return mainLayout;
    	}
    
    		private TabSheet buildGroupTabPanel() {
    		
    			groupTabPanel = new TabSheet();
    			groupTabPanel.setImmediate(true);
    			groupTabPanel.setSizeFull();
    			groupForm.setImmediate(true);
    			groupTabPanel.setStyleName(Runo.TABSHEET_SMALL);
        		groupForm.getLayout().setMargin(false,false,false,true);//
        		groupTabPanel.addTab(groupForm, "Group details", null);
        		groupTabPanel.addTab(new Label("Not ready yet"),
        		          "Schedule", null );
        		groupTabPanel.addTab(new Label("Not ready yet too!"),
      		          "List", null );
    		return groupTabPanel;
    	}

    private void initContactAddRemoveButtons() {
        // New item button
    	buttonLeft.addComponent(new Button("+ Add Group",
                new Button.ClickListener() {
    				private static final long serialVersionUID = 1L;
    				public void buttonClick(ClickEvent event) {
                        // Add new contact "John Doe" as the first item
                        Object id = ((IndexedContainer) contactList
                              .getContainerDataSource()).addItemAt(0);
                        contactList.getItem(id).getItemProperty("Group")
                              .setValue("John");
                        contactList.getItem(id).getItemProperty("Group Name")
                              .setValue("Doe");
                        // Select the newly added item and scroll to the item
                        contactList.setValue(id);
                        contactList.setCurrentPageFirstItemId(id);
                    }
                }));
        // Remove item button
        contactRemovalButton = new Button("- Delete group", new Button.ClickListener() {

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
 	            	 groupForm.commit();
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
 						groupForm.discard();
 	                 }
 	             });
 	     discardChanges.setStyleName(Runo.BUTTON_DEFAULT);
 	     buttons.addComponent(discardChanges);
 	     buttons.setComponentAlignment(discardChanges, Alignment.MIDDLE_RIGHT);

    }   

    private void initAddressList() {
        contactList.setContainerDataSource(addressBookData);
        contactList.setVisibleColumns(visibleCols);
        contactList.setSelectable(true);
        contactList.setImmediate(true);
        contactList.addListener(new Property.ValueChangeListener() {

    		private static final long serialVersionUID = 1L;

    		public void valueChange(ValueChangeEvent event) {
                Object id = contactList.getValue();
                groupForm.setItemDataSource(id == null ? null : contactList
                        .getItem(id));
                contactRemovalButton.setVisible(id != null);  
                groupForm.setFooter(new VerticalLayout());           
                groupForm.getFooter().addComponent(topRightCorner);   
                topRightCorner.setMargin(true);
            }
        });
    }
    private void initFilteringControls() {
        for (final String pn : visibleCols) {
            final TextField sf = new TextField();
            topLeftCorner.addComponent(sf);
            sf.setWidth("100%");
            sf.setInputPrompt(pn);
            sf.setImmediate(true);
            topLeftCorner.setExpandRatio(sf, 5);
            sf.addListener(new Property.ValueChangeListener() {

    			private static final long serialVersionUID = -2314749847110552037L;

    			public void valueChange(ValueChangeEvent event) {
                    addressBookData.removeContainerFilters(pn);
                    if (sf.toString().length() > 0 && !pn.equals(sf.toString())) {
                        addressBookData.addContainerFilter(pn, sf.toString(),
                                true, false);
                    }
                    getWindow().showNotification(
                            "" + addressBookData.size() + " matches found", Notification.TYPE_TRAY_NOTIFICATION);
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
        for (int i = 0; i < 1000; i++) {
            Object id = ic.addItem();
            ic.getContainerProperty(id, "ID").setValue(
            		GroupData.idGroup[(int) (GroupData.idGroup.length * Math.random())]);
            ic.getContainerProperty(id, "Group Name").setValue(
            		GroupData.groupName[(int) (GroupData.groupName.length * Math.random())]);
            ic.getContainerProperty(id, "Responsible").setValue(
            		GroupData.resp[(int) (GroupData.resp.length * Math.random())]);
            ic.getContainerProperty(id, "Mobile Phone").setValue(
            		GroupData.mobile[(int) (GroupData.mobile.length * Math.random())]);
            ic.getContainerProperty(id, "Email").setValue(
            		GroupData.mail[(int) (GroupData.mail.length * Math.random())]);
            ic.getContainerProperty(id, "Phone/Fax").setValue(
            		GroupData.phonefax[(int) (GroupData.phonefax.length * Math.random())]);
            
            ic.getContainerProperty(id, "Country").setValue(
            		GroupData.country[(int) (GroupData.country.length * Math.random())]);
            ic.getContainerProperty(id, "Arrival").setValue(
            		GroupData.arrival[(int) (GroupData.arrival.length * Math.random())]);
            ic.getContainerProperty(id, "Departure").setValue(
            		GroupData.departure[(int) (GroupData.departure.length * Math.random())]);
            ic.getContainerProperty(id, "Invoice Status").setValue(
            		GroupData.invStatus[(int) (GroupData.invStatus.length * Math.random())]);
            ic.getContainerProperty(id, "Group Status").setValue(
            		GroupData.groupStatus[(int) (GroupData.groupStatus.length * Math.random())]);
            ic.getContainerProperty(id, "Reservation Way").setValue(
            		GroupData.reservationWay[(int) (GroupData.reservationWay.length * Math.random())]);
      
        }
        return ic;
    }

   public class FormWithComplexLayout extends Form {
	   private static final long serialVersionUID = 1L;
		private GridLayout gridLayout;
		public FormWithComplexLayout( Item id) {
			setCaption("Group details");
			  gridLayout = new GridLayout(6, 8);
			// Use top-left margin and spacing
    		  gridLayout.setMargin(true, false, false, true);
    		  gridLayout.setSpacing(true);
    		  setLayout(gridLayout);
    		  // Set up buffering
              setWriteThrough(false); // we want explicit 'apply'
              setInvalidCommitted(false); // no invalid values in datamodel
              // FieldFactory for customizing the fields and adding validators
              setFormFieldFactory(new groupFieldFactory());
             // setItemDataSource( id); // bind to POJO via BeanItem
			
		}
		 // Override to get control over where fields are placed.
		@Override
        protected void attachField(Object propertyId, Field field) {
            if (propertyId.equals("Group Name")) {
            	gridLayout.addComponent(field, 0, 0);
            } else if (propertyId.equals("ID")) {
            	gridLayout.addComponent(field, 1, 0);
            } else if (propertyId.equals("Country")) {
            	gridLayout.addComponent(field, 2, 0);
            }else if (propertyId.equals("Language")) {
            	gridLayout.addComponent(field, 3, 0);
            }else if (propertyId.equals("Responsible")) {
            	gridLayout.addComponent(field, 0, 1);
            } else if (propertyId.equals("Email")) {
            	gridLayout.addComponent(field, 1, 1);
            } else if (propertyId.equals("Mobile Phone")) {
            	gridLayout.addComponent(field, 2, 1);
            } else if (propertyId.equals("Phone/Fax")) {
            	gridLayout.addComponent(field, 3, 1);	
            } else if (propertyId.equals("Arrival")) {
            	gridLayout.addComponent(field, 0, 2,1, 2);
            } else if (propertyId.equals("Departure")) {
            	gridLayout.addComponent(field, 2, 2,4, 2);
            } else if (propertyId.equals("Invoice Status")) {
            	gridLayout.addComponent(field, 0, 3);
            }else if (propertyId.equals("Group Status")) {
            	gridLayout.addComponent(field, 1, 3);
            }else if (propertyId.equals("Reservation Way")) {
            	gridLayout.addComponent(field, 2, 3);
            }else if (propertyId.equals("Chruch")) {
            	gridLayout.addComponent(field, 0, 5);
            }else if (propertyId.equals("Celebrant")) {
            	gridLayout.addComponent(field, 1, 5);
            }else if (propertyId.equals("Israel Staying")) {
           	gridLayout.addComponent(field, 2, 5);
           } else if (propertyId.equals("Bishop")) {
              	gridLayout.addComponent(field, 0, 6);
              }else if (propertyId.equals("Priest")) {
             	gridLayout.addComponent(field, 1, 6);
             }else if (propertyId.equals("Participatn")) {
            	gridLayout.addComponent(field, 2, 6);
            } else if (propertyId.equals(	"Note")) {
           	gridLayout.addComponent(field, 0, 7,4,7);
           }
		}
   }//FormWithComplexLayout
   
   private class groupFieldFactory extends DefaultFieldFactory {
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
		   if ("Group Name".equals(propertyId)) {
               TextField tf = (TextField) f;
               //tf.setWidth("10em");
               tf.setRequired(true);
               tf.setRequiredError("Please enter a Group ID");
              
               tf.setWidth(COMMON_FIELD_WIDTH);
               tf.addValidator(new StringLengthValidator(
                       "Group Name must be 6-20 characters", 6, 20, false));
               tf.setWidth(COMMON_FIELD_WIDTH);
           }
		    if ("Invoice Status".equals(propertyId)) {
		    	 OptionGroup op = new OptionGroup("Invoice Status Way");
    			 
		    	 op.addItem("Payable");
		    	 op.addItem("Paid");
		    	 op.addItem("Issued");
		    	 op.addItem("Don't need");
 	    		
 	    		// Lay the items out horizontally
		    	// op.addStyleName("horizontal");//option in CSS
 		
 	    		return op;  
        	   
           }
		    if ("Group Status".equals(propertyId)) {
		    	 OptionGroup op = new OptionGroup("Group Status");
   			 
		    	 op.addItem("Closed");
		    	 op.addItem("Open");
		    	 op.addItem("Pending");
	    		
	    		// Lay the items out horizontally
		    	// op.addStyleName("horizontal");//option in CSS
		
	    		return op;    
          }
		    if ("Reservation Way".equals(propertyId)) {
		    	 OptionGroup op = new OptionGroup("Reservation Way");
		    	 op.addItem("Fax");
		    	 op.addItem("Email");
		    	 op.addItem("Phone");
		    	 op.addItem("Regular Mail");
		    	 op.addItem("Email");
		    	 op.addItem("Telegram");
		    	 op.addItem("Voice");
	    		
	    		// Lay the items out horizontally
		    	// op.addStyleName("horizontal");//option in CSS
		
	    		return op;   
         }
		    if ("Note".equals(propertyId)) {
		    	RichTextArea rta = new RichTextArea("Note");
		    	rta.setWidth("100%");
	    		return rta;  
        }
		    if ("Arrival".equals(propertyId)) {
		    	//DateField dfe = new DateField("Arrival");
		    	 TextField tf = (TextField) f;
		    	 tf.setWidth(COMMON_FIELD_WIDTH);
	    		return tf;  	   
        }
		    if ("Departure".equals(propertyId)) {
		    	//DateField dfe = new DateField("Arrival");
		    	 TextField tf = (TextField) f;
		    	 tf.setWidth(COMMON_FIELD_WIDTH);
	    		return tf;    
        }  
		    else if ("ID".equals(propertyId)) {
                TextField tf = (TextField) f;
                tf.setNullRepresentation("");
                tf.setNullSettingAllowed(true);
                tf.addValidator(new IntegerValidator(
                        "Shoe size must be an Integer"));
                tf.setWidth("4em");
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
        	   tf.setWidth(COMMON_FIELD_WIDTH);
        	  // tf.addValidator(new StringLengthValidator(
              //         "Password must be 6-20 characters", 6, 20, false));
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
	   private TextField createTextField(Object propertyId) {
	       TextField f = new TextField();
	       f.setCaption(DefaultFieldFactory
                   .createCaptionByPropertyId(propertyId));
	       return f;
	   }
	   
	   public Field createDateField(String caption) {
			 DateField dfa = new DateField(caption);
		     if (useSecondResolution) {
		    	 dfa.setResolution(DateField.RESOLUTION_SEC);
		     } else {
		    	 dfa.setResolution(DateField.RESOLUTION_MIN);
		     }
		     return dfa;
		}
	   }//groupFieldFactory


   }


