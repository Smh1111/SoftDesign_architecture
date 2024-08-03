public class NJSlotComponentFactory implements SlotComponentFactory {
	
	public Cabinet createCabinet(String type) {
        switch (type) {
            case "straight":
                return new smallCabinet();
            case "bonus":
                return new largeCabinet();
            case "progressive":
                return new smallCabinet();
            default:
                return null;
        }
    }

	public Payment createPayment(String type) {
        switch (type) {
            case "straight":
                return new Coins();
            case "bonus":
                return new Coins();
            case "progressive":
                return new Bills();
            default:
                return null;
        }
    }

    public Display createDisplay(String type) {
        switch (type) {
            case "straight":
                return new LCD();
            case "bonus":
                return new Reels();
            case "progressive":
                return new CRT();
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
                return new X86();
            default:
                return null;
        }
    }

    public OS createOS(String type) {
        switch (type) {
            case "straight":
                return new WindowsME();
            case "bonus":
                return new WindowsME();
            case "progressive":
                return new WindowsXP();
            default:
                return null;
        }
    }

}
