
public class Main {

	public static void main(String[] args) {
		
		
		UserManager userManager = new UserManager(new ValidationManager());
        userManager.add(new User(
                1,
                "8665522",
                1996,
                "ayhan",
                "demircan",
                "aa09@gmail.com"

        ));
        userManager.update(new User(
                2,
                "444444",
                1988,
                "Özkan",
                "Demircan",
                "dlr@dlr.com"
        ));

        GameManager gameManager = new GameManager();
        gameManager.update(new Game(
                1,
                1,
                "GTA",
                500
        ));

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.delete(new Campaign(
                1,
                "Game Season",
                15
        ));

        SaleManager saleManager = new SaleManager();
        saleManager.sell(new User(
                1,
                "111111",
                1994,
                "Özkan",
                "dd",
                "dddd@gmail.com"

        ),new Campaign(
                2,
                "New Campaign",
                40
        ),new Game(
                2,
                1,
                "Counter",
                120

        ));
		

	}

}
