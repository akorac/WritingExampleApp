import java.io.*;
public class WritingExample
{
    private File destinationFile;

    public WritingExample(File file)
    {
        this.destinationFile = file;
    }

    public void writeToFile(String fn, String ln, int age)
    {
        try
        {
            FileWriter writerObject = new FileWriter(destinationFile, true);
            writerObject.write(fn);
            writerObject.write(",");
            writerObject.write(ln);
            writerObject.write(",");
            writerObject.write(age + "");
            writerObject.write("\n");

            writerObject.flush();
            writerObject.close();

        }
        catch(IOException ioe)
        {
            System.out.println("Error with the file");
        }
    }
}