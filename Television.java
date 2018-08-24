package com.capgemini.day3.java;

public class Television {
	private boolean power;
	private int volume;
	private int channel;

	public Television() {

	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int changeChannel(int newChannel) {
		if (power == true)
			channel = newChannel;
		return channel;
	}

	public int changeVolume(int newVolume) {
		if (power == true) {
			if (volume>newVolume) {
				int n = volume - newVolume;

				for (int i = 0; i < n; i++) {
					volume = volume -1;
				}
			}
			if (volume<newVolume) {
				int n = newVolume - volume;

				for (int i = 0; i < n; i++) {
					volume = volume + 1;
				}
			}
			return volume;
		}
		return 0;

	}
	public boolean powerStatus1() {
		power=!power;
		return power;
	}
	public String powerStatus() {
		if(power=true) {
			return ("Power: "+power+" Channel: "+channel+" Volume: "+volume);
		}
		return ("Power: "+power);
	}
}
