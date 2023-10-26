package HardwareStore;

class Invoice
{
	private String partNo,partDesc;
	private int qty;
	private double price;
	
	public Invoice() 
	{
		this("101","Throttle Body",1,0.0);
	}
	
	public Invoice(String partNo, String partDesc, int qty,double price) {
		super();
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.qty = qty;
		this.setPrice(price);
	}
	
	
	public String getPartNo() {
		return partNo;
	}
	

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void dispInvoice()
	{
		System.out.println("------------------------INVOICE---------------------------");
		System.out.println("PART NO. : "+this.partNo);
		System.out.println("PART DESCRIPTION : "+this.partDesc);
		System.out.println("QTY : "+this.qty);
		System.out.println("PRICE : "+(this.price)*this.qty);
		System.out.println("----------------------------------------------------------");
		
	}
	
		
	
	
}
