package leet79.word_search;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/4.
 */
public class Leet79 {

    public static void main(String... args) {
        Leet79 l = new Leet79();

        char[][] board = new char[][]{new char[]{'a', 'b'}, new char[]{'c', 'd'}};
        String word = "abcd";

        boolean flag = l.exist(board, word);
        System.out.println(flag);
    }


    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0 || word.length() > board.length * board[0].length) return false;
        char[] wordArr = word.toCharArray();

        Map<Character, Integer> boardMap = new HashMap<>();
        Map<Character, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char alphabet = board[i][j];
                if (boardMap.containsKey(alphabet)){
                    boardMap.put(alphabet, boardMap.get(alphabet) + 1);
                }else{
                    boardMap.put(alphabet,1);
                }
            }
        }

        for(int i = 0 ;i<wordArr.length;i++){
            char alphabet = wordArr[i];
            if(!boardMap.containsKey(alphabet)) return false;
            if (wordMap.containsKey(alphabet)){
                if (boardMap.get(alphabet) <= wordMap.get(alphabet)) return false;
                wordMap.put(alphabet, wordMap.get(alphabet) + 1);
            }else{
                wordMap.put(alphabet,1);
            }
        }
        return true;
    }


}
