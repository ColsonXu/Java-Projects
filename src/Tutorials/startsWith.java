package Tutorials;

public class startsWith {

    public static void main(String[] args) {
        String words[] = {"fu**", "Funk", "furry", "Apple"};
        for (String w: words) {
            if (w.startsWith("fu")) {
                System.out.println(w);
            }
        }
    }

}
