/**
 * 
 */
package model;

import java.util.List;

import exceptions.directory.CreateDirectoryExceptions;
import exceptions.directory.DeleteDirectoryExceptions;
import exceptions.directory.MoveDirectoryExceptions;
import exceptions.directory.RenameDirectoryExceptions;
import exceptions.directory.SearchDirectoryExceptions;
import exceptions.directory.ZipDirectoryExceptions;

/**
 * @author Vlado
 *
 */
public interface Directory {
	
	
	/**
	 * Kreira novi direktorijum na datoj putanji.
	 * 
	 * @param name ime file-a
	 * @param path putanja do file-a
	 * 
	 */
	public void create(String name, String path) throws CreateDirectoryExceptions; 
	
	
	/**
	 * Brise direktorijum sa date putanje.
	 * 
	 * @param path putanja do file-a
	 */
	public void delete(String path)throws DeleteDirectoryExceptions;
	
	
	/**
	 * Zipuje sve fajlove iz datog direktorijuma.
	 * @param path
	 * @throws ZipDirectoryExceptions
	 */
	public void zip(String path)throws ZipDirectoryExceptions;
	
	/**
	 * Premesta file sa date putanje na odredisnu putanju.
	 * @param pathFile
	 * @param destination
	 * @throws MoveDirectoryExceptions
	 */
	public void move(String pathFile, String destination)throws MoveDirectoryExceptions;
	
	/**
	 * Menja naziv direktorijuma koji je prosledjen kao parametar funkcije.
	 * @param name
	 * @param path
	 * @throws RenameDirectoryExceptions
	 */
	public void rename(String name, String path)throws RenameDirectoryExceptions; 
	
	
	/**
	 * Ispisuje sve datoteke iz datog direktorijuma.
	 * @param path
	 * @return
	 * @throws SearchDirectoryExceptions
	 */
	public List<File> listAllinDirectory(String path) throws SearchDirectoryExceptions;
	
	
	public List<File> listAllinDirectoryInDirectory(String path)throws SearchDirectoryExceptions;
	
	public List<File> listAllFileinDirectory(String path)throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryAndSubdirectory(String path)throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryWithExtension(String path, String extension)throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryWithMetadata(String path)throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryWithoutMetadata(String path)throws SearchDirectoryExceptions;
	
	/**
	 * Preuzima direktorijum sa prosledjenog path-a.
	 *
	 * @param src  putanja do direktorijuma.
	 * @param dest gde zelimo da sacuvamo preuzeti direktorijum.
	 */
	public void download(String src, String dest);
	/**
	 * Upload-uje direktorijum na zadatoj putanji.
	 *
	 * @param src  putanja direktorijuma na skladistu.
	 * @param dest odrediste 
	 */
	public void upload(String src, String dest);

	/**
	 * Upload-uje vise direktorijuma na zeljenu putanju.
	 *
	 * @param directories List of directories.
	 * @param dest        Path on the storage where we want to upload directories.
	 * @param name        Name of created zip.
	 */
	public void uploadMultiple(List<File> directories, String dest, String name);

	/**
	 * Uploads multiple zipped directories on given path in storage.
	 *
	 * @param directories List of directories.
	 * @param dest        Path on the storage where we want to upload zipped directories.
	 * @param name        Name of created zip
	 */
	public void uploadMultipleZip(List<File> directories, String dest, String name);

	
	
	
	

}
