package com.ktdsuniversity.edu.oop.interfaces.tv;

public class SmartTv implements TV {

  private final String[] INPUT_SOURCE = {"COMPONENT", "HDMI1", "HDMI2", "USB"};
  private final String[] APPS = {"NETFLIX", "WAVVE", "YOUTUBE", "TVING", "DISNEY+"};

  private boolean isOn;
  private int volume;
  private int channelNumber;
  private int activatedInputSourceNumber;
  private int activatedAppNumber;

  @Override
  public void turnOn() {
    this.isOn = true;
    System.out.println("전원이 켜집니다.");
  }

  @Override
  public void turnOff() {
    this.isOn = false;
    System.out.println("전원이 꺼집니다.");
  }

  @Override
  public void increaseVolume() {
    if (this.isOn) {
      this.volume++;
      if (this.volume > 100) {
        this.volume = 100;
        System.out.println("최대 볼륨입니다.");
      }
      System.out.println("현재 볼륨: " + this.volume);
    }
  }

  @Override
  public void decreaseVolume() {
    if (this.isOn) {
      this.volume--;
      if (this.volume < 0) {
        this.volume = 0;
        System.out.println("최소 볼륨입니다.");
      }
      System.out.println("현재 볼륨: " + this.volume);
    }
  }

  @Override
  public void increaseChannel() {
    if (this.isOn) {
      this.channelNumber++;
      if (this.channelNumber >= TV.CHANNELS.length) {
        this.channelNumber = 0;
      }

      String channelName = TV.CHANNELS[this.channelNumber];

      System.out.println("현재 채널: " + channelName);
    }
  }

  @Override
  public void decreaseChannel() {
    if (this.isOn) {
      this.channelNumber--;
      if (this.channelNumber < 0) {
        this.channelNumber = TV.CHANNELS.length - 1;
      }

      String channelName = TV.CHANNELS[this.channelNumber];

      System.out.println("현재 채널: " + channelName);
    }

  }

  @Override
  public void changeInputSource() {
    if (this.isOn) {
      this.activatedInputSourceNumber++;
      if (this.activatedInputSourceNumber >= this.INPUT_SOURCE.length) {
        this.activatedInputSourceNumber = 0;
      }
      String inputSourceName = this.INPUT_SOURCE[this.activatedInputSourceNumber];
      System.out.println("외부 입력: " + inputSourceName);
      if (inputSourceName.equals("USB")) {
        this.readUsb();
      }
    }
  }

  @Override
  public void readUsb() {
    System.out.println("USB를 읽습니다.");
  }

  @Override
  public void runApps() {
    if (this.isOn) {
      this.activatedAppNumber++;
      if (this.activatedAppNumber >= this.APPS.length) {
        this.activatedAppNumber = 0;
      }
      String AppName = this.APPS[this.activatedAppNumber];
      System.out.println("앱: " + AppName);

    }
  }

  // @Override 생략해도 알아서 Override 처리 해줌
  // 하지만 성능의 차이가 있기 때문에 어노테이션 처리 해줘야 함.
  @Override
  public void mute() {
    this.volume = 0;
    System.out.println("음소거");
  }

  @Override
  public void changeChannel(int channelNumber) {
    for (int i = 0; i < TV.CHANNELS.length; i++) {
      if (TV.CHANNELS[i].equals(channelNumber + "")) {
        this.channelNumber = i;
        break;
      }
    }

    String ChannelName = TV.CHANNELS[this.channelNumber];
    System.out.println("현재 채널: " + ChannelName);

  }

}
