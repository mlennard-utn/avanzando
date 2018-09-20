package nio2;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathFileFileSystem {

	public static void main(String[] args) throws IOException {
		FileSystem fs = FileSystems.getDefault();
		Path p1 = fs.getPath("C:\\tmp\\nivel2\\nivel3\\objetos.txt");

//		Iterator<Path> pathIterator = p1.iterator();
//		while (pathIterator.hasNext()) {
//			Path path = (Path) pathIterator.next();
//			System.out.format("getFileName: %s%n", path.getFileName());
//			System.out.format("getParent: %s%n", path.getParent());
//			System.out.format("getNameCount: %d%n", path.getNameCount());
//			System.out.format("isAbsolute: %b%n", path.isAbsolute());
//			System.out.format("toAbsolutePath: %s%n", path.toAbsolutePath());
//			System.out.format("toURI: %s%n", path.toUri());
//			System.out.println("-------------------");
//
//		}

		Path path = Paths.get("C:\\tmp\\nivel2","nivel3","objetos.txt");
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("isAbsolute: %b%n", path.isAbsolute());
		System.out.format("toAbsolutePath: %s%n", path.toAbsolutePath());
		System.out.format("getRoot: %s%n", path.getRoot());
		System.out.format("toURI: %s%n", path.toUri());
		System.out.println("-------------------");

		Path p = Paths.get("C:\\tmp\\nivel2","..","objetos.txt");
	    Path normalizedPath = p.normalize();

	    System.out.format("toAbsolutePath: %s%n", normalizedPath.toAbsolutePath());
		

	    Path otroPath = Paths.get("C:\\tmp", "nivel2","link");
//		System.out.println(p3.toAbsolutePath());
		
	}

}
