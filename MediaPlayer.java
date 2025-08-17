import java.util.*;

interface Playable {
    void play();
    void pause();
    void stop();
}

class AudioFile implements Playable {
    private String title;
    public AudioFile(String title) { this.title = title; }
    public void play() { System.out.println("Playing audio: " + title); }
    public void pause() { System.out.println("Pausing audio: " + title); }
    public void stop() { System.out.println("Stopping audio: " + title); }
}

class VideoFile implements Playable {
    private String title;
    public VideoFile(String title) { this.title = title; }
    public void play() { System.out.println("Playing video: " + title); }
    public void pause() { System.out.println("Pausing video: " + title); }
    public void stop() { System.out.println("Stopping video: " + title); }
}

class Podcast implements Playable {
    private String title;
    public Podcast(String title) { this.title = title; }
    public void play() { System.out.println("Playing podcast: " + title); }
    public void pause() { System.out.println("Pausing podcast: " + title); }
    public void stop() { System.out.println("Stopping podcast: " + title); }
}

public class MediaPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playable media = null;

        System.out.println("Select media type: 1-Audio, 2-Video, 3-Podcast");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();

        switch (choice) {
            case 1: media = new AudioFile(title); break;
            case 2: media = new VideoFile(title); break;
            case 3: media = new Podcast(title); break;
            default: System.out.println("Invalid choice"); System.exit(0);
        }

        media.play();
        media.pause();
        media.stop();
    }
}
