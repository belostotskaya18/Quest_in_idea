import java.util.Scanner;

public class Main {
    public static Character student;
    public static Story story;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы пришли в школу. \n "
                + "Введите ваше возраст и имя:");
        student = new Character(in.nextInt(),in.next());
        story = new Story();
        while (true) {
            student.score += story.current_situation.dscore;
            System.out.println("=====\nСчет:" + student.score + " \n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }

    }

}
