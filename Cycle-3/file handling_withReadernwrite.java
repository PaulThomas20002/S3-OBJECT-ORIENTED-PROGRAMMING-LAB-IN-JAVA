/*Write a file handling program in Java with reader/writer.*/

import java.io.*;
public class filehandling_withReadernwrite{
  public static void main(String[]args) throws Exception{
    File inf = new File("in.dat");   //create a file in.dat and add any text there
    File outf = new File("out.dat");
    FileReader ins = new FileReader(inf);
    FileWriter outs = new FileWriter(outf);
    int ch;
    while((ch=ins.read()) != -1){
    outs.write(ch);
    }
    if(outs != null)
      System.out.println("Content written Successfully");
    ins.close();
    outs.close();
  }
}
