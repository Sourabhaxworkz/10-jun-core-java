class SpeakerRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = Speaker.onOrOff();
		System.out.println("The speaker is connected:" +connect);
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			Speaker.increaseVolume();
			
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
			Speaker.decreaseVolume();
		connect = Speaker.onOrOff();
		System.out.println("The Speaker is connected:" +connect);
		System.out.println("Main Ended");
	}
}