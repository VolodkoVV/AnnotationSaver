package volodko.vyacheslav.ukr.net;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "c:\\tem\\1.txt")
public class TextConteiner {
    private String textOne = "Hello World";

    @Saver
    public void methodIsWriter(String text){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(text))) {
            bw.write(textOne);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}