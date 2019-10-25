package part1_App;

public class Application{
	private Menu menu1 = new Menu("menu1");
	private Menu menu2 = new Menu("menu2");
	private Menu menu3 = new Menu("menu3");
	private Button button1 = new Button("button1");
	private Button button2 = new Button("button2");
	
	private ScreenUI currentScreen=null;
	
	public Application() {
		menu1.setOnClickListener(menuListener);
		menu2.setOnClickListener(menuListener);
		menu3.setOnClickListener(menuListener);
		button1.setOnClickListener(buttonListener);
		button2.setOnClickListener(buttonListener);
	}
	
	private OnClickListener menuListener = new OnClickListener() {
		public void clicked(Component eventSource) {
			String sourceId=eventSource.getId();
			if (sourceId.equals("menu1")) {
				currentScreen=new Menu1ScreenUI();
			} else if (sourceId.equals("menu2")) {
				currentScreen=new Menu2ScreenUI();
			} else if (sourceId.equals("menu3")) {
				currentScreen=new Menu3ScreenUI();
			}
			currentScreen.show();
		}
	};
	
	private OnClickListener buttonListener = new OnClickListener() {
		public void clicked(Component eventSource) {
			if (currentScreen == null)
				return;
			String sourceId=eventSource.getId();
			if (sourceId.equals("button1")) {
				currentScreen.handleButton1Click();
			} else if (sourceId.equals("button2")) {
				currentScreen.handleButton2Click();
			}
		}
	};
}
