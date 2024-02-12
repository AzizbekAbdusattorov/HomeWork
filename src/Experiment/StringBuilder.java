package Experiment;

public class StringBuilder {
    String sentence;

    StringBuilder(String sentence){
        this.sentence = sentence;
    }

   public void append(String sentence1){
        sentence += sentence1;
        System.out.println(sentence);
    }

    public void deleteCharAt(int n){
        String s = sentence;
        sentence = "";
         for (int i = 0; i < s.length(); i++) {
             if (i != n)
                 sentence += s.charAt(i);

         }
         System.out.println(sentence);
    }

    public void replace(int a, int b, String s){
        String s1 = sentence;
        sentence = "";
        for (int i = 0; i < s1.length(); i++) {
            if (i < a || i > b){
                sentence += s1.charAt(i);
            }

            if (i == b){
                sentence += s;
            }
        }

        System.out.println(sentence);
    }

    public String toString(){
        return sentence;
    }
}
