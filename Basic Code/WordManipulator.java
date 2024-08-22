import java.util.Scanner;

class WordManipulator {
    String word;
    int len;

    WordManipulator() {
        word = "";
    }

    void readWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.nextLine();
        word = word.toLowerCase();
        len = word.length();
    }

    void shiftCons() {
        String cons = "";
        String vowl = "";
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowl = vowl + ch;
            else
                cons += ch;
        }
        word = cons + vowl;
        System.out.println("Shifted Word=" + word);
    }

    void changeWord() {
        String sr = "";
        word = word.toUpperCase();
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                ch = (char) ((int) ch + 32);
                sr = sr + ch;
            } else
                sr = sr + ch;
        }
        System.out.println("Changed word=" + sr);
    }

    void show() {
        System.out.println("Original word=" + word);
    }

    public static void main(String[] args) {
        WordManipulator ob = new WordManipulator();
        ob.readWord();
        ob.show();
        ob.shiftCons();
        ob.changeWord();
    }
}
