package PolymorphismTask;

public class MySmartPhone extends MyCellPhone implements MyWiFi,MyCamera{
	@Override
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }
    // we can override default method in implemented class
//    @Override
//    public void record4kVideo() {
//        System.out.println("Recording in 4k full hd...");
//    }
    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Alok","Harry","Vishal"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}
