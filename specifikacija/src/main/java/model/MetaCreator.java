package model;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

import com.google.gson.Gson;

public class MetaCreator {
	public static void createNewMetaDescription(String path) {
		LinkedHashMap<String,String> mapa = new LinkedHashMap<String,String>();
		mapa.put("Metapodaci za fajl :",path);
		
		System.out.println("Za kraj unosa unesite kljuc END ");
		System.out.println("Unesite meta podatke - format : kljuc - vrednost ");
		
		String kljuc="kljuc",vrednost;
		Scanner myScanner = new Scanner(System.in);
		while(true) {
			System.out.println("Unesite kljuc za meta podatak :");
			kljuc = myScanner.nextLine();
			if(kljuc.equalsIgnoreCase("END"))break;
			System.out.println("Unesite vrednost :");
			vrednost = myScanner.nextLine();	
			mapa.put(kljuc, vrednost);
		}
		
		String withoutExtension = path.substring(0, path.lastIndexOf("."));
		
		File metaOpis = new  File(withoutExtension+"-META.json");
		
		
		Gson gson = new Gson();
		String jsonIspis = gson.toJson(mapa);
		
		try {
			FileWriter fw =  new FileWriter(metaOpis);
			fw.write(jsonIspis);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
//	public static void main(String[] args) {
//		
//		String s = "/Users/jovicadjurisic/Desktop/FirstPage.html";
//		
//		MetaCreator.createNewMetaDescription(s);
//
//	}
}
