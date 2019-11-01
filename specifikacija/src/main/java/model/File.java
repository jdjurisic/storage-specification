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

/**
 * @author Vlado
 *
 */
public interface File {
	
	
	/**
	 * Pravi novi fajl sa prosledjenim imenom i putanjom.
	 * @param name ime file
	 * @param path putanja do file
	 */
	public void create(String name, String path) throws CreateFileException; 
	
	
	/**
	 * Pravi novi fajl sa proizvoljnim metapodacima.
	 * @param name
	 * @param path
	 * @throws CreateFileException
	 */
	public void createWithMetadata(String name, String path) throws CreateFileException;
	
	
	/**
	 * Brise fajl sa prosledjene putanje.
	 * @param path putanja do file
	 */
	public void delete(String path) throws DeleteFileExeption;
	
	
	/**
	 * Preuzima fajl sa prosledjene putanje i cuva ga na proizvoljnu lokaciju.Default implementacija cuva na desktopu.
	 * @param pathStorage
	 * @param pathDesktop
	 * @throws DownloadFileExeption
	 */
	public void download(String pathStorage, String pathDesktop)throws DownloadFileExeption;
	
	
	/**
	 * 
	 * @param pathDesktop
	 * @param pathStorage
	 * @throws UploadFileExeption
	 */
	public void upload(String pathDesktop, String pathStorage) throws UploadFileExeption;
	
	public void selectMutlipleFile(List<String> path) throws SelectFileExeption;
	
	public void uploadMultiple(List<File> files, String pathStorage) throws UploadFileExeption;
	
	public void uploadMultipleZip(List<File> files, String destination) throws Exception;
	
	public void zip(String path)throws ZipFilesExeption;
	
	
	/**
	 * Premesta fajl sa prosledjene putanje na zadatu putanju.
	 * @param pathFile
	 * @param destination
	 * @throws MoveFileExeption
	 */
	public void move(String pathFile, String destination) throws MoveFileExeption;
	
	
	/**
	 * Premesta fajl(sa metapodacima) sa prosledjene putanje na zadatu putanju.
	 * @param pathFile
	 * @param destination
	 * @throws MoveFileExeption
	 */
	public void moveWithMetadata(String pathFile, String destination) throws MoveFileExeption;
	
	
	/**
	 * Menja naziv fajla na zadatoj putanji u prosledjenu vrednost.
	 * @param name
	 * @param path
	 * @throws RenameFileExeption
	 */
	public void rename(String name, String path)throws RenameFileExeption; 
	
	
	
	
	
}
