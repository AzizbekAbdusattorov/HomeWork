package Experiment;

public class StringBuilderMain {
    public static void main(String[] args) {
        // StringBuilder obyekti yaratish
        StringBuilder stringBuilder = new StringBuilder("Salom, ");

        // O'zgartirish imkoniyati, qo'shish
        stringBuilder.append("Java!");  // "Salom, Java!"

        // Matn ichidagi belgini o'chirish
        stringBuilder.deleteCharAt(5);  //"Salom Java"

        // Matn ichidagi bir qismini o'zgartirish
        stringBuilder.replace(6, 9, "Dunyo");  // "Salom Dunyo"

        // StringBuilder obyektini Stringga aylantirish
        String natija = stringBuilder.toString();

        System.out.println(natija);
    }
}
