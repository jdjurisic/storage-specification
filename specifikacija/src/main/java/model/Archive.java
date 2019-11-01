package model;
import java.io.*;
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/**
 * Klasa za arhiviranje fajlova / direktorijuma u zip formatu.
 * Koriscen sajt https://www.baeldung.com/java-compress-and-uncompress
 * Uz malu korekciju za rad na razlicitim operativnim sistemima.
 * @author Jovica
 *
 */
public class Archive {

	/**
	 * Pravi zipovan fajl na zadatoj putanji
	 *
	 * @param file File koji zelimo da zipujemo.
	 * @param name Ime fajla.
	 * @param path Odredisna putanja zipovanog fajla.
	 * @throws IOException Throws IOException if file doesn't exists on given path.
	 */
	public void zipFile(File file, String name, String path) throws IOException {
		if (!file.isDirectory()) {
			FileOutputStream fileOutputStream = new FileOutputStream(path + File.separator + name + ".zip");
			ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
			FileInputStream fileInputStream = new FileInputStream(file);
			ZipEntry zipEntry = new ZipEntry(file.getName());
			zipOutputStream.putNextEntry(zipEntry);

			byte[] bytes = new byte[1024];
			int length;

			while ((length = fileInputStream.read(bytes)) > 0) {
				zipOutputStream.write(bytes, 0, length);
			}

			zipOutputStream.close();
			fileInputStream.close();
			fileOutputStream.close();
		}
	}

	/**
	 * Kreira zipovani direktorijum na zadatoj putanji.
	 *
	 * @param file Direktorijum koji zelimo da zipujemo.
	 * @param name Naziv direktorijuma.
	 * @param path Odredisna putanja zipovanog direktorijuma.
	 * @throws IOException Throws IOException if directory doesn't exists on given path.
	 */
	public void zipDirectory(File file, String name, String path) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(path + File.separator + name + ".zip");
		ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

		zip(file, file.getName(), zipOutputStream);
		zipOutputStream.close();
		fileOutputStream.close();
	}

	/**
	 * Zipuje prosledjeni direktorijum.
	 *
	 * @param file            Direktorijum koji zelimo da zipujemo.
	 * @param fileName        Naziv direktorjiuma.
	 * @param zipOutputStream Izlazni tok podataka.
	 * @throws IOException Throws IOException if ZIP output stream doesn't work correctly.
	 */
	private void zip(File file, String fileName, ZipOutputStream zipOutputStream) throws IOException {
		if (file.isHidden()) {
			return;
		}

		if (file.isDirectory()) {
			if (fileName.endsWith(File.separator)) {
				zipOutputStream.putNextEntry(new ZipEntry(fileName));
				zipOutputStream.closeEntry();
			} else {
				zipOutputStream.putNextEntry(new ZipEntry(fileName + File.separator));
				zipOutputStream.closeEntry();
			}

			File[] children = file.listFiles();

			if (children != null) {
				for (File childFile : children) {
					zip(childFile, fileName + File.separator + childFile.getName(), zipOutputStream);
				}
			}

			return;
		}

		FileInputStream fileInputStream = new FileInputStream(file);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zipOutputStream.putNextEntry(zipEntry);
		byte[] bytes = new byte[1024];
		int length;

		while ((length = fileInputStream.read(bytes)) >= 0) {
			zipOutputStream.write(bytes, 0, length);
		}

		fileInputStream.close();
	}
}
