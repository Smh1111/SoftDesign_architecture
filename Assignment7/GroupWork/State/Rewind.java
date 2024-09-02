public class Rewind implements State {
	private RemoteDevice remote;
	
	public Rewind(RemoteDevice remote) {
		this.remote = remote;
		remote.setState(new Playing(this.remote));
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("The player can't play while rewinding.");
		
		
		return false;
	}

	// the Pause button is pressed
	public boolean pressPause() {
		System.out.println("The player can't pause while rewinding.");
		
		return false;
	}


	// the Stop button is pressed
	public boolean pressStop() {
		System.out.println("The player can't stop while rewinding.");
		
		
		return false;
	}

	// the Rewind button is pressed
	public boolean pressRewind() {
		System.out.println("The player is already rewinding.");
		return false;
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
