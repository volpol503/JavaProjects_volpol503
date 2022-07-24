package Test.hh1;

import Test.Test;
import java.util.*;

public class Main {
    public static int changeWord(String word1, String word2){

        TreeSet<Character> alphavet = new TreeSet<>(Arrays.asList('а', 'б', 'в', 'г', 'д', 'е',  'ж', 'з',
                'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п','р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш',
                'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'));

        char[] firstWord = word1.toCharArray();
        char[] secondWord = word2.toCharArray();
        int tryCheck = 0;
        char[] wordCheck = new char[firstWord.length];
        char[] wordAlphDel = new char[firstWord.length];

        if (word1.equals(word2)) return 1;
        if (firstWord.length != secondWord.length ) return 0;
        if (secondWord.length != firstWord.length) return 0;

        for (int i = 0; i < firstWord.length; i++) {
            for (int j = i +1; j < firstWord.length; j++) {
                if ((j) < firstWord.length) {
                    if (firstWord[i] == firstWord[j] && secondWord[i] == secondWord[j]) {
                        for (int k = 0; k < firstWord.length; k++) {
                            alphavet.remove(firstWord[k]);
                        }
                        word1 = word1.replace(secondWord[i], alphavet.last());
                        wordCheck[tryCheck] = firstWord[i];
                        wordAlphDel[tryCheck] = alphavet.last();
                        alphavet.remove(alphavet.last());
                        tryCheck++;
                        continue;
                    } else if (firstWord[i] == firstWord[j] && secondWord[i] != secondWord[j]) {
                        return 0;
                    } else if (secondWord[i] == secondWord[j] && firstWord[i] != firstWord[j]) {
                        return 0;
                    } else if (secondWord[i] == secondWord[j] && firstWord[i] == firstWord[j]){
                        return 0;
                    }
                } else break;
            }
        }
        for (int i = 0; i < firstWord.length; i++) {
            word1 = word1.replace(firstWord[i],secondWord[i]);
        }
        if (tryCheck > 0) {
            for (int i = 0; i < tryCheck; i++) {
                word1 = word1.replace(wordAlphDel[i], wordCheck[i]);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String task = in.nextLine();

        String [] word = task.split("aba ");

        System.out.println(changeWord(word[0],word[1]));

        in.close();
    }
}