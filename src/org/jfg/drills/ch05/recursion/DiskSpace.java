package org.jfg.drills.ch05.recursion;

import java.io.File;

public class DiskSpace {

    public static void main(String[] arg) {

        File file1 = new File("/home/jfg/Public");
        long sizeOfFile1 = calculateDirectorySize(file1);
        System.out.format("Size of %s is: %d.\n", file1, sizeOfFile1);

        File file2 = new File("/home/jfg/Pictures");
        long sizeOfFile2 = calculateDirectorySize(file2);
        System.out.format("Size of %s is: %d.\n", file2, sizeOfFile2);

        File file3 = new File("/home/jfg/repos");
        long sizeOfFile3 = calculateDirectorySize(file3);
        System.out.format("Size of %s is: %d.\n", file3, sizeOfFile3);

        File file4 = new File("/home/jfg/repos/DS_and_Algorithms_Goodrich/ch03/dsaj/arrays");
        long sizeOfFile4 = calculateDirectorySize(file4);
        System.out.format("Size of %s is: %d.\n", file4, sizeOfFile4);

        File file5 = new File("/home/jfg/repos/DS_and_Algorithms_Goodrich/ch03/dsaj/arrays");
        long sizeOfFile5 = calculateDirectorySizeWithListOfFilenames(file5);
        System.out.format("Size of %s is: %d.\n", file5, sizeOfFile5);


    }

    public static long calculateDirectorySize(File root) {

        /*El metodo length es el que te da el tamano de la entrada
        del directorio (archivo o directorio. Para directorios, no regresa
        el tamano con el contenido sino nomas el tamano de la entrada) */
        long totalSize = root.length();

        if (root.isDirectory()) {
            File [] directoryEntries = root.listFiles();
            for (File directoryEntry : directoryEntries) {
                totalSize += calculateDirectorySize(directoryEntry);
            }
        }
        return totalSize;
    }

    public static long calculateDirectorySizeWithListOfFilenames(File root) {

        /*El metodo length es el que te da el tamano de la entrada
        del directorio (archivo o directorio. Para directorios, no regresa
        el tamano con el contenido sino nomas el tamano de la entrada) */
        long totalSize = root.length();

        if (root.isDirectory()) {
            for (String directoryEntry : root.list()) {
                File entry = new File(root, directoryEntry);
                totalSize += calculateDirectorySize(entry);
            }
        }
        return totalSize;
    }
}
