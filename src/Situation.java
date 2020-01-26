public class Situation {
    Situation[] direction;
    String subject,text;
    int dscore;
    public Situation (String subject, String text, int variants, int score) {
        this.subject=subject;
        this.text=text;
        dscore=score;
        direction=new Situation[variants];
    }
}