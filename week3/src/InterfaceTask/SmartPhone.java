package InterfaceTask;

public class SmartPhone extends Phone implements Camera, MusicPlayer {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Music Playing.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Music Stopped.");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Picture Clicked.");
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println("Recording started....");
        System.out.println("Recording Stopped.");
	}
	
	public static void main(String[] args) {
        //creating object of SmartPhone class
        SmartPhone samsung = new SmartPhone();
        // calling methods
        // calling phone class methods
        samsung.call();
        samsung.sms();
        System.out.println();

        // calling camera methods
        samsung.click();
        samsung.record();
        System.out.println();

        // calling musicPlayer methods
        samsung.play();
        samsung.stop();
        System.out.println();

    }

}
