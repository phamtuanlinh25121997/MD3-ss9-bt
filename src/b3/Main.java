package b3;

public class Main {
    public static void main(String[] args) {
        Playable playable = new AudioPlayer();
        System.out.println("Đây là audio: ");
        playable.play();
        System.out.println("--------------------------------");
        Playable playable1 = new VideoPlayer();
        System.out.println("Đây là video: ");
        playable1.play();
    }
}
