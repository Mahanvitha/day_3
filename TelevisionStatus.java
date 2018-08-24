package com.capgemini.day3.java;

public class TelevisionStatus {
		 private boolean power;
		 private int volume;
		 private int channel;
public Television() {
	
}
public int changeChannel(int newValue) {
	if(power==true)
		channel =newValue;
	return newValue;
}
void changeVolume(int newValue) {
	if(power == true) {
		if(newValue<volume) {
			int n = volume-newValue;
		
			for(int i=volume;i<n;i++) {
				volume = volume-1;
		}
	}		
}

}
}
