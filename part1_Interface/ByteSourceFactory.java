package part1_Interface;

public class ByteSourceFactory {
	public ByteSource create() {
		if (usefile())
			return new FileDataReader();
		else
			return new SocketDataReader();
	}
	private boolean usefile() {
		String useFileVal = System.getProperty("useFile");
		return useFileVal != null && Boolean.valueOf(useFileVal);
	}

	//싱글톤 패턴: 이 클래스는 단 하나의 인스턴스를 가지며, 새 인스턴스 호출시 있던 인스턴스를 반환하도록 한다. 
	private static ByteSourceFactory instance=new ByteSourceFactory();
	public static ByteSourceFactory getInstance() {
		return instance;
	}
	private ByteSourceFactory() {}
}
