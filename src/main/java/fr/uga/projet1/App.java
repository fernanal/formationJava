package fr.uga.projet1;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import fr.uga.projet1.genericite.ExportTools;
import fr.uga.projet1.poo.Contact;
import fr.uga.projet1.poo.abstraction.CompSoldeDec;
import fr.uga.projet1.poo.heritage.CompteB;

public class App {
	public static void main(String[] args) {
		try {
			
			CompteB cb1 = new CompteB("AAA", 400);
			CompteB cb2 = new CompteB("BBB", 300);
			int resComp = cb1.compareTo(cb2);
			System.out.println("resComp = "+resComp);
			List<CompteB> lc = new ArrayList<>();
			lc.add(cb1);
			lc.add(cb2);
			
			List<CompteB> lc2 = Arrays.asList(cb1, cb2);
			Collections.sort(lc2);
			
			LocalDate loDate1 = LocalDate.now();
			//System.out.println(loDate1);
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.println("Date formatée " + dtf.format(loDate1));
			
			LocalDateTime loDate2 = LocalDateTime.ofInstant(Instant.now(),ZoneId.of("America/New_York") );
			System.out.println("DATE  " +dtf.format(loDate2));
			

		
			
			Date d1 = new Date();
			System.out.println(d1);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(sdf.format(d1));
			for (CompteB cb: lc2) {
				System.out.println(cb);
			}
			
			lc2.sort(new CompSoldeDec());
			System.out.println("Apres tri décroissant :");
			for (CompteB cb: lc2) {
				System.out.println(cb);
			}
			
			List<Contact> contacts = 
					Arrays.asList(new Contact(1,"toto",45), 
								  new Contact(2,"titi",1));
			ExportTools.exportCsv("contacts.csv", contacts);
			System.out.println("Export OK");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
