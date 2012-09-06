package war.data;

import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;

public final class POPData {
	
	public static String[] fields = { "POP ID", "POP Name", "Shrine ID", 
		"Shrine" , "Sanctuary Superior" , "Responsible" ,
		"Mobile Phone", "Phone/Fax", "Email",  "Address", "City", "ZIP", 
		"Max. no. of persons", "Max. no. of seats"  , "WWW", "Note"};
	
	public static String[] visibleCols = new String[] { "POP ID","POP Name" };
	
	public static final String[] idPOP = new String[]{ "32", "23", 
		"33", "21", "12", "34", "76", "35", "26", "68",
		"36", "25", "78", "24" };
	
	public static final String[] idShrine = new String[]{ "4748", "65685", 
		"75478", "56859", "98759", "74678", "76578", "98765", "54678", "65789",
		"76546", "78654", "78765", "45675" };
	
	public static final String[] popName = new String[]{
		"11 - Bethlehem - Manger Grotto", 
		"13 - Bethlehem - St. Joseph", 
		"14 - Bethlehem - St Jerome", 
		"15 - Bethlehem - St. Helen", 
		"41 - Bethlehem Milk Grotto - Church",
		"51 - Shepherds’ Field - The Big Grotto (I Grotto)", 
		"52 - Shepherds’ Field - Grotta “IN EXCELSIS” (II Grotto)",
		"53 - Shepherds’ Field - Cloister of the IV century (III Grotto)",
		"54 - Shepherds’ Field - The monastery (IV Grotto)",
		"55 - Shepherds’ Field - Grotta - Manger (V Grotto)",
		"56 - Shepherds’ Field - Amphitheatre  (VI Grotto)",
		"57 - Shepherds’ Field - Angels Chapel",
		"71 - Gethsemane - Basilica of the Agony",
		"72 - Gethsemane - Grotto",
		"81 - Flagellation - Church",
		"111 - Convent of the Good Shepherd - Jericho Church",
		"151 - Emmaus-Qubeibeh - Basilica of St. Simon and Cleofa",
		"161 - Basilica of the Holy Sepulchre - Holy Tomb",
		"162 - Basilica of the Holy Sepulchre - Crucifixiony",
		"163 - Basilica of the Holy Sepulchre - Our Lady of Sorrows",
		"164 - Basilica of the Holy Sepulchre - Chapel of the Blessed Sacrament",
		"165 - Basilica of the Holy Sepulchre - The Crusaders Chapels",
		"181 - Ain Karem - St. John The Baptist-- Ain Karem - St. John ",
		"201 - Bethany Church",
		"261 - Cana 1 Church  - Convent of the 1st Miracle",
		"262 - Cana 3 chapel 1 - Convent of the 1st Miracle",
		"263 -Cana 3 chapel 2 - Convent of the 1st Miracle",
		"264 -Cana 4 san Bartolomea’s church - Convent of the 1st Miracle",
		"266 -Renewal of wedding vows Cana’s church - Convent of the 1st Miracle",
		"267 -Renewal of wedding vows Cana’s chapel 1 - Convent of the 1st Miracle",
		"268 -Renewal of wedding vows Cana’s chapel 2 - Convent of the 1st Miracle",
		"269 - Renewal of wedding vows Cana - San Bartolomea’s church  - Convent of the 1st Miracle",
		};
	

	
	
	public static final String[] shrine = new String[] {    
		"Ain Karem – Birthplace of St John the Baptist",
	    "Ain Karem – St John in the Desert (Wilderness)",
	    "Ain Karem – The Shrine of the Visitation",
	    "Beit Sahour – The Shepherds’ Field",
	    "Bethany – The Shrine of St Lazarus",
	    "Bethphage – The Shrine of the Palms",
	    "Bethlehem – The Cave of the Nativity and the church of St Catherine",
	    "Cana of Galilee – The Shrine of Our Blessed Lord’s first miracle",
	    "Capernaum – The Shrine of the Eucharistic Promise",
	    "Emmaus – The Shrine of St Cleopas",
	    "Jericho – The church of the Good Shepherd",
	    "Jerusalem – The Basilica of the Holy Sepulchre",
	    "Jerusalem – Basilica of the Agony at Gethsemane",
	    "Jerusalem – Dominus Flevit, the Shrine of the Weeping Christ",
	    "Jerusalem – St Francis, at the Cenacle",
	    "Jerusalem – The Shrine of the Scourging and Condemnation",
	    "Jerusalem – Terra Sancta College",
	    "Jaffa – Church of St Peter, Apostle",
	    "Mount Tabor – Basilica of the Transfiguration",
	    "Tabgha – Shrine of the Primacy of Peter",
	};
	
	public static final String[] superior = new String[] {    
		"Amir Stark",
		"Bernard Hunter",
		"Phelan Gates",
		"Garrison Oneal",
		"Colorado Nelson",
		"Nehru Acevedo",
		"Kuame Vance",
		"Louis Rios",
		"Tate Baxter",
		"Hayden Oliver",
		"Reuben Downs",
		"Aladdin Fry",
		"Tanner Albert",
		"Dean Lyons",
		"Reuben Aguirre",
		"Jakeem Sparks",
		"Stuart Mcknight",
		"Elliott Morales",
	};
	
	public static final String[] resp = new String[] {    
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
	
	public static final String[] person = new String[]{
		"12",
		"60",
		"34",
		"23",
		"90",
};
	
	
	public static final String[] seat = new String[]{
		"12",
		"60",
		"34",
		"23",
		"90",
};
	
	public static final String[] www = new String[]{
		"hao123.com",
		"tudou.com",
		"yahoo.co.jp",
};
	
	public static final Object SHRINE_NAME = "Shrine Name";
	
	public static IndexedContainer getPOPContainer() {
		 IndexedContainer shrineContainer = new IndexedContainer();
		 shrineContainer.addContainerProperty(SHRINE_NAME,
		            String.class, "");
		 for (int i = 0; i < 20;) {
			 
			 String id = shrine[i];
			 Item item = shrineContainer.addItem(id);
			 if (item != null) {
				 i++;
				 item.getItemProperty(SHRINE_NAME).setValue(id); 
			 }
		 }
		 return shrineContainer;
		
	}

}
