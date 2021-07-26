package Entity;

public class Campaign {
	private int campaignId;
	private String campaignName;
	private int campaignDiscount;
	
	public Campaign() {
		
	}

	public Campaign(int campaingId, String campaignName, int campaignDiscount) {
		this.campaignId = campaingId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}

	public int getCampaingId() {
		return campaignId;
	}

	public void setCampaingId(int campaingId) {
		this.campaignId = campaingId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(int campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	
	
	
}
