/**
 * Stopped.java
 *
 * This file represents the Stopped state.
 */

public class Stopped implements State {
	private RemoteDevice remote;
	
	public Stopped(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("The player is now playing.");
		remote.setState(remote.getPlayingState());
		remote.setPosition(remote.getPosition()+1);
		
		return true;
	}

	// the Paused button is pressed
	public boolean pressPause() {
		System.out.println("The player can't pause while stopped.");

		
		return false;
	}

	// the  Stop button is pressed
	public boolean pressStop() {
		System.out.println("The player is already stopped.");
		
		return false;
	}

	// the Rewind button is pressed
	public boolean pressRewind() {
		System.out.println("The player is now rewinding.");

		// set the state to running state
		remote.setState(remote.getRewindState());
		remote.setPosition(0);
		return true;
	}

	@Override
	public boolean pressLock() {
		System.out.println("The player is now locked.");
		remote.setState(remote.getLockedState());

		return true;
	}

	@Override
	public boolean pressUnlock() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'pressUnlock'");
	}

}
