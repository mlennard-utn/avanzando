package nio2;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.regex.PatternSyntaxException;

public class ArchivosNIO {

	public static void main(String[] args) throws IOException {

		Path dir = Paths.get("C:\\tmp\\nivel2\\archivo1.txt");
		Path file = Paths.get("C:\\tmp\\nuevo", "archivo.txt");

		// Files.createDirectory(dir);
		// if (Files.isWritable(dir)) {
		// Files.createFile(file);
		// }
		// Files.createDirectory (Path dir);
		// Files.deleteIfExists(file);
		Files.copy(file, dir, REPLACE_EXISTING);
		listarArchivos();
		verAtributos();
	}

	private static void listarArchivos() {
		Path dir = Paths.get("C:/tmp");
		// DirectoryStream is a stream, so use try-with-resources
		// or explicitly close it when finished
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.txt")) {
			for (Path file : stream) {
				System.out.println(file.getFileName());
			}
		} catch (PatternSyntaxException | DirectoryIteratorException | IOException x) {
			System.err.println(x);
		}

	}

	private static void verAtributos() {
		DosFileAttributes attrs = null;
		Path file = Paths.get("C:\\tmp\\nuevo", "archivo.txt");
		try {
			attrs = Files.readAttributes(file, DosFileAttributes.class);
		} catch (IOException e) { /// ... }
			
		}
		FileTime creation = attrs.creationTime();
		FileTime modified = attrs.lastModifiedTime();
		FileTime lastAccess = attrs.lastAccessTime();
		if (!attrs.isDirectory()) {
			long size = attrs.size();
		}
		// DosFileAttributes adds these to BasicFileAttributes
		boolean archive = attrs.isArchive();
		boolean hidden = attrs.isHidden();
		boolean readOnly = attrs.isReadOnly();
		boolean systemFile = attrs.isSystem();

	}
}
