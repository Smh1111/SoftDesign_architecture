public class WASlotComponentFactory implements SlotComponentFactory {
	
	public Cabinet createCabinet(String type) {
        switch (type) {
            case "straight":
                return new largeCabinet();
            case "bonus":
                return new mediumCabinet();
            case "progressive":
                return new largeCabinet();
            default:
                return null;
        }
    }

	public Payment createPayment(String type) {
        switch (type) {
            case "straight":
                return new Bills();
            case "bonus":
                return new TicketInTicketOut();
            case "progressive":
                return new Coins();
            default:
                return null;
        }
    }

    public Display createDisplay(String type) {
        switch (type) {
            case "straight":
                return new Reels();
            case "bonus":
                return new VGA();
            case "progressive":
                return new Reels();
            default:
                return null;
        }
    }

    public GPU createGPU(String type) {
        switch (type) {
            case "straight":
                return new ARM();
            case "bonus":
                return new ARM();
            case "progressive":
                return new ARM();
            default:
                return null;
        }
    }

    public OS createOS(String type) {
        switch (type) {
            case "straight":
                return new Linux();
            case "bonus":
                return new Symbian();
            case "progressive":
                return new Android();
            default:
                return null;
        }
    }

}
