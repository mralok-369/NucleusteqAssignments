package PolymorphismTask;

public class DriverClass {
	 public static void main(String[] args) {
	        // this is a smartPhone but use it as a camera
	        MyCamera cam1 = new MySmartPhone(); // dynamic method dispatch
//	        cam1.getNetwork():  // not allowed it can use only camera function
//	        cam1.sampleMeth();  // also not allowed
	        cam1.recordVideo();

	        MyWiFi wifi = new MySmartPhone(); // this is a smartPhone but use it as a WiFi

	    }
}
