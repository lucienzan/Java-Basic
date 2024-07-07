import java.io.CharArrayReader;

public class Tuto3 {
    public static void main(String[] args) throws Exception
    {
        //file output
        //try (FileOutputStream fos = new FileOutputStream("/Users/mac/Documents/java/Java Basic/file/task.txt")){
        //    var text = "Hello this is java file output stream testing";
        //    fos.write(text.getBytes(), 6, text.length() - 6);
        //    fos.close();
        //} catch (Exception e) {
        //}

        //file input
        //try (FileInputStream fis = new FileInputStream("/Users/mac/Documents/java/Java Basic/file/task.txt")) {
        //    byte[] b = new byte[fis.available()];
        //    fis.read(b);
        //    String s = new String(b);
        //    System.out.println(s);
        //}

        // or
        //try (FileInputStream fileRead = new FileInputStream("/Users/mac/Documents/java/Java Basic/file/task.txt")) {
        //    int x;
        //    while ((x = fileRead.read()) != -1) {
        //        System.out.print((char)x);
        //    }
        //}

        //FileInputStream fr = new FileInputStream("/Users/mac/Documents/java/Java Basic/file/source.txt");
        //FileOutputStream fos = new FileOutputStream("/Users/mac/Documents/java/Java Basic/file/source1.txt");
        //int x;
        //while ((x = fr.read()) != -1) {
        //    if (x >= 65 && x <= 90)
        //        fos.write(x+32);
        //    else
        //        fos.write(x);
        //}
        //fr.close();
        //fos.close();

        // SequenceInputStream
        //        FileInputStream fr = new FileInputStream("/Users/mac/Documents/java/Java Basic/file/source.txt");
        //        FileInputStream fr1 = new FileInputStream("/Users/mac/Documents/java/Java Basic/file/task.txt");
        //
        //        FileOutputStream fos = new FileOutputStream("/Users/mac/Documents/java/Java Basic/file/source1.txt");
        //        int x;
        //        SequenceInputStream sis = new SequenceInputStream(fr, fr1);
        //        while ((x = sis.read()) != -1) {
        //            fos.write(x);
        //        }
        //        fr.close();
        //        fr1.close();
        //        fos.close();
        //        sis.close();

        // ByteArrayInputStream & ByteArrayOutputStream
        //byte b[] = { 'a', 'b', 'c', 'd', 'e' };
        //ByteArrayInputStream bais = new ByteArrayInputStream(b);
        //int x;
        //while ((x = bais.read()) != 1) {
        //    System.out.print((char) x);
        //}
        // or
        //String s = new String(bais.readAllBytes());
        //System.out.print(s);

        //ByteArrayOutputStream baos = new ByteArrayOutputStream(20);
        //baos.write(b);
        //byte b1[] = baos.toByteArray();
        //for (byte bb : b1) {
        //    System.out.print((char) bb);
        //}
        //baos.writeTo(new FileOutputStream("your path/task.txt"));
        //baos.close();
        //bais.close();

        // charArray
        CharArrayReader car = new CharArrayReader(new char[] { 'v', 'b', 'd' });
        int t;
        while ((t = car.read()) != -1) {
            System.out.print((char) t);
        }
        car.close();
    }
}
