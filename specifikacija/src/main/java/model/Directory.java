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
	 * @param name ime file
	 * @param path putanja do file
	 */
	public void create(String name, String path) throws CreateDirectoryExceptions; 
	
	
	/**
	 * @param path putanja do file
	 */
	public void delete(String path)throws DeleteDirectoryExceptions;
	
	
	public void zip(String path)throws ZipDirectoryExceptions;
	
	public void move(String pathFile, String destestination)throws MoveDirectoryExceptions;
	
	public void rename(String name, String path)throws RenameDirectoryExceptions; 
	
	public List<File> listAllinDirectory(String path) throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryInDirectory(String path)throws SearchDirectoryExceptions;
	
	public List<File> listAllFileinDirectory(String path)throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryAndSubdirectory(String path)throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryWithExtension(String path, String extension)throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryWithMetadata(String path)throws SearchDirectoryExceptions;
	
	public List<File> listAllinDirectoryWithoutMetadata(String path)throws SearchDirectoryExceptions;
	
	
	
	

}
