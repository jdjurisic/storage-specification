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
 * @author Vladimir
 *
 */

/**
 * @author Vlado
 *
 */
/**
 * @author Vlado
 *
 */
public interface File {
	
	
	/**
	 * @param name ime file
	 * @param path putanja do file
	 */
	public void create(String name, String path) throws CreateFileException; 
	
	public void createWithMetadata(String name, String path) throws CreateFileException;
	
	
	/**
	 * @param path putanja do file
	 */
	public void delete(String path) throws DeleteFileExeption;
	
	
	public void download(String pathStorage, String pathDesktop)throws DownloadFileExeption;
	
	public void upload(String pathDesktop, String pathStorage) throws UploadFileExeption;
	
	public void selectMutlipleFile(List<String> path) throws SelectFileExeption;
	
	public void uploadMultiple(List<File> files, String pathStorage) throws UploadFileExeption;
	
	public void uploadMultipleZip(List<File> files, String destination) throws Exception;
	
	public void zip(String path)throws ZipFilesExeption;
	
	public void move(String pathFile, String destestination) throws MoveFileExeption;
	
	public void moveWithMetadata(String pathFile, String destestination) throws MoveFileExeption;
	
	public void rename(String name, String path)throws RenameFileExeption; 
	
	
	
	
	
}
