package PolymorphismTask;

public interface MyCamera {
	void takeSnap();
    void recordVideo();
    // private method
    private void greet(){
        System.out.println("Good morning");
    }
    // default method
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
