package com.company;
import java.util.Scanner;
 class Word {
    private String word_target;
    private String word_explain;

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public String getWord_target() {
        return word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
 class Dictionary {
    private Word[] word =new Word[1000];
    public class DictionaryManagement{
        public  Scanner sc = new Scanner(System.in);
        public void insertFromCommandline(){
            Dictionary dictionary = new Dictionary();
            int sum_word = sc.nextInt();
            for(int i=0;i<sum_word;i++){
                String a ,b;
                a=sc.next();
                b=sc.next();
                dictionary.word[i].setWord_target(a);
                dictionary.word[i].setWord_explain(b);
            }
        }
    }
    public class DictionaryCommandline {
        public void showAllWords(){
            Dictionary dictionary = new Dictionary();
            System.out.println("No"+"         | English        "+"| Vietnamese ");
            //print dictionary
            for(int i=0;i<dictionary.word.length; i++){
                System.out.println(i + 1 + "   |   "+dictionary.word[i].getWord_target()+"     |     "+dictionary.word[i].getWord_explain());
                // print word;
            }
        }
        public void dictionaryBasic(){
            DictionaryManagement basic = new DictionaryManagement();
            basic.insertFromCommandline();
            showAllWords();
        }
    }
}


