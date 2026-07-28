package com.ktdsuniversity.edu.oop.interfaces.tv;

public interface Remote {

  void turnOn(TV tv);

  void turnOff(TV tv);

  void increaseVolume(TV tv);

  void decreaseVolume(TV tv);

  void increaseChannel(TV tv);

  void decreaseChannel(TV tv);

  void changeInputSource(TV tv);

  void runApps(TV tv);

  void runAi(TV tv);

  void controlShoppingButtons(TV tv);

  void inputChannelNumber(int number, TV tv);

  void mute(TV tv);

  void changeTvSettings(TV tv);


}
