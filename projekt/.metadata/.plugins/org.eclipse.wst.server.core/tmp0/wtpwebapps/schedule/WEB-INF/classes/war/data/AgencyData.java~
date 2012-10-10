package org.cicts.scheduler.data;

import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;

public class AgencyData {
	public static String[] fields = { "Agency ID", "Agency Name", "Manager", 
		"Mobile Phone", "Phone/Fax", "Email",  "Email2",  "Address", "City", 
		"Country","ZIP", "WWW", "Note"};
	
	public static String[] visibleCols = new String[] { "Agency ID",
		"Agency Name", "Manager", "City", "Country" };
	
	public static final String[] idAgency = new String[]{ "32", "23", 
		"33", "21", "12", "34", "76", "35", "26", "68",
		"36", "25", "78", "24" };
	

	
	public static final String[] agencyName = new String[]{
		"Franciscan Pilgrim Office", 
		"Tope Group", 
		"Diocesis de Ourense",
		"Don Gianfranco Macor",
		"Carlos Saez", 
		"Vittorio Zeccone",
		"Fr. Lucas Teixeria",
		"Amarante", 
		"Terra Santa II",
		"Abba Travel Group",
		"Jack Urbanowicz", 
		"Fr. Athanasius",
		"Bishop Luis Quinteiro",
		"Israel et Sinai", "Leon Group (Spain)"
		};
	

	
	
	public static final String[] manager = new String[] {    
		"Malachi Livingston",
		"Samuel Waller",
		"Nigel Frost",
		"Sean Kane",
		"Julian Vincent",
		"Arden Erickson",
		"Burton Ellison",
		"Charles Knowles",
		"Raymond Franks",
		"Cedric Tate",
		"Ivor Henry",
		"Dylan Graham",
		"Kyle Phillips",
	};
	
	
	
	public static final String[] mobile = new String[]{"(313) 816-9380", 
		"(334) 842-0201",
		"(479) 552-8319",
		"(182) 884-7460",
		"(984) 469-5626",
		"(763) 729-9031",
		"(139) 317-7923",
		"(112) 559-4157", };
	
	public static final String[] phonefax = new String[]{"1-767-741-3191",
		"1-902-359-2609", 
		"1-226-442-3794", 
		"1-332-806-7651", 
		"1-415-823-7819"};
	
	public static final String[] mail = new String[]{
		"erat.nonummy@nonegestas.ca",
		"tortor.at@ligulaDonecluctus.com",
		"nonummy@antedictum.ca",
		"ac@aarcu.org",
		"ante.Nunc@consectetueradipiscingelit.ca",
		"ut@Vestibulum.org",
		"erat@facilisislorem.ca",
		"sit.amet@tristiquepharetraQuisque.edu",
		"Cum@Etiam.ca",
		"sem@etnetuset.ca",
		"erat.Vivamus@quama.com",
		"odio@scelerisque.org",
		"dui.Suspendisse.ac@sitamet.org",
		"erat@sedtortorInteger.edu",
		"gravida.sagittis.Duis@adipiscingelitAliquam.ca",
		"Phasellus.at@massaMaurisvestibulum.edu",
		"nisl.elementum.purus@enimconsequat.com",
		"Aenean.egestas.hendrerit@vulputateposuerevulputate.ca",
		"Etiam.ligula@malesuadavelconvallis.edu",
		"a@acfermentumvel.edu",
		"arcu.vel.quam@magna.org",
		"nibh@Fuscealiquetmagna.org",
		"libero.et.tristique@massaQuisque.ca",
		"Phasellus.dapibus.quam@quamdignissim.ca",
		"augue.id@DonecegestasAliquam.edu",
		"ultrices.a.auctor@Donec.com",
		"nunc@nullaanteiaculis.edu",
		"Nulla.semper.tellus@Vestibulum.ca", };
	
	public static final String[] address = new String[]{
		"6492 Pulvinar Street",
		"468-7626 Ipsum Rd.",
		"483-5109 Adipiscing Rd.",
		"857-4445 Nunc St.",
		"1178 Enim Av.",
		"Ap #218-7977 Odio Ave",
		"317-3491 Lorem St.",
		"845-3264 Ut, Av.",
		"304-779 Congue. Rd.",
		"9117 Nec Ave",
		"344-6567 Est, Av.",
		"Ap #169-9419 Ligula Road",
		"P.O. Box 948, 2257 Nam Av.",
		"339-6174 Dignissim. Street",
};
	
	public static final String[] city = new String[]{
		"Ain Karem",
		"Beit Sahour",
		"Bethany",
		"Bethphage",
		"Bethlehem",
		"Capernaum",
		"Emmaus",
		"Jericho",
		"Jerusalem",
		"Jaffa",
		"Mount Tabor",
		"Tabgha"
};
	public static final String[] zip = new String[]{
		"J78 7FR",
		"88299",
		"43639",
		"52930",
		"3280BO",
		"H16 1JO",
		"M4 0DW",
		"85079",
		"4452NQ",
		"30991"
};
	

	public static final String[] www = new String[]{
		"hao123.com",
		"tudou.com",
		"yahoo.co.jp",
};
	
	public static final Object AGENCY_NAME = "Agency Name";
	
	public static IndexedContainer getPOPContainer() {
		 IndexedContainer shrineContainer = new IndexedContainer();
		 shrineContainer.addContainerProperty(AGENCY_NAME,
		            String.class, "");
		 for (int i = 0; i < 20;) {
			 
			 String id = agencyName[i];
			 Item item = shrineContainer.addItem(id);
			 if (item != null) {
				 i++;
				 item.getItemProperty(AGENCY_NAME).setValue(id); 
			 }
		 }
		 return shrineContainer;
		
	}

}