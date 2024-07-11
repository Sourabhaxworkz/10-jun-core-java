class CameraRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean connect = Camera.onOrOff();
		System.out.println("The Camera is connected:" +connect);
			Camera.increaseZoom();
			Camera.increaseZoom();
			Camera.increaseZoom();
			Camera.increaseZoom();
			Camera.increaseZoom();
			Camera.increaseZoom();
			
			Camera.decreaseZoom();
			Camera.decreaseZoom();
			Camera.decreaseZoom();
			Camera.decreaseZoom();
			Camera.decreaseZoom();
			Camera.decreaseZoom();
		connect = Camera.onOrOff();
		System.out.println("The Camera is connected:" +connect);
		System.out.println("Main Ended");
	}
}