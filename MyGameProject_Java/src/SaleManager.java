
public class SaleManager implements SaleService {

	@Override
	public void sell(User user, Campaign campaign, Game game) {
		System.out.println(game.getName()+" Game "+user.getFirstName()+" User "+campaign.getName()+" Campaign"+" %"+campaign.getDiscount()+" Selling");
		
	}

}
