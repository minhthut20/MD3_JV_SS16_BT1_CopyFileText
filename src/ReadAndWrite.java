import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ReadAndWrite {
    public List<String> readFile(String filePath) {
        List<String> string = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                string.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File does not exist.");
        }
        return string;
    }
    public void writeFile(String filePath, List<String> list, int sumOfChar){
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter writer = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i) + "\n");
            }
            bufferedWriter.write("Total of characters in this file: " + sumOfChar);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
