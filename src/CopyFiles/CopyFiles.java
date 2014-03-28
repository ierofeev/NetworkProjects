package CopyFiles;


import java.io.*;

public class CopyFiles {

    public CopyFiles(){

        try {
            Copy();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  void Copy() throws IOException{

        //FileSystem fileSystem = FileSystems.getDefault();

        File srcDir = new File("//home/supersonic/Документы/from/");
        File destDir = new File("//home/supersonic/Документы/to/");

        if(!destDir.exists()){
            destDir.mkdir();
        }
        if (!srcDir.exists()){
            System.out.println("Folder doesn't exists");
            System.exit(0);
        }

        try {
            copyFolder(srcDir,destDir);

        }  catch (IOException e){
            e.printStackTrace();

        }
        System.out.println("Done sir");

    }

    public  void copyFolder(File src, File dest) throws IOException {

        if (src.isDirectory()){
            if(!dest.exists()){
                dest.mkdir();
                System.out.println("Files copied from"+src+"to"+dest);
            }
            String files[] = src.list();
            for (String file:files){
                File srcFile = new File (src,file);
                File destFile = new File(dest,file);
                copyFolder(srcFile,destFile);
            }

        }  else {
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length=in.read(buffer))>0){
                out.write(buffer,0,length);
            }
            in.close();
            out.close();
            System.out.println("File copied from"+src+"to"+dest);
        }

    }

    public static void main(String[] args) {

        CopyFiles copyFiles = new CopyFiles();

    }
}
