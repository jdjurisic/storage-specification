package model;

import java.util.List;

import exceptions.file.CreateFileException;
import exceptions.file.DeleteFileExeption;
import exceptions.file.DownloadFileExeption;
import exceptions.file.MoveFileExeption;
import exceptions.file.RenameFileExeption;
import exceptions.file.SelectFileExeption;
import exceptions.file.UploadFileExeption;
import exceptions.file.ZipFilesExeption;
import formatComponent.ExtensionList;

/**
 * @author Vlado
 *
 */
public interface MyFile {
	
	
	/**
	 * Pravi novi fajl sa prosledjenim imenom i putanjom.
	 * @param name ime file
	 * @param path putanja do file
	 */
	public void create(String name, String path, ExtensionList extensiontList) throws CreateFileException; 
	
	
	/**
	 * Pravi novi fajl sa proizvoljnim metapodacima.
	 * @param name naziv fajla.
	 * @param path putanja na kojoj se kreira.
	 * @throws CreateFileException
	 */
	public void createWithMetadata(String name, String path, ExtensionList extensiontList) throws CreateFileException;
	
	
	/**
	 * Brise fajl sa prosledjene putanje.
	 * @param path putanja do file
	 * @throws DeleteFileExeption greska prilkom birsanja.
	 */
	public void delete(String path) throws DeleteFileExeption;
	
	
	/**
	 * Preuzima fajl sa prosledjene putanje i cuva ga na proizvoljnu lokaciju.Default implementacija cuva na desktopu.
	 * @param pathStorage putanja do fajla.
	 * @param pathDesktop putanja do skladista.
	 * @throws DownloadFileExeption greska prilikom preuzimanja.
	 */
	public void download(String pathStorage, String pathDesktop)throws DownloadFileExeption;
	

	public void upload(String pathDesktop, String pathStorage, ExtensionList extensiontList) throws UploadFileExeption;
	
	public void uploadMultiple(List<String> files, String pathStorage, ExtensionList extensiontList) throws UploadFileExeption;
	
	public void uploadMultipleZip(List<String> files, String destination) throws Exception;
	
	public void zip(String path)throws ZipFilesExeption;
	
	
	/**
	 * Premesta fajl sa prosledjene putanje na zadatu putanju.
	 * @param pathFile putanja do fajla koji premestamo.
	 * @param destination odredisna putanja.
	 * @throws MoveFileExeption greska prilikom premestanja.
	 */
	public void move(String pathFile, String destination) throws MoveFileExeption;
	
	
	/**
	 * Premesta fajl(sa metapodacima) sa prosledjene putanje na zadatu putanju.
	 * @param pathFile putanja do fajla.
	 * @param destination odredisna putanja.
	 * @throws MoveFileExeption greska prilkom premestanja.
	 */
	public void moveWithMetadata(String pathFile, String destination) throws MoveFileExeption;
	
	
	/**
	 * Menja naziv fajla na zadatoj putanji u prosledjenu vrednost.
	 * @param name naziv fajla.
	 * @param path putanja do fajla.
	 * @throws RenameFileExeption
	 */
	public void rename(String name, String path)throws RenameFileExeption; 
	
	
	
	
	
}
