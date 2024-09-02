
public class TestDrive {
	public static void main(String[] args) {
		
		// what about a singleton here???
		// RemoteDeviceV1 remote = new RemoteDeviceV1();
		
		// remote.pressPlay();
		
		// remote.pressPause();
		
		// remote.pressStop();
		
		// remote.pressPlay();
		// remote.pressPlay();

		RemoteDevice remote = new RemoteDevice();

		remote.pressPlay();
		remote.pressPause();
		remote.pressStop();
		remote.pressPlay();

		remote.pressStop();

		remote.pressRewind();
		remote.pressStop();

		remote.pressLock();

		remote.pressPlay();
		remote.pressUnlock();
		remote.pressPlay();

		remote.pressLock();
		remote.pressUnlock();

		remote.pressStop();
		
	}

}
