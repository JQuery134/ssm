package spring.factory;

public class ColorFactory {
	
	private static String type;

	public ColorFactory(String type) {
		super();
		ColorFactory.type = type;
	}

	public static InterfaceColor getColorInstance(){
		InterfaceColor color=null;
		if("Red".equals(type)){
			color=new Red();
		}else if("Black".equals(type)){
			color=new Black();
		}
		return color;
		
	}
}
