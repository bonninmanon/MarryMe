package marryMe.model;


public class Views {
	
	public static class ViewBase {}	
	
	public static class ViewCompte extends ViewBase {}
	
	public static class ViewInvite extends ViewBase {}
	
	public static class ViewMariage extends ViewBase {}
	
	public static class ViewBeaute extends ViewBase {}
	
	public static class ViewPrestation extends ViewBase {}
	
	public static class ViewRobe extends ViewPrestation {}
	
	public static class ViewCake extends ViewPrestation {}
	
	public static class ViewClient extends ViewBase {}
	
	public static class ViewClientWithMariage extends ViewClient{}
	
	public static class ViewMariageWithInvites extends ViewMariage{}
	
	public static class ViewMariageWithPrestations extends ViewMariage{}
	
	public static class ViewMariageWithClient extends ViewMariage{}
	
	public static class ViewPrestationWithMariages extends ViewPrestation{}
}
