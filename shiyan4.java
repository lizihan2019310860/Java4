public class Fangfa {
 public static void main(String[] args) throws Exception {
  read();
  write();
 }
  public static void read() throws Exception {
   File file = new File("C:\Users\���Ӻ�\Desktop\�ı��ļ�B.txt");
   FileInputStream fis = new FileInputStream(file);
   byte[] buf = new byte[1024];
   int len = -1;
   StringBuffer sbuf = new StringBuffer("");
   while ((len = (fis.read(buf))) != -1) {
    sbuf.append(new String(buf, 0, len));
   }
   System.out.println(sbuf.toString());
   fis.close();
  }
  public static void write() throws Exception {
   File file = new File("C:\Users\���Ӻ�\Desktop\�ı��ļ�B.txt");
   StringBuilder file1 = new StringBuilder();
   file1.append(file);
   File file0 = new File("C:\Users\���Ӻ�\Desktop\�ı��ļ�A.txt");
   FileOutputStream fos = new FileOutputStream(file0);
    int last = file1.length();
          for(int i = 7; i < last+8 ; i+=8) {
              file1.insert(i,',');
          }
              System.out.print(file1.toString());
   fos.write("C:\Users\���Ӻ�\Desktop\�ı��ļ�B.txt".getBytes());
   fos.close();
   }
  
}