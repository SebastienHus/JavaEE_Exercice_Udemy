package com.directMedia.onlineStore.core;

import com.directMedia.onlineStore.core.entity.Artist;
import com.directMedia.onlineStore.core.entity.Catalogue;
import com.directMedia.onlineStore.core.entity.Work;

public class Startup {

	public static void main(String[] args) {
		
		Artist artist1 = new Artist("Bob");
		Artist artist2 = new Artist("Alfred");
		Artist artist3 = new Artist("Catarina");
		
		Work work1 = new Work("La reine des neiges");
		Work work2 = new Work("Zombilenium");
		Work work3 = new Work("Avatar37");
		
		work1.setMainArtist(artist1);
		work2.setMainArtist(artist2);
		work3.setMainArtist(artist3);
		
		work1.setRelease(2000);
		work2.setRelease(1900);
		work3.setRelease(2020);
		
		work1.setSummary("Un film galciale");
		work2.setSummary("Sauve qui peut");
		work3.setSummary("Il vas falloir soufler dans les bronch du pays du feu pour qui se carbonise avant qu'il nenous carbonise !");
		
		work1.setKind("FILM");
		work2.setKind("FILM");
		work3.setKind("FILM");
		
		Catalogue.listOfWorks.add(work1);
		Catalogue.listOfWorks.add(work2);
		Catalogue.listOfWorks.add(work3);
	
		for (Work listWork : Catalogue.listOfWorks) {
			
		
			System.out.println(listWork.getTitle() + " sortis en : " + listWork.getSummary());
		}

	}

}
