import java.io.*;

public class test18 {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/Юзер/Desktop/test.txt");

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);

                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String str;
        BufferedReader br=
                new BufferedReader(new
                        InputStreamReader(System.in));
        System.out.print("Конец ввода  - стоп");
        try (FileWriter fw = new FileWriter("/Users/Юзер/Desktop/test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("стоп") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("стоп") != 0);

        }catch (IOException exc){
            System.out.print("Ошибка ввода-вывода:" + exc);
        }
    }
}