package conn;

//Exceptionhandling


class StockHighException extends Exception{


	public StockHighException(String msg) {
		super(msg);
	}
	
}


class StockLowException extends Exception{


	public StockLowException(String msg) {
		super(msg);
	}
	
}


class Stocks {
	public float stockRate;
	
	
	public Stocks(float stockRate) {
		super();
		this.stockRate = stockRate;
	}
	public String checkRate(float rate) throws Exception {
		
		 if( rate < 0.8*stockRate) {
			throw new StockLowException("Under Loss");
		}else if ( rate > 0.8*stockRate) {
			throw new StockHighException("Under Profit");
		}
		
		return "Hope to raise";
	}




	
}


public class Source{
	public static void main(String args[]) throws Exception {
		Stocks stocks = new Stocks(120.0f);
		try {
			
			System.out.println(stocks.checkRate(80.0f));
		}catch(StockLowException e){
			System.out.println("StockLowException : "+e.getMessage());
		}catch(StockHighException e) {
			System.out.println("StockHighException :"+e.getMessage());
		}
		
	}
}