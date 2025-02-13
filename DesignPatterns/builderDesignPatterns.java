package DesignPatterns;

class gamingPc {
	
	String processor;
	int ram;
	int ssd;
	int graphicGb;
	String graphicsCard;
	
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public int getGraphicGb() {
		return graphicGb;
	}
	public void setGraphicGb(int graphicGb) {
		this.graphicGb = graphicGb;
	}
	public String getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public gamingPc(String processor, int ram, int ssd, int graphicGb, String graphicsCard) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.ssd = ssd;
		this.graphicGb = graphicGb;
		this.graphicsCard = graphicsCard;
	}
	@Override
	public String toString() {
		return "gamingPc [processor=" + processor + ", ram=" + ram + ", ssd=" + ssd + ", graphicGb=" + graphicGb
				+ ", graphicsCard=" + graphicsCard + "]";
	}
}

class gamingBuilder {
	
	String processor;
	int ram;
	int ssd;
	int graphicGb;
	String graphicsCard;

	public gamingBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public gamingBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public gamingBuilder setSsd(int ssd) {
		this.ssd = ssd;
		return this;
	}
	public gamingBuilder setGraphicGb(int graphicGb) {
		this.graphicGb = graphicGb;
		return this;
	}
	public gamingBuilder setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
		return this;
	}

	public gamingPc build () {
		return new gamingPc(processor, ram, ssd, graphicGb, graphicsCard);
	}
}

public class builderDesignPatterns {

	public static void main(String[] args) {
		
	//	gamingPc pcs = new gamingPc("Intel-i9", 16, 520, 16, "ASUS");
		
		gamingPc pcs = new gamingBuilder().setProcessor("AMD").build();
		
		System.out.println(pcs);

	}

}
