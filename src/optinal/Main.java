package optinal;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String word;
        HashMap<String, Integer> words = new HashMap<>();
        for (int i = 0; i < count; i++) {
            word = sc.nextLine();
            if (words.containsKey(word))
                words.replace(word, words.get(word) + 1);
            else
                words.put(word, 1);
        }

        int result = 0;
        String answer = "";
        for (String key: words.keySet()){
            if (words.get(key) > result) {
                result = words.get(key);
                answer = key;
            }

        }
        System.out.println(words);
        System.out.println(words.keySet());
        System.out.println(answer);
    }
}
