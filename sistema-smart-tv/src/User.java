public class User {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();
    System.out.println("START");
    System.out.println("On?\t\t" + smartTv.on);
    System.out.println("Channel:\t" + smartTv.channel);
    System.out.println("Volume: \t" + smartTv.volume);
    System.out.println("-----");

    smartTv.turnOn();
    smartTv.volumeUp();
    smartTv.channelUp();
    smartTv.changeChannel(11);
    smartTv.volumeDown();
    smartTv.channelDown();
    smartTv.turnOff();
  }
}
