package BridgePattern;

public class TV implements Device {
	private boolean on=false;
	private int volume=30;
	private int channel=1;

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return on;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		on=true;
		
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		on=false;
		
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if(volume>100)
			this.volume=100;
			else if (volume<0)
				this.volume=0;
			else
				this.volume=volume;
		
			
		}

	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		this.channel=channel;
		
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		
	}

}
