/* Потрібно: Створіть 2 інтерфейси Playable та Recodable.
 У кожному з інтерфейсів створіть по 3 методи void play() / void pause() / void stop() та void record() / void pause() / void stop() відповідно.
  Створіть похідний клас Player від базових інтерфейсів Playable та Recodable.
  Написати програму, яка виконує програвання та запис.
 */

interface Playable {
    void play();
    void pause();
    void stop();
}
interface Recodable {
    void record();
    void pause();
    void stop();
}
  //  implements - успадкування від інтерфейсу
public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Playing ...");
    }

    @Override
    public void record() {
        System.out.println("Recording ...");
    }

    @Override
    public void pause() {
        System.out.println("Paused.");
    }

    @Override
    public void stop() {
        System.out.println("Stopped.");
    }
}
class NewPlayer {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.pause();
        player.stop();

        player.record();
        player.pause();
        player.stop();
    }
}
