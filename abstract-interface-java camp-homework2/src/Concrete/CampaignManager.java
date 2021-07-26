package Concrete;

import Abstract.ICampaignService;
import Entity.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" campaign is used "+" and discount is :"+campaign.getCampaignDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" deleted");
		
	}

	@Override
	public void update(Campaign campaign,Campaign campaign2) {
		
		System.out.println(campaign.getCampaignName()+" updated as  "+campaign2.getCampaignName());
	}

}
