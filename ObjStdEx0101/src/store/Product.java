package store;

public class Product {
	/******** フィールド ******************************************/
	/**
	 * 店舗名
	 */
	private static final String STORE_NAME = "速水PC販売店";
	
	/**
	 * 標準変更金額
	 */
	private static final int DEFAULT_CHANGE_AMT = 1000;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 価格
	 */
	private int price;

	/******** コンストラクタ **************************************/
	/**
	 * @param name 商品名初期値
	 * @param price 価格初期値
	 */
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/**
	 * @param name
	 */
	public Product(String name) {
		this(name, 0);
	}

	/******** メソッド ******************************************/
	/**
	 * 店舗名の表示
	 */
	public static void displayStoreName() {
		System.out.println("■店舗名：" + STORE_NAME);
	}

	/**
	 * 値上げする
	 * @param amt 値上げ金額
	 * @return 値上げ後の価格
	 */
	public int up(int amt) {
		return price += amt;
	}
	
	/**
	 * 値上げする（標準変更金額）
	 * @return
	 */
	public int up() {
		return this.up(DEFAULT_CHANGE_AMT);
	}
	
	/**
	 * 値下げする
	 * @param amt 値下げ金額
	 * @return 値下げ後の価格
	 */
	public int down(int amt) {
		return price -= amt;
	}

	/**
	 * 値上げする（標準変更金額）
	 * @return
	 */
	public int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}

	/**
	 * 情報表示
	 */
	public void display() {
		System.out.println(name + "：" + price + "円");
	}
}
