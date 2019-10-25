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

	//�̱��� ����: �� Ŭ������ �� �ϳ��� �ν��Ͻ��� ������, �� �ν��Ͻ� ȣ��� �ִ� �ν��Ͻ��� ��ȯ�ϵ��� �Ѵ�. 
	private static ByteSourceFactory instance=new ByteSourceFactory();
	public static ByteSourceFactory getInstance() {
		return instance;
	}
	private ByteSourceFactory() {}
}
