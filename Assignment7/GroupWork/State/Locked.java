/**
 * Paused.java
 * 
 * This file represents the Paused state.
 */

 public class Locked implements State {
	private RemoteDevice remote;
	
	public Locked(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("You must unlock the player before you can play.");
		return false;
	}

	// the Pause button is pressed
	public boolean pressPause() {
		System.out.println("You must unlock the player before you can pause.");
		
		return false;
	}


	// the Stop button is pressed
	public boolean pressStop() {
		System.out.println("You must unlock the player before you can stop.");

		
		return false;
	}

	// the Rewind button is pressed
	public boolean pressRewind() {
		System.out.println("You must unlock the player before you can rewind.");

		return true;
	}

	// the lock button is pressed
	public boolean pressLock() {
		System.out.println("The player is already locked.");

		return false;
	}

      @Override
      public boolean pressUnlock() {
            
            System.out.println("The player is now unlocked.");
            remote.setState(remote.getPreviousState());
            return true;
      }     
}
