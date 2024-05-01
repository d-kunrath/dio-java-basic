public class SmartTv {

  boolean on = false;
  int channel = 1;
  int volume = 30;

  private void printStatus() {
    System.out.println("On?\t\t" + on);
  }
  
  private void printVolume() {
    System.out.println("volume: \t" + volume);
  }

  private void printChannel() {
    System.out.println("channel:\t" + channel);
  }

  public void changeChannel(int newChannel) {
    channel = newChannel;
    printChannel();
  }

  public void turnOn() {
    on = true;
    printStatus();
  }
  
  public void turnOff() {
    on = false;
    printStatus();
  }

  public void volumeUp() {
    volume++;
    printVolume();
  }

  public void volumeDown() {
    volume--;
    printVolume();
  }

  public void channelUp() {
    channel++;
    printChannel();
  }

  public void channelDown() {
    channel--;
    printChannel();
  }

}