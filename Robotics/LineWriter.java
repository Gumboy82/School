import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;



import java.time.LocalDateTime;
import java.nio.charset.Charset;


public class LineWriter { 
    public static void main(String[] args) throws IOException {
        DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("MM-dd-yy HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(dFormatter.format(now));
        Path path = Paths.get("Runlog " + dFormatter.format(now)+".txt");
        OpenOption options = StandardOpenOption.CREATE_NEW;
        BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset(), options);
        writer.write("Hello World!");
        writer.newLine();
        writer.close();
    }
}
