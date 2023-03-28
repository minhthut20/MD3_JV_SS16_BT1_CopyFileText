import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\uD83D\uDE0D");
        ReadAndWrite readAndWrite = new ReadAndWrite();
        String PATH_MAIN = "src/main.txt";
        String PATH_COPY = "src/copy.txt";
        List<String> mainFile = readAndWrite.readFile(PATH_MAIN);
        readAndWrite.writeFile(PATH_COPY,mainFile,countChar(mainFile));
    }

    public static int countChar(List<String> list){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i).length();
        }
        return count;
    }
}
